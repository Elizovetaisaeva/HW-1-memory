public class HufflepuffStudent extends  HogwartsStudent {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance,
                             int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void innerCompareTo(HufflepuffStudent other) {

        public int getHardworking () {
            return hardworking;
        }

        public int getLoyal () {
            return loyal;
        }

        public int getHonest () {
            return honest;
        }
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
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }

    private int skillSum() {
        return hardworking + loyal + honest;
    }
}