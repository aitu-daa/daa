// best-case:       n          linear   ~n   = Theta(n)       easy+useless       9
// average-cases              quadratic ~n^2 = Theta(n^2)     tricky+useful     27
// worst-case                 quadratic ~n^2 = Theta(n^2)     easy+useful       55

// insertion sort = quadtraic

import java.util.Arrays;

public class BestWorst {
    static void main() {
        int n = 10;
//        best
//        int [] A = new int []{30, 34, 36, 38, 49, 50, 73, 78, 97, 99}

//        worst
        int [] A = new int []{99, 97, 78, 73, 50, 49, 38, 36, 34, 30};

//        random
//        int [] A = new int [n];
//        Random random = new Random(2026);
//        for (int i = 0; i < n; i++) {
//            A[i] = random.nextInt(100);
//        }

        System.out.println(Arrays.toString(A));
        int sumcount=0;
        for (int i = 1; i < n; i++) { // outer loop
            int key = A[i];
            int j = i;

            int count = 1; // number of comparisons
            while (j>0 && A[j-1]>key){
                A[j] = A[j-1];
                j--;
                count++;
            }
            A[j] = key;
            System.out.println(Arrays.toString(A)+" "+ count);
            sumcount+=count;
        }
        System.out.println(sumcount);
    }
}

// worst
//[99, 97, 78, 73, 50, 49, 38, 36, 34, 30] 1
//[97, 99, 78, 73, 50, 49, 38, 36, 34, 30] 2
//[78, 97, 99, 73, 50, 49, 38, 36, 34, 30] 3
//[73, 78, 97, 99, 50, 49, 38, 36, 34, 30] 4
//[50, 73, 78, 97, 99, 49, 38, 36, 34, 30] 5
//[49, 50, 73, 78, 97, 99, 38, 36, 34, 30] 6
//[38, 49, 50, 73, 78, 97, 99, 36, 34, 30] 7
//[36, 38, 49, 50, 73, 78, 97, 99, 34, 30] 8
//[34, 36, 38, 49, 50, 73, 78, 97, 99, 30] 9
//[30, 34, 36, 38, 49, 50, 73, 78, 97, 99] 10
// 1 + 2 + 3 + ... + n = n*(n-1)/2 = O(n^2)

// average
// 1/2 + 2/2 + 3/2 + ... + n/2 = n*(n-1)/4 = O(n^2)
