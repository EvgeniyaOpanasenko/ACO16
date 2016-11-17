package week1_day1;

/**
 * Created by Lisa on 11/13/2016.
 */
public class HashCodeDemo {
    int var1;
    int var2;

    public HashCodeDemo(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

   @Override
    public int hashCode() {
       final int prime = 34;
       int result = 1;
       result = prime* result + var2;
       result = prime* result + var1;
       return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        HashCodeDemo hs = (HashCodeDemo)obj;
        if (var1 != hs.var1) return false;
        if (var2 != hs.var2) return false;
        return true;
    }

    public static void main(String[] args) {
        HashCodeDemo ob1 = new HashCodeDemo(1,2);
        HashCodeDemo ob2 = new HashCodeDemo(1,3);

        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.getClass());
    }
}
