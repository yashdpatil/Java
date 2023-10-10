import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            int numVaccines = scanner.nextInt();
            int[] vaccines = new int[numVaccines];
            int[] patients = new int[numVaccines];

            for (int j = 0; j < numVaccines; j++) {
                vaccines[j] = scanner.nextInt();
            }

            for (int j = 0; j < numVaccines; j++) {
                patients[j] = scanner.nextInt();
            }

            Arrays.sort(vaccines);
            Arrays.sort(patients);

            boolean allPatientsCured = true;

            for (int j = 0; j < numVaccines; j++) {
                if (vaccines[numVaccines - 1 - j] < patients[numVaccines - 1 - j]) {
                    allPatientsCured = false;
                    break;
                }
            }

            if (allPatientsCured) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}