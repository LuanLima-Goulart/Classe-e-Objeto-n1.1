public class Porta_Luan {
    //atributos
    public String modelo;
    public String cor;
    protected String material;
    protected float largura;
    protected boolean chave;

    //metodos
    public void abrirPorta(){
        if(this.chave == true){
            System.out.println("Não pode abrir a porta sem a chave!");
        } else {
            System.out.println("Chave funcionou!");
            System.out.println("Abrindo porta...");
            System.out.println("Porta aberta!");
        }
    }

    public void trancada(){
        this.chave = true;
    }

    public void aberta(){
        this.chave = false;
    }

    public void status(){
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