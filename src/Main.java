public class Main {
    public static void main(String[] args) {
        // Task 1
        int i = 0;
        while (i <= 9) {
            System.out.print(" " + (i = i + 1));
        }
        System.out.println();
        for (int a = 11; a > 1; a = a - 1) {
            System.out.print(" " + (a - 1));
        }
        System.out.println();

        // Task 2

        for (int friday = 1; friday < 32; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число." + " Необходимо подготовить отчет.");
        }

        // Task 3


        int before = 2022 - 200;
        int after = 2022 + 100;
        for (int theLastYear = 0; theLastYear <= 2022; theLastYear = theLastYear + 79) {
            System.out.println(theLastYear + 79);
        }
    }
}