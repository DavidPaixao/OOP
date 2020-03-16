package Arena_EQV_Moto;

import java.util.ArrayList;

public class Arena {
    private Combatente combatenteEsq = new Combatente();
    private Combatente combatenteDir = new Combatente();
    private int publico = 0;

    public Arena(int publico) {

        setPublico(publico);
        String nome = null;
        int idade = 0;
        int poder = 0;

        this.combatenteDir.setIdade(idade);
        this.combatenteDir.setPoder(poder);
        this.combatenteDir.setNome(nome);

        this.combatenteEsq.setIdade(idade);
        this.combatenteEsq.setPoder(poder);
        this.combatenteEsq.setNome(nome);
    }

    public int getPublico() {

        return publico;
    }

    public void setPublico(int publico) {

        this.publico = publico;
    }

    private boolean confCombatente(Combatente comb, String nome, int idade, int poder) {
        if (poder > 100) {
            System.out.printf("O combatente é muito poderoso para essa arena\n");
            return false;
        }

        if (idade > 20) {
            System.out.printf("O combatente é muito velho para essa arena\n");
            return false;
        }

        if (nome == null) {
            System.out.printf("Esse combatente não tem nome. Não pode entrar para arena.\n");
            return false;
        }

        comb.setNome(nome);
        comb.setIdade(idade);
        comb.setPoder(poder);

        return true;
    }

    public boolean confCombatenteEsq(String nome, int idade, int poder) {
        return this.confCombatente(this.combatenteEsq, nome, idade, poder);
    }

    public boolean confCombatenteDir(String nome, int idade, int poder) {
        return this.confCombatente(this.combatenteDir, nome, idade, poder);
    }

    public void retirarCombatentes() {
        String nome = null;
        int idade = 0;
        int poder = 0;

        this.combatenteDir.setIdade(idade);
        this.combatenteDir.setPoder(poder);
        this.combatenteDir.setNome(nome);

        this.combatenteEsq.setIdade(idade);
        this.combatenteEsq.setPoder(poder);
        this.combatenteEsq.setNome(nome);
    }

    public boolean lutar() {
        if (this.combatenteEsq.getNome() == null) {
            System.out.println("Não tem combatente a esquerda\n");
            return false;
        }
        if (this.combatenteDir.getNome() == null) {
            System.out.println("Não tem combatente a direita\n");
            return false;
        }

        if (this.combatenteEsq.getPoder() > this.combatenteDir.getPoder()) {
            System.out.printf("Combatete %s ganhou do combatente %s\n", this.combatenteEsq.getNome(), this.combatenteDir.getNome());
            this.publico();
        } else if (this.combatenteEsq.getPoder() < this.combatenteDir.getPoder()) {
            System.out.printf("Combatete %s ganhou do combatente %s\n", this.combatenteDir.getNome(), this.combatenteEsq.getNome());
            this.publico();
        } else {
            System.out.printf("Combatete %s e combatente %s empataram\n", this.combatenteDir.getNome(), this.combatenteEsq.getNome());
            this.publico();
        }
        return true;
    }

    public boolean publico() {
        String gritaria = "";

        for (int i = 0; i < this.publico; i++) {
            gritaria = gritaria + " he!";
        }

        gritaria = gritaria + "\n";
        System.out.println(gritaria);

        return true;
    }

    public void show() {
        System.out.printf("Combatente da direita: \n nome: %s, idade: %d, poder: %d\n", this.combatenteDir.getNome(), this.combatenteDir.getIdade(), this.combatenteDir.getPoder());
        System.out.printf("Combatente da esqueda: \n nome: %s, idade: %d, poder: %d\n", this.combatenteEsq.getNome(), this.combatenteEsq.getIdade(), this.combatenteEsq.getPoder());
    }

}