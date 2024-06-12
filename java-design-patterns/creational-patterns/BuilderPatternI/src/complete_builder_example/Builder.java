/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complete_builder_example;

import java.awt.Color;
import java.awt.Dimension;

public interface Builder {

    Builder setCeilingHeight(int ceilingHeight);

    Builder setDimensions(Dimension dimensions);

    Builder setFloorNumber(int floorNumber);

    Builder setNumberOfDoors(int numberOfDoors);

    Builder setNumberOfWindows(int numberOfWindows);
    
    Builder setWallColor(Color wallColor);
    
}
