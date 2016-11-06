package OOP.week5_day1.cloneDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
class Man extends Person {

    private Woman wife;

    public Man(String name, int age) {
        super(name, age);
    }

    public Man(String name, int age, Woman wife) {
        super(name, age);
        this.wife = wife;
    }

    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;

    }

    @Override
    public String toString() {
        return "Wife{" +
                "wife=" + wife +
                '}';
    }
    @Override
    public Man clone() throws CloneNotSupportedException {
        Man man = (Man)super.clone();
        man.setWife(wife.clone());
        return man;
    }

}
