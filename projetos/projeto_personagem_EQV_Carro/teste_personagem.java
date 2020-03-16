package projeto_personagem_EQV_Carro;
import java.util.Scanner;
public class teste_personagem {
    public static void main(String[] args) {
        int value = 0;
        Personagem person = new Personagem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");

            if (ui[0].equals("end")) {
                System.out.println("Encerrou o programa");
                break;
            } else if (ui[0].equals("status")) {
            person.status();
            }  else if (ui[0].equals("curar")) {
                value = Integer.parseInt(ui[1]);
                person.curar(value);
            }else if (ui[0].equals("descansar")) {
                value = Integer.parseInt(ui[1]);
                person.descansar(value);
            }  else if (ui[0].equals("caminhar")) {
                value = Integer.parseInt(ui[1]);
              person.caminhar(value);
            }else if (ui[0].equals("lutar")) {
                person.lutar(value);
            } else {
                System.out.println("Comando invalido");
            }
        }
    }
}
