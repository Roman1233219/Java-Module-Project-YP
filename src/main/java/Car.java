public class Car {
    String nameAuto;//инициализация переменной названия авто
    int speed;//инициализация переменной скорости авто


    public Car(String nameAuto,int speed) { // создание конструктора класса с присвоением переменным данных
        this.nameAuto = nameAuto;
        this.speed = speed;
    }
        public int getSpeed() {  // метод возврата скорости из присвоенной переменной
            return speed;
        }


}