package plan.attack.OOPInterface2;

public interface Inter {
    //测试default关键字、static关键字、private关键字
    public default void show() {
        System.out.println("默认方法");
        show2();
    }
    public static void show1() {
        System.out.println("静态方法");
    }
    private void show2() {
        System.out.println("私有方法");
    }
    public abstract void show3();
}
