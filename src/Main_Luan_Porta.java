public class Main_Luan_Porta {
    public static void main(String[] args) {
        Porta_Luan portaFerroNegro = new Porta_Luan();

        portaFerroNegro.cor = "Preta";
        portaFerroNegro.modelo = "Bruesky";
        portaFerroNegro.defMaterial("Ferro Negro");
        portaFerroNegro.largura = 25.0f;
        portaFerroNegro.chave = true;

        portaFerroNegro.status();

        portaFerroNegro.abrirPorta();
        portaFerroNegro.chave = false;
        portaFerroNegro.abrirPorta();
        portaFerroNegro.status();
    }
}