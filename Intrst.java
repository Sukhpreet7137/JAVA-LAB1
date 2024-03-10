import java.util.*;

public class Intrst{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      
      int choice =-1;
      do{
         System.out.println("Choose from the Options: " + "\n1." + " FD Interest" + " \n2." + " RD Interest"
      + "\n3." + " Exit");
         choice=sc.nextInt();
         switch (choice){
            case 1:
            FDacnt fds = new FDacnt();
            System.out.println("Enter your FD Amount");
            double fAmnt = sc.nextDouble();
            System.out.println("Interest gained on your FD Amount is: $ " + fds.calcIntrst(fAmnt));
            break;
            case 2:
            RDacnt rds = new RDacnt();
            System.out.println("Enter your RD amount");
            double RAmnt = sc.nextDouble();
            System.out.println("Interest gained on your RD Amount is: $ " + rds.calcIntrst(RAmnt));
            break;
            case 3:
            System.out.println("Exiting Program");
            default:
            System.out.println("Choose correct choice");
         }
      }while(choice!=3);
   }
}