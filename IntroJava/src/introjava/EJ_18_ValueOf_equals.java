package introjava;

public class EJ_18_ValueOf_equals {

    public static void main(String[] args) {

        int j, k, i;

        for (i = 0; i <= 9; i++) {
            for (j = 0; j <= 9; j++) {
                for (k = 0; k <= 9; k++) {

                    String letra = String.valueOf(i);
                    String letra1 = String.valueOf(j);
                    String letra2 = String.valueOf(k);

                    if (letra.equals("3")) {
                        System.out.print("E-");
                    } else {
                        System.out.print(i + "-");

                    }

                    if (letra1.equals("3")) {
                        System.out.print("E");
                    } else {
                        System.out.print(j);

                    }

                    if (letra2.equals("3")) {
                        System.out.println("-E");
                    } else {
                        System.out.println("-" + k);

                    }

                }
            }
        }

    }

}
