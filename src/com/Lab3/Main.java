package com.Lab3;

public class Main {

    public static void main(String[] args) {
	/*Formula first=new Formula();
    first.set(-15.246, 0.04642, 2000.1);
    first.run();
    first.print();*/
    Vector vector1=new Vector(5,6,5,4,3,3);
    Vector vector2=new Vector (4,8,9,0,3,1);
    Vector result=vector1.multiply(vector2);
    result.print();
    }
}
