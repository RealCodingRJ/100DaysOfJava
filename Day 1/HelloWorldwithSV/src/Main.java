import java.util.ArrayList;

public class Main {

    public static ThreadLocal<String>
            C = ThreadLocal.withInitial(() -> null);

    public static void main(String[] args){


        Thread thread = new Thread(() -> {
            C.set("World");
            Run();
        });

        thread.start();

    }

    static void Run() {

        System.out.println("Hello " + C.get());
    }

}