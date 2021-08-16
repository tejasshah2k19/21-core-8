class SingleInh{

    public static void main(String[] args) {
        Singhma2 s2 = new Singam2();

        s2.vv();
        s2.ss();
        
    }
}

class Singham1 {

    void vv(){
        System.out.println("Singam1");       
    }

}


class Singhma2 extends Singam1{

    void ss(){

        System.out.println("Singam2");
    } 
}