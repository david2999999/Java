public class MyTriangle{
      public static boolean isValid(double s1, double s2, double s3) {
            boolean isTriangle;

            if((s1 + s2 > s3) && (s2 + s3 > s1) &&(s3 + s1 > s2))
                  isTriangle = true;
            else
                  isTriangle = false;

            return isTriangle;
      }

      public static double area(double s1, double s2, double s3){

            if((s1 + s2 > s3) && (s2 + s3 > s1) &&(s3 + s1 > s2)){
                  double p = (.5)* (s1 + s2 + s3); // perimeter
                  double area = Math.sqrt(p * (p-s1) * (p-s2) * (p-s3));
                  return area;
            }else{
                  System.out.println("Not a triangle");
                  return 0;
            }
      }
}
