import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int dzien;
    Scanner scan = new Scanner(System.in);
    System.out.println("0 - wyjscie z programu");
    System.out.println("Podaj dzien tygodnia: ");
    dzien = scan.nextInt();
    while(dzien != 0){
    System.out.println("Podaj dzien tygodnia: ");
    dzien = scan.nextInt();
    switch(dzien)
      {
        case 1: System.out.println("Poniedziałek");
          break;
        case 2:
          System.out.println("Wtorek");
          break;
        case 3:
          System.out.println("Środa");
          break;
        case 4:
          System.out.println("Czwartek");
          break;
        case 5:
          System.out.println("Piątek");
          break;
        case 6:
          System.out.println("Sobota");
          break;
        case 7:
          System.out.println("Niedziela");
          break;
          
      }
   }

}
}