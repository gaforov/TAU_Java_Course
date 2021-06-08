package chapter8;
/*
1. Create a method that counts the number of words in a String and prints
them individually on a new line.
2. Create a method that prints a given String backwards. For example,
if given the word “camel”, it prints “lemac”.
3. Create a method that adds spaces to a jumbled String, where all words are written
 together with no spaces, but each new word begins with a capital letter.
 */
public class TextProcessor {
    public static void main(String[] args) {
        countWords("I like Java Programming");
        reverseString("Hello Said");
        addSpaces("HeyEveryone!It'sMeSaid");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        System.out.println(String.format("Your text contains %d words: ", numberOfWords));

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("word "+(i+1)+": " + words[i]);
        }
    }

    public static void reverseString(String text){
        for (int i=text.length()-1; i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println("\nmodifiedText = " + modifiedText);
    }
}
