
public class StarEmployees {
    public static void main(String[] args) {

    
        int[][] hours = {
            {2, 5, 7, 9, 3, 6, 5},
            {5, 4, 5, 4, 5, 5, 6},
            {6, 4, 3, 8, 5, 4, 4},
            {4, 5, 6, 7, 8, 8, 9}
        };

        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
        };

        int[] employeeTotals = new int[4];
        int[] dayTotals = new int[7];

        
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                employeeTotals[i] += hours[i][j];
                dayTotals[j] += hours[i][j];
            }
        }

        int maxEmployeeHours = employeeTotals[0];

        for (int i = 1; i < employeeTotals.length; i++) {
            if (employeeTotals[i] > maxEmployeeHours) {
                maxEmployeeHours = employeeTotals[i];
            }
        }

        int maxDayHours = dayTotals[0];

        for (int j = 1; j < dayTotals.length; j++) {
            if (dayTotals[j] > maxDayHours) {
                maxDayHours = dayTotals[j];
            }
        }

       
        System.out.println("Star Employee(s):");

        for (int i = 0; i < employeeTotals.length; i++) {
            if (employeeTotals[i] == maxEmployeeHours) {
                System.out.println("Employee " + i
                        + " worked " + maxEmployeeHours + " hours.");
            }
        }
       
        System.out.println("\nBusiest Day(s):");

        for (int j = 0; j < dayTotals.length; j++) {
            if (dayTotals[j] == maxDayHours) {
                System.out.println(days[j] + " had "
                        + maxDayHours + " total working hours.");
            }
        }
    }
}
