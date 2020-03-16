package Arena_EQV_Moto;
/*----------------------------------------------------------------------------------------------------------------------
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

class MainArena {
    public static void main(String[] args) {
        int value = 0;
        Arena arena = new Arena(3);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");

            if (ui[0].equals("fim")) {
                System.out.println("Encerrou o programa");
                break;
            }
            else if (ui[0].equals("comb_dir")) {
                String nome = ui[1];
                int idade = Integer.parseInt(ui[2]);
                int poder = Integer.parseInt(ui[3]);

                arena.confCombatenteDir(nome,idade,poder);
            }
            else if (ui[0].equals("comb_esq")) {
                String nome = ui[1];
                int idade = Integer.parseInt(ui[2]);
                int poder = Integer.parseInt(ui[3]);

                arena.confCombatenteEsq(nome,idade,poder);
            }
            else if (ui[0].equals("rmv")) {
                arena.retirarCombatentes();
            }
             else if (ui[0].equals("lutar")) {
                arena.lutar();
            }
            else if (ui[0].equals("status")) {
                arena.show();
            }
            else {
                System.out.println("Comando invalido");
            }
            }
        }

    }





