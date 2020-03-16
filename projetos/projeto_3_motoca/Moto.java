package projeto_3_motoca;


public class Moto {
    private int potencia;
    private Pessoa pass;
    private int tempo;

    public void Moto() {
        this.potencia = 1;
        this.pass.setIdade(0);
        this.pass.setNome(null);
        this.tempo = 0;
    }

    public boolean subir(Pessoa pass) {
        if (this.pass.getNome() != null) {
            System.out.println("Ja tem passageiro!\n");
            return false;
        }

        this.pass = pass;
        return true;
    }

    public boolean descer() {
        if (this.pass.getNome() == null) {
            System.out.println("Não tem passageiro!\n");
            return false;
        }

        this.pass.setNome(null);
        this.pass.setIdade(0);
        return true;
    }

    public void adicionarTempo(int tempo) {
        this.tempo += tempo;
    }

    public boolean dirigir(int tempo) {
        if (this.pass.getIdade() > 10) {
            System.out.println("Não tem passageiro!\n");
            return false;
        }

        if (this.tempo < tempo) {
            System.out.printf("Andou: %d minutos\n", this.tempo);
            this.tempo = 0;
            return true;
        }

        System.out.printf("Andou: %d minutos\n", tempo);
        this.tempo -= tempo;
        return true;
    }

    public void potencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean buzinar() {
        String buzina = "P";

        if (this.pass.getNome() != null) {
            System.out.println("Ja tem ninguem para buzinar\n");
            return false;
        }

        for (int i = 0; i < this.potencia; i++) {
            buzina = buzina + "e";
        }

        buzina = buzina + "m!\n";
        System.out.println(buzina);

        return true;
    }


    public void show() {
        System.out.printf("Potência: %d, Passageiro: %s (%d), Tempo: %d\n", this.potencia, this.pass.getNome(), this.pass.getIdade(), this.tempo);
    }
}
