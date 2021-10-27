public class Main {
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(5);

        for (Vector vector : vectors) {
            System.out.print("Vector length: ");
            System.out.println(vector.length());
        }
    }
}
