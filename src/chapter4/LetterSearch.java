package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get text
        System.out.println("Enter some text:");
        String text = scanner.nextLine();
        scanner.close();

        //Search text for letter A
        boolean letterFound = false;
        for (int i=0; i<text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'A') {
                letterFound = true;
                break;
            }
        }

            if (letterFound){
                System.out.println("Entered text contains letter A");
            }else {
                System.out.println("Entered text does not contain letter A");
            }


//            my 2nd attempt
//            if (currentLetter == 'a' || currentLetter == 'A') {
//                System.out.println("Entered text contains letter A");
//                break;
//            } else {
//                System.out.println("No letter A found in the text");
//            }
//            /*
//            Problem with this approach:
//            Enter some text:
//            My name is Said
//            No letter A found in the text
//            No letter A found in the text
//            No letter A found in the text
//            No letter A found in the text
//            Entered text contains letter A
//
//            Process finished with exit code 0
//             */
//        }


//          my 1st attempt
//            if (text.toLowerCase().contains("a")) {
//                System.out.println("Entered text contains letter A");
//                break;
//            } else {
//                System.out.println("No letter A found in the text");
//            }
//            /*
//            Enter some text:
//            My name is Said
//            Entered text contains letter A
//            Enter some text:
//            Some wierd text here
//            No letter A found in the text ==> keeps repeating this lines until all chars are finished counting
//             */
//        }
    }
}
