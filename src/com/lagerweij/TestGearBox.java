package com.lagerweij;

import org.junit.Assert;
import org.junit.Test;

public class TestGearBox {

    @Test
    public void testNormalRPM(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;
        gearBox.shiftGear(1000);
        Assert.assertEquals(3,gearBox.gear);
    }
    @Test
    public void testShiftDown(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;
        gearBox.shiftGear(2500);
        Assert.assertEquals(4,gearBox.gear);

    }

    @Test
    public void testShiftUp(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 3;
        gearBox.shiftGear(400);
        Assert.assertEquals(2,gearBox.gear);

    }


}