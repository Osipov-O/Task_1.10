package com.company;

public class Main {

    public static void main(String[] args) {
	double a = 50;
	double b = 100;
	double x = 150;
	double y =50;
	double z = 100;

	if ( x<=a && y<=b || x<=b && y<=a ) System.out.println("проходит");
	else if ( y<=a && z<=b || y<=b && z<=a ) System.out.println("проходит");
	else if ( x<=a && z<=b || x<=b && z<=a ) System.out.println("проходит");
	else System.out.println("не проходит");

    }
}
