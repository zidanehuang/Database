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
		db.add(new CD("��������ĸ��","����Ѹ",1, 15, "�ǳ�����"));
		db.add(new CD("�Ǳ�","��ѧ��",4, 60, "����"));
		db.list();
	}

}
