abstract class Bank{
    public void karta(){
    }
    public void pin(){
        System.out.println("wprowadz pin");
    }
    public void kwota(){
        System.out.println("podaj kwote: ");
    }
    public void informacja(){
        System.out.println("bank przyją informacje");
    }
    public void stan(){
        System.out.println("sprawdzenie stanu kąta");
    }
    public void potwierdzenie(){
        System.out.println("Potwierdzenie możliwości wypłaty");
    }
    public void wyplacenie(){
        System.out.println("wyplacenie");
    }
    public void podziekowanie(){
        System.out.println("dziekujemy za skorzystanie z banku");
    }
}

class Bankomat extends Bank{
    public void karta() {
        System.out.println("wprowadz karte");
    }
}


public class Main {
    public static void main(String[] args)                    {
Bankomat b= new Bankomat();
b.karta();b.pin();b.kwota();b.informacja();
b.podziekowanie();b.stan();b.potwierdzenie();b.wyplacenie();

    }
}