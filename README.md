# promo-codes

zac fawcett

Retail Promo code generator and decoder in Java

Store needs a code to generate  readable, self-verifying and difficult to counterfeiters promotional codes

The rules for each code will be: 

    • promo codes will be 5 characters long
    • promo code will be all uppercase
    • 1 character will be a consonant or a Y
    • 2nd character will be vowel (AEIOU)
    • 3rd character will be a consonant
    • 4th character will be vowel (AEIOUY)
    • 5th character is an alphabetic check digit
    

To calculate the check digit:
    • take characters 1 and 3 and add them to the sum
    • take 2nd character value * 2 and add it to the sum
    • take 4th character value *2 and add it to the sum
    • calculate the reminder of the sum  divided by 26
    • take the reminder and add it to the UNICODE for ‘A’
    
There will be two programs

CreatePromoCode - will create a random code using the rules

VerifyPromoCode - will read a code and using the check digit determine if it is a valid code

The program does NOT need to validate that the promo code matches all of the individual rules (e.g. 1st character is a consonant or Y)
