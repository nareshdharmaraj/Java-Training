/*
Jeni and her brothers Joseph and John found themselves in Narnia, the land of magic during World War III. Narnia was completely filled with gentle people and also it is where the trees sing, the fauns dance, and animals talk. Being from England, Jeni wanted to teach the kids the English language. She started teaching them the alphabet but then she remembered that she might have to go to London and felt sad. John and Joseph discussed with each other and suggested an idea to Jeni to come up with a program so that the kids can learn on their own when she was not there. Can you help Jeni to write a program to check whether the given character is a vowel or consonant or alphabet? */

import java.util.Scanner;
class vowelchecker {
    public static void main(String[] args) {
        System.out.println("Enter a alphabet: ");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a=='i' || a == 'o' || a=='u' || a == 'A' || a == 'E' || a=='I' || a == 'O' || a=='U' ){
            System.out.println(a  + " is a vowel");
        }
        else{
            System.out.println(a + " is a consonant.");
        }
        sc.close();
    }
}
