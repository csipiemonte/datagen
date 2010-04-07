package it.csi.mddtools.datagen.genutils;

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
}
