package web.service;

import web.model.Car;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carsCount(List<Car> list, int count) {
        if (count == 0 || count > 5) return list;
        return list.stream().limit(count).collect(Collectors.toList());
    }
}





