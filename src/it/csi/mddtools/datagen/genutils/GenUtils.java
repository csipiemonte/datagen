package it.csi.mddtools.datagen.genutils;

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
		System.out.println("from:"+pkg);
		String path= pkg.replaceAll("\\p{Punct}", "/"); 
		System.out.println("to:"+path);
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
	
}
