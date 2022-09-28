package builder;

public class Pizza {

    private final String size;
    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean ham;
    private final boolean corn;
    private final boolean bacon;
    private final boolean pepperoni;
    private final boolean salami;
    private final boolean pineapple;
    private final boolean chickenMeat;
    private final boolean tuna;
    private final boolean onion;

    public static Builder createPizza(){
        return new Builder();
    }

    private Pizza(Builder builder){
        this.size = builder.size;
        this.tomatoSauce = builder.tomatoSauce;
        this.cheese = builder.cheese;
        this.ham = builder.ham;
        this.corn = builder.corn;
        this.bacon = builder.bacon;
        this.pepperoni = builder.pepperoni;
        this.salami = builder.salami;
        this.pineapple = builder.pineapple;
        this.chickenMeat = builder.chickenMeat;
        this.tuna = builder.tuna;
        this.onion = builder.onion;
    }

    @Override
    public String toString() {
        return "╔═════════════════════════╗" +
                "\n╠ Your Pizza:" +
                "\n╠═════════════════════════╝" +
                (size != null ? "\n╠-● Size: " + size : "") +
                "\n╠═════════════════════════╗" +
                "\n╠ Ingredients:" +
                "\n╠═════════════════════════╝\n" +
                (tomatoSauce ? "╠-● Tomato Sauce\n" : "") +
                (cheese ? "╠-● Cheese\n" : "") +
                (ham ? "╠-● Ham\n" : "") +
                (corn ? "╠-● Corn\n" : "") +
                (bacon ? "╠-● Bacon\n" : "") +
                (pepperoni ? "╠-● Pepperoni\n" : "") +
                (salami ? "╠-● Salami\n" : "") +
                (pineapple ? "╠-● Pineapple\n" : "") +
                (chickenMeat ? "╠-● Chicken Meat\n" : "") +
                (tuna ? "╠-● Tuna\n" : "") +
                (onion ? "╠-● Onion\n" : "") +
                "╚═════════════════════════╝\n";
    }

    public String getSize() {
        return size;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isHam() {
        return ham;
    }

    public boolean isCorn() {
        return corn;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isSalami() {
        return salami;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public boolean isChickenMeat() {
        return chickenMeat;
    }

    public boolean isTuna() {
        return tuna;
    }

    public boolean isOnion() {
        return onion;
    }


    public static class Builder{
        private String size;
        private boolean tomatoSauce;
        private boolean cheese;
        private boolean ham;
        private boolean corn;
        private boolean bacon;
        private boolean pepperoni;
        private boolean salami;
        private boolean pineapple;
        private boolean chickenMeat;
        private boolean tuna;
        private boolean onion;

        private Builder(){}

        public Builder setSize(String size){
            this.size = size;
            return this;
        }

        public Builder setTomatoSauce(boolean tomatoSauce){
            this.tomatoSauce = tomatoSauce;
            return this;
        }

        public Builder setCheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public Builder setHam(boolean ham){
            this.ham = ham;
            return this;
        }

        public Builder setCorn(boolean corn){
            this.corn = corn;
            return this;
        }

        public Builder setBacon(boolean bacon){
            this.bacon = bacon;
            return this;
        }

        public Builder setPepperoni(boolean pepperoni){
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder setSalami(boolean salami){
            this.salami = salami;
            return this;
        }

        public Builder setPineapple(boolean pineapple){
            this.pineapple = pineapple;
            return this;
        }

        public Builder setChickenMeat(boolean chickenMeat){
            this.chickenMeat = chickenMeat;
            return this;
        }

        public Builder setTuna(boolean tuna){
            this.tuna = tuna;
            return this;
        }

        public Builder setOnion(boolean onion){
            this.onion = onion;
            return this;
        }

        public void reset(){
            this.tomatoSauce = false;
            this.cheese = false;
            this.ham = false;
            this.corn = false;
            this.bacon = false;
            this.pepperoni = false;
            this.salami = false;
            this.pineapple = false;
            this.chickenMeat = false;
            this.tuna = false;
            this.onion = false;
        }

        public Pizza build(){
            return new Pizza(this);
        }

    }

}
