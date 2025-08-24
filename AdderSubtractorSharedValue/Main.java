package AdderSubtractorSharedValue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Value value = new Value();

        System.out.println(
                "Initial Value : "+ value.value
        );
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Adder(value));
        executorService.submit(new Subtrator(value));

        executorService.shutdown();
        // This is Causing Thread to Shutdown
        executorService.awaitTermination(1L, TimeUnit.SECONDS);

        System.out.println(
                "Final Value : "+value.value
        );
    }
}