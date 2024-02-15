public class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance){
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

public String getName(){
        return name;
}

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareTo(HogwartsStudent other) {
        if (this.skillSum() < other.skillSum()) {
            System.out.println(this.name + "сильнее чем" + other.name);
        } else (skillSum() < other.skillSum()) {
        }
        System.out.println(other.name + "сильнее чем" + this.name);
    } else

    {
        System.out.println(this.name + "и" + other.name + "равны по силе");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", magicPower=" + magicPower + ", transgressionDistance=" + transgressionDistance;

    }
}
    private int skillSum(){
        return magicPower + transgressionDistance;
    }




