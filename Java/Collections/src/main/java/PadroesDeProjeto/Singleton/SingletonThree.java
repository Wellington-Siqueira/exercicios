package PadroesDeProjeto.Singleton;

public class SingletonThree {

    private  static class InstanceHolder{
        public static SingletonThree instancia = new SingletonThree();
    }

    private SingletonThree(){
        super();
    }

    public static SingletonThree getInstancia(){
        return InstanceHolder.instancia;
    }
}
