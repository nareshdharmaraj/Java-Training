import java.util.*;
public class first{
    public static void main(String[] args) {
        //collection<Integer> c  = new List<>();
        //List<Integer> c  = new ArrayList<>();
        //Collection<Integer> c2 = new ArrayList<>();
        //class_name obj_name = new class_name();
        ArrayList<Integer> c  = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c);
        // to print without the square braces
        for(int i: c){
            System.out.print(i + " ");
        }

        ArrayList<Integer> c1  = new ArrayList<>();
        c1.add(72);
        c1.add(00);
        c1.add(75);
        c1.add(45);
        c1.add(66);
        System.out.println(c1);

        c.addAll(c1); // to add all elements of c1 to c
        System.out.println(c);
    }
}

/* Colletions methods:
binarySearch()
copy()
fill()
max()
min()
reverse()
sort()
swap()
disjoint()
frequency()
nCopies()
replaceAll()
reverse()
sort()
swap()
shuffle()

---------------------------

collection methods:
add()
addAll()
isEmpty()
clear()
contains()
containsAll()
equals()
hashCode()
iterator()
remove()
removeAll()
removeIf()
retainAll()
size()
toArray()
toString()

---------------------------
wrapper classes-> used to convert primitive data types into objects
byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean -> Boolean

used for collection framework
Autoboxing -> automatic conversion of primitive data type to object
 eg: into to integer
 int a = 10;
 Integer i = Integer.valueOf(a); //boxing
 Integer i = a; //autoboxing
Unboxing -> automatic conversion of object to primitive data type
Integer i = new Integer(10);
int a = i.intValue(); //unboxing 
int a = i; //unboxing
*/
