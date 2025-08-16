import java.util.Scanner;
public class CheckVowelOrConsonant{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
char letterIs;
System.out.println("Ener one alphabet :" );
char letter=sc.next().toLowerCase().charAt(0);
switch(letter){
    case 'a':
    System.out.println(letter+ " is a vowel letter");
    break; 
    case 'e':
    System.out.println(letter+ " is a vowel letter");
    break; 
    case 'i':
    System.out.println(letter+ " is a vowel letter");
    break;
    case 'o':
    System.out.println(letter+ " is a vowel letter");
    break;
    case 'u':
    System.out.println(letter+ " is a vowel letter");
    break;
    default:
    System.out.println(letter+ " is a consonant letter");
    break;
     }
    }
 }
/* 
*Author:Amal Roy
*date: 17-07-2025
*/