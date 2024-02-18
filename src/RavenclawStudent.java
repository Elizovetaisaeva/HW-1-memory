public class RavenclawStudent extends  HogwartsStudent {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int fullCreativity;


    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int smart,
                            int wise, int witty, int fullCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullCreativity = fullCreativity;

    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullCreativity() {
        return fullCreativity;
    }

    public void innerCompareTo(RavenclawStudent other) {
        if (this.skillSum() > other.skillSum()) {
            System.out.println(this.getName() + "сильнее чем" + other.getName());
        } else if (skillSum() < other.skillSum()) {
            System.out.println(other.getName() + "сильнее чем" + this.getName());
        } else {
            System.out.println(this.getName() + "и" + other.getName() + "равны по силе");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullCreativity=" + fullCreativity;
    }

    private int skillSum() {
            return smart + wise + witty + fullCreativity;
        }
    }

