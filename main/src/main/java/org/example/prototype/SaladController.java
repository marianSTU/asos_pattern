package org.example.prototype;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class SaladController {

    public SaladController() {
    }

    public String saladOrder() throws Exception {
        intro();
        String order = " ";
        MeatSalad meatSalad = new MeatSalad("chicken");
        CheeseSalad cheeseSalad = new CheeseSalad("balkan");
        VegetableSalad vegetableSalad = new VegetableSalad("corn");

        while (true){


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();

            try {
                switch(name) {
                    case "1":
                            // object cloning
                            MeatSalad meatSaladClone = (MeatSalad) meatSalad.clone() ;

                            System.out.println("Enter type of meat:");
                            String meat = reader.readLine();
                            // decision if we want to have totally same object or slightly different
                            if (!Objects.equals(meatSaladClone.getMeat(), meat)){
                                meatSaladClone.setMeat(meat);
                                compare(meatSalad, meatSaladClone);
                            }else {
                                compare(meatSalad, meatSaladClone);
                            }
                            // order making
                            order = " Meat: " + meatSaladClone.getMeat() + " SaladType: " + meatSaladClone.getSalad() +
                                    " Dressing: " + meatSaladClone.getDresing() + " Oil: " + meatSaladClone.getOil() ;
                            break;

                    case "2":
                        System.out.println("Enter type of cheese:");
                        String cheese = reader.readLine();

                        String saladType = cheeseSalad.getSalad();
                        String oil = cheeseSalad.getOil();
                        String dressing = cheeseSalad.getDresing();
                        String cheeseType = cheeseSalad.getCheese();
                        CheeseSalad cheeseSaladClone = new CheeseSalad(saladType, oil, dressing, cheeseType);


                        if (!Objects.equals(cheeseSaladClone.getCheese(), cheese)){
                            cheeseSaladClone.setCheese(cheese);
                            compare(cheeseSalad, cheeseSaladClone);
                        }else {
                            compare(cheeseSalad, cheeseSaladClone);
                        }
                        order = " Cheese: " + cheeseSaladClone.getCheese() + " SaladType: " + cheeseSaladClone.getSalad() +
                                " Dressing: " + cheeseSaladClone.getDresing() + " Oil: " + cheeseSaladClone.getOil() ;

                        break;
                    case "3":
                        // object cloning
                        VegetableSalad vegetableSaladClone = (VegetableSalad) vegetableSalad.clone() ;

                        System.out.println("Enter type of vegetable:");
                        String veget = reader.readLine();
                        // decision if we want to have totally same object or slightly different
                        if (!Objects.equals(vegetableSalad.getVegetable(), veget)){
                            vegetableSaladClone.setVegetable(veget);
                            compare(vegetableSalad, vegetableSaladClone);
                        }else {
                            compare(vegetableSalad, vegetableSaladClone);
                        }
                        // order making
                        order = " Vegetable: " + vegetableSaladClone.getVegetable() + " SaladType: " + vegetableSaladClone.getSalad() +
                                " Dressing: " + vegetableSaladClone.getDresing() + " Oil: " + vegetableSaladClone.getOil() ;

                        break;
                    case "4":
                        break;
                    default:
                        System.out.println("Try it again");
                    }
                }catch (Exception e){
                        System.out.println(e);
            }
            break;
        }
        return order;
    }

    public static void compare(Object obj1, Object obj2) {
        System.out.println("-------------------------");
        if (obj1 != obj2) {
        System.out.println("Salads are different objects");
        if (obj1.equals(obj2)) {
            System.out.println("And they are identical");
        } else {
            System.out.println("But they are not identical");
        }
        } else {
            System.out.println("Salads objects are the same");
        }
        System.out.println("-------------------------");
    }

    public static void intro() {
        System.out.println("""
                ╔═════════════════════════════╗
                ╠  Choose option:
                ╠═════════════════════════════╝
                ╠-● 1. Select MeatSalad
                ╠-● 2. Select CheeseSalad
                ╠-● 3. Select VegetableSalad
                ╠-● 4. EXIT
                ╚═════════════════════════════╝
                """);
    }
}

