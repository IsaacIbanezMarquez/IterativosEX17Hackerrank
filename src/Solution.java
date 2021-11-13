
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;





// ENUNCNIADO:

// Narcisistes

/* Fes un programa que digui si un nombre de tres xifres és narcisista. Un nombre narcisista de tres xifres compleix que: abc = a3 + b3 + c3

Si el nombre compleix la condició s'imprimirà TRUE, sinó s'imprimirà FALSE.

Input Format

Introdueix nombre enter positiu de 3 xifres

Constraints

Suposem N enter positiu de tres xifres

Output Format

{ TRUE | FALSE }

Sample Input 0

153
Sample Output 0

TRUE
Explanation 0

1 al cub és 1 5 al cub és 125 3 al cub és 27

Si sumem 1 + 125 + 27 = 153

Sample Input 1

125
Sample Output 1

FALSE

    */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int counter = num/10;
        int a = counter/10;
        int b = num % 10;
        int c = counter % 10;


        if (num == Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}
