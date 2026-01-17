import org.lessons.java.poligoni.Quadrato;
import org.lessons.java.poligoni.Rettangolo;
import org.lessons.java.poligoni.Triangolo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Quadrato quadrato = new Quadrato("quadrato" , 20);
        Rettangolo rettangolo = new Rettangolo("rettangolo", 18, 5);
        Triangolo triangolo = new Triangolo("triangolo", 5, 17, 14);

        System.out.println("---------------");
        System.out.println(quadrato);
        System.out.println("---------------");
        System.out.println(rettangolo);
        System.out.println("---------------");
        System.out.println(triangolo);
        System.out.println("---------------");

    }
}
