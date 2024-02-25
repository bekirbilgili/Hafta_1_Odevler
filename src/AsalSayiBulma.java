public class AsalSayiBulma {
    public static void main(String[] args) {


        for(int i = 2; i < 100; i++) { //en küçük asal sayı2 ve 100 aralığı taranır.

            boolean isPrime = true;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
