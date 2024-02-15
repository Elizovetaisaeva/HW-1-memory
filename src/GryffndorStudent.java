public class GryffindorStudent extends HogwartsStudent{
   private final int nobility;
    private final  int honor;
    private final int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance,
                             int nobility, int honor, int bravery) {
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
}

