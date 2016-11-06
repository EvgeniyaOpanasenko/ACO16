package OOP.week5_day1.NestedClassesDemo;

/**
 * Created by Lisa on 11/5/2016.
 */
public class Ship {
    public static class LifeBoat{
        private String name;

        public LifeBoat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "LifeBoat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

   public static class Engine{
       private String name;

       public Engine(String name) {
           this.name = name;
       }

       @Override
       public String toString() {
           return "Engine{" +
                   "name='" + name + '\'' +
                   '}';
       }
   }
}
