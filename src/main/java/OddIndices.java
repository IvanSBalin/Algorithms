public class OddIndices {

//    Написать алгоритм OddIndices, который принимает массив чисел,
//    и возвращает массив значений нечетных индексов

    public int[] oddIndices(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 != 0) {
                sum++;
            }
        }
        int[] result = new int[sum];
        for (int i = 1, index = 0; i < input.length; i += 2) {
            result[index++] = input[i];
        }

        return result;

    }
}
