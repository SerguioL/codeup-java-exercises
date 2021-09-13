import java.util.Arrays;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives ={"likeable", "tacit", "tough", "jittery", "elastic", "comfortable", "shiny", "fascinated", "brainy", " invincible"};

        String[]nouns ={"dealer", "charity", "city", "director", "advice", "dinner", "bath", "attitude", "two", "poet"};

        System.out.println(adjectives[random()] + " " + nouns[random()]);
    }


    public static int random() {
        return (int)Math.floor((Math.random()*10));
    }

}
