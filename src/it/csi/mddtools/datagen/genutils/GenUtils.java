/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.genutils;

import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.Deleter;
import it.csi.mddtools.datagen.Finder;
import it.csi.mddtools.datagen.LookupResolver;
import it.csi.mddtools.datagen.OrderSpec;
import it.csi.mddtools.datagen.QCalculatedColumn;
import it.csi.mddtools.datagen.QResultColumn;
import it.csi.mddtools.datagen.QTableColumn;
import it.csi.mddtools.datagen.Updater;
import it.csi.mddtools.rdbmdl.Column;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import org.eclipse.xtend.util.stdlib.PropertiesExtension;

public class GenUtils {
	
	/**
	 * Genera un ID univoco da assegnare ad una Protected Region.
	 * 
	 * @param sourceId Stringa da cui ricavare l'ID 
	 * @return un id univoco della regione protetta univocamente derivabile
	 *         da sourceId. Serve per avere degli id univoci ma abbastanza corti da non
	 *         creare problemi a seguito di eventuali formattazioni automatiche dei
	 *         commenti che dichiarano la Protected Region.
	 */
	public static String getRegionUID(String sourceId){
		String uid = "R"+sourceId.hashCode();
		return uid;
	}
	
	public static String pkg2Path(String pkg){
		//System.out.println("from:"+pkg);
		String path= pkg.replaceAll("\\p{Punct}", "/"); 
		//System.out.println("to:"+path);
		return path;
	}
	
	public static void dumpProperties(){
		PropertiesExtension.getProperties().list(System.out);
	}
	
	public static void backupProperties(){
		System.out.println("Backup properties originarie");
		Properties orig = PropertiesExtension.getProperties();
		Properties bkpProps = new Properties();
		bkpProps.putAll(orig);
		_origProps = bkpProps;
		
	}
	
	public static void restoreProperties(){
		System.out.println("Restore properties originarie");
		if (_origProps!=null){
			PropertiesExtension.setProperties(_origProps);	
		}
		_origProps = null;
		
	}
	
	static Properties _origProps=null;
	
	public static void setProperty(String name, String val){
		java.util.Properties props = PropertiesExtension.getProperties();
		props.put(name, val);
		PropertiesExtension.setProperties(props);
	}
	
	public static String toJavaId(String sourceId){
		
		String formattedSource = "";
		StringTokenizer tok = new StringTokenizer(sourceId, "_");
		
		int n = tok.countTokens();
		if(n == 0){
			return sourceId.toLowerCase();
		}
		
		int i = 0;
		while (tok.hasMoreTokens()) {
			String tmp = tok.nextToken().toLowerCase();
			if(i > 0){
				tmp = tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
			}
			formattedSource += tmp;
			i++;
		}
		return formattedSource;
	}
	
	@SuppressWarnings("unchecked")
	public static boolean areDistinctAndOrderByClauseConsistent(List distinctCols, List orderSpecs){
		HashMap<String, Column> hmDistinct = new HashMap<String, Column>();
		Iterator<Column> iterDistinct = distinctCols.iterator();
		while (iterDistinct.hasNext()) {
			Column column = (Column) iterDistinct.next();
			hmDistinct.put(column.getName(), column);			
		}
		Iterator<OrderSpec> iterOrderBy = orderSpecs.iterator();
		while (iterOrderBy.hasNext()) {
			OrderSpec spec = (OrderSpec) iterOrderBy.next();
			if (!hmDistinct.containsKey(spec.getColumn().getName())){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Verifica se vi sono duplicazioni di nome tra i metodi di un DAO 
	 * @param ins
	 * @param find
	 * @param upd
	 * @param del
	 * @return true se non ci sono duplicazioni, false altrimenti
	 */
	public static boolean areAllDaoMethodsNamesUnivocal(
			it.csi.mddtools.datagen.Inserter ins,
			it.csi.mddtools.datagen.Finders find,
			it.csi.mddtools.datagen.Updaters upd,
			it.csi.mddtools.datagen.Deleters del) {
		HashMap<String, String> hmNames = new HashMap<String, String>();
		// inserter
		if (ins != null) {
			String opName = ins.getName();
			if (opName != null) {
				hmNames.put(opName, opName);
			}
		}
		// finders
		if (find != null && find.getFinders() != null) {
			Iterator<Finder> iterFind = find.getFinders().iterator();
			while (iterFind.hasNext()) {
				Finder finder = (Finder) iterFind.next();
				String opName = finder.getName();
				if (opName != null) {
					if (!hmNames.containsKey(opName)) {
						hmNames.put(opName, opName);
					} else {
						return false;
					}
				}
			}
		}
		// updaters
		if (upd != null && upd.getUpdaters() != null) {
			Iterator<Updater> iterUpd = upd.getUpdaters().iterator();
			while (iterUpd.hasNext()) {
				Updater updater = (Updater) iterUpd.next();
				String opName = updater.getName();
				if (opName != null) {
					if (!hmNames.containsKey(opName)) {
						hmNames.put(opName, opName);
					} else {
						return false;
					}
				}
			}
		}
		// deleters
		if (del != null && del.getDeleters() != null) {
			Iterator<Deleter> iterDel = del.getDeleters().iterator();
			while (iterDel.hasNext()) {
				Deleter deleter = (Deleter) iterDel.next();
				String opName = deleter.getName();
				if (opName != null) {
					if (!hmNames.containsKey(opName)) {
						hmNames.put(opName, opName);
					} else {
						return false;
					}
				}
			}
		}

		return true;
	}
	
	
	public static boolean findLoop(it.csi.mddtools.datagen.DataAccessObject dao){
		return findLoop(dao, new ArrayList<DataAccessObject>());
	}
	
	public static boolean findLoop(it.csi.mddtools.datagen.DataAccessObject dao, List<DataAccessObject> visited ){
		
		if(visited.contains(dao)){
			return true;
		}
		else{
			ArrayList<DataAccessObject> visited2 = new ArrayList<DataAccessObject>();
			visited2.addAll(visited);
			visited2.add(dao);
			if(dao.getLookupResolvers()==null || dao.getLookupResolvers().getResolvers().size()== 0){
				return false;
			}
			List<LookupResolver> list = dao.getLookupResolvers().getResolvers();
				for(LookupResolver resolver:list){
					if(findLoop(resolver.getSupplierDAO(),visited2)){
						return true;
						}
					}
				return false;
				}
			}
					

	public static boolean checkAliasUniqness(it.csi.mddtools.datagen.FromClause fc){
		HashMap<String, String> aliasNames = new HashMap<String, String>();
		aliasNames.put(fc.getTables().get(0).getAliasName(), fc.getTables().get(0).getAliasName());
		for(int i=1; i<fc.getTables().size();i++){
			if(aliasNames.containsKey(fc.getTables().get(i).getAliasName()))
				return false;
		}
		return true;
	}
	
	
	public static boolean checkSelectClause(it.csi.mddtools.datagen.SelectClause sc){
		HashMap<String, String> selectClauses = new HashMap<String, String>();
		QTableColumn c = (QTableColumn)sc.getColumns().get(0);
		String t = c.getQtable().getTable().getName();
		selectClauses.put(t+c.getColumn().getName(),"");
		for(int i=1;i<sc.getColumns().size();i++){
			QTableColumn tci = (QTableColumn)sc.getColumns().get(i);
			String ti = tci.getQtable().getTable().getName();
			if(selectClauses.containsKey(ti+tci.getColumn().getName()))
				return false;
		}
		return true;
	}
	
	public static List<DataAccessObject> getAllDistinctSuppliers(DataAccessObject dao){
		ArrayList<DataAccessObject> ris = new ArrayList<DataAccessObject>();
		if (dao.getLookupResolvers()!=null){
			Iterator<LookupResolver> it_lr = dao.getLookupResolvers().getResolvers().iterator();
			while(it_lr.hasNext()){
				LookupResolver currLR = it_lr.next();
				DataAccessObject currSupp = currLR.getSupplierDAO();
				if (currSupp != null && !ris.contains(currSupp))
					ris.add(currSupp);
			}
		} 
		return ris;
	}
	
	public static String getSingleSelectClause(it.csi.mddtools.datagen.QCalculatedColumn qcc){
		String ris = qcc.getFreeTextExpression();
		for(int i=0; i<qcc.getReferencedColumns().size(); i++){
			QResultColumn currQResCol = qcc.getReferencedColumns().get(i);
			String subst = "";
			if (currQResCol instanceof QCalculatedColumn){
				subst = "???QCalculatedColumn non ancora supportata???";
			}
			else if (currQResCol instanceof QTableColumn){
				QTableColumn qtc = (QTableColumn)currQResCol;
				if (qtc.getQtable()!=null){
					// aggiungo l'alias o il nome della tabella
					if (qtc.getQtable().getAliasName()!=null && qtc.getQtable().getAliasName().length()>0){
						subst += qtc.getQtable().getAliasName()+".";
					}
					else {
						if (qtc.getQtable().getTable()!=null)
							subst += qtc.getQtable().getTable().getName()+".";
						else
							subst+= "#ERRORE#";
					}
					// aggiungo il nome della colonna
					if (qtc.getColumn()!=null)
						subst+=qtc.getColumn().getName();
					else
						subst+= "#ERRORE#";
				}
				else
					subst+= "#ERRORE#";
			}
			else{
				subst = "???"+currQResCol.getClass()+" non ancora supportata???";
			}
			String pattern = "\\$"+(i+1);
			System.out.println("pattern: "+pattern);
			System.out.println("subst:"+subst);
			ris = ris.replaceFirst(pattern, subst);
			System.out.println("ris:"+ris);
		}
		// aggiungo l'alias
		ris += " AS "+qcc.getAlias();
		return ris;
	}
	
	
//	public static boolean areAllFkNamesUnivocal(List<it.csi.mddtools.rdbmdl.Table> list){
//		
//		
//		
//		boolean isUnique = true;
//		ArrayList<String> listFK = new ArrayList<String>();
//		//riempio un array di FK
//		for(int i=0;i<list.size();i++){
//			if(list.get(i).getForeignKeys()!= null && list.get(i).getForeignKeys().size()>0 ){
//				for(int j=0;j<list.get(i).getForeignKeys().size();j++){
//					listFK.add(list.get(i).getForeignKeys().get(j).getName());
//					if(isFkNameUnivocal(list, list.get(i).getForeignKeys().get(j).getName())){
//						isUnique=false;
//					}
//				}
//			}
//			
//		}
//		
//		return isUnique;
//		
//		
//		
//	}
//	
//	
//public static boolean areAllPkNamesUnivocal(List<it.csi.mddtools.rdbmdl.Table> list){
//		
//		
//		
//		boolean isUnique = true;
//		ArrayList<String> listFK = new ArrayList<String>();
//		//riempio un array di FK
//		for(int i=0;i<list.size();i++){
//			if(list.get(i).getPrimaryKey()!= null && list.get(i).getPrimaryKey().getIncludedColumns().size()>0 ){
//				for(int j=0;j<list.get(i).getPrimaryKey().getIncludedColumns().size();j++){
//					listFK.add(list.get(i).getPrimaryKey().getIncludedColumns().get(j).getName());
//					if(isPkNameUnivocal(list, list.get(i).getPrimaryKey().getIncludedColumns().get(j).getName())){
//						isUnique=false;
//					}
//				}
//			}
//			
//		}
//		
//		return isUnique;
//		
//		
//		
//	}
//
//	private static boolean isFkNameUnivocal(List<Table> list, String name) {
//		
//		int chk = 0;
//		if(list!=null && list.size()>0){
//			for(int i=0;i<list.size();i++){
//				if(name.equals(list.get(i))){
//					chk++;
//				}
//			}
//			
//		if(chk>1){
//			return false;
//		}else{
//			return true;
//		}
//			
//		}
//		return false;
//		
//	}
//	
//private static boolean isPkNameUnivocal(List<Table> list, String name) {
//		
//		int chk = 0;
//		if(list!=null && list.size()>0){
//			for(int i=0;i<list.size();i++){
//				if(name.equals(list.get(i))){
//					chk++;
//				}
//			}
//			
//		if(chk>1){
//			return false;
//		}else{
//			return true;
//		}
//			
//		}
//		return false;
//		
//	}
	
}//fine classe


