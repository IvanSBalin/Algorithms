public class BiggerValue {

// Напишите алгоритм BiggerValue, который из двух параметров типа
// int возвращает бОльшее значение.

    public Object biggerValue(int firstFigure, int secongFigure) {
        if (firstFigure > secongFigure) {

            return firstFigure;
        } else if (firstFigure < secongFigure) {

            return secongFigure;
        } else {

            return "Fidures are equals!";
        }
    }
}
