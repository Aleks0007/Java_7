class Cat {
    private String name;
    private int appetite;
    private boolean satisfied;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satisfied = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satisfied = true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isSatisfied() {
        return satisfied;
    }
}