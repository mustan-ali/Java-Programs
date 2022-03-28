public class Main {
    public static void main(String[] args){

        Sorting s = new Sorting();

        s.sort();

        System.out.println("Prime numbers: ");
        s.printPrime();

        System.out.println("\n");

        System.out.println("Non-Prime numbers: ");
        s.printNonPrime();
    }
}
