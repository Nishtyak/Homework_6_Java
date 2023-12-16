/**
Задание

📌 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
📌 Создать множество ноутбуков.
📌 Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
📌 Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
📌 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
условиям.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class homework_6 {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Huawei", "MateBook", "D 15 BoDe-WDH9 53013WRP", 15.6, "Intel Core i5 1155G7", 2.5, 4, 8, 512, "серый космос", "без операционной системы", "Intel Iris Xe graphics");
        Laptop laptop2 = new Laptop("TECNO", "MegaBook", "T1 TCN-T1R5W15.512.GR", 15.6, "AMD Ryzen 5 5560U", 2.3, 6, 16, 512, "серый", "Windows 11 Home", "AMD Radeon");
        Laptop laptop3 = new Laptop("Huawei", "MateBook", "14 KLVF-X 53013PET", 14.0, "Intel Core i5 1240P", 1.7, 12, 16, 512, "серый космос", "Windows 11 Home", "Intel Iris Xe graphics");
        Laptop laptop4 = new Laptop("Xiaomi", "RedmiBook", "JYU4525RU", 15.6, "Intel Core i3 1115G4", 3.0, 2, 8, 256, "серый", "Windows 11 Home", "Intel UHD Graphics");
        Laptop laptop5 = new Laptop("Apple", "MacBook", "Air A2681 Z15S0059F", 13.6, "Apple M2 8 core",3.5, 8, 16, 512, "серый космос", "Mac OS", "интегрированный");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));
        
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}