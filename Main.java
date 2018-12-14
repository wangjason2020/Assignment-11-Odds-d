import java.util.Random;

public class Main {

    public static void main(String[] args) {

        oddNumber();
        tenSided();
        evenOdd();
        increasingRoll();
        uniqueRoll();
    }

    public static void oddNumber() {
        System.out.println("Scenario: Expected result 50%");
        int numTrue=0;
        int numFalse=0;
        int count=100000;

        for (int i=0; i<count; i++) {
            Random roll=new Random();
            int result=roll.nextInt(6)+1;

            if (result==1 || result==3 || result==5) {
                numTrue++;
            }
            else {
                numFalse++;
            }
        }

        System.out.println("Count of true: "+numTrue);
        System.out.println("Count of false: "+numFalse);
        System.out.println("Condition reached: "+((double)numTrue/100000)*100+"%");
        System.out.println();
    }

    public static void tenSided() {
        System.out.println("Scenario: Expected result 70%");
        int numTrue=0;
        int numFalse=0;
        int count=100000;

        for (int i=0; i<count; i++) {
            Random roll=new Random();
            int result=roll.nextInt(10)+1;

            if (result==2 || result==4 || result>5) {
                numTrue++;
            }
            else {
                numFalse++;
            }
        }

        System.out.println("Count of true: "+numTrue);
        System.out.println("Count of false: "+numFalse);
        System.out.println("Condition reached: "+((double)numTrue/100000)*100+"%");
        System.out.println();
    }

    public static void evenOdd() {
        System.out.println("Scenario: Expected result 25%");
        int numTrue=0;
        int numFalse=0;
        int count=100000;

        for (int i=0; i<count; i++) {
            Random roll=new Random();
            int result=roll.nextInt(6)+1;
            int result2=roll.nextInt(6)+1;

            if (result==2 || result==4 || result==6) {
                if (result2==1 || result2==3 || result2==5)
                numTrue++;
            }
            else {
                numFalse++;
            }
        }

        System.out.println("Count of true: "+numTrue);
        System.out.println("Count of false: "+numFalse);
        System.out.println("Condition reached: "+((double)numTrue/100000)*100+"%");
        System.out.println();
    }

    public static void increasingRoll() {
        System.out.println("Scenario: Expected result 3.7%");
        int numTrue=0;
        int numFalse=0;
        int count=100000;

        for (int i=0; i<count; i++) {
            Random roll=new Random();
            int result=roll.nextInt(6)+1;
            int result2=roll.nextInt(6)+1;
            int result3=roll.nextInt(6)+1;

            if (result==1 || result==2) {
                if (result2==3 || result2==4)
                    if (result3==5 || result3==6)
                    numTrue++;
            }
            else {
                numFalse++;
            }
        }

        System.out.println("Count of true: "+numTrue);
        System.out.println("Count of false: "+numFalse);
        System.out.println("Condition reached: "+((double)numTrue/100000)*100+"%");
        System.out.println();
    }

    public static void uniqueRoll() {
        System.out.println("Scenario: Expected result 27.8%");
        int numTrue=0;
        int numFalse=0;
        int count=100000;

        for (int i=0; i<count; i++) {
            Random roll=new Random();
            int result=roll.nextInt(6)+1;
            int result2=roll.nextInt(6)+1;
            int result3=roll.nextInt(6)+1;
            int result4=roll.nextInt(6)+1;

            if (result!=result2) {
                if (result!=result3 && result2!=result3)
                    if (result!=result4 && result2!=result4 && result3!=result4)
                    numTrue++;
            }
            else {
                numFalse++;
            }
        }

        System.out.println("Count of true: "+numTrue);
        System.out.println("Count of false: "+numFalse);
        System.out.println("Condition reached: "+((double)numTrue/100000)*100+"%");
    }
}
