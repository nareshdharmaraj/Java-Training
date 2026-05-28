import java.util.Scanner;
public class stringfunctions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dept = "Department of Artificial Intelligence @ Data Science";
        String core = new String("            Artificial Intelligence     ");
        String balance = "";
        System.out.println(dept.charAt(0));
        System.out.println(dept.length());
        System.out.println(dept.substring(30));
        System.out.println(dept.substring(30,45));
        System.out.println(dept.contains("AI"));
        System.out.println(dept.equals(core));
        System.out.println(balance.isEmpty());
        System.out.println(dept.concat(core));
        System.out.println(core.replace("Artificial", "Genarative"));
        System.out.println(dept.indexOf("Data"));
        System.out.println(dept.toLowerCase());
        System.out.println(dept.toUpperCase());
        System.out.println(core.trim());
        String str=String.join("-", "welcome", "to", "terv");
        String[] s2 = {"Welcome", "To", "Terv"};
        String ans = String.join(" ", s2);
        System.out.println(str);
        System.out.println(ans);
        String arr[] = dept.trim().split("\\s+");
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        sc.close();
    }
}



/* OUTPUT:
D
52
ligence @ Data Science
ligence @ Data 
false
false
true
Department of Artificial Intelligence @ Data Science            Artificial Intelligence     
            Genarative Intelligence     
40
department of artificial intelligence @ data science
DEPARTMENT OF ARTIFICIAL INTELLIGENCE @ DATA SCIENCE
Artificial Intelligence
welcome-to-terv
Welcome To Terv
Department 
of 
Artificial 
Intelligence 
@ 
Data 
Science 
*/