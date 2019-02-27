public class Main {


    public static void main(String[] args) {

        int branches = 12;
        String star = "*";
        String hole = " ";

        for (int z = 8; z > 0; z = z - 2) {
            for (int j = 0; j < branches - z; j++) {
                for (int i = branches - j; i > 0; i--) {
                    System.out.print(hole);
                }
                for (int i = 0; i < j; i++) {
                    System.out.print(star);
                }
                System.out.print(star);
                for (int i = 0; i < j; i++) {
                    System.out.print(star);
                }
                for (int i = branches - j; i > 0; i--) {
                    System.out.print(hole);
                }
                System.out.print("\n");
            }
        }

    }

}
