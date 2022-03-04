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

    @Test
    public void testNShiftUpInGear6(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 6;
        gearBox.shiftGear(3000);
        Assert.assertEquals(6,gearBox.gear);

    }

    @Test
    public void testNoShiftDownInGear1(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 1;
        gearBox.shiftGear(300);
        Assert.assertEquals(1,gearBox.gear);

    }


    @Test
    public void testNoShiftinNeutral(){
        GearBox gearBox = new GearBox();
        gearBox.gear = 0;
        gearBox.shiftGear(400);
        Assert.assertEquals(0,gearBox.gear);
        gearBox.shiftGear(3000);
        Assert.assertEquals(0,gearBox.gear);

    }

    @Test
    public void testNoShiftinReverse(){
        GearBox gearBox = new GearBox();
        gearBox.gear = -1;
        gearBox.shiftGear(400);
        Assert.assertEquals(-1,gearBox.gear);
        gearBox.shiftGear(3000);
        Assert.assertEquals(-1,gearBox.gear);

    }
}
