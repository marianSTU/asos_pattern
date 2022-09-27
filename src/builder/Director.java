package builder;

public class Director {

    public void setMargarita(Pizza.Builder builder){
        builder.setTomatoSauce(true)
                .setCheese(true);
    }

    public void setCardinale(Pizza.Builder builder){
        builder.setTomatoSauce(true)
                .setCheese(true)
                .setHam(true);
    }

    public void setDiavolo(Pizza.Builder builder){
        builder.setTomatoSauce(true)
                .setCheese(true)
                .setHam(true)
                .setPepperoni(true);
    }

    public void setHawai(Pizza.Builder builder){
        builder.setTomatoSauce(true)
                .setCheese(true)
                .setHam(true)
                .setPineapple(true);
    }

    public void setSalami(Pizza.Builder builder){
        builder.setTomatoSauce(true)
                .setCheese(true)
                .setSalami(true);
    }

    public void setAllaMexicana(Pizza.Builder builder){
        builder.setTomatoSauce(true)
                .setCheese(true)
                .setChickenMeat(true)
                .setCorn(true);
    }

    public void setAlTonno(Pizza.Builder builder){
        builder.setTomatoSauce(true)
                .setCheese(true)
                .setTuna(true)
                .setOnion(true);
    }





}
