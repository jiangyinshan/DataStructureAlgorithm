
public class SingletonPattern {
    /**
     * 线程安全的双重检查的懒汉式单例模式，
     * 增加volatile修饰符，禁止重排序,保证原子性,解决了因重排序可能导致的空指针问题
     **/
    private volatile static SingletonPattern instance;

    public static SingletonPattern getInstance() {
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

    /**
     * 线程安全的双重检查的懒汉式单例模式，但可能发生空指针
     * 因为instance= new SingletonPattern非原子操作。先创建一个instance，执行构造方法，将已经创建好的实例赋值到引用
     * 对于CPU来说，当它进行重排序时,可能将空对象赋值给引用，最后才执行构造方法
     * 那么当其他线程进来时，发现instance不为空，便直接return，不执行synchronized代码块
     * 那么新线程获取的instance其实是未初始化完成的对象
     **/
/*    private  static SingletonPattern instance;
    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();

                }
            }
            instance = new SingletonPattern();
        }
        return instance;
    }*/

    /**
     * 线程安全的饿汉式，在类加载时就实例化了一个对象，会消耗很小的性能
     **/
/*    private static SingletonPattern instance = new SingletonPattern();
    private SingletonPattern() {
    }
    public static SingletonPattern getInstance() {
        return instance;
    }*/
    public static void main(String args[]) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        System.out.println(singletonPattern.hashCode());
        System.out.println(singletonPattern2.hashCode());
    }
}
