import java.util.Scanner;
 
public class EuroDollar {
 
  public static void main (String[] args) {
 
    do {
 
      Scanner eingabe = new Scanner(System.in);
 
 
      System.out.println("Welcher W�hrungstausch soll " +
        "vorgenommen werden ? (geben Sie bitte die entsprechende " +
        "Zahl ein).\n1:Euro zu Dollar\n2:Dollar zu Euro");
 
 
 
      double einheit = eingabe.nextDouble();
 
 
      int w�hrung = (int) einheit;
 
      if ((w�hrung != 1) && (w�hrung != 2)) {
 
 
 
        System.out.println("Unzul�ssige Eingabe!");
      } 
      else {
 
        Scanner wert = new Scanner(System.in);
 
        System.out.println("Wieviel soll umgerechnet werden ?");
        double geld = wert.nextDouble();
 
        switch (w�hrung) {
          case 1:
            System.out.println(geld + " Euro sind " + 
              geld * 1.34 + " Dollar.");
            break;         
          case 2:
            System.out.println(geld + " Dollar sind " + 
              geld / 1.34 + " Euro.");
            break;
        
        }
      }
 
      Scanner ende = new Scanner(System.in);
      System.out.println("M�chten Sie das Programm beenden? " +
        "J-j/N-n");
 
      char endlauf;
 
      endlauf = ende.next().charAt(0);
      if (endlauf == 'J' ) {
        break;
      }
    } while (true);
  }
}