package innerclasses;

public class Parcel10 {
    public Destination destination(final String dest,final float price ){
        return new Destination() {
            private final int cost;
            {
                cost=Math.round(price);
                if(cost>100)
                System.out.println("over budget");
            }
            private final String label=dest;
            @Override
            public String readLabel(){return label;}
        };
    }
    public static void main(String[] args) {
        Parcel10 p=new Parcel10();
        Destination d=p.destination("tasmania", 101.395f);
    }
}
