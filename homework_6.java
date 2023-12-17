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

import java.lang.annotation.Retention;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class homework_6 {


    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Huawei", "MateBook D 15 BoDe-WDH9 53013WRP", 15.6, "Intel Core i5 1155G7", 2.5, 4, 8, 512, "серый космос", "без операционной системы", "Intel Iris Xe graphics");
        Laptop laptop2 = new Laptop("TECNO", "MegaBook T1 TCN-T1R5W15.512.GR", 15.6, "AMD Ryzen 5 5560U", 2.3, 6, 16, 512, "серый", "Windows 11 Home", "AMD Radeon");
        Laptop laptop3 = new Laptop("Huawei", "MateBook 14 KLVF-X 53013PET", 14.0, "Intel Core i5 1240P", 1.7, 12, 16, 512, "серый космос", "Windows 11 Home", "Intel Iris Xe graphics");
        Laptop laptop4 = new Laptop("Xiaomi", "RedmiBook JYU4525RU", 15.6, "Intel Core i3 1115G4", 3.0, 2, 8, 256, "серый", "Windows 11 Home", "Intel UHD Graphics");
        Laptop laptop5 = new Laptop("Apple", "MacBook Air A2681 Z15S0059F", 13.6, "Apple M2 8 core",3.5, 8, 16, 512, "серый космос", "Mac OS", "интегрированный");
        Laptop laptop6 = new Laptop("Acer", "Aspire 3 A315-510P-3374", 15.6, "Intel Core i3 N305", 1.8, 8, 8, 256, "серебристый", "без операционной системы", "Intel UHD Graphics");
        Laptop laptop7 = new Laptop("Microsoft Surface", "Go Platinum TNV-00004", 12.4, "Intel Core i5 1035G1", 1.0, 4, 8, 256, "серебристый", "Windows 10 Professional", "Intel UHD Graphics");
        Laptop laptop8 = new Laptop("HP", "Omen 16-c0045ur 4E1R9EA", 16.1, "AMD Ryzen 7 5800H", 3.2, 8, 0, 1000, "темно-серебристый", "Free DOS 3.0", "NVIDIA GeForce RTX 3070 для ноутбуков - 8 ГБ");


        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8));
        
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

        findByParams(laptops);
    }

    public static void findByParams(Set<Laptop> laptops) {
        Map<String, String> params = new HashMap<>();
        params = getParams();

        boolean result = false;

        for (Laptop laptop : laptops) {
            result = false;
            for(var item : params.entrySet()) {
                if (!compareParams(laptop, item.getKey(), item.getValue())) {
                    result = false;
                    break;
                }
                result = true;
            }

            if (result) {
                System.out.println();
                System.out.println(laptop.toString());
            }
        }


        
    }

    public static String inputParam () {
        Scanner input = new Scanner(System.in,  "UTF-8");
        System.out.print("Введите значение: ");
        return input.nextLine();
    }

    public static Map<String, String> getParams() {
        System.out.println("Введите через пробел цифры, соответствующие необходимому критерию:\n" + 
                                    "1 - ОЗУ\n" + 
                                    "2 - Объем ЖД\n" + 
                                    "3 - Операционная система\n" + 
                                    "4 - Диагональ\n" + 
                                    "0 - Закончить ввод критериев");
        Map<String, String> params = new HashMap<>();
        while (true) {
            Scanner input = new Scanner(System.in, "UTF-8");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }
            
            switch (num) {
                case 1:
                    params.put("ram", inputParam());
                    break;

                case 2:
                    params.put("rom", inputParam());
                    break;

                case 3:
                    params.put("os", inputParam());
                    break;
                
                case 4:
                    params.put("diagonal", inputParam());
                    break;
            }

            
        }

        return params;
    }

    public static boolean compareParams (Laptop laptop, String key, String value) {
        switch (key) {
            case "ram":
                return compareInt(laptop.getRam(), value);
                // break;

            case "rom":
                return compareInt(laptop.getRom(), value);
                // break;

            case "os":
                return compareString(laptop.getOs(), value);
                // break;
                
            case "diagonal":
                return compareDouble(laptop.getDiagonal(), value);
                // break;
        }
        return false;
    }

    public static boolean compareInt (int field, String param) {
        return field >= Integer.parseInt(param);
    }

    public static boolean compareDouble (Double field, String param) {
        return field >= Double.parseDouble(param);
    }

    public static boolean compareString (String first, String second) {
        if (first.indexOf(second) == -1) {
            return false;
        } else {
            return true;
        }
    }
}