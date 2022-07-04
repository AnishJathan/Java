import java.util.Scanner;
class missingNumber {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in .nextInt();
    int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++)
            arr[i] = in.nextInt();
            System.out.println(missingNumberFinder( arr,size));
        }
        static int missingNumberFinder(int array[], int n) {
                // write your code here
                int sum1=0,sum2=0;
                for (int i=1 ; i<=n ; i++){
                    sum1 += i;
                }
               for (int j=0 ; j< array.length;j++){
                    sum2 +=array[j];
               }
               return sum1-sum2;
            }
}

//,,
