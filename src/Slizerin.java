public class Slizerin extends Hogwards{
    private  int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private  int lustForPower;

    public Slizerin (String name, int powerOfMagic, int transgressionDistance, int cunning, int determination,
                     int ambition, int resourcefulness, int lustForPower){
        super(name, powerOfMagic,transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public int calculateSpecificScore(){
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
