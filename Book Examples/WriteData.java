public class WriteData{
      public static void main(String[] args) throws Exception {
            java.io.File file = new java.io.File("Scores.txt");
            if(file.exists()){
                  System.out.println("File already exists");
                  System.exit(0);
            }

            java.io.PrintWriter output = new java.io.PrintWriter(file);

            output.print("David Jiang ");
            output.println(100);
            output.print("Henry Chen ");
            output.println(0);

            output.close();
      }
}
