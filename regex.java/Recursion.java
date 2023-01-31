public class Recursion {

    public static void main(String[] args) {

        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters

        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "Miguel Angelo Enrico";


        removeLetter(fullName, 0);
    }

    static void removeLetter(String str) {
        // Add code here
    }

    static void removeLetter(String str, int index) {
        //add the code here

        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u') {
            str = str.substring(0, index) + str.substring(index + 1);
            removeLetter(str, index);
        } else {
            removeLetter(str, index + 1);
        }

        System.out.println(str);
    }
    }

