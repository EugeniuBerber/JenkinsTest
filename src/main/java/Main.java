public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("TEST "+i);
            Thread.sleep(2000);
        }
    }
}
