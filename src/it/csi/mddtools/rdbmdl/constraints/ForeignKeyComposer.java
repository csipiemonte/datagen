package it.csi.mddtools.rdbmdl.constraints;

import java.util.List;

public class ForeignKeyComposer {

	
	//nome della tabella su cui vi e' la FK
	String fkTableName;
	//lista dei nomi delle colonne FK
	List<String> fkColumnNames;
	//lista dei nomi delle colonne pk referenziate dalla FK
	List<String> pksColumNames;
	//nome della tabella PK cui e' relazionata la FK
	String pkTableName;
	
	//costruttore vuoto
	public ForeignKeyComposer(){}







	public String getFkTableName() {
		return fkTableName;
	}







	public void setFkTableName(String fkTableName) {
		this.fkTableName = fkTableName;
	}







	public List<String> getFkColumnNames() {
		return fkColumnNames;
	}







	public void setFkColumnNames(List<String> fkColumnNames) {
		this.fkColumnNames = fkColumnNames;
	}







	public List<String> getPksColumNames() {
		return pksColumNames;
	}







	public void setPksColumNames(List<String> pksColumNames) {
		this.pksColumNames = pksColumNames;
	}







	public String getPkTableName() {
		return pkTableName;
	}







	public void setPkTableName(String pkTableName) {
		this.pkTableName = pkTableName;
	};
	
	
}
