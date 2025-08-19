 /* import java.util.Scanner;

class JavaBasics{
     public static void main(String[] args){
        System.out.println("Hello World!!\n");
    

        System.out.println("is an");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);
    
    float N = sc.nextInt();
    System.out.println("ok");

        float m = sc.nextFloat();
        int m2 = (int) m;
        System.out.println(m2);
    
        int O = 01;
        int L= 10;
        System.out.println("Addition of a & b is :"+(O+L));
    }
}
import java.util.Scanner;

class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Hello World!!\n");

        System.out.println("is an");

        Scanner sc = new Scanner(System.in);

        // Taking two integers
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Product: " + product);

        // Taking a float input
        float N = sc.nextFloat();
        System.out.println("ok"+N);

        // Taking another float and typecasting
        float m = sc.nextFloat();
        int m2 = (int) m;
        System.out.println("Typecasted int: " + m2);

        // Simple addition
        int num1 = 1;
        int num2 = 10;
        System.out.println("Addition of num1 & num2 is: " + (num1 + num2));

        sc.close(); // Always good to close the Scanner
    }
// }*/
// import java.util.*;
// import java.util.Scanner;

public class JavaBasics {
        /*  int age = 22;
        // if(age>18 ){
        //     System.out.println("An adult");
        // }
        // else{
        //     System.out.println("Not an adult");
        // }
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
            Scanner sc = new Scanner(System.in);
            int income = sc.nextInt();
            int tax;
            if(income <500000){
                tax = 0;
            }
            else if(income >= 500000 && income <=1000000){
                tax = (int )(income *0.2);
            }
            else{
                tax = (int)(income * 0.3);
            }
            System.out.println("Your tax is : "+tax);
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt();
        int nb = sc.nextInt();
        int nc = sc.nextInt();
        if((na>nb)&&(na>nc)){
            System.out.println(na);
        }
        else if(nb>nc){
            System.out.println(nb);
        }
        else{
            System.out.println(nc);
        }
        String n = (5 > 3) ? "yes" : "no";
        System.out.println(n); // Output: yes
        int na = (5 > 3) ? 1 : 0;
        System.out.println(na); // Output: 1
        int marks = 44;
        String rc = (marks >=33)? "pass":"fail";
        System.out.println(rc);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while(i<=n){
            sum+= i;
            i++;

        }
        System.out.println("The sum of n natural numbers is :"+sum);
        for(int i=1;i<=9; i++){
            System.out.println("Hello World");
        }
        for(int i =1;i<4;i++){
            System.out.println("****");
        }
        int i =0;
        while (i<4) {
        System.out.println("****");
        i++;
        }
        int k =10899;
        while(k>0){
            int ld = k%10;
            System.out.print(ld);
            k = k/10;
        }
        int n = 98788;
        int rev = 0;
        while (n>0) {
            int d = n%10;
             rev = (rev * 10) + d;
            n=n/10;

        }System.out.println(rev);
        int i =1;
        do{
            System.out.println("Hell0");
            i++;
        }
        while(i<=2); 
        for(int i =0; i <=6;i++){
            if(i==3){
                break;
            }System.out.println(i);
        } 
       int i =1;
       do{
        System.out.println("Hello world");
        i++;
       }
       while(i<=10);

       Scanner sc = new Scanner(System.in);
       do{
        
        int n = sc.nextInt();
        if(n%10 == 0){
            break;
        }
        System.out.println(n);
       }
       while(true);
       for(int i =1;i<=5;i++){
        if(i==3)
            continue;
                   System.out.println(i);

       }
      Scanner sc = new Scanner(System.in);
      do{
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%10 == 0){
            continue;
            }            System.out.println("Number was "+n);

        }
        while(true);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("2 is prime");
        }
        else{
            boolean isp = true;
            for(int i =2; i<=(int)Math.sqrt(n); i++){
                if(n%1 ==0){
                isp = false;
                }
            }
                if(isp == true){
                    System.out.println(+n+"Is a prime number ");
                }
                else{
                    System.out.println(+n+"is not a prime number");
                }
            
            }
            //Reverse star pattern
        for(int i =1; i<=4;i++){
            for(int s = 1; s<= i;s++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i =1;i<=4;i++){
            for(int s=1;s<=(4-i+1);s++){
                System.out.print("*");
            }System.out.println();
        }
        int n =4;
        for(int i =1;i<=n;i++){
            for(int o =1;o<=i;o++){
                System.out.print(o);
            }System.out.println();
        }
        int n =4;
        char ch = 'A';
        for(int i =1;i<=n; i++){
            for(int j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
        public static void print(){
            System.out.println("Hello world");
        }
        public static void cal(int a,int b){
            int sum = a+b;
            System.out.println("Sum of a and b is:"+sum);
        }
        public static void rohm(int n){
            for(int i=1;i<=n;i++){
                for(int j =1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j =1;j<=n;j++){
                    System.out.print("*");
                }System.out.println();
            }
        }
        public static void hollowrh(int n){
            for(int i =1;i<=n;i++){
                for(int j =1; j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j =1;j<=n;j++){
                    if(i==1||i==n|| j==1||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
        public class Main {
    public static void dia(int n) {
        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {
            int stars = (i <= n) ? (2 * i - 1) : (2 * (totalRows - i) + 1);
            int spaces = (i <= n) ? (n - i) : (i - n);

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= stars; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dia(5);
    }
}
    
        
        public static void dia(int n){
            for(int i=1;i<=n;i++){
                    for(int j=1;j<=(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i-1);j++){
                        System.out.print("*");
                    }System.out.println();
                }
                for(int  i =n-1; i>=1; i--){
                      for(int j=1;j<=(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i-1);j++){
                        System.out.print("*");
                    }System.out.println();
                }
            }*/

        
        
            public static void main(String args[]){
                /*  print();
                cal(3, 8);
                rohm(5);
                hollowrh(5);
                dia(3);*/
    }
}

