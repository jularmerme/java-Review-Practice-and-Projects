
package abstract_factory_example;

public class RoadBikeFactory extends BikeFactory {
    
    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }
    
    @Override
    public Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }
    
}
