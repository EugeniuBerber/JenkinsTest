public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("TEST "+i);
            System.out.println("Changes");
            Thread.sleep(2000);
        }
    }
}
