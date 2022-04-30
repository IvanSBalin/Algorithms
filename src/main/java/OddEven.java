public class OddEven {

// 1. Создать алгоритм OddEven, который принимает на вход целое число, возвращает
//    “Odd”,  если число нечетное, и “Even”, если число четное. Во всех остальных
//    случаях результат будет “Undefined”.
    public String oddEven(int number) {
        String result;
        if(number > Integer.MAX_VALUE) {
            return  "Undefined";
        } else if (number % 2 != 0) {
            return "Odd";
        }else{
            return  "Even";
        }
    }
}
