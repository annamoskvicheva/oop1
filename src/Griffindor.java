public class Griffindor extends Hogwards{
    private  int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage){
        super (name,powerOfMagic,transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public  int calculateSpecificScore(){
        return nobility + honor + courage;
    }
    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                "}" + super.toString();
    }
}
