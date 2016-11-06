package OOP.week5_day1.cloneDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
class Woman extends Person{
    private Child child;

    public Woman(String name, int age, Child child) {
        super(name, age);
        this.child = child;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    public Woman clone() throws CloneNotSupportedException {
        Woman woman = (Woman) super.clone();
        woman.setChild((Child)child.clone());
        return woman;
    }

}
