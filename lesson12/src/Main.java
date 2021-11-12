public class Main {
    public static void main(String[] args) {
        Thread chicken = new Chicken();
        Thread egg = new Egg();
        chicken.start();
        egg.start();
    }
}

class Chicken extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Chicken");
        }
    }
}

class Egg extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Egg");
        }
    }
}
