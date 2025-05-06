import Mecanismo.*;

public class App {
    public static void main(String[] args) throws Exception {
        //ExemploHashMap.executar();
        // MapearIdades mapa = new MapearIdades();
        // mapa.executar();

        Executor exec = new Executor();
        // motor.CarregarArquivo();
        exec.CarregarArquivo("ProjetoLexPascal-main\ProjetoLexPascal\LexPascal\src\Pascal\Hello.pas");
        exec.ProcessarBufferPrimario();
        exec.ImprimirBufferPrimario();
        exec.ProcessarBufferSecundario();
        exec.ImprimirBufferSecundario();
        exec.AnalisarMontandoTabelaSimbolos();
        exec.ImprimirTabelaSimbolosPrograma();
    }
    
}
