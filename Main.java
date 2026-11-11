import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int inicjalna_ilosc_spacji = 0;
    int dlugosc_pnia;

    System.out.println("1.Trojkat (2 petle)\n2.Trojkat(1 petla)\n3.Kwadrat\n4.Odwrotny trojkat\n5.Trojkat taki z obu stron\n6.Choinka\n7.Choinka(pusta w srodku)\nPodaj tryb: ");
    int tryb = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Podaj wielkosc ksztaltu: ");
    int liczba = scanner.nextInt();
    scanner.nextLine();

    if (liczba <= 0) {
      System.out.println("Wielkosc ksztaltu nie moze byc mniejsza lub rowna 0.");
      System.exit(0);
    }
    
    System.out.println("Podaj znak kszatltu: ");
    String znak = scanner.nextLine();

    switch(tryb) {
      case 1:
        for(int i = 1; i<=liczba; i++) {
          for(int j = 1; j<=i;j++){
            System.out.print(znak);
          }
          System.out.print("\n");
        }
        break;

      case 2:
        for(int i=1; i!=liczba+1;i++) {
          System.out.println(znak.repeat(i));
        }
        break;
        
      case 3:
        for(int i = 1; i<=liczba; i++) {
          for(int j = 1; j<=liczba; j++) {
            System.out.print(znak);
          }
          System.out.print("\n");
        }
        break;
        
      case 4:
        for(int i = liczba; i!=0; i--) {
          for(int j = i; j!=0;j--){
            System.out.print(" ");
          }
          for(int k = (liczba - i) + 1; k>0; k--) {
            System.out.print(znak);
          }
          System.out.print("\n");
        }
        break;

      case 5:
        for(int i = 0; i!=liczba; i++) {
          for(int j = liczba-i; j!=0; j--) {
            System.out.print(" ");
          }
          int ilosc_znakow = (2*i) + 1;
          System.out.print(znak.repeat(ilosc_znakow));
          System.out.print("\n");
        }
        break;

      case 6:
        for(int i = 0; i!=liczba; i++) {
          for(int j = liczba-i; j!=0; j--) {
            System.out.print(" ");
            if (inicjalna_ilosc_spacji == 0) {
              inicjalna_ilosc_spacji = j;
            }
          }
          int ilosc_znakow = (2*i) + 1;
          System.out.print(znak.repeat(ilosc_znakow));
          System.out.print("\n");
        }

        dlugosc_pnia = (int) (liczba * 0.4);
        for(int i = 0; i!=dlugosc_pnia; i++) {
          for(int j = 0; j != inicjalna_ilosc_spacji;j++) {
            System.out.print(" ");
          }
          System.out.print(znak + "\n");
        }
        break;

      case 7:
        for(int i = 0; i!=liczba; i++) {
          for(int j = liczba-i; j!=0; j--) {
            System.out.print(" ");
            if (inicjalna_ilosc_spacji == 0) {
              inicjalna_ilosc_spacji = j;
            }
          }
          for (int j = 0; j < 2 * i + 1; j++) {
              if (j == 0 || j == 2 * i || i == liczba - 1) {
                  System.out.print(znak);
              } else {
                  System.out.print(" ");
              }
          }
          System.out.print("\n");
        }
        dlugosc_pnia = (int) (liczba * 0.4);
        for(int i = 0; i!=dlugosc_pnia; i++) {
          for(int j = 0; j != inicjalna_ilosc_spacji;j++) {
            System.out.print(" ");
          }
          System.out.print(znak + "\n");
        }
        break;
        
      default:
        System.out.println("Whar?");
        break;
    }
  }
}

