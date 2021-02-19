import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] a = new int[n][4];
        int fund = 0;
        int contador = 0;
        while (n > contador) {

            String s = sc.nextLine();
            String[] splitA = s.split(" ");
            if (!s.equals("0")) {
                a[contador][0] = Integer.parseInt(splitA[0]);
                a[contador][1] = Integer.parseInt(splitA[1]);
                a[contador][2] = Integer.parseInt(splitA[2]);
                a[contador][3] = 0;
            }
            contador++;
        }
        int j = 1;
        for (int i = 0; i < a.length - 1; i++) {

            int fundConvidado1 = (a[i][2]);
            int fundConvidado2 = a[j][2];
            if (a[i][0] <= a[j][0] && a[i][1] <= a[j][1]) {

                if (a[i][3] != 1 && a[j][3] != 1) {
                    if (i == 0) {
                        fund += (fundConvidado1 + fundConvidado2);
                    } else {
                        fund += fundConvidado2;
                    }

                }
            } else if (a[i][0] >= a[j][0] && a[i][1] >= a[j][1]) {
                if (a[i][3] != 1 && a[j][3] != 1) {
                    if (i == 0) {
                        fund += (fundConvidado1 + fundConvidado2);
                    } else {
                        fund += fundConvidado2;
                    }
                }

            }
            j++;

        }
        System.out.println(fund);
    }
}