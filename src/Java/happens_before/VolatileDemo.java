package Java.happens_before;

/**
 * Created by xieyuhui on 2017/6/28.
 */
public class VolatileDemo {
    static int  a  = 0 ;

    static class ReadThread implements Runnable{

        @Override
        public void run() {
            System.out.printf("读volatile变量:" + a);
        }
    }
    static class WriteThread implements Runnable{

        @Override
        public void run() {
            System.out.println("写volatile变量:" + ++a);
        }
    }

    public static void main(String[] args) {
        Thread writeThread = new Thread(new WriteThread());
        Thread readThread = new Thread(new ReadThread());
        readThread.start();
        try {
            writeThread.start();
            writeThread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
