package it.csi.mddtools.datagen.genutils;

import it.csi.mddtools.datagen.Deleter;
import it.csi.mddtools.datagen.Finder;
import it.csi.mddtools.datagen.OrderSpec;
import it.csi.mddtools.datagen.Updater;
import it.csi.mddtools.rdbmdl.Column;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

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
		org.openarchitectureware.util.stdlib.PropertiesExtension.getProperties().list(System.out);
	}
	
	public static void backupProperties(){
		System.out.println("Backup properties originarie");
		Properties orig = org.openarchitectureware.util.stdlib.PropertiesExtension.getProperties();
		Properties bkpProps = new Properties();
		bkpProps.putAll(orig);
		_origProps = bkpProps;
		
	}
	
	public static void restoreProperties(){
		System.out.println("Restore properties originarie");
		if (_origProps!=null){
			org.openarchitectureware.util.stdlib.PropertiesExtension.setProperties(_origProps);	
		}
		_origProps = null;
		
	}
	
	static Properties _origProps=null;
	
	public static void setProperty(String name, String val){
		java.util.Properties props = org.openarchitectureware.util.stdlib.PropertiesExtension.getProperties();
		props.put(name, val);
		org.openarchitectureware.util.stdlib.PropertiesExtension.setProperties(props);
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
	
}
