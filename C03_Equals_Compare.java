package day27;

public class C03_Equals_Compare {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="java";


        //System.out.println(sb1==str);
        // javada farklı data turune sahip non primitive objeler == ile karsılastırılamaz.
        System.out.println(sb1==sb2); //false
        System.out.println(sb1==sb1);//true
        System.out.println(sb1.equals(sb2));//false
        // cunku stringbuilder classında equals methodu yoktur.equals methodunu parent classi olan object
        //classından kullanır ve bundan dolayı iceriklere bakmadan false verir.

        // String builderda icerik aynı olsa bile equals methodu false döner
        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1));//tru

        // iki StringBuilderın iceriklerinin aynı oldgunu kontrol etmek icin compareTo() kullanılır.

        System.out.println(sb1.compareTo(sb2));//0
        //System.out.println(sb1.compareTo(str));cte

        StringBuilder sb3=new StringBuilder("Hava");
        StringBuilder sb4=new StringBuilder("Hara");


        System.out.println(sb1.compareTo(sb3)); //2
        System.out.println(sb1.compareTo(sb4));//2
        System.out.println(sb3.compareTo(sb4));//4
        System.out.println(sb4.compareTo(sb3));//-4

        /*
        compareTo() karsılastırılan StringBuilderlar aynı metne sahipse 0 döner
        aynı dgilse bastan itibaren kontrole baslar.Farklı olan ilk harfin karsılastirilan
        kelimedeki aynı indexdeki harften kac harf ilerde oldugunu dondurur.
         */


    }
}
