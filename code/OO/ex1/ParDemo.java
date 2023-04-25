package ex1;

public class ParDemo {

    public static void main(String[] args){
        ChkNum e = new ChkNum();

        if(e.ePar(10)) {
            System.out.println("10 é par");
        }

        if(e.ePar(9)){
            System.out.println("9 é par");
        }

        if(e.ePar(8)){
            System.out.println("8 é par");
        }
    }
}