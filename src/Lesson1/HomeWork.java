package Lesson1;
// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class HomeWork {
    private static int a;

    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void main(String[] args) {
        byte b = 10;
        short sh = 31;
        int width;
        width = 24;
        long l = 787654L;
        float f = 7.5f;
        double pi = Math.PI;
        char ch = '\u0044';
        boolean bool = b >= sh;
    }
//3. Написать метод вычисляющий выражение
// a * (b + (c / d)) и возвращающий результат,
// где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static int calculate(int a, int b, int c, int d) {
        return a * (b+(c / d));
    }
//4. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20
// (включительно), если да – вернуть true, в противном случае – false.
    public static boolean task10and20 (int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }
//5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
   public static void isPositiveOrNegative (int a) {
        HomeWork.a = 7;
        if( a >= 0) {
            System.out.println("Положительное");
        }  else {
            System.out.println("Отрицательное");
        }}
//6. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true,
// если число отрицательное, и вернуть false если положительное.
        public static boolean isNegative (int n) {
            if (n < 0) {
                return true;
            }
            return false;
        }
//7. Написать метод, которому в качестве параметра передается строка,
// обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        public static void greetings(String name) {
            System.out.println('Привет, '+ name +'!');
}
//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение
//в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
//– високосный.
    static void doSeven(int year) {
        System.out.println("\nЗадание 7.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
    }