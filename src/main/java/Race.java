public class Race {
    String nameAuto =""; // создали переменную названия авто
    int km = 0; //присвоили переменной скорости начальную скорость
    public void returnCalculation(Car car){ //создали метод который присваивает переменным новые данные если условие сравнения верно
        int kmCar =car.getSpeed()*24;
        if (kmCar >= km){
            km = kmCar;
            nameAuto = car.nameAuto;
        }
    }
    public String getFarting(){//создали метод возврата названия авто которое по условию быстрее.
        return nameAuto;
    }


}
