public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 100, 100,
                100, 100,100);
        Griffindor hermionGranger = new Griffindor("Hermione Granger", 90,86,
                78,90,99);

        Slizerin dracoMalfoy = new Slizerin("Draco Malfoy", 78,89,78,
                98, 76,98,85);
        Slizerin gregoryGoyly = new Slizerin("Gregory Goyly", 98,65,65,
        98,45,67,45);

        harryPotter.compare(hermionGranger);
        dracoMalfoy.compare(gregoryGoyly);

        harryPotter.compare(dracoMalfoy);
        harryPotter.compare(gregoryGoyly);
    }
}