package AdderSubtractorSharedValue;

public class Adder implements Runnable {
    private final Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++) {
            // to create Race condition we need to sleep that thread for First time
            try {
                Thread.sleep(5);
            } catch (Exception e) {

            }
            this.value.value += i;
        }
    }
}