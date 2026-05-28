String:
String is the collection of sequence of characters.
-> It is non-primitive data type
-> This was a immutable by default. Since if once the string is created, it will be stored as the address.
-> String buffer and string builder can be used to convert from immutable to mutable.
-> The various built in functions can be used to fetch, not to modify the contents.

-> There are two type of declaring / inititlizing the string:
        1. String literal : String str = "Sentence"
        2. using new keyword: String str = new String("Sentence")

-> The difference between the both kinds is:
        If the string value is same in one or more strings, it creates only one memory space and it points all the variables similar to that one place int the STRING LITERAL, but the string declared using new keyword will be creating the new memory spaces each time.

-> String operations:
        1. str.charAt(0) : returns the character of the string at that position.
        2. str.length() : returns the length of the string.
        3. str.substring(beginindex): returns the full string after the mentioned position.
        4. str.substring(beginindex, endindex) : returns the string inbetween that mentioned positions alone
        5. str.contains('element') : returns true/false 
        6. str.equals(ch): compares the two strings (str and ch) to check their values are equal or not.
        7. str.equalsIgnoreCase(ch): it compares the string excluding the cases.
        8. str.isEmpty() : returns true/false based on the empty or not.
        9. str.replace('old','new'): it replaces the old with new, it is printable or storable in the new variable.
        10. str.split("Regex"):
        11. str.split("Regex", int limit):
        12. str.trim():
        13. str.indexOf():
        14. str.indexOf(int ch, int fromindex):
        15. str.lastIndexOf():
        16. str.lastIndexOf(int ch, int fromindex):
        17. str.toLowerCase():
        18. str.toUpperCase():
        19. str.valueOf(int value):
        20. str.reverse(): 