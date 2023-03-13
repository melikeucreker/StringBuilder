package day27;

public class C04_StringBuilderdastringmethodlari {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Candir");
        StringBuilder sb2=new StringBuilder("Java candir");


        sb1.substring(5);
        System.out.println(sb1); // Java Candir
        //sb1=sb1.substring(5)

        System.out.println(sb1.compareTo(sb2)); //-32
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3, 6);
        System.out.println(sb1); //Java Candir
        /*
        StringBuilder classında olmayıp string classında olan methodları kullanmak istersek sb.toString kullanarak,
        StringBuilder'ı önce stringe cevirip sonra istedigimiz string methodlarını kullanırız.
        bu konuda dikkat etmemiz gereken yer: string döndüren methodlar veya string classından kullanacagımız methodlar
        kalıcı degisiklik yapmaz.

         */

    }
}
