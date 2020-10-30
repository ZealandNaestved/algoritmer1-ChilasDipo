import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til dettest

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomPigeNavne property OBS: randomPigeNavne skal forblive private!

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {
        exampleOfPredictableRandomNumber();
        Algorithms1 opgave = new Algorithms1();

        for (int i = 0; i <10 ; i++) {
            System.out.print("-----  Dreng   " + opgave.randomBoyName()  + "    ");
            System.out.println();
            System.out.print("---   Pige   " +  opgave.randomGirlName()  + "    ");
        }
        System.out.println("gender mixed names");
        String[] namesnogender= opgave.randomName();

        for (int i = 0; i < namesnogender.length; i++) {
            System.out.println(namesnogender[i]);
        }
        for (int i = 0; i <10 ; i++) {
            opgave.randombogstav();
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(opgave.platorkrone());
        }
    }
    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

    public String randomBoyName(){
        Random random = new Random();
        random.setSeed(7L); //TODO skal fjernes før production
        int tal = random.nextInt(45);
        String name = new Data().getRandomDrengeNavne(tal);
        return name;
    }
    public String randomGirlName(){
        Random random = new Random();
        random.setSeed(7L); //TODO skal fjernes før production
        int tal = random.nextInt(45);
        String name = new Data().getRandomPigeNavne(tal);
        return name;
    }
    public String[] randomName(){
        int lenght = 10;
        String[] namesnogender = new String[lenght];

        for (int i = 0; i <lenght ; i=i+2) {
            namesnogender[i] = randomGirlName();
            namesnogender[i+1] = randomBoyName();
        }
        return namesnogender;
    }

    public void randombogstav() {
        int max = 122;
        int min = 97;
        int tal = new Random().nextInt(((max-min)))+min;
        System.out.println( (char)tal + "   -   ");
    }

    public boolean platorkrone() {
        Random rng = new Random();
        int tal = rng.nextInt(2);
        if( tal==1){
            return true;
        }else {
            return false;
        }
    }
}
