/******
 * Myla Vijayan
 * 3/19/24
 */

import java.util.*;

public class Grades
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Numerical Grade: ");
        int NumGrade = input.nextInt();
        String LetGrade = "Roar";

        if (NumGrade >=  90){
            LetGrade = "A";
        }

        else if (NumGrade >= 80 && NumGrade < 90){
            LetGrade = "B";
        }

        else if (NumGrade >= 70 && NumGrade < 80){
            LetGrade = "C";
        }

        else if (NumGrade >= 65 && NumGrade < 70){
            LetGrade = "D";
        }

        else{
            LetGrade = "F";
        }
        
        System.out.println("Letter Grade: " + LetGrade);

        input.close();
    }

}
