public class binaryExponentiation{
    public static void main(String[] args) {
        System.out.print(binaryExp(3, 4));
    }
    static long binaryExp(int a,int b){
        long res=1;
        while(b>0){
            if((b&1)==1)
             res*=a;
            a*=a;
            b>>=1;
        }
        return res;
    }
}