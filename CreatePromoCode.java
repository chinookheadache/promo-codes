/**
 * Promo Code Generator
 * This program generates a 5 Uppercase letter promo code 
 * with each letter having specific characteristics.
 * The letters are the Unicode characters of randomly generated numbers.
 * The last letter is used as a check for verifying the promo
 * codes in the Promo code verifying program.
 * 
 * @author (Zac Fawcett ) 
 * @version (July 1st, 2021)
 */
// Standard import for the Scanner class
import java.util.*;
public class CreatePromoCode {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        Random random = new Random();
        System.out.print("How many codes do you want to generate: ");
        if(in.hasNextInt() == false ){ // Error check for wrong type of entry (anything but int)
            System.out.printf("That is not a valid input.%nPlease restart program and enter a positive number under 100");

        } else {

            int promo = in.nextInt();
            int count = 0;

            if (promo < 1){
                //error check for negative integers 
                System.out.printf("That is not a valid input.%nPlease restart program and enter a positive number under 100");
            
            } else if (promo >=100)
            //error check for integers over 99    
                System.out.printf("That is not a valid input.%nPlease restart program and enter a positive number under 100");

            else
                while (count < promo){

                    // L1 is the first digit of the promo code. There are no vowels allowed.
                    // The if statement removes the vowels
                    int L1 = 65 + (int)(Math.random() * (91 - 65));
                    if (L1 == 'A' || L1 == 'E' || L1 == 'I' || L1 == 'O' || L1 == 'U') continue;

                    // L2 has to be a vowel (AEIOU)
                    int L2 = 65 + (int)(Math.random() * (91 - 65));
                    if ((L2 <= 90 && L2 >=65) && L2!= 'A' && L2 != 'E' && L2 != 'I' && L2 
                    != 'O' && L2 != 'U') continue;

                    //L3 has to be a consonant, but no 'Y's
                    int L3 = 65 + (int)(Math.random() * (91 - 65));
                    if (L3 == 'A' || L3 == 'E' || L3 == 'I' || L3 == 'O' || L3 == 'U' || L3 == 'Y') continue;

                    //L4 has to be a vowel.    
                    int L4 = 65 + (int)(Math.random() * (91 - 65));
                    if ((L4 <= 90 && L4 >=65) && L4!= 'A' && L4 != 'E' && L4 != 'I' && L4 
                    != 'O' && L4 != 'U' && L4 != 'Y') continue;

                    // L5 is the sum of Unicode of L1 + (L2 *2) + L3 + (L4 * 2)
                    int sum = (L1 + L2*2 + L3 + L4*2);
                    // Then you find the remainder when divided by 26

                    char L5 = (char)(sum % 26);
                    // Then take the remainder and add it to the Unicode for 'A'
                    L5 += 'A';

                    System.out.printf("Promo code is %c%c%c%c%c%n", L1, L2, L3, L4, L5);            

                    count++;

                }
        }
    }
}
