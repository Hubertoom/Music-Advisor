package advisor;

import advisor.model.Model;

public class Main {

    private static final String banner = """
            
              ____              _   _  __         __  __           _           _       _       _               \s
             / ___| _ __   ___ | |_(_)/ _|_   _  |  \\/  |_   _ ___(_) ___     / \\   __| |_   _(_)___  ___  _ __\s
             \\___ \\| '_ \\ / _ \\| __| | |_| | | | | |\\/| | | | / __| |/ __|   / _ \\ / _` \\ \\ / / / __|/ _ \\| '__|
              ___) | |_) | (_) | |_| |  _| |_| | | |  | | |_| \\__ \\ | (__   / ___ \\ (_| |\\ V /| \\__ \\ (_) | |  \s
             |____/| .__/ \\___/ \\__|_|_|  \\__, | |_|  |_|\\__,_|___/_|\\___| /_/   \\_\\__,_| \\_/ |_|___/\\___/|_|  \s
                   |_|                    |___/                                                                \s
            """;

    public static void main(String[] args) {
        System.out.println(banner);


        int itemsPerPage = 5; // by default

        if (args.length > 1 && args[0].contains("-access")) {
            Authorization.PATH_TO_SERVER = args[1];
        }
        if (args.length > 2 && args[2].contains("-resource")) {
            Model.PATH_TO_API = args[3];
        }
        if (args.length > 3 && args[4].contains("-page")) {
            try {
                itemsPerPage = Integer.parseInt(args[5]);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number input. Number of item has been set on 5");
            }
        }
        App app = new App(itemsPerPage);
        app.startApp();
    }
}