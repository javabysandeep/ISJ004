package accessSpecifiers.p2;

import accessSpecifiers.p1.A;

class C extends A{

    public static void main(String[] args) {
        System.out.println(A.a);
        //System.out.println(A.b); //private
        System.out.println(A.c);
        //System.out.println(A.d);//default
    }
}
