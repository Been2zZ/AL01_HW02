package PoweringANumber;

public class PoweringANumber {

    public int Powering(int A, int n) {
        int num;

        if(n <= 0)   return 1;

        if(n%2 == 0)    num = Powering(A, n/2) * Powering(A, n/2);  // even
        else  num = Powering(A, n/2) * Powering(A, n/2) * A;        // odd

        return num;
    }
}
