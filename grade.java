import java.util.Scanner;
class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        String grade = "";
        int marks = sc.nextInt();
        if (marks >= 90){
            grade = "A";
        }
        else if(marks <90 && marks >=80){
            grade = "B";
        }
        else if(marks <80 && marks >=70){
            grade = "C";
        }
        else if(marks<70 && marks >= 60){
            grade = "D";
        }
        else{
            grade = "Fail";
        }
        System.out.println(grade);
        sc.close();
    }
}
