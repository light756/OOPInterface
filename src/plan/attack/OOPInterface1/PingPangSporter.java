package plan.attack.OOPInterface1;

public class PingPangSporter extends Sporter implements English{
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球学习中");
    }

    @Override
    public void speakEnglish() {
        System.out.println("这英语得学啊！学英语好啊！");
    }
}
