import java.util.Random;

//                    n=10   n=50     n=75    n=100   n=10000       n=100000
// insertion sort     3656   17639   46000   69000   26 413105     801 352677
// merge     sort     6472   28695   48000   66189    2 773578      18 386710
// hybrid    sort     3376   15959   26561   44150    2 075439      17 273040

// insertion sort     4709                   77367   26 127566    1281 127587
// merge     sort    17211                            3 845959       30 980919
// hybrid    sort     5545                            3 220192       31 687513


public class HybridMergeSort {
    public static void main(String[] args) {
        int n =100000;
        int [] A = new int[n];
        Random rand = new Random(2026);
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(1000000000);
        }

        // System.out.println(Arrays.toString(A));
        long t1 = System.nanoTime();
//         insertSort(A);
//         mergeSort(A);
        hybridSort(A);
        long t2 = System.nanoTime();
        // System.out.println(Arrays.toString(A));
        System.out.println(t2-t1);
    }

    public static void insertSort(int []A){
        insertSort(A,0,A.length-1);
    }
    public static void insertSort(int []A, int left, int right){
        int n = right+1;
        for (int i = left+1; i < n; i++) {
            int key = A[i];
            int j = i;
            while(j>left && A[j-1]>key){
                A[j] = A[j-1];
                j--;
            }
            A[j] = key;
        }
    }
    public static void merge(int []A,int left, int right){
        int middle = (left+right)/2;
        int [] B = new int[right-left+1];
        int ileft = left;
        int iright = middle+1;
        for (int i = 0; i < B.length; i++) {
            if (ileft==middle+1){
                B[i] = A[iright++];
                continue;
            }

            if (iright==right+1){
                B[i] = A[ileft++];
                continue;
            }
            if(A[ileft]<A[iright]){
                B[i] = A[ileft++];
            } else{
                B[i] = A[iright++];
            }
        }
        for (int i = 0; i < B.length; i++) {
            A[left+i] = B[i];
        }
    }
    public static void mergeSort(int []A){
        mergeSort(A,0,A.length-1);
    }
    public static void mergeSort(int []A, int left, int right){
        if (left==right) return; // array size equals
        int middle = (left+right)/2;
        mergeSort(A,left,middle);
        mergeSort(A,middle+1,right);
        merge(A,left,right);
    }
    public static void hybridSort(int []A){
        hybridSort(A,0,A.length-1);
    }
    public static void hybridSort(int []A, int left, int right){
        if (right-left+1<=16){
            insertSort(A,left,right);
            return;
        }
        int middle = (left+right)/2;
        hybridSort(A,left,middle);
        hybridSort(A,middle+1,right);
        merge(A,left,right);
    }
}

