package temp;

/**
 * @author 12402
 */
public class ThreadDemo {
    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                int[] a = new int[4];
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
            }
        }.start();
        System.out.println(Thread.currentThread().getName());
    }
}
