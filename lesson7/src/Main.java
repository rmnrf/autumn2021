public class Main {
    public static void main(String[] args) {
        NumberKeeper<Integer> number = new NumberKeeper<>(1);

        System.out.println(number.getAsShort());
        System.out.println(number.getAsFloat());
        System.out.println(number.getAsByte());
        System.out.println(number.getAsDouble());
        System.out.println(number.getAsInteger());
        System.out.println(number.getAsLong());
        System.out.println(number.getAsString());
    }
}