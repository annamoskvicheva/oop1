public abstract class Hogwards {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;
    public Hogwards (String name, int powerOfMagic, int transgressionDistance){
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }
    abstract public int calculateSpecificScore();
    public void compare(Hogwards hogwards){
        if (this.getClass().equals(hogwards.getClass())){
            compareSpecificScore(hogwards);
        }else {
            compareGeneralScore(hogwards);
        }
    }
    private void compareSpecificScore(Hogwards hogwards){
        System.out.println("Сравнение учеников одного факультета:" );
        int thisScore = this.calculateSpecificScore();
        int otheitScore = hogwards.calculateSpecificScore();

        if (thisScore > otheitScore){
            System.out.println(this.getName() + "сильнее чем" + hogwards.getName());
        }else if (thisScore < otheitScore){
            System.out.println(hogwards.getName() + "сильнее чем " + this.getName());
        }else {
            System.out.println(this.getName() + "и" + hogwards.getName() + "равны по силе");
        }
    }
    private void  compareGeneralScore(Hogwards hogwards){
        System.out.println("Сравнение учеников разных факультетов:");
        int thisScore = this.getPowerOfMagic() +  this.getTransgressionDistance();
        int otherScore = hogwards.getPowerOfMagic() + hogwards.getTransgressionDistance();

        if (thisScore > otherScore){
            System.out.println(this.getName() + " сильнее чем " + hogwards.getName());
        }else if (thisScore < otherScore){
            System.out.println(hogwards.getName() + " сильнее чем " + this.getName());
        }else{
            System.out.println(this.getName() + "и" + hogwards.getName() + " равны по силе");
        }
    }
    public String getName(){
        return name;
    }
    public  int getPowerOfMagic(){
        return powerOfMagic;
    }
    public int getTransgressionDistance(){
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwards{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
