// import java.util.Scanner;
// import java.utill.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ArraysBasics{
/* public static int lnsrch(int num[],int key ){
    //     for(int i =0;i<num.length;i++){
    //         if(num[i]== key){
    //             System.out.println("key found");
    //             return i;
    //         }
    //     }               return -1;

    // }
    public static int lnsrchh(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }return -1; 
    }
    public static int getlar(int num[]){
        int lar=Integer.MIN_VALUE;
        int sma = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(lar <num[i]){
                lar = num[i];
            }
            if(sma >num[i]){
                sma = num[i];
            }
        }System.out.println("The smallest value is "+sma);
        return lar;
    }
    public static int bnsrch(int n[],int key){
        int start =0;
        int end = n.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(n[mid] == key){
                return mid;
            }
            else if(n[mid]<key){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
        }return -1;
    }
    public static void rev(int arr[]){
        int f=0,l=arr.length-1;
        while(f<l){
            int temp=arr[l];
            arr[l]=arr[f];
            arr[f]= temp;
            f++;
            l--;

        }
    }
    public static void printpairs(int num[]){
        for(int i =0;i<num.length;i++){
            int cur = num[i];
            int tp=0;
            for(int j=i+1;j<num.length;j++){
                System.out.println("("+cur+","+num[j]+")");
                tp++;
                }
        }System.out.println();
        System.out.println("Total pairs :"+tp);
    }
    public static void subarr(int num[]){
        // int ts=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start =i;
            for(int j=i;j<num.length;j++){
                int end =j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                    sum+=num[k];
                }
                // ts++;
                System.out.println();
                System.out.print("Sum of subarray is:"+sum);
                System.out.println();
                if(maxsum<sum){
                    maxsum=sum;
                }

            }System.out.println();

        }
        // System.out.println(ts);
        System.out.println("Maximum subarray sum is: "+maxsum);
    }
    //prefix array su = method
    public static void prefixarr(int num[]){
        int maxs =Integer.MIN_VALUE;
        int sum =0;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i =0;i<num.length;i++){
            int start =i;
            for(int j=i;j<num.length;j++){
                int end=j;
                sum= start ==0? prefix[end] :prefix[end]-prefix[start-1];
                if(maxs<sum){
                    maxs = sum;
                }
            }
        }System.out.println("max sum is"+maxs);
    }
    public static void kadens(int num[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs+=num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
       }System.out.println("The maximum sub array sum is: "+ms);
    } 
    public static void kadens2(int nuu[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i =0;i<nuu.length;i++){
            cs+=nuu[i];
            if(cs <0){
                ms=Math.max(ms, cs);
            }
        }System.out.println("The maximum number is :"+ms);
    } 
    // RAIN WATER PROBLEM 
    public static int trappedwater(int height[]){
        int n = height.length;
        int leftm[]= new int[n];
        leftm[0]=height[0];
        for(int i=1;i<n;i++){
            leftm[i]= Math.max(height[i], leftm[i-1]);
        }
        int rmax[]=new int[n];
        rmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]= Math.max(height[i], rmax[i+1]);
        }
        int tp=0;
        for(int i=0;i<n;i++){
            int wl= Math.min(leftm[i], rmax[i]);
            tp+=wl-height[i];

        }return tp;
    }
    public static int buysellstock(int prices[]){
        int buyp=Integer.MAX_VALUE;
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            if(buyp<prices[i]){
                int profit = prices[i]-buyp;
                maxp = Math.max(maxp, profit);
            }else{
                buyp = prices[i];
            }
        }return maxp;
    }
    public static void bubblesort(int arr[]){
        for(int t=0;t<arr.length-1;t++){
            for(int j=0;j<arr.length-1-t;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minp=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minp]>arr[j]){
                    minp=j;
                }
            }
            int temp =arr[minp];
            arr[minp]=arr[i];
            arr[i]=temp;
        }
    }  
      public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
      }
      public static void countsort(int arr[]){
        int lar= Integer.MIN_VALUE;
        for( int num:arr){
            lar = Math.max(lar,num);
        }
        int count []=new int[lar+1];
        for(int  num:arr){
            count[arr[num]]++;
        }
        int indx=0;
        for(int j=0;j<count.length;j++){
            while (count[j]>0) {
                arr[indx]=j;
                indx++;
                count[j]--;
            }
        }
    }
    //2D Arrays 
    //lec-14
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]== key){
                    System.out.println("Key found at cell :("+i+","+j+")");
                    return true;
                }
            }
        }return false;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int sr = 0; // start row
        int sc = 0; // start col
        int er = matrix.length - 1; // end row
        int ec = matrix[0].length - 1; // end col

        while (sr <= er && sc <= ec) {
            // top
            for (int j = sc; j <= ec; j++) {
                result.add(matrix[sr][j]);
            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                result.add(matrix[i][ec]);
            }
            // bottom
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) {
                    result.add(matrix[er][j]);
                }
            }
            // left
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) {
                    result.add(matrix[i][sc]);
                }
            }
            sr++;
            sc++;
            er--;
            ec--;
        }

        return result; // returning the list instead of printing
    }
    public static int  diagSum(int mat[][]){
        int sum=0;
        int n= mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
            //primary diag
                if(i==j){
                    sum+=mat[i][j];
                }
                // secondary diag
                else if(i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }// HERE TC = O(N2) SO OPTIMIZED CODE IS OTHER ONE THIS ONE DOWN
    public static int diagS(int mat[][]){
        int sum =0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            sum += mat[i][i];
        
        if( i!=n-i-1){
            sum +=mat[i][n-i-1];
        }
    }return sum;
    }HERE TC IS O(N)
    */
    public static boolean stairCase(int mat[][],int key){
        int r=0,c=mat[0].length-1;
        while (r<=mat.length-1 && c>=0) {
            if(mat[r][c]==key){
                System.out.println("Key found at ("+r+","+c+")");
                return true;
            }
            else if(key< mat[r][c]){
                c--;
            }
            else{
                r++;
            }
        }return false;
    }




    public static void main(String args[]){
        /*  int arr[] = new int [4];
        // Scanner sc = new Scanner(System.in);
        // arr[0]=sc.nextInt();
        // arr[1]=sc.nextInt();
        // arr[2]=sc.nextInt();
        // System.out.println("math marks:"+arr[2]);
        // System.out.println("math marks:"+arr[1]);
        // System.out.println("math marks:"+arr[0]);

        int num[]= {2,6,4,8,10,12,14};
        int key =10;
        int index =lnsrch(num, key);
        if(index == -1){
            System.out.println("error ");
        }
        else{
            System.out.println("key found at index "+index);
        }
        String menu[]={"akk","arr","ann"};
        String key ="arr";
        int ind = lnsrchh(menu, key);
        if(ind ==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index "+ind);
        }
        int num[]={1,2,6,5,7,9};
        System.out.println("The largest value is :"+getlar(num));
        int n[]={1,3,4,6,8,10,12,14};
        int key = 10;
        System.out.println("Index for key is :"+bnsrch(n, key));
        int arr[]={2,4,6,10};
            rev(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }System.out.println();
        int num[]={2,4,6,8,10};
        printpairs(num);
        // int num[]={2,4,6,8,10};
        int num[]={1,-2,6,-1,3};
        subarr(num);
        int num []={1,-2,6,-1,3};
        prefixarr(num); 
        int num []={-2,-3,4,-1,-2,1,5,-3};
        kadens(num);
        int nuu[]={-1,-2,-3,-4};
        kadens2(nuu);
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));
        int prices []= {7,1,5,3,6,4};
        System.out.println(buysellstock(prices)); 
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printarr(arr);
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printarr(arr);*
        int arr[]={5,4,1,3,2};
        // insertionSort(arr);
        Arrays.sort(arr);
        printarr(arr);
        int arr[]={1,4,1,3,2,4,3,7};
        countsort(arr);
        printarr(arr);
        // 2D ARRRAYS 
        //LEC-14
      
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

          // Fill the matrix with user input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                        matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for the number 5
        search(matrix, 5);
        int matrix[][]= {{1,2,3},
                        {5,6,7},
                        {9,10,11}};
        ArraysBasics sol = new ArraysBasics();
        List<Integer> result = sol.spiralOrder(matrix);
        System.out.println(result);


        // spiralOrder(matrix);
        int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // System.out.println(diagSum(mat));
        System.out.println(diagS(mat));*/
        int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key =14;
        System.out.println(stairCase(mat, key));

    }
}
