package PadroesDeProjeto.Singleton;

public class SingletonTwo {

    private static SingletonTwo instancia = new SingletonTwo();

    private SingletonTwo(){
        super();
    }

    public static SingletonTwo getInstancia(){
        return instancia;
    }
}
