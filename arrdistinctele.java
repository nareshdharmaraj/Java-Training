/*
Harish and Rajesh were developing a plan to find the ideal woman for Sheldon Cooper. There were puzzles, translations, and questions to check a person's intelligence. One such question was to come up with a program to count the number of distinct elements in an array. Harini is a postdoctoral researcher and a former graduate student of Caltech who is a huge fan of Sheldon's work and she wanted to impress Sheldon by writing a program to count the number of distinct element in an array. Can you help Harini?
*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int uniqueCount = 0;
        for(int i = 0; i < n; i++) {
            boolean isDuplicate = false;//we are assuming that the current element is unique until we find a duplicate
            for(int j = 0; j < i; j++) {//we are checking for duplicates only in the elements before the current element because we have already counted the unique elements before the current element
                if(arr[i] == arr[j]) {//comparing the current element with the previous elements to check for duplicates
                    isDuplicate = true;
                    break;//stopping the loop as soon as we find a duplicate because we only need to know if there is a duplicate or not, we don't need to count the number of duplicates
                }
            }
            if(!isDuplicate) {//if there is no duplicate, then we can count the current element as a unique element
                uniqueCount++;
            }
        }
        System.out.println("There are " + uniqueCount + " unique elements.");
        sc.close();
    }
}
