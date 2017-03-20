package it.polito.tdp.libretto.model;

public class TestModel {

	public static void main(String[] args) {
		Model m = new Model();
		
		System.out.println(m.addEsame(new Esame("03FYZ","Tecninche di Programmazione", "Fulvio Corno")));
		System.out.println(m.addEsame(new Esame("0IQZP","Ambient Intelligence", "Fulvio Corno")));
		System.out.println(m.addEsame(new Esame("03FYZ","Tecninche di Programmazione", "Fulvio Corno")));
		
		System.out.println(m.trovaEsame("03FYZ"));
		System.out.println(m.trovaEsame("0IQZP"));
		System.out.println(m.trovaEsame("99QQQ"));
	}

}
