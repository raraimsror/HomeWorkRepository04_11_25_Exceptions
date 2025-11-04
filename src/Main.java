import java.util.Scanner;

/*
Создайте метод,
который просит пользователя ввести email.
Email считается корректным, если:
в нем не менее 5 символов,
есть один символ  ‘@’,
 он не должен быть первым или последним
Создайте свой NotCorrectEmailFormatException
Если пользователь ввел некорректную строку метод должен
выкидывать  NotCorrectEmailFormatException.
В main сделайте обработку Exception
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Add e-mail: ");
        String eMail = scanner.nextLine();


        System.out.println(eMail);


    }
public static void nailChek(String mail){

}



}