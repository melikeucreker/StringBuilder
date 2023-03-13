package day27;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//0
        sb1.append("mustafa");
        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//7

        sb1.append("Yılmazturk");
        System.out.println(sb1);//Mustafa Yılmazturk 18 karakter
        System.out.println(sb1.capacity());// 34 =2*eski capacity +2
        System.out.println(sb1.length()); // 18
        System.out.println(sb1.append("javayı cok sever sabah aksam java calisir."));
        System.out.println(sb1.capacity()); // 70=2*34+2
        System.out.println(sb1.length());

        //2.yontem

        StringBuilder sb2=new StringBuilder("Java candir");
        System.out.println(sb2.capacity()); // 27
        System.out.println(sb2.length()); // 11

        //3.yontem

        StringBuilder sb3=new StringBuilder(11);
        sb3.append("544785123");
        System.out.println(sb3.capacity()); //11
        System.out.println(sb3.length());//9

        String str=" Java Candir";
        sb3.append(str,4,str.length());
        System.out.println(sb3);
        sb3.trimToSize();
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());







    }
}
