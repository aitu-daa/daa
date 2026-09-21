package week03;

public class FastPowerMain{
    // Roughgarden
    // Problem 3.1

    // $T(b) = T(b/2) + O(1)$

    public static void main(){
        int r = fastPower(2,7);
        IO.println(r);
    }

    public static int fastPower(int a, int b){
        if (b==1) return a;
        else {
            int c = fastPower(a,b/2);
            if (b%2==0){
                return c*c;
            } else{
                return c*c*a;
            }
        }
    }

}
