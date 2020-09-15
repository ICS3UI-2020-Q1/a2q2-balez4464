import java.util.Scanner;
/**
 *This program tells the user which of his numbers are bigger
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates new scanner
    Scanner input = new Scanner(System.in);

    //Asks and allows user to input numberA
    System.out.println("Please enter an integer:");
    int numberA = input.nextInt();

    //Asks and allows user to input numberB
    System.out.println("Please enter another integer:");
    int numberB = input.nextInt();

    //Detects which number is biggest 
    if(numberA > numberB){
      System.out.println("The biggest number is " + numberA + ".");
    } else if (numberA < numberB){
      System.out.println("The biggest number is " + numberB + ".");
    } else {
      System.out.println("There is no biggest number.");
    }
  }
}
