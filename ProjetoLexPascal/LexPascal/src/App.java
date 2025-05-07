import Mecanismo.*;

public class App {
    public static void main(String[] args) throws Exception {
        //ExemploHashMap.executar();
        // MapearIdades mapa = new MapearIdades();
        // mapa.executar();

        Executor exec = new Executor();
        // motor.CarregarArquivo();
        exec.CarregarArquivo("INSIRA AQUI O CAMINHO DO ARQUIVO .PAS");
        exec.ProcessarBufferPrimario();
        exec.ImprimirBufferPrimario();
        exec.ProcessarBufferSecundario();
        exec.ImprimirBufferSecundario();
        exec.AnalisarMontandoTabelaSimbolos();
        exec.ImprimirTabelaSimbolosPrograma();
    }
    
}
