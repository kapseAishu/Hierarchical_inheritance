package com.prime.javaintro.HierarchicalInh;

public class MainCompany {
public static void main(String []args) {
	Company c=new Company();
	c.swipe(100,"Aish");
	
	Developers d=new Developers();
	d.swipe(101, "Jagadeesh");
	d.develop();
	
	Testers t=new Testers();
	t.swipe(111, "Sai");
	t.tester();
}
}
