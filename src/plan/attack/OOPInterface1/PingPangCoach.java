package plan.attack.OOPInterface1;

public class PingPangCoach extends Coach implements English{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教学——乒乓");
    }

    @Override
    public void speakEnglish() {
        System.out.println("英语好啊！英语得学啊！！！");
    }
}
