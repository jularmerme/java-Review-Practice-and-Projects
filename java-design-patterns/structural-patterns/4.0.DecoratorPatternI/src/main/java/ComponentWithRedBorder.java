import java.awt.*;

public class ComponentWithRedBorder implements Component {

    Component decoreatedComponent;

    public ComponentWithRedBorder(Component component) {
        this.decoreatedComponent = component;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoreatedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);
    }
}
