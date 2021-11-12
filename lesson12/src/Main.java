public class Main {
    public static void main(String[] args) {
        Thread chicken = new Thread(new Chicken());
        Thread egg = new Thread(new Egg());
        chicken.start();
        egg.start();
    }
}

class Chicken implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Chicken");
        }
    }
}

class Egg implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Egg");
        }
    }
}
