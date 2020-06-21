public class Fibonacci{
    public static int of (int n){
        if(n==1||n==2){
            return 1;
        }
        if(n>2){
            return of(n-1)+of(n-2);
        }
        return -1;
    }
    public static void main (String[] args) {
        int n=1,i;
        for(i=1;;i++){
            n=of(i);
            if(n<=200)
            System.out.printf("Fibonacci.of(%d)=%d\n",i,n);
            else
            break;
        }
    }
}