package dotcom;

import java.util.ArrayList;

public class DotComm {
	ArrayList location = new ArrayList();
	String name;
	Boolean sunk;

	public DotComm(String name, String Loc1, String Loc2, String Loc3) {
		location.add(Loc1);
		location.add(Loc2);
		location.add(Loc3);
		this.name=name;
		sunk = false;
	}
	
	public Boolean IsHit(String Loc){
		int i=location.indexOf(Loc) ;
		if (i == -1){
			return false;
		}
		else {
			location.remove(i);
			int size=location.size();
			if (size == 0){ 
				sunk=true;
				return true;
			}
		}
		return true;
		
	}
	

}
