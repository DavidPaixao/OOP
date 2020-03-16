package projeto_2_Carro;

class Car {
    private int gas = 0;
    private int gasMax = 100;
    private int pass = 0;
    private int passMax = 2;
    private int km = 0;

    //embarcar
    public boolean in() {
        if (this.pass >= this.passMax) {
            return false;
        }
        ++this.pass;
        return true;
    }

    //desembarcar
    public boolean out() {
        if (this.pass <= 0) {
            return false;
        }
        --this.pass;
        return true;
    }

    //abastecer
    public void fuel(int value) {
        this.gas += value;
        if (this.gas > this.gasMax) {
            this.gas = this.gasMax;
        }
    }

    //dirigir
    public boolean drive(int distance) {
        if (this.pass < 1) {
            return false;
        }
        if (distance > this.gas) {
            this.km += this.gas;
            System.out.printf("Não tem combustível suficiente, andou: %d \n", this.gas);
            this.gas = 0;
            return false;

        } else {
            this.km += distance;
            this.gas -= distance;
            return true;
        }
    }

    public void show() {
        System.out.printf("Combustivel: %d, Passageiros: %d, Odômetro: %d\n", this.gas, this.pass, this.km);
    }
}