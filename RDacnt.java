import java.util.*;

public class RDacnt extends Acnt{
   double RDIntrstRate;
   double RDamnt;
   int periods;
   double monthlyAmnt;
   double Gen, SenCitizen;
   Scanner input = new Scanner(System.in);
   @Override
   double calcIntrst(double amnt){
      this.RDamnt = amnt;
      System.out.println("Enter your RD months");
      periods =input.nextInt();
      System.out.println("Enter the age of account holder");
      int age =input.nextInt();
      if (periods >= 0 && periods <= 6) {
         Gen = .0750;
         SenCitizen = 0.080;
      } else if (periods >= 7 && periods <= 9) {
         Gen = .0775;
         SenCitizen = 0.0825;
      } else if (periods >= 10 && periods <= 12) {
         Gen = .0800;
         SenCitizen = 0.0850;
      } else if (periods >= 13 && periods <= 15) {
         Gen = .0825;
         SenCitizen = 0.0875;
      } else if (periods >= 16 && periods <= 18) {
         Gen = .0850;
         SenCitizen = 0.0900;
      } else if (periods >= 22) {
         Gen = .0875;
         SenCitizen = 0.0925;
      }
      RDIntrstRate = (age < 50) ? Gen : SenCitizen;
      return RDamnt * RDIntrstRate;
   }
}