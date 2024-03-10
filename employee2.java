import java.util.ArrayList;

public class employee2 {
    /**
     * Inneremployee
     */
    public static class Inneremployee {
        private int eid;
        private String ename;
        private String date;
        private String code;
        private String dept;
        private int basic;
        private int hra;
        private int it;

        Inneremployee(int a, String b, String c, String d, String e, int f, int g, int h) {
            eid = a;
            ename = b;
            date = c;
            code = d;
            dept = e;
            basic = f;
            hra = g;
            it = h;
        }

        void calc(int id) {

        }
    }

    public static class emp {
        ArrayList<Inneremployee> ok = new ArrayList<>();

        public void change(int a, String b, String c, String d, String e, int f, int g, int h) {
            Inneremployee x = new Inneremployee(a, b, c, d, e, f, g, h);
            ok.add(x);
        }

        public void check(int a) {
            int k = 0;
            for (Inneremployee i : ok) {
                if (i.eid == a) {
                    switch (i.code) {
                        case "c":
                            System.out.println("Consultant "+(i.hra + i.basic - i.it + 32000)); k++;
                            break;
                        case "e":
                            System.out.println("Engineer "+(i.hra + i.basic - i.it + 20000)); k++;
                            break;
                        case "k":
                            System.out.println("Clerk "+(i.hra + i.basic - i.it + 12000)); k++;
                            break;
                        case "r":
                            System.out.println("Receptionist "+(i.hra + i.basic - i.it + 15000)); k++;
                            break;
                        case "m":
                            System.out.println("Manager "+(i.hra + i.basic - i.it + 40000)); k++;
                            break;
                    }
                }
            }
            if(k==0) System.out.println("There is no employee with empid : "+a);
        }
    }
    public static void main(String[] args) {
        emp Emp1 = new emp();
        Emp1.change(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000);
        Emp1.change(1002, "Sushma", "01/04/2009", "c", "PM", 30000, 12000, 9000);
        Emp1.change(1003, "Rahul", "01/04/2009", "k", "Acc", 10000, 8000, 1000);
        Emp1.change(1004, "Chahat", "01/04/2009", "r", "FD", 12000, 6000, 2000);
        Emp1.change(1005, "Ranjan", "01/04/2009", "m", "Eng", 50000, 20000, 20000);
        Emp1.change(1006, "Suman", "01/04/2009", "e", "Manuf", 23000, 9000, 4400);
        Emp1.change(1007, "Tanmay", "01/04/2009", "c", "PM", 29000, 12000, 10000);
        System.out.println("Ruhani Dhiman-21BCS5549");
        Emp1.check(1003);
        // Emp1.check(123);
    }
}