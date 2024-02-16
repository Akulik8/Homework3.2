import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Cat> catMap = new HashMap<>();

        catMap.put("Мурзик", new Cat("Мурзик", "серый"));
        catMap.put("Барсик", new Cat("Барсик", "рыжий"));
        catMap.put("Васька", new Cat("Васька", "черный"));
        catMap.put("Рыжик", new Cat("Рыжик", "рыжий"));
        catMap.put("Матроскин", new Cat("Матроскин", "белый"));
        catMap.put("Том", new Cat("Том", "серый"));
        catMap.put("Гарфилд", new Cat("Гарфилд", "рыжий"));
        catMap.put("Кузя", new Cat("Кузя", "серый"));
        catMap.put("Леопольд", new Cat("Леопольд", "белый"));
        catMap.put("Базилио", new Cat("Базилио", "черный"));

        System.out.println("Список ключей:");
        for (String name : catMap.keySet()) {
            System.out.println(name);
        }

        System.out.println("\nСписок котов вместе с их цветом:");
        for (Cat cat : catMap.values()) {
            System.out.println(cat.getName() + " - " + cat.getColor());
        }
    }
}