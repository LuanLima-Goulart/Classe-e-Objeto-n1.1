public class Porta_Luan {
    //atributos
    String modelo;
    String cor;
    String material;
    float largura;
    boolean chave;

    //metodos
    void abrirPorta(){
        if(this.chave == true){
            System.out.println("Não pode abrir a porta sem a chave!");
        } else {
            System.out.println("Chave funcionou!");
            System.out.println("Abrindo porta...");
            System.out.println("Porta aberta!");
        }
    }

    void trancada(){
        this.chave = true;
    }

    void aberta(){
        this.chave = false;
    }

    void status(){
        System.out.println("Uma porta " + cor);
        if(this.chave == true){
            System.out.println("A porta está trancada!");
        } else {
            System.out.println("A porta está aberta!");
        }
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Material: " + this.material);
    }
}