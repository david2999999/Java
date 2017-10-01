public class FinallyDemo{
      public static void main(String[] args) {
            java.io.PrintWriter output = null;

            try {
                  output = new java.io.PrintWriter("text.txt");

                  output.println("Welcome to java");
            }
            catch (java.io.IOException e) {
                  e.printStackTrace();
            }
            finally {
                  if(output != null)
                        output.close();
            }
            System.out.println("End of program");
      }
}
