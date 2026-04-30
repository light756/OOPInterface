package plan.attack.OOPInterface1;

public class Test {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("篮球教练",100);
        System.out.println(bc.getName());
        System.out.println(bc.getAge());
        PingPangCoach pc = new PingPangCoach("乒乓教练",100);
        System.out.println(pc.getName());
        System.out.println(pc.getAge());
        pc.speakEnglish();
    }
}
