import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //cresce 3cm por ano
        double maricota = 110;
        double mariazinha = 150;
        //cresce 2cm por ano
        ArrayList <Integer> anosDecorridos = new ArrayList<>();

        do {
            maricota +=3;
            mariazinha +=2;
            anosDecorridos.add(1);
        } while (maricota < mariazinha);

        System.out.print("Vai demorar " + anosDecorridos.size() + "anos");
    }
}
