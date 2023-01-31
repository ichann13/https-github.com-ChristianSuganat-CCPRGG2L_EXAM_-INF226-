public class exam1 {

    public static void main(String[] args) {

        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to
        // remove specific letters in
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

        String fullName = "christian geams m suganat";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {

        extractConsonant(str, "");

    }

    public static String extractConsonant(String s, String previous) { // nilagyan ok ng additional parameter na previous
        // previous is yung nag i-store ng mga previous vowels para ma display sa dulo
        if (s.length() == 0) {
            return s;
        }
        char c = s.charAt(0);
        switch (c) {
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println(previous + s.substring(1)); // kapag nag remove ng consonant, print nya yung previous vowels + yung current string na natitira
                return extractConsonant(s.substring(1), previous);
            default:
                return c + extractConsonant(s.substring(1), previous+c);

        }
    }
}

// Add code here

