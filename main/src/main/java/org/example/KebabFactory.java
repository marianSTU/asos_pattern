import java.util.Scanner;

public class KebabFactory extends  BaseKebabFactory{
    @Override
    public  Kebab createKebab(){
        System.out.println("Choose type of kebab\n");
        System.out.println("1: Kebab in Box");
        System.out.println("2: Kebab in Bun");
        System.out.println("3: Kebab in Tortilla");

        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        Kebab kebab;
        switch (type)
        {
            case 1:
                kebab = new KebabBox();
                break;
            case 2:
                kebab = new KebabBun();
                break;
            case 3:
                kebab = new KebabTortilla();
                break;
            default: throw new IllegalArgumentException("No such Kebab.");
        }

        kebab.chickenKebab();
        kebab.addingIngredients();
        kebab.typeOfKebab();

        return kebab;
    }


}
