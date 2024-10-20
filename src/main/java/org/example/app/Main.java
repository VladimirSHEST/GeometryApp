упаковка org.example.app;


импорт com.example.utils.GeometryUtils;
импорт org.example.geometry.Circle;
импорт org.example.geometry.Rectangle;
импорт org.example.geometry.Triangle;

публичный класс Главная {
    публичный статический пустота Главная(String[] аргументы) {
        Круг circle = новое Круг(5);
        System.out.println("Circle Area: " + круг.облАсть получения());
        System.out.println("Circle Perimeter: " + круг.Гетпериметр());

        Прямоугольник rectangle = новое Прямоугольник(4, 6);
        System.out.println("Rectangle Area: " + прямоугольник.облАсть получения());
        System.out.println("Rectangle Perimeter: " + прямоугольник.Гетпериметр());

        Треугольник triangle = новое Треугольник(3, 4, 6);
        System.out.println("Triangle Area: " + треугольник.облАсть получения());
        System.out.println("Triangle Perimeter: " + треугольник.Гетпериметр());

        двойной lengthInCm = 100;
        двойной lengthInMeters = GeometryUtils.Конвертометры(lengthInCm, "cm");
        System.out.println("Length in meters: " + lengthInMeters);
    }
}
