public class DisplayTrigTable{
      public static void main(String[] args) {
            System.out.println("Degree\t\t\tSin\t\t\tCos");
            for (int i = 0; i <=360; i+=10) {
                  System.out.format("%d\t\t\t%.4f\t\t\t%.4f",i, Math.sin(Math.toRadians(i)), Math.cos(Math.toRadians(i)));
                  System.out.println();
            }
      }
}
