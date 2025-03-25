package telustudios;

import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== PETUALANGAN " + player.getName().toUpperCase() + " ===");
        System.out.println("Ketik 'A', 'B', atau 'C' untuk membuat pilihan.");
        System.out.println("Ketik 'INFO' untuk melihat status karakter.");
        System.out.println("Ketik 'QUIT' untuk keluar dari permainan.");
        play();
    }

    public void play() {
        Scene currentScene = startScene;
        String input;

        while (currentScene != null && player.getHealth() > 0) {
            currentScene.displayScene();

            if (currentScene.isEndScene()) {
                System.out.println("\nPetualangan telah selesai!");
                displayPlayerInfo();
                break;
            }

            System.out.print("\nPilihan kamu: ");
            input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("QUIT")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            } else if (input.equals("INFO")) {
                displayPlayerInfo();
                continue;
            }

            Scene nextScene = currentScene.makeChoice(input, player);

            if (nextScene == null) {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            } else {
                currentScene = nextScene;
            }

            if (player.getHealth() <= 0) {
                System.out.println("\nGAME OVER! " + player.getName() + " telah kehabisan nyawa.");
                displayPlayerInfo();
            }
        }
    }

    private void displayPlayerInfo() {
        System.out.println("\n=== STATUS " + player.getName().toUpperCase() + " ===");
        System.out.println("Health: " + player.getHealth());
        System.out.println("XP: " + player.getXP());
        System.out.println("Item: " + player.getItem());
        System.out.println("========================");
    }
}
