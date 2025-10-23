public class ModeloCaneta_Prof {
    //atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //metodos
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não é possível escrever com a caneta tampada");
        } else {
            System.out.println("Carga atual da caneta é: " + this.carga);
            System.out.println("Escrevendo... Rabiscando...");
            this.carga = this.carga - 5;
            System.out.println("Carga atual da caneta depois do uso é: " + this.carga);
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampadar(){
        this.tampada = false;
    }

    void status(){
        System.out.println("Uma caneta " + this.cor);
        if(this.tampada == true){
            System.out.println("A caneta está tampada");
        } else {
            System.out.println("A caneta está destampada");
        }
        System.out.println("Modelo: " + this.modelo);
    }
}