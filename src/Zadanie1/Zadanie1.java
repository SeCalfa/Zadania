package Zadanie1;

public class Zadanie1 {

    public static void main(String[] args){
        System.out.println(createPicture(1));
        System.out.println(createPicture(2));
        System.out.println(createPicture(3));
        System.out.println(createPicture(4));
    }

    public static String createPicture(int n){
        int number1 = n;
        int number2 = n;
        String result = "";
        int length = (n - 1) * 2 + 1;
        char[][] resultInChar = new char[length][length];
        int middleNumber = (length - 1) / 2 + 1;

        for (int num = 0; num < middleNumber; num++){

            for (int a = num; a < resultInChar.length - num; a++){
                resultInChar[num][a] = Integer.toString(number1).charAt(0);
                resultInChar[a][num] = Integer.toString(number1).charAt(0);
            }

            number1--;
        }

        for (int num = length; num > middleNumber; num--){

            for (int a = num - 1; a > resultInChar.length - num; a--){
                resultInChar[num - 1][a] = Integer.toString(number2).charAt(0);
                resultInChar[a][num - 1] = Integer.toString(number2).charAt(0);
            }

            number2--;
        }

        for (int y = 0; y < length; y++){
            for (int x = 0; x < length; x++){
                result += String.valueOf(resultInChar[y][x]) + " ";
            }

            result += "\n";
        }

        return result;
    }

}
