import java.util.Scanner;
 
public class EuroDollar {
 
  public static void main (String[] args) {
 
    do {
 
      Scanner eingabe = new Scanner(System.in);
 
 
      System.out.println("Welcher Währungstausch soll " +
        "vorgenommen werden ? (geben Sie bitte die entsprechende " +
        "Zahl ein).\n1:Euro zu Dollar\n2:Dollar zu Euro");
 
 
 
      double einheit = eingabe.nextDouble();
 
 
      int währung = (int) einheit;
 
      if ((währung != 1) && (währung != 2)) {
 
 
 
        System.out.println("Unzulässige Eingabe!");
      } 
      else {
 
        Scanner wert = new Scanner(System.in);
 
        System.out.println("Wieviel soll umgerechnet werden ?");
        double geld = wert.nextDouble();
 
        switch (währung) {
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
      System.out.println("Möchten Sie das Programm beenden? " +
        "J-j/N-n");
 
      char endlauf;
 
      endlauf = ende.next().charAt(0);
      if (endlauf == 'J' ) {
        break;
      }
    } while (true);
  }
}