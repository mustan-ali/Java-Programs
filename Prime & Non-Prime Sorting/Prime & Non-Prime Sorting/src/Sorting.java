public class Sorting {
    public int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    public int[] Prime = new int[Array.length];
    public int[] NonPrime = new int[Array.length];

    public void sort() {
        int PrimeCounter = 0;
        int NonPrimeCounter = 0;

        for (int i = 0; i < Array.length; i++) {
            int count = 0;
            for (int j = 1; j <= Array[i]; j++) {
                if (Array[i] % j == 0) {
                    count++;
                }
            }
            if (count > 2) {
                NonPrime[NonPrimeCounter] = Array[i];
                NonPrimeCounter++;
            } else {
                Prime[PrimeCounter] = Array[i];
                PrimeCounter++;
            }
        }

    }

    public void printPrime() {
        for (int i = 0; i < Prime.length; i++) {
            System.out.print(Prime[i] + " ");
        }
    }

    public void printNonPrime() {
        for (int i = 0; i < NonPrime.length; i++) {
            System.out.print(NonPrime[i] + " ");
        }
    }

}
