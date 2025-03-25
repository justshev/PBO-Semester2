package telustudios;

public class Scene {
    private String description;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private Scene nextSceneA;
    private Scene nextSceneB;
    private Scene nextSceneC;
    private int damageA;
    private int damageB;
    private int damageC;
    private int XPA;
    private int XPB;
    private int XPC;

    public Scene(String description, 
                 String choiceA, Scene nextSceneA, int damageA, int XPA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC) {
        this.description = description;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.nextSceneA = nextSceneA;
        this.nextSceneB = nextSceneB;
        this.nextSceneC = nextSceneC;
        this.damageA = damageA;
        this.damageB = damageB;
        this.damageC = damageC;
        this.XPA = XPA;
        this.XPB = XPB;
        this.XPC = XPC;
    }

    public void displayScene() {
        System.out.println("\n" + description);
        if (choiceA != null) {
            System.out.println("A. " + choiceA);
        }
        if (choiceB != null) {
            System.out.println("B. " + choiceB);
        }
        if (choiceC != null) {
            System.out.println("C. " + choiceC);
        }
        System.out.println("(Ketik INFO untuk melihat status karakter)");
    }

    public Scene makeChoice(String choice, Character player) {
        switch (choice.toUpperCase()) {
            case "A":
                if (damageA > 0) {
                    System.out.println("Kamu mengalami " + damageA + " damage.");
                    player.takeDamage(damageA);
                }
                if (XPA > 0) {
                    System.out.println("Kamu mendapatkan " + XPA + " pengalaman!");
                    player.addXP(XPA);
                }
                return nextSceneA;
            case "B":
                if (damageB > 0) {
                    System.out.println("Kamu mengalami " + damageB + " damage.");
                    player.takeDamage(damageB);
                }
                if (XPB > 0) {
                    System.out.println("Kamu mendapatkan " + XPB + " pengalaman!");
                    player.addXP(XPB);
                }
                return nextSceneB;
            case "C":
                if (damageC > 0) {
                    System.out.println("Kamu mengalami " + damageC + " damage.");
                    player.takeDamage(damageC);
                }
                if (XPC > 0) {
                    System.out.println("Kamu mendapatkan " + XPC + " pengalaman!");
                    player.addXP(XPC);
                }
                return nextSceneC;
            default:
                return null;
        }
    }

    // Getter untuk memeriksa apakah scene ini adalah scene akhir
    public boolean isEndScene() {
        return nextSceneA == null && nextSceneB == null && nextSceneC == null;
    }
}