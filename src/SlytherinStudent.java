public class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int powerLust;


    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int powerLust) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void innerCompareTo(GryffindorStudent other) {
        if (this.skillSum() > other.skillSum()) {
            System.out.println(this.getName() + "сильнее чем" + other.getName());
        } else if (skillSum() < other.skillSum()) System.out.println(other.getName() + "сильнее чем" + this.getName());
        else {
            System.out.println(this.getName() + "и" + other.getName() + "равны по силе");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", powerLust=" + powerLust;
    }

    private int skillSum() {
        return cunning + determination + ambition + resourcefulness + powerLust;
    }
}


