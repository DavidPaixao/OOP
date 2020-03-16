package projeto_2_Carro;

import java.util.Scanner;

public class Teste_carro {
    public static void main(String[] args) {
        int value = 0;
        Car carro = new Car();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if (ui[0].equals("fim")) {
                System.out.println("Encerrou o programa");
                break;
            } else if (ui[0].equals("estado")) {
                carro.show();
            } else if (ui[0].equals("embarcar")) {
                carro.in();
            } else if (ui[0].equals("desembarcar")) {
                carro.out();
            } else if (ui[0].equals("abastecer")) {
                value = Integer.parseInt(ui[1]);
                carro.fuel(value);
            } else if (ui[0].equals("dirigir")) {
                value = Integer.parseInt(ui[1]);
                carro.drive(value);
            } else {
                System.out.println("Comando invalido");
            }
        }
    }
}
