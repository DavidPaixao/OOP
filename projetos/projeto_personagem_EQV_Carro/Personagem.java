package projeto_personagem_EQV_Carro;

public class Personagem {
    private int pontos_de_vida = 5;
    private int pontos_de_vida_max = 100;
    private int enegia = 100;
    private int enegia_max = 100;
    private int distancia = 0;
    private int dano = 1;

    // lutar
    public void lutar(int bater){
        bater= dano;
        this.pontos_de_vida -= bater;
        this.enegia -= bater ;
        System.out.println("seu personagem lutou bravamente");
        if (this.pontos_de_vida == 0){
            System.out.println("seu personagem morreu");


        }
    }

    //curar
    public void curar(int value) {
        this.pontos_de_vida += value;
        if (this.pontos_de_vida > this.pontos_de_vida_max) {
            this.pontos_de_vida = this.pontos_de_vida_max;
            System.out.println("voce se curou");
        }
    }

    // caminhar
    public boolean caminhar(int distancia) {
        if (this.enegia < 1) {
            return false;
        }
        if (distancia > this.enegia) {
            System.out.printf("seu personagem estar cansado, andou: %d \n", this.enegia);
            this.enegia = 0;
            this.distancia += this.enegia;
            System.out.println("bote seu persoangem para descansar \n");
            return false;
        } else {
            this.enegia -= distancia;
            this.distancia += distancia;
            return true;
        }
    }

    // descansar
    public void descansar(int sono) {
        this.enegia += sono;
        System.out.println("seu personagem descansou  \n");
        if (this.enegia > this.enegia_max) {
            this.enegia = this.enegia_max;
        }
    }

    public void status() {
        System.out.printf("vida do personagem: %d, Energia do personagem: %d, Quanto andou: %d\n", this.pontos_de_vida, this.enegia, this.distancia);
    }
}

