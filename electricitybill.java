/*
In the city of Rajkot, Gujarat the Golden company is taking care of the expenses for the Court's discussion room. Due to continuous discussions regarding the upcoming 'Ring Road' project at Rajkot, the electricity bill was high and they need to pay it with all the money they have.
The electricity board has decided to charge money based on the units consumed by a particular home. 
-> If the units consumed are less than or equal to 200, the cost for one unit is 0.5paise. 
-> If the unit is less than or equal to 400, the cost for one unit is 0.65paise plus Rs.100 extra charge. 
-> If the unit is less than or equal to 600, the cost for one unit is 0.80paise plus Rs.200 extra charge. 
-> If the unit is greater than 600 the cost for one unit is Rs.1.25 plus Rs.425 extra charge. 
You need to calculate the electricity bill based on the units consumed. 
*/

import java.util.Scanner;
class electricitybill {
    public static void main(String[] args) {
        System.out.println("Enter the units consumed: ");
        Scanner sc = new Scanner(System.in);
        int consumed = sc.nextInt();
        int extra =0;
        double price;
        if(consumed <=200){
            price = 0.5;
            extra = 0;
        }
        else if (consumed <= 400){
            price = 0.65;
            extra = 100;
        }
        else if (consumed <= 600){
            price = 0.80;
            extra = 200;
        }
        else{
            price = 1.25;
            extra = 425;
        }
        double total = (consumed * price + extra);
        System.out.println("Your bill amount is " + total);
        sc.close();
    }
}