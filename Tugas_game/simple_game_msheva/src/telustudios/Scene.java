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
    private String itemA;
    private String itemB;
    private String itemC;


    public Scene(String description, 
                 String choiceA, Scene nextSceneA, int damageA, int XPA, String itemA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB, String itemB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC,String itemC) {
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
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
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
                if (itemA != null) {
                    System.out.println("Kamu mendapatkan " + itemA + "!");
                    player.setItem(itemA);
                }
                if ( itemA == null ) {
                    System.out.println("Kamu tidak mendapatkan item apapun!");
                    return this;
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
                if (itemB != null) {
                    System.out.println("Kamu mendapatkan " + itemB + "!");
                    player.setItem(itemB);
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
                if (itemC != null) {
                    System.out.println("Kamu mendapatkan " + itemC + "!");
                    player.setItem(itemC);
                }
                return nextSceneC;
            default:
                return null;
        }
    }

    public boolean isEndScene() {
        return nextSceneA == null && nextSceneB == null && nextSceneC == null;
    }
}