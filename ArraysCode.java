import java.util.Scanner;
import java.util.Arrays;

public class ArraysCode {
    
    
	public static void main (String[] args) throws java.lang.Exception
	{   ArraysCode s = new ArraysCode();
       // s.project1();
       int [] arr1 = {2,3,4,5,6,7,8,10,9};
        int [] arr2 = {2,3,4,5,6,7,8,9,10};
        int[][] matrix = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42},
            {43, 44, 45, 46, 47, 48, 49}
        };

        s.rotatingMatrixBy90(matrix,7);

      //  s.findMissingNumberInArray(arr);
     //  int [] ans =  s.pairsHavingSameSum(arr, 9);
     //  System.out.println("Is a permutation -"+s.isPermutation(arr1, arr2));
      //s.allPairsHavingSameSum(arr, 9);


      
	}

    public void rotatingMatrixBy90(int [] [] arr,int n){

        //Without creating an array : 
        int tmp1,tmp2,tmp3,tmp4;
        for(int k =0;k<n-2;k++){ // k is the  no. of out squares which can be formed . 
                  for(int i =k;i<n-1-k;i++){
          tmp1 = arr[k][i];
          tmp2 = arr[n-1-k][n-1-i];
          tmp3= arr[i][n-1-k];
          tmp4 = arr[n-1-i][k];
          
          arr[k][i]=tmp4;
          arr[n-1-i][k]=tmp2;
          arr[n-1-k][n-1-i]=tmp3;
          arr[i][n-1-k]=tmp1;
         

        }
        }
      
      for(int i =0;i<n;i++){
        for(int j = 0;j<n;j++){
            System.out.print(arr[i][j]+",");
        }
        System.out.println();
      }
        //By creating another matrix 
       /*  int [][] ans = new int[3][3];
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                ans[i][j]=arr[2-j][i];
                  System.out.print(ans[i][j]+",");
            }
            System.out.println();
        }*/
      }
    /**
     *  Checks if same element are present in both the arrays , (may not be in the same  order)
     * @param a
     * @param b
     */
    public boolean isPermutation (int [] a, int [] b){
                int l1 = a.length;
                int l2 = b.length;
                int sum1=0,sum2=0,prod1=1,prod2=1;
                if(l1!=l2){
                    return false;
                }

                else{
                    for(int i =0;i<l1;i++){
                        sum1+=a[i];
                        prod1*=a[i];
                    }
                     for(int i =0;i<l2;i++){
                        sum2+=b[i];
                        prod2*=b[i];
                    }
                    if(sum1==sum2 && prod1==prod2)
                    return true;
                }


                return false ;

    }

    public void findMissingNumberInArray(int arr[] ){
            int n = arr.length + 1;
            int sum = (n*(n+1))/2;
            int sum2 = 0;
            for(int i = 0;i<arr.length;i++){
                sum2+=arr[i];
            }
            System.out.println("Missing no. = "+(sum-sum2));
    }
    /**
     * 
     * @param arr
     * @param sum
     * @return only 1 soln of a valid pair 
     */
    public int []  pairsHavingSameSum(int arr[], int sum){
        /**
         * O(n^2) - using 2 loops 
         * O(nlogn) - using 1 loop and Binary Search 
         * 
         */
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==sum){
                    return new int[] {i,j};
                }
            }
        }
       throw new IllegalArgumentException("No Solution found");
    }

    /**
     * 
     * @param arr
     * @param sum
     * @return only 1 soln of a valid pair 
     */
    public void  allPairsHavingSameSum(int arr[], int sum){
        /**
         * O(n^2) - using 2 loops 
         * O(nlogn) - using 1 loop and Binary Search 
         * 
         */
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==sum){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                  //  return new int[] {i,j};
                }
            }
        }
      // throw new IllegalArgumentException("No Solution found");
    }






     public void project1(){
             Scanner sc= new Scanner(System.in);
        int days,ct=0;
        float sum=0.0F;
        System.out.println("How many days temperature?");
        days = sc.nextInt();
         float[] arr = new float[days];
        for(int i =0 ;i<days;i++){
            System.out.println("Enter Day "+(i+1)+" temperature-");
            arr[i] = sc.nextFloat();
            sum+=arr[i];
        }
        float avg = sum/days;
       for(int i = 0;i<days;i++){
                if(arr[i]>avg){
                    ct++;
                }
       }
       System.out.println("Average temp = "+avg);
       System.out.println("No. of days with higher temp = "+ct);

     }
      public int[] insertAtLocation(int pos, int[]arr,int n ){
        int len = arr.length;
        if(pos-1 >= 0 && pos<=len){
            arr[pos-1]=n;
            return arr;
        }

       /*  if(pos<len){
         for(int i = len-1;i>pos-1;i--){
            arr[i] = arr[i-1];
         }
         arr[pos-1] = n;
        }*/



        return arr;
 
    }
}