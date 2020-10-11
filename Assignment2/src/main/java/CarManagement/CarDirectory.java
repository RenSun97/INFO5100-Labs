/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUNREN
 */
public class CarDirectory {

    private ArrayList<Car> carList;

    public CarDirectory() {
        this.carList = new ArrayList<Car>();
        //生成默认的Car，用来进行测试
        generateSampleCars();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public Car addCar() {
        Car car = new Car();
        carList.add(car);
        return car;
    }

    public void deleteCar(Car car) {
        carList.remove(car);
    }

    public Car searchCar(String serialNum) {
        for (Car car : carList) {
            if (car.getSerialNum().equals(serialNum)) {
                return car;
            }
        }
        return null;
    }

    private void generateSampleCars() {
        String[] manufacture = {"BMW", "Toyota", "Honda", "Volkswagen", "Audi", "BMW", "Audi", "Toyota", "Honda", "Volkswagen"};
        boolean[] available = {true, false, true, true, false, false, true, true, false, true};
        boolean[] expiredMaintenanceCertificate = {true, true, true, false, false, true, false, false, true, true};
        String[] manufactureDate = {"2018", "2010", "2012", "2013", "2015", "2015", "2016", "2015", "2018", "2020"};
        String[] dates = {"2012-9-12", "2012-12-12","2013- 8-5", "2013-9-25","2013-9-12",
            "2014-9-12", "2015-12-30","2016- 8-5", "2019-11-25","2020-9-12", };
        int[] seat = {4, 4, 2, 4, 4, 6, 8, 4, 2, 5};
        String[] modelNumber = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] serialNumbe = {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100"};
        String[] cityName = {"Orlando", "New York City", "Detroit", "LosAngeles", "Detroit", "Orlando", "LosAngeles", "Phoenix", "New York City", "Phoenix",};
        for (int i = 0; i < 10; i++) {
            try {
                Car car = addCar();
                car.setManu(manufacture[i]);
                car.setAvail(available[i]);
                car.setCertificate(expiredMaintenanceCertificate[i]);
                car.setManuYear(manufactureDate[i]);
                car.setSeat(seat[i]);
                car.setModelNum(modelNumber[i]);
                car.setSerialNum(serialNumbe[i]);
                car.setCity(cityName[i]);
                car.setUpdate(new SimpleDateFormat("yyyy-MM-dd").parse(dates[i]));
            } catch (ParseException ex) {
                Logger.getLogger(CarDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
