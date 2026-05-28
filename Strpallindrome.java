import java.util.*;
public class Strpallindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp = "";
        int n = str.length();
        for (int i = n-1; i>=0; i--){
            temp = temp+str.charAt(i); 
        }
        if(str.equals(temp)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
        sc.close();
    }
}


/* using string buffer/builder.............
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        String st=sk.next();
        StringBuilder sb=new StringBuilder(st);
        sb.reverse();
        if(st.equals(sb.toString())){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not");
        }
        sk.close();
    }
}


*/