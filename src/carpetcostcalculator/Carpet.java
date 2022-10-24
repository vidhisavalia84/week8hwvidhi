package carpetcostcalculator;

public class Carpet {
    double cost = 0;

    public Carpet(double cost){
        this.cost=cost;
        if(cost<0){this.cost=0;
        }else {
            this.cost=cost;
        }
    }
    public double getCost(){
      // Carpet c=new Carpet();
       //cost=8*area;//cost=8*area
        return this.cost;
    }

}
