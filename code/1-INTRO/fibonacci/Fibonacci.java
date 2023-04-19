class Fibonacci{
    public static void main(String[] args) {
        
        int x=0; int z; int y = 1;
        int i; int N = 15;

        System.out.println(x);
        System.out.println(y);
        
        for(i=1;i<N;i++) {
            z=x+y;
            System.out.println(z);
            x=y; y=z;
        }
    }  
}