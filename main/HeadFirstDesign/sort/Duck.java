package HeadFirstDesign.sort;

public class Duck implements Comparable{
    String name;
    int weight;

    @Override
    public String toString() {
        return "Duck{" + "name='" + name + '\'' + ", weight=" + weight + '}';
    }


    public Duck( String name,int weight) {
        this.weight = weight;
        this.name = name;
    }


    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck) object;
        if (this.weight<otherDuck.weight){
            return -1;
        } else if (this.weight==otherDuck.weight) {
            return 0;
        } else  {
            return 1;

        }
    }

}
