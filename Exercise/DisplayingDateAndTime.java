import java.util.*;
import java.text.*;

public class DisplayingDateAndTime{
      public static void main(String[] args) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println("Current date and time is \n" + dateFormat.format(date));
      }
}
