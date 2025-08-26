// import java.security.PublicKey;
// import java.util.*;

// import javax.print.DocFlavor.STRING;
public class Strings {
   /* public static void print(String str){
        for(int i =0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    } 
    public static boolean IsPalind(String str){
        for(int i =0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!= str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static float getShort(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // SOUTH 
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float ) Math.sqrt(x2+ y2);
 
    }
    public static String subString(String str,int si,int ei){
        String substr = "";
        for(int i =si;i<ei;i++){
            substr +=str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        } return sb.toString();
    }*/
   // STRING COMPRESSIION AMAZON
    public static String Compress(String str){
        String newstr = "";
        for(int i =0;i<str.length(); i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += String.valueOf(count);
            }
        }return newstr;
    } 

    public static void main(String args[]){
       /* char arr[]={'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        //STRINGS ARE IMMUTABLE
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name); 
        String fullName = "Ayaan khan";
        System.out.println(fullName.length());
        // CONCATINATION 
        String firstName ="MD ";
        String lastName = "Ayaan Khan";
        String fullName = firstName+lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(4));
        print(fullName);
        String str= "racecar";
        System.out.println(IsPalind(str));
                                            
        String path = "WNEENESENNN";
        System.out.println(getShort(path));
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1==s2){
            System.out.println("Strings are equall");
        }
        else{
            System.out.println("Strings are not equall");
        }
        //COMPARE METHOD 
        if(s1.equals(s3)){
            System.out.println("Strings are equall");
        }
        else{
            System.out.println("Strings are not equall");

        }
        String str = "Hello World";
        System.out.println(subString(str, 0, 5));
        String fruits[]={"apple","mango","banana"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println("LARGEST FRUIT LEXICOGRPAICALLY IS :"largest);
        StringBuilder sb = new StringBuilder(" ");
        for(char i ='a';i<='z';i++){
            sb.append(i+" ");
        }
        System.out.println(sb);
        String str = "md ayaan khan";
        System.out.println(toUpperCase(str));*/
        String str = "aaabbcccdd";
        System.out.println(Compress(str));
    }
} 