package advisor;

import advisor.model.Model;

import java.util.Scanner;

public class App {
    private final Controller controller;

    public App(int itemsPerPage) {
        Model model = new Model();
        View view = new View(itemsPerPage);
        this.controller = new Controller(model, view);
    }

    public void startApp() {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("""
Type:
        'auth' - to log in to application
        'new' to get new released lists
        'featured' - to get featured list
        'categories' - to list all categories
        'playlists' 'category name' - choose the category you are interested in by entering 'playlist' + category name
        'exit' to exit the program
        
        Advisor show five items at one page.
        type:
                'next' - to go to the next page
                'prev' - to go to the previous page\s
                    """);

            String userRequest = scanner.nextLine();
            String chosenPlaylist = null;

            if (userRequest.contains("playlists")) {
                chosenPlaylist = userRequest.replace("playlists", "").strip();
                userRequest = "playlists";
                System.out.println(chosenPlaylist + " " + userRequest);
            }

            switch (userRequest) {
                case "auth": {
                        controller.auth();
                    break;
                }
                case "featured": {
                    controller.featured();
                    break;
                }
                case "new": {
                    controller.newReleases();
                    break;
                }
                case "categories": {
                    controller.categories();
                    break;
                }
                case "playlists": {
                    controller.playList(chosenPlaylist);
                    break;
                }
                case "exit": {
                    System.out.println("---GOODBYE!---");
                    System.exit(0);
                }
                default: {
                    System.out.println("Unknown command!");
                }
            }
        }
    }
}
