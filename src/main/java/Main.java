import models.Beauty.Shampoos;
import models.Store_Goods;
import models.electronics.*;
import models.fashion.Jacket;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Store_Goods> goods = new ArrayList<Store_Goods>();

        Store_Goods laptop1 = new Laptop("LENOVO W530 i7-3740QM 8 ГБ 240 ГБ SSD Nvidia K1000M",2199, 25,"black",3.5);
        ((Laptop) laptop1).setGraphics_card(new Graphics_Card("Integrated graphics", "NVIDIA Quadro K1000M"));
        ((Laptop) laptop1).setHard_drive(new Hard_drive("240", "SATA II, SATA III", "SSD"));
        ((Laptop) laptop1).setProcessor(new Processor("Intel Core i7", "2.7", "6"));
        ((Laptop) laptop1).setRam(new Ram("8", "16", "DDR3"));
        ((Laptop) laptop1).setScreen(new Screen("15.6","1920 x 1080", "matte"));

        Store_Goods laptop2 = new Laptop("HP 255 G7 8Gb / 256 Radeon RX Vega 3 FHD",1657, 0,"black",1.78);
        ((Laptop) laptop2).setGraphics_card(new Graphics_Card("Integrated graphics", "shared"));
        ((Laptop) laptop2).setHard_drive(new Hard_drive("120", "M.2, SATA", "SSD"));
        ((Laptop) laptop2).setProcessor(new Processor("AMD Athlon", "2.4", "5"));
        ((Laptop) laptop2).setRam(new Ram("6", "12", "DDR4"));
        ((Laptop) laptop2).setScreen(new Screen("11.6","1366 x 768", "matte"));

        Store_Goods laptop3 = new Laptop("Lenovo Helix 2 FHD 8GB 256GB W10",1894, 0,"grey",2.56);
        ((Laptop) laptop3).setGraphics_card(new Graphics_Card("Integrated graphics", "Intel HD Graphics 5300"));
        ((Laptop) laptop3).setHard_drive(new Hard_drive("256", "SATAII", "SSD"));
        ((Laptop) laptop3).setProcessor(new Processor("Intel Core m", "2.0", "4"));
        ((Laptop) laptop3).setRam(new Ram("6", "12", "DDR4"));
        ((Laptop) laptop3).setScreen(new Screen("11.6","1920 x 1080", "shiny"));

        Store_Goods laptop4 = new Laptop("ACER Aspire 5 Ryzen 5 / 8GB / 512GB SSD / 15.6 / W10",2899, 50,"silver",1.75);
        ((Laptop) laptop4).setGraphics_card(new Graphics_Card("Integrated graphics", "shared"));
        ((Laptop) laptop4).setHard_drive(new Hard_drive("512", "SATAIII", "SSD"));
        ((Laptop) laptop4).setProcessor(new Processor("AMD Ryzen 5", "2.4", "6"));
        ((Laptop) laptop4).setRam(new Ram("8", "16", "DDR4"));
        ((Laptop) laptop4).setScreen(new Screen("15.6","1920 x 1080", "matte"));

        Store_Goods laptop5 = new Laptop("Lenovo laptop | i5 | 15.6 '' | 16GB | 512SSD | Kl.Num | W10",1652, 35,"black",2.45);
        ((Laptop) laptop5).setGraphics_card(new Graphics_Card("Integrated graphics", "shared"));
        ((Laptop) laptop5).setHard_drive(new Hard_drive("512", "SATAII", "SSD"));
        ((Laptop) laptop5).setProcessor(new Processor("Intel Core i5", "2.5", "5"));
        ((Laptop) laptop5).setRam(new Ram("16", "16", "DDR3"));
        ((Laptop) laptop5).setScreen(new Screen("15.6","1366 x 768", "matte"));

        Store_Goods laptop6 = new Laptop(" Lenovo 14w dotykowy AMD A6 win10 gw24",1299, 0,"black",1.85);
        ((Laptop) laptop6).setGraphics_card(new Graphics_Card("Integrated graphics", "shared"));
        ((Laptop) laptop6).setHard_drive(new Hard_drive("64", "SATAIII", "eMMC"));
        ((Laptop) laptop6).setProcessor(new Processor("AMD A6", "1.8", "4"));
        ((Laptop) laptop6).setRam(new Ram("4", "4", "DDR4"));
        ((Laptop) laptop6).setScreen(new Screen("14","1920 x 1080", "matte"));

        Store_Goods laptop7 = new Laptop("Lenovo IdeaPad 5 i7 12GB 512SSD FHD Touch IPS W10",3399, 15,"blue",2);
        ((Laptop) laptop7).setGraphics_card(new Graphics_Card("Integrated graphics", "shared"));
        ((Laptop) laptop7).setHard_drive(new Hard_drive("512", "M.2 PCIe", "SSD"));
        ((Laptop) laptop7).setProcessor(new Processor("Intel Core i7", "1.3", "8"));
        ((Laptop) laptop7).setRam(new Ram("12", "12", "DDR4"));
        ((Laptop) laptop7).setScreen(new Screen("15.6","1920 x 1080", "matte"));

        Store_Goods laptop8 = new Laptop("Laptop Asus DM543MA 15,6'' 256SSD FHD W10",1899, 5,"gray",1.9);
        ((Laptop) laptop8).setGraphics_card(new Graphics_Card("Integrated graphics", "Intel HD Graphics 620"));
        ((Laptop) laptop8).setHard_drive(new Hard_drive("256", "SATA III", "SSD"));
        ((Laptop) laptop8).setProcessor(new Processor("Intel Celeron Dual-Core", "1.6", "6"));
        ((Laptop) laptop8).setRam(new Ram("4", "4", "DDR4"));
        ((Laptop) laptop8).setScreen(new Screen("15.6","1920 x 1080", "matte"));

        Store_Goods laptop9 = new Laptop("Intel Celeron J3455 15,6 cala 6G RAM + 256G",1217, 0,"silver",2.4);
        ((Laptop) laptop9).setGraphics_card(new Graphics_Card("Integrated graphics", "Intel HD Graphics 500"));
        ((Laptop) laptop9).setHard_drive(new Hard_drive("256", "M.2", "SSD"));
        ((Laptop) laptop9).setProcessor(new Processor("Intel Celeron", "1.5", "2"));
        ((Laptop) laptop9).setRam(new Ram("6", "8", "DDR4"));
        ((Laptop) laptop9).setScreen(new Screen("15.6","1920 x 1080", "shiny anti-reflective"));

        Store_Goods laptop10 = new Laptop("Apple MacBook AIR A1465 Core i5 11,6' 512SSD macOS",1927, 37,"black",1.9);
        ((Laptop) laptop10).setGraphics_card(new Graphics_Card("Integrated graphics", "Intel HD Graphics 4000"));
        ((Laptop) laptop10).setHard_drive(new Hard_drive("512", "SATA II", "SSD"));
        ((Laptop) laptop10).setProcessor(new Processor("Intel Core i5", "1.7", "3"));
        ((Laptop) laptop10).setRam(new Ram("4", "8", "DDR3"));
        ((Laptop) laptop10).setScreen(new Screen("11.6","1366 x 768", "matte"));


        Store_Goods jacket1 = new Jacket("3XL - MEN'S TRANSITIONAL JACKET A027", 159.99, 15, "other (matt)", "3XL",
                "windbreaker", "navy blue, different color", "synthetic", "74", "87", "64", "A027");
        Store_Goods jacket2 = new Jacket("XL - MEN'S TRANSITION JACKET A03", 99.99, 0, "other (matt)", "XL",
                "windbreaker", "black, different color", "synthetic", "75", "84", "60.5", "A03");
        Store_Goods jacket3 = new Jacket("L - MEN'S TRANSITION JACKET KL3249 A", 89.99, 0, "other (100)", "L",
                "air gun", "black, navy blue, different color", "synthetic", "74", "82", "58", "A028");
        Store_Goods jacket4 = new Jacket("XL - MEN'S LEATHER JACKET JP-1169 A", 179.99, 10, "other (100)", "XL",
                "different", "black, different color", "not applicable", "74", "84", "58", "A02");
        Store_Goods jacket5 = new Jacket("L - MEN'S WARM WINTER JACKET HM1902", 149.99, 0, "other (100)", "L",
                "air gun", "khaki, different color", "synthetic", "82", "82", "63", "HM1902");
        Store_Goods jacket6 = new Jacket("XL - MEN'S TRANSITION JACKET TM08A", 139.99, 17, "other (100)", "XL",
                "air gun", "yellow, a different color", "synthetic", "74", "82", "64", "TM08A");
        Store_Goods jacket7 = new Jacket("L - MEN'S TRANSITION JACKET TM08", 119.99, 0, "other (100)", "L",
                "air gun", "black, different color", "synthetic", "72", "82", "79", "TM08");
        Store_Goods jacket8 = new Jacket("XL - MEN'S LEATHER JACKET C1371", 99.99, 0, "other (matt)", "XL",
                "different", "brown, khaki, different color", "not applicable", "70", "82", "57", "C1371");
        Store_Goods jacket9 = new Jacket("M-MEN'S LEATHER JACKET 14G07 SLIM-FIT THIN02", 99.99, 14, "other (matt)", "M",
                "different", "black, different color", "not applicable", "65", "79", "53", "THIN02");
        Store_Goods jacket10 = new Jacket("XL - MEN'S TRANSITION JACKET A025", 159.99, 0, "other (matt)", "XL",
                "air gun", "navy blue, different color", "synthetic", "71", "84", "61", "A025");

        Store_Goods shampoo1 = new Shampoos("ALFAPARF KERATIN THERAPY KIT SHAMPOO CONDITIONER", 56.48, 0, "New", "Alfaparf",
                "for all hair colors", "for all hair types", "straightening and smoothing", "500", "bottle", "Full-size product");
        Store_Goods shampoo2 = new Shampoos("Loreal Inforcer Brittle Brittle Thin Shampoo 500", 45.90, 5, "New", "L'Oréal Expert",
                "for all hair colors", "dry and damaged", "universal care", "500", "pump bottle", "Full-size product");
        Store_Goods shampoo3 = new Shampoos("FANOLA NO YELLOW Shampoo for blond hair 1000ML", 40.00, 0, "New", "Fanola",
                "for blondes", "for all hair types", "color protection", "500", "bottle", "Full-size product");
        Store_Goods shampoo4 = new Shampoos("STAPIZ Sleek Line Repair Set XXL Shampoo Mask", 40.49, 17, "New", "Stapiz",
                "for all hair colors", "dry and damaged", "regeneration and hydration", "450", "bottle", "Full-size product");
        Store_Goods shampoo5 = new Shampoos("REGENERATING SHAMPOO WITH AVOCADO THIGH STEAM 300ml", 14.99, 0, "New", "other brand (thigh walz)",
                "for all hair colors", "dry and damaged", "regeneration and hydration", "300", "bottle", "Full-size product");
        Store_Goods shampoo6 = new Shampoos("STAPIZ Sleek Line Repair Shampoo with Silk 1L", 13.99, 0, "New", "Stapiz",
                "lack of information", "dry and damaged", "regeneration and hydration", "1000", "pump bottle", "Full-size product");
        Store_Goods shampoo7 = new Shampoos("NO YELLOW FANOLA BLOND HAIR SHAMPOO 1000ML", 38.00, 23, "New", "Fanola",
                "for blondes", "dyed", "color protection", "1000", "bottle", "Full-size product");
        Store_Goods shampoo8 = new Shampoos("STAPIZ Sleek Line Blond Set XL Shampoo Mask 2L", 47.90, 0, "New", "Stapiz",
                "for blondes", "dry and damaged", "regeneration and hydration", "1000", "bottle", "Full-size product");
        Store_Goods shampoo9 = new Shampoos("ANWEN Shampoo Wake It Up enzymatic coffee 200ml", 23.74, 19, "New", "Anwen",
                "for all hair colors", "for all hair types", "cleansing", "200", "pump bottle", "Full-size product");
        Store_Goods shampoo10 = new Shampoos("Fitokosmetik shampoo with clay and silver ions", 8.29, 0, "New", "Fitokosmetik",
                "for all hair colors", "for all hair types", "extra volume", "270", "bottle", "Full-size product");






        goods.add(laptop1);
        goods.add(laptop2);
        goods.add(laptop3);
        goods.add(laptop4);
        goods.add(laptop5);
        goods.add(laptop6);
        goods.add(laptop7);
        goods.add(laptop8);
        goods.add(laptop9);
        goods.add(laptop10);
        goods.add(jacket1);
        goods.add(jacket2);
        goods.add(jacket3);
        goods.add(jacket4);
        goods.add(jacket5);
        goods.add(jacket6);
        goods.add(jacket7);
        goods.add(jacket8);
        goods.add(jacket9);
        goods.add(jacket10);
        goods.add(shampoo1);
        goods.add(shampoo2);
        goods.add(shampoo3);
        goods.add(shampoo4);
        goods.add(shampoo5);
        goods.add(shampoo6);
        goods.add(shampoo7);
        goods.add(shampoo8);
        goods.add(shampoo9);
        goods.add(shampoo10);


        List<Store_Goods> store_goodsList = goods
                .stream()
                .filter(store_good -> store_good.getPercentage_discount() > 0)
                .collect(Collectors.toList());

        System.out.println(store_goodsList);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Alegro_service.csv");

            fileWriter.write(store_goodsList.toString());
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
