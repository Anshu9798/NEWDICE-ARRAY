/**
 * Anshu Nunemunthala
 */

public class DiceArray 
{

    public static void main(String[] args)
    {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        int[] total = new int [11];

        for (int i = 0; i < 1000; i++)
        {
            total[dice1.roll() + dice2.roll()-2]+=1;
        }

        for (int i=0; i<11; i++)
        {
            System.out.println("You rolled the number" + (i+2) + total[i] + "times");
      }
    }
}
