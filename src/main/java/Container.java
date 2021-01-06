public class Container {



    public <T> T doItAndRun(String s){
        T t=null;
        System.out.println(t instanceof User);
        System.out.println(t instanceof Object);
        System.out.println("I did smth");
        T t2= (T) s;
        return t2;
    }
//
//    public <T> User doItWithUser(){
//        System.out.println("User objectini return edeceksen");
//        return ;
//    }
}
