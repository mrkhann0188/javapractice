public class BitMan {
   /* public static void oddEven(int n ){
        int bitmask = 1;
        if(((n & bitmask)== 0)){
            System.out.println("Even no");
        }
        else{
            System.out.println("ODD NO ");
        }
    }       

   //GET I TH BIT
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        return 1;
    }
    public static int setIth(int n , int i){
        int bitmask = 1<<i;
            return n | bitmask;
        } 
    public static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        return n& bitmask;
    }  
    public static int updateIth(int n ,int i,int newBit){
        //FIRST METHOOD
        // if(newBit ==0){
        //     return clearBit(n, i);
        // }
        // else{
        //     return setIth(n, i);
        // }
        // SECOND METHOD 
        n = clearBit(n, i);
        int bitmask = newBit<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ((-1)<< i);
        return n& bitmask;
    }
    public static int clearangeI(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static boolean isPowerOf2(int n ){
        return (n & (n-1)) == 0;
    }*/
    public static int  countSetBit(int n) {
        int count = 0;
        while (n>0) {
            if((n&1) != 0 ){
                count++;
            }
            n = n>>1;
        }return count;
    }
    public static void main(String args[]){
    /* BINARY AND & 
    BINARY OR |
    BINARY XOR ^
    BINARY ONES COMPLEMENT ~
    BINARY LEFT SHIFT <<
    BINARY RIGHT SHIFT >>
        
    oddEven(3);
    oddEven(30);
    oddEven(32);
    oddEven(35);
    // System.out.println(getIthBit(10, 3));
    System.out.println(setIth(10, 2));
    System.out.println(clearBit(10,1));
    System.out.println(updateIth(10, 2, 1));
    System.out.println(clearIthBit(15, 2));
    System.out.println(clearangeI(10, 2, 4));
    System.out.println(isPowerOf2(8));*/
    System.out.println(countSetBit(10));

    }
}