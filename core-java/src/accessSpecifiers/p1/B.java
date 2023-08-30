package accessSpecifiers.p1;

class B {

    public static void main(String[] args) {
        System.out.println(A.a);
        //System.out.println(A.b);//private
        System.out.println(A.c);
        System.out.println(A.d);
    }
}
