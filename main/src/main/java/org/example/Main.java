public class Main {
    public static void main(String args[]) {
        BaseKebabFactory kebabFactory = new KebabFactory();


        System.out.println(kebabFactory.createKebab().getClass());
    }
}
