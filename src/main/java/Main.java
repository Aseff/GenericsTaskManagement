public class Main {

    public static void main(String[] args) {
        Container container=new Container();
        User user=container.<User>doItAndRun(null);
       // Container<User> container = new Container<User>(new User());// burda User yerine String-in de objectini gondere bilerdi.
        // Ve belece callObject metodu geriye uSER IN OBJECTINI RETURN EDECEK .VE KIMSE uSER YERINE sTRINGI OTURSE
        //CONSTRUCTORA STRING IN OBJECTINI OTURECEK.

        //callObject(container);



    }


//    public static void callObject(Container<User> container) {
//        User user=container.doItAndRun();// vE  BELECE BURDA CLASSCASTEXCEPTION ALACAYIQ.
//        // java.lang.ClassCastException: java.lang.String cannot be cast to User
//        //Ve bizim proqramimiz type safe deyil.
//        //Ve bunun qarshisini almaq ucun Generics deye anlayis var,
//        //Container<T> diamond moterize acirlar. Iceriye isteniern HERF OTURE BILERIK CApiTAL HERFLERLE.bURDA T yazmisiq
//        //Ve bu herfi asagida oturduyumuz Object yerine de yazirsan (private T object;)
//        //vE BELECE OTURDUYUMUZ OBJECTLER HAMISI OZUNU O CLASSIN OBJECT KIMI APARIR.
//        //Ve harda istifade edib o classin objectini yazsaq typein <T> yazirq
//        //Belece hemin classin metodlari da return type T tipinde olacaq.
//        //ve belece basqa metodda T calssina cast etmeye ehiyac qalmir
//        //deye bilersiz ki ele konkret Container clasinda User objecti yaraqdaq getsin de ne ucun bele edirik deye sorushsaz
//        // Burda itireceyiniz sey , bizim contianer classimiz istenilen classin objectine xidemet ede bilmir,
//        //yeni ki , biz her classda ferqli classlarin objectini oturub isleye bilerik
//        //Yaxsi bes Object object deyib onun objectini yaratsaq ne olar?
//        //Onda da type safety ni itireceyik // bilen bilmeyen basqa classalrin objectini oturecek ve classcastexception yeni type safety olmayacaq
//        // ve result olaqraq <> buna generics deyilir,
//        //Generics are used for tighter type checks at compile time and to provide a generic programming.
//        //Raw type nedir?
//        //Container container deyende yaninda diamonsuz =bu raw typedir , yeni sade hali
//        //type erasure nedir?
//        //Type erasure is a process in which compiler replaces a generic parameter with actual class or bridge method
//        // In type erasure, compiler ensures that no extra classes are created and there is no runtime overhead.
//        //Replace type parameters in generic type with their bound if bounded type parameters are used.
//        //
//        //Replace type parameters in generic type with Object if unbounded type parameters are used.
//        //
//        //Insert type casts to preserve type safety.
//        //
//        //Generate bridge methods to keep polymorphism in extended generic types.
//        //generics type safety-ni compile time verir
//        // <T extends User> ancaq user ve onun toremeleri islene biler
//        //wildcard metodlara da generics oture bilerik, ve o metodlari cagiranda istediyimiz objecti oturub rturn edirik.
//        //Eger class generics edend
//        //generics tipini metodun basinda elan etsem , o metodu cagirb Usere set edende casting elave edir compile zamani, biz onu gormuruk
//        //ve belece return olan object user tipinde olur
//         //Eger biz metoda hec ne gondermesek , yeni parameter olaraq bos olsa onda bes hansi calssin objectini goturuecek
    //Geriye object return edir .Bes niye hec ne gondermiyende object kimi gorurse bes niye eror  verirki oBJECT IS NOT TYPE uSER
    // CAVAB: SIRF METODUN TYPE-I GENERICS TIPI OLANDA(oBJECT YAZANDA OLMUR) AVTOMATIK sol terefde yazdigimiz classa cast edecek,bU SIRF METODLARA AIDDIR
    //gENERICSE GORE INHERITENCEDE EN SONUNNU CLASSS HANSIDIRSA ONA CAST OLUNUR
    //VE EGER ELAVE BU INHERITENCE ELAQESI OLAN METODLARDAN BASQA BIR METOD YAZSAQ(MES:String) onda eror verecek , cunki bilmir hansina cast etsin
    //eger biz metodun return typeni null etsek ve type-ni Object etsek onda o objecte cast eddcek.

//        System.out.println("u"+ user);
//    }
//}
}
