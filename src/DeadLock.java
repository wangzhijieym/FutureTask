public class DeadLock {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Dead(true));
        Thread thread2=new Thread(new Dead(false));
        thread1.start();
        thread2.start();
    }
}
