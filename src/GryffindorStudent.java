public class GryffindorStudent extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance,
                             int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void innerCompareTo(GryffindorStudent other) {
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
        return super.toString() + " , nobility=" + nobility + ", honor=" + honor + ", bravery=" + bravery;
    }

    private int skillSum() {
        return nobility + honor + bravery;
    }
}


