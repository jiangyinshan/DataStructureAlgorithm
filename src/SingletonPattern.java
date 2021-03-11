/**
 * 线程安全的双重检查的懒汉式单例模式
 **/
public class SingletonPattern {
    private static SingletonPattern instance;

    private SingletonPattern() {

    }

    public SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();

                }
            }
            instance = new SingletonPattern();
        }
        return instance;
    }
}
