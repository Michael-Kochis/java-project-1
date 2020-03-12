package com.revature.enums;

public enum ERSUserRole {
	ERS_UR_EMP, ERS_UR_FIN_ADM;
	
	public static long typeToLong(ERSUserRole ersu) {
		if (ersu.equals(ERS_UR_EMP)) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static ERSUserRole longToType(long ersu) {
		int x = ((int) ersu);
		switch(x) {
		  case 1: return ERSUserRole.ERS_UR_FIN_ADM;
		  default: return ERSUserRole.ERS_UR_EMP;
		}
	}
}
