package day27;

public class C05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java candir");
        sb1.delete(4,5);
        System.out.println(sb1); // Javacandir
        System.out.println(sb1.deleteCharAt(9)); // Javacandi
        System.out.println(sb1);// Javacandi

        System.out.println(sb1.insert(9, "r")); //Javacandir
        System.out.println(sb1);//Javacandir
        sb1.insert(4," ");
        System.out.println(sb1); // Java candir
        String str= " can bize gelecekmis";
        sb1.insert(11,str,0,4);
        System.out.println(sb1);// Java candir can
        sb1.replace(12,15," Can");
        System.out.println(sb1); // Java candir  Can
    }
}
