
public class Recursion{
   /*public static void printdec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n +" ");
        printdec(n-1);
    } 
    public static void printIn(int n){
        if(n ==1){
            System.out.println(n);
            return;
        }
        printIn(n-1);
        System.out.println(n+" ");

    }
    //PROBLEM 3
    public static int fact(int n){
        if( n == 0 ){
            return 1;
        }
        int fnc = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    //PROBLEM 4
    public static int calSum(int n){
        if(n ==1 ){
            return 1;
        }
        int sn1 = calSum(n-1);
        int sn = n + sn1;
        return sn;
    }
    // PROBLRM 5 FIBONACCI SERIES
    public static int fib(int n){
        if( n ==0 || n ==1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int fn = f1 +f2;
        return fn;
    }
    //  PROBLEM 6 ARRAY IS SORTED 
    public static boolean isSorted(int arr[],int i ){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    //PROBLEM 7 
    public static int FirstOc(int arr[],int key,int i){
        if(arr[i] == key ){
            return i;
        }
        return FirstOc(arr,key,i+1);
    }
    //PROBLEM 8 
    public static int LastOc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = LastOc(arr, key, i+1);
        if(isFound == -1 && arr[i]== key){
            return i;
        }
        return isFound;
    }
    //PROBLEM 9 
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        int xm1 = pow(x,n-1);
        int xn = x *xm1;
        return xn;
    }
    //PROBLEM 10
    public static int poww(int x, int a){
        if(a == 0){
            return 1;
        }
        int halfp = poww(x,a/2);
        int halfpsq = halfp*halfp;
        if(a %2 != 0){
            halfpsq = x * halfpsq;
        }
        return halfpsq;
    }
    //PROBLEM 11
    public static int tillingp(int n){
        if(n ==0 || n ==1){
            return 1;
        }
        int fnm1 = tillingp(n-1);
        int fnm2 = tillingp(n-2);
        int tot = fnm1 +fnm2;
        return tot;
    }
    // PROBLEM 12 
    public static void removeDup(String str, int ind , StringBuilder newStr, boolean map[]){
        if(ind == str.length()){
            System.out.println(newStr);
            return ;
        }

        char charc = str.charAt(ind);
        if(map[charc - 'a']== true){
            removeDup(str,ind+1,newStr,map);
        }else{
            map[charc - 'a'] = true;
            removeDup(str,ind+1,newStr.append(charc),map);
        }
    }
    // PROBLEM 13
    public static int friendspair(int n){
        if(n ==1 || n ==2 ){
            return n;
        }
        int fnm1 = friendspair(n-1);
        int fnm2 = friendspair(n-2);
        int pways = (n-1)* fnm2;
        int tways =fnm1 + pways;
        return tways; 
        // SINGLE LINE CODE 
        // return friendspair(n-1) + (n-1)*friendspair(n-2);
    }*/
    public static void Binstr(int n ,int ls , String str){
        if(n == 0){
            System.out.println(str);
            return ;
        }
        Binstr(n-1, 0, str+"0");
        if(ls == 0)
            Binstr(n-1, 1, str+"1");
        
    }



    public static void main(String[] args) {
       /* int n =10;
        printdec(n); 
        int n = 10;
        printIn(n);
        int n = 5;
        fact(n);
        System.out.println(fact(n));
        int n =5;
        System.out.println(calSum(n));
        int n = 5;
        System.out.println(fib(n));
        int arr[]= {1,2,3,4,5};
        System.out.println(isSorted(arr,0));
        int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(FirstOc(arr,5,0));
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOc(arr, 5, 0));
        System.out.println(pow(2, 10));
        System.out.println(poww(2,5));
        System.out.println(tillingp(3));*
        String str ="ayaankhan";
        removeDup(str,0,new StringBuilder(""), new boolean [26]);
        System.out.println(friendspair(3)); */
        Binstr(3, 0, "");

    }
}
