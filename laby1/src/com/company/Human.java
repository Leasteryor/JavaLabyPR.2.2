package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {

        private static final Double DEFAULT_SALARY = 1600.0;

        String firstName;
        String lastName;
        Animal pet;
        Phone mobile;
        private String car;
        private Double salary;

        Human(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.salary = DEFAULT_SALARY;
        }

        public void setSalary(Double newSalary) {
                if (newSalary >= 0) {
                        salary = newSalary;
                        System.out.println("Nowe dane zostały wysłane do systemu księgowego");
                        System.out.println("Należy odebrać aneks do umowy od pani Hani z kadr");
                        System.out.println("ZUS i US już wiedzą o zmianie wypłaty, nie ma co ukrywać dochodu :)");
                }
                else
                {
                        System.out.println("Ujemna wyplata!!");
                }
        }
        public void setCar(Car vehicle)
        {
                if(salary > vehicle.value)
                {
                        System.out.println("Udało się kupić samochód za gotówkę!");
                        car = vehicle.showCar();
                }
                else if(salary > (vehicle.value/12))
                {
                        System.out.println("Udało się kupić samochód na kredyt!");
                        car = vehicle.showCar();
                }
                else
                {
                        System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę!");
                }
        }

        public Double getSalary(){

                System.out.println("Ostatnie pobieranie danych o wypłacie: 10.09.2021. Wartość: "+ salary+ "zl");
                return this.salary;
        }
        public void getCar()
        {
                System.out.println(this.car);
        }
        //toString
        public String toString()
        {
                return "Imię: " + firstName + " Nazwisko: " + lastName +
                        "\nZwierzę: (" + pet + ") Samochód:( " + car + ") " +
                        "\nPensja: " + salary + "Telefon: "+ mobile;
        }
}
