import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class LeetCode3783 {
    static void main(String[] args){
        int a = 87945, b;
        b= reversao(a);
        System.out.println(b);
        System.out.println(mirrorDistance(a));
        System.out.println(mirrorDistance(25));
        System.out.println(mirrorDistance(10));
        System.out.println(7);
    }
    static int mirrorDistance(int n) {
        return abs(n-reversao(n));
    }
    static int reversao(int n){


        int reverso=0;
        if (n<10) {
            reverso = n;
        }
        else {
            while (true) {
                reverso =reverso * 10 + (n % 10);
                n = (n - (n % 10)) / 10;
                if (n == 0)
                    break;
            }
        }
        return reverso;
    }
}
