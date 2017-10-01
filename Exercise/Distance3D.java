import java.util.*;
import java.lang.*;

public class Distance3D{
      public static void main(String[] args) {
            double[][] points ={{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},{2, 0.5, 9}, {3.5, 2, -1}
                                                , {3, 1.5, 3}, {-1.5, 4, 2},{5.5, 4, -0.5}};
            double[] distance = new double[40];
            int counter = 0;
            double closestDistance = 999999;
            int point1 = -1; // arbitray substitues until the real value is found
            int point2 = -1 ;

            for (int i = 0; i < points.length - 1;i++ ) {
                  for (int j = i + 1; j < points.length; j++ ) {
                        distance[counter++] = Math.sqrt(Math.pow((points[j][0] - points[i][0]), 2) + Math.pow((points[j][1] - points[i][1]), 2) + Math.pow((points[j][2] - points[i][2]), 2) );
                        for (int k = 0; k < counter; k++ ) {      // looping through the distance array
                              if (distance[k] < closestDistance) {
                                    closestDistance = distance[k];
                                    point1 = i; // finding the two points of the closest distance
                                    point2 = j;
                              }
                        }
                  }
            }

            System.out.println("The closest distance is " + closestDistance + ". This is between points " + point1 + " and " + point2);

      }
}
