public class Main_Prof {
    public static void main(String[] args) {
        //criando uma caneta a partir do molde
        ModeloCaneta_Prof canetaVermelhaPontaFina = new ModeloCaneta_Prof();

        //adicionando as propriedades/ ATRIBUTOS
        canetaVermelhaPontaFina.cor = "Vermelha";
        canetaVermelhaPontaFina.ponta= 0.5f;
        canetaVermelhaPontaFina.carga = 90;
        canetaVermelhaPontaFina.tampada = false;

        //exibindo status // METODOS
        canetaVermelhaPontaFina.status();

        //mudando o estado e exibindo novamente // atributo + metodo
        canetaVermelhaPontaFina.tampada = true;
        canetaVermelhaPontaFina.status();

        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.destampadar();
        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.rabiscar();
        canetaVermelhaPontaFina.rabiscar();


        //criando outra caneta a partir do molde
        ModeloCaneta_Prof canetaAzulPontaGrossa = new ModeloCaneta_Prof();

        //adicionando as propriedades / ATRIBUTOS
        canetaAzulPontaGrossa.modelo = "Comum";
        canetaAzulPontaGrossa.cor= "Azul";
        canetaAzulPontaGrossa.ponta = 1.5f;
        canetaAzulPontaGrossa.carga = 45;
        canetaAzulPontaGrossa.tampada = true;

        //exibindo status // METODOS
        canetaAzulPontaGrossa.status();
    }
}