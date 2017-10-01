public class WeeklyHourOfMatrix{
      public static void main(String[] args) {
            int[] employee = {0,0,0,0,0,0,0,0};
            String[] employeeName = {"Employee0","Employee1","Employee2","Employee3","Employee4","Employee5","Employee6","Employee7"};
            int[][] hours = {{2,4,3,4,5,8,8},
                                          {7,3,4,3,3,4,4},
                                          {3,3,4,3,3,2,2},
                                          {9,3,4,7,3,4,1},
                                          {3,5,4,3,6,3,8},
                                          {3,4,4,6,3,4,4},
                                          {3,7,4,8,3,8,4},
                                          {6,3,5,9,2,7,9}};

            for (int i = 0; i < hours.length; i++) {
                  for (int j = 0; j < hours[i].length ; j++ ) {
                        employee[i] += hours[i][j];
                  }
            }

            for (int i = 0 ;i < employee.length - 1 ;i++ ) {
                  for (int j = i + 1; j < employee.length; j++ ) {
                        if(employee[i] < employee[j]){
                              int temp = employee[i];
                              employee[i] = employee[j];
                              employee[j] = temp;

                              String temp2 = employeeName[i];
                              employeeName[i] = employeeName[j];
                              employeeName[j] = temp2;
                         }
                  }
            }

            for (int i = 0; i < employeeName.length; i++ ) {
                  System.out.println(employeeName[i] + " " + employee[i]);
            }
      }
}
