package AdderSubtractorSharedValue;

public  class Subtrator implements Runnable {

    private final Value value;

    public Subtrator(Value value) {
        this.value = value;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 100 ; i++) {
            try {
                Thread.sleep(5);
            } catch (Exception e) {

            }
            this.value.value -= i;
        }
    }
}