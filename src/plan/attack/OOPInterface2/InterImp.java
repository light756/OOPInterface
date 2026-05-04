package plan.attack.OOPInterface2;

public class InterImp implements Inter{
    @Override
    public void show() {
        System.out.println("重写默认方法");
        //调用父接口的默认方法
        Inter.super.show();
    }

    @Override
    public void show3() {
        System.out.println("对show3接口方法的重写");
    }
    //接口的实现
}
