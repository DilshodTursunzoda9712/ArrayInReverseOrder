public class Main {
    public static void main(String[] args) {
        String[] str = {"Каждый", "охотник", "желает", "знать", "где", "сидить", "фазан"};
        //ввыводим начальный массив в консоль
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("-----");
        int x = str.length;
        //это переменнаяб  будет использоваться при обмене элементов
        String temp;
        for (int i = 0; i < x / 2; i++) {
            temp = str[x - i - 1];
            str[x - i - 1] = str[i];
            str[i] = temp;
        }
        //выводим конечный массив в консоль
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}