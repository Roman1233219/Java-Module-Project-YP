import java.util.Scanner;//мпортируем пакет

public class Main {
    public static void main(String[] args) {

    System.out.println("Мы приветствуем вас на гонках - 24 часа Ле-Мана!");//приветствуем
        Race race = new Race();//создаем объект класса гонки
    Scanner scanner = new Scanner(System.in);//создаем объект класса ввода данных
    for (int i = 1;i<4;i++){ //запускаем цикл считывания данных название авто и скорость авто
        String nameAuto; //инициализируем переменную названия авто
        int speed;       // инициализируем переменную скорости авто
        while (true){    //запуск бесконечного цикла пока пользователь не введет строковые данные(название авто)
            System.out.println("Введите название автомобиля №" + i + ": ");
            nameAuto = scanner.nextLine();
            if (nameAuto.isEmpty()){
                System.out.println("Ошибка!Название автомобиля не может быть пустым!Пожалуйста повторите ввод.");
            }else {
                break;
            }
            }
        while(true){  //запуск бесконечного цикла пока пользователь не введет цельночисленные данные (скорость авто)
            System.out.println("Введите скорость автомобиля №" + i + " (от 0 до 250) ");
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();
                scanner.nextLine();//чистим буфер после ввода
                if(speed <= 0 || speed > 251){
                    System.out.println("Ошибка!скорость должна быть больше 0 и меньше или равна 250.Пожалуйста повторите ввод.");
                }else{
                    break;
                }
        }else {
                System.out.println("Ошибка!скорость должна быть целым числом.Пожалуйста повторите ввод.");
                scanner.nextLine();//чистим буфер после ввода
            }

        }
        Car car = new Car(nameAuto, speed);//создаем объект класса
        race.returnCalculation(car);//вызываем метод класса который вычисляет скорость

    }
        scanner.close();//закрываем сканер

        System.out.println("Самая быстрая машина: " + race.getFarting()); // выводим результат
    }
}