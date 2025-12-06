import java.utill.*
public class JavaBasicss{

    /*public static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;
    }
    public static void main(String args[]){
        int a = 10;
        int b =5;
        swap(a,b);        
    }*/
    // LECTURE -11
    /*public static void holl(int a , int b){
        for(int i =1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1|| i==a || j==1||j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void inverteds(int n){
        for(int i =1;i<=n;i++ ){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ")
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedn(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    } 
   public static void floyds(int n){
    int counter =1;
    for(int i=1;i<=n;i++){
        for(int j=0;j<=i;j++){
            System.out.println(counter);
            counter++;
        }
    }
   }
  public static void zotri{
    for(int i =1;i<=n ;i++){
        for(int j =1;j<=i;j++){
            if( (i+j)%2 ==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }System.out.println();
    }
  }
    public static void butterfly(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i ;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
        for(int i=n; int i>=1;i--){
                for(int j=1;j<=i ;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    } 
   //lec-14
   // spiral matrix
   public static void printSpiral(int matrix[][]){
    int sr=0;
    int sc=0;
    int er = matrix.length-1;
    int ec=matrix.length-1;
    while(sr <=er&& sc<=ec ){
        // top row
        for(int j =sc;j<=ec;j++){
            System.out.println(matrix[sr][j]);
        }
        // right row
        for(int i= sr+1;i<=er;i++){
            System.out.println(matrix[i][ec]);
        }
        //bottom row
        for(int j=ec-1;j>=sc;j++){
            System.out.println(matrix[er][j]);
        }
        //left col
        for(int i=er-1;i>=sr+1;i++ ){
            System.out.println(matrix[i][sc]);
        }
        }
    }
    //SHORTEST PATH 
    public static float  shortPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 =y*y;
        return (float) Math.sqrt(x2+y2);
    }*/
        public static void main(String args[]){
        /* lec -11  holl(5,4);
        inverteds(4);
        invertedn(5);
        zotri(4);
        butterfly(4);*/
        // System.out.println(shortPath("WNEENESENNN")); // Output: ~5.0
}
}
