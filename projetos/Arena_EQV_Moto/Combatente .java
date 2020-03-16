package Arena_EQV_Moto;

class Combatente {
    private String nome;
    private int idade;
    private int poder;

    public Combatente() {
        this.nome = null;
        this.idade = 0;
        this.poder = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
