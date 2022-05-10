package PadroesDeProjeto.Singleton;

public class SingletonOne {

    private static SingletonOne instancia;

    private SingletonOne(){
        super();
    }

    public static SingletonOne getInstancia(){
        if (instancia == null){
            instancia = new SingletonOne();
        }
        return instancia;
    }
}
