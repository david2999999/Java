public class Rectangle extends GeometricObject{
      private double width;
      private double height;

      public Rectangle(){
      }

      public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
      }

      public Rectangle(double width , double height, String color, boolean filled){
            this.width = width;
            this.height = height;
            setColor(color);
            setFilled(filled);
      }

      public double getWidth(){
            return width;
      }

      public double getHeight(double height){
            return height;
      }

      public void setHeight(double height){
            this.height = height;
      }

      public double getArea(){
            return width * height;
      }

      public double getPerimeter(){
            return 2 * (width + height);
      }
}
