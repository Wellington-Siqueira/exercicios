package PadroesDeProjeto.Singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstancia();
        System.out.println(one);
        one = SingletonOne.getInstancia();
        System.out.println(one);

        SingletonTwo two = SingletonTwo.getInstancia();
        System.out.println(two);
        two = SingletonTwo.getInstancia();
        System.out.println(two);

        SingletonThree three = SingletonThree.getInstancia();
        System.out.println(three);
        three = SingletonThree.getInstancia();
        System.out.println(three);
    }
}
