import java.util.*;
public class FDacnt extends Acnt {
   double FDintrstRate;
   double FDAmnt;
   int period;
   int age;
   double Gen, SenCitizen;
   Scanner input = new Scanner(System.in);
   @Override
   double calcIntrst(double amnt){
      this.FDAmnt = amnt;
      System.out.println("Enter your FD days");
      period = input.nextInt();
      System.out.println("Enter the age of account holder ");
      age = input.nextInt();
      if (amnt < 10000000) {
         if (period >= 7 && period <= 14) {
            Gen = 0.0450;
            SenCitizen = 0.0500;
         } else if (period >= 15 && period <= 29) {
            Gen = 0.0470;
            SenCitizen = 0.0525;
         } else if (period >= 30 && period <= 45) {
            Gen = 0.0550;
            SenCitizen = 0.0600;
         } else if (period >= 45 && period <= 60) {
            Gen = 0.0700;
            SenCitizen = 0.0750;
         } else if (period >= 61 && period <= 184) {
            Gen = 0.0750;
            SenCitizen = 0.0800;
         } else if (period >= 185 && period <= 365) {
            Gen = 0.0800;
            SenCitizen = 0.0850;
         }
         FDintrstRate = (age < 50) ? Gen : SenCitizen;
      } else {
         if (period >= 7 && period <= 14) {
            intrstRate = 0.065;
         } else if (period >= 15 && period <= 29) {
            intrstRate = 0.0675;
         } else if (period >= 30 && period <= 45) {
            intrstRate = 0.00675;
         } else if (period >= 45 && period <= 60) {
            intrstRate = 0.080;
         } else if (period >= 61 && period <= 184) {
            intrstRate = 0.0850;
         } else if (period >= 185 && period <= 365) {
            intrstRate = 0.10;
         }
      }
      return FDAmnt * FDintrstRate;
   }
}