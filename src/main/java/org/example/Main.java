package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;


public class Main {
    // - Создать коллекцию из числовых элементов.
    static double[] numberList = new double[]{6d, 4d, 12d, 16d, 100d};

    public static void main(String[] args) {

        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(numberList);
        /* - С помощью объекта DescriptiveStatistics вычислить минимальное и
        максимальное значение, сумму и среднее арифметическое.
        */

        System.out.println("Минимальное значение: " + descriptiveStatistics.getMin());
        System.out.println("Максимальное значение: " + descriptiveStatistics.getMax());
        System.out.println("Сумма: " + descriptiveStatistics.getSum());
        System.out.println("Среднее арифметическое значение: " + descriptiveStatistics.getMean());

        /* С помощью класса ArithmeticUtils найти:
        - факториал числа N.
        - Наименьшее общее частное двух чисел
        - Наибольший общий делитель двух чисел
        - Проверить что число N это степень двойки
        */

        System.out.println("Факториал числа N: " + ArithmeticUtils.factorial(5));
        System.out.println("Наименьшее общее частное двух чисел: " + ArithmeticUtils.lcm(2, 3));
        System.out.println("Наибольший общий делитель двух чисел: " + ArithmeticUtils.gcd(2, 3));
        System.out.println("Число N это степень двойки: " + ArithmeticUtils.isPowerOfTwo(8));
    }
}