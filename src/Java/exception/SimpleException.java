package Java.exception;

/**
 * Created by xieyuhui on 2018/7/18.
 */
public class SimpleException extends Exception {

    private String detailMessage;

    public SimpleException() {

    }

    public SimpleException(String message) {
        this.detailMessage = message;
    }

    public void f() throws SimpleException {
        throw new SimpleException("");
    }

    public String getMessage() {
        return detailMessage;
    }

    public String getLocalizedMessage() {
        return getMessage();
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException("My Exception");
        } catch (Exception e) {
            System.out.println("getMessage:" + e.getMessage());
            System.out.println("getLocalizedMessage:" + e.getLocalizedMessage());
            System.out.println("toString:" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.getClassName());
                System.out.println(stackTraceElement.getFileName());
                System.out.println(stackTraceElement.getMethodName());
                System.out.println(stackTraceElement.getLineNumber());
            }
        }
    }
}
