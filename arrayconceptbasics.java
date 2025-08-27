import java.util.Scanner;
public class arrayconceptbasics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the "+size+ " integers: ");
        for (int i = 0; i < size; i ++){
            arr[i] = scanner.nextInt();
        }

        // sum of array elements
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of "+size+" array elements is: "+sum);

        //average of array elements
        int average = sum/size;
        System.out.println("The average of elements: "+average);

        //search of array elements
        System.out.print("Do you want to search any array elements? [Y/N]:");
        char response1 = scanner.next().charAt(0);
        if(response1 == 'Y' || response1 =='y'){
            System.out.print("Enter the element you want to search: ");
            int element = scanner.nextInt();
            for(int i = 0; i < size; i++){
                if (arr[i] == element){
                    System.out.println("The element "+element+" is found in the index position at "+i);
                }
            }
        }

        //Reversing the array elements
        System.out.print("Do you want to reverse the array? [Y/N]: ");
        char response2 = scanner.next().charAt(0);
        if(response2 == 'Y' || response2 =='y'){
            System.out.println("The reversal of array is: ");
            for (int i = size-1; i>=0; i--){
                System.out.println(arr[i]);
            }
        }

        //multidimensional array getting and store the elements
        System.out.print("Do you want to explore multidimensional array? [Y/N]: ");
        char response3 = scanner.next().charAt(0);
        if(response3 == 'Y' || response3 =='y'){
            System.out.print("Enter the number of rows: ");
            int r = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int c = scanner.nextInt();
            int array[][] = new int[r][c];
            for (int i = 0; i < r; i++){
                for(int j = 0; j< c; j++){
                    System.out.println("Enter the value for ("+i+","+j+")");
                    array[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Your entered array looks like: ");
            for (int i = 0; i < r; i++){
                for(int j = 0; j< c; j++){
                    System.out.print(array[i][j]+ " ");
                }
                System.out.println(" ");
            }
        }
        else{
            System.out.println("Thank you!");
        }
        scanner.close();
    }
}
