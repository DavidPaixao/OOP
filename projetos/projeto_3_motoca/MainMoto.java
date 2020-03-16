package projeto_3_motoca;/*----------------------------------------------------------------------------------------------------------------------
02_noobie Motoca de aluguel sub: Duas classes, agregação, nulo

Você deverá implementar a classe Pessoa e a class Moto.

Iniciar
    A moto inicia com 1 de potência, sem minutos e sem ninguém.

Subir
    Só pode estar uma pessoa na moto por vez. Para subir, informe nome e idade de quem está subindo.

Descer
    Só pode descer se tiver alguém na moto.

Comprar tempo
    O tempo em minutos é comprado e enquanto houver tempo, qualquer pessoa pode dirigir.

Dirigir tempo
    Se houver uma pessoa com 10 anos ou menos e houver minutos, então ela pode passear de moto.
    Se o tempo acabar no meio do passeio, informe o quanto a pessoa andou.

Buzinar
    Qualquer pessoa pode buzinar
    O barulho da buzina é "Pem", porém o número de e é igual ao valor da potência.
    Ex: se a potência for 5, buzinar deve gerar: Peeeeem
//--------------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class MainMoto {
    public static void main(String[] args) {
        int value = 0;
        Moto moto = new Moto();
        Pessoa pessoa = new Pessoa("", 0);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");

            if (ui[0].equals("fim")) {
                System.out.println("Encerrou o programa");
                break;
            } else if (ui[0].equals("subir")) {
                String nome = ui[1];
                int idade = Integer.parseInt(ui[2]);
                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                moto.subir(pessoa);
            } else if (ui[0].equals("descer")) {
                moto.descer();
            } else if (ui[0].equals("tempo")) {
                value = Integer.parseInt(ui[1]);
                moto.adicionarTempo(value);
            } else if (ui[0].equals("dirigir")) {
                value = Integer.parseInt(ui[1]);
                moto.dirigir(value);
            } else if (ui[0].equals("potencia")) {
                value = Integer.parseInt(ui[1]);
                moto.potencia(value);
            } else if (ui[0].equals("buzinar")) {
                moto.buzinar();
            } else if (ui[0].equals("status")) {
                moto.show();
            } else {
                System.out.println("Comando invalido");
            }
        }
    }
}

