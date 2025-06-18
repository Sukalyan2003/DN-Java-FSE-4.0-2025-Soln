public class Test {
    public static void main(String[] args){
        Logger logger1 = Logger.getLogInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getLogInstance();
        logger2.log("Second log message");

        // Test if both references point to the same object(Single responsibility principle is reserved)
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different!");
        }

    }
}
