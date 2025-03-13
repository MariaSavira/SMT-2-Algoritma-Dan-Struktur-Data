public class Faktorial{
    static int faktorialBF (int n){
        int fakto = 1;
        int i = 0;
        do {
            i++;
            fakto *= i;
        } while (i < n);
        return fakto;
    }

    static int faktorialDC (int n){
        if (n == 1){
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}