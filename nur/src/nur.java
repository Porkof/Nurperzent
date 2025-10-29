import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class nur {
    public static void main(String[] args) {
        List<SpaceObject> spaceObjects = Arrays.asList(
                new SpaceObject("Sun", "Star", "Solar System", 4600000000L, 696340L),
                new SpaceObject("Earth", "Planet", "Solar System", 4500000000L, 12742L),
                new SpaceObject("Moon", "Moon", "Earth", 4500000000L, 3474L),
                new SpaceObject("Mars", "Planet", "Solar System", 4600000000L, 6779L),
                new SpaceObject("Jupiter", "Planet", "Solar System", 4600000000L, 139820L),
                new SpaceObject("Andromeda", "Galaxy", "Local Group", 10000000000L, 220000L),
                new SpaceObject("Neptun", "Planet", "Solar System", 520000000L, 5279L)
        );

        // Фильтрация обектов типа Planet
        List<SpaceObject> planets = spaceObjects.stream()
                .filter(obj -> obj.getType().equalsIgnoreCase("Planet"))
                .collect(Collectors.toList());
        System.out.println("Планеты: " + planets);

        // Сортируем объекты по возрасту
        List<SpaceObject> sortedByDiamandPlan = planets.stream()
                .sorted((o1, o2) -> Double.compare(o1.getDiameter(), o2.getDiameter()))
                .collect(Collectors.toList());
        System.out.println("Объекты, отсортированы по планетам и деаметрам: " + sortedByDiamandPlan);

        // Фильтрация обектов типа Location
        List<SpaceObject> local = spaceObjects.stream()
                .filter(obj -> obj.getLocation().equalsIgnoreCase("Solar System"))
                .collect(Collectors.toList());
        System.out.println("Обьекты солнечной системы: " + local);

        // самый старый объект
        SpaceObject oldestObject = spaceObjects.stream()
                .max((o1, o2) -> Long.compare(o1.getAge(), o2.getAge()))
                .orElse(null);
        if (oldestObject != null) {
            System.out.println("Самый старый объект: " + oldestObject);
        } else {
            System.out.println("Нет объектов для сравнения.");
        }

        // Список имен объектов
        List<String> objectNames = spaceObjects.stream()
                .map(SpaceObject::getName)
                .collect(Collectors.toList());
        System.out.println("Названия объектов: " + objectNames);

        // Группировка по типу объекта (звезды, планеты)
        Map<String, List<SpaceObject>> groupedByType = spaceObjects.stream()
                .collect(Collectors.groupingBy(SpaceObject::getType));
        System.out.println("Группировка по типу: " + groupedByType);

        // Сумма диаметров всех объектов
        double totalDiameter = spaceObjects.stream()
                .mapToDouble(SpaceObject::getDiameter)
                .sum();
        System.out.println("Сумма диаметров всех объектов: " + totalDiameter);

        // Сортируем объекты по возрасту
        List<SpaceObject> sortedByAge = spaceObjects.stream()
                .sorted((o1, o2) -> Long.compare(o1.getAge(), o2.getAge()))
                .collect(Collectors.toList());
        System.out.println("Объекты, отсортированные по возрасту: " + sortedByAge);
    }
}

class SpaceObject {
    private String name;
    private String type;
    private String location;
    private long age;
    private long diameter;

    public SpaceObject(String name, String type, String location, long age, long diameter) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.age = age;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public long getAge() {
        return age;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", " + location + ", " + age + " billion years, " + diameter + " km)";
    }
}
