package database;

import java.util.ArrayList;

public class Database {
	private ArrayList<CD> listCD=new ArrayList<CD>();
	
	public void add(CD cd) {
		listCD.add(cd);}
	public void list() {
		for(CD cd:listCD) {
			cd.print();
		}
	}
	
	public static void main(String[] args) {
		Database db=new Database();
		db.add(new CD("陪伴是最长情的告白","陈奕迅",1, 15, "非常好听"));
		db.add(new CD("吻别","张学友",4, 60, "好听"));
		db.list();
	}

}
