package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DeviceDataTest {
    @Parameters({"kind", "product"})
    @Test
    public void testDeviceDataXML(String kind, String product) {
        System.out.println("testDeviceDataXML");
        System.out.println("Product name is: " + product + "\nKind name is: " + kind);
    }

    @Test(dataProvider = "DeviceDataProvider")
    public void testDeviceDataProvider(String kind, String product) {
        System.out.println("testDeviceDataProvider");
        System.out.println("Product name is: " + product + "\nKind name is: " + kind);
    }

    @DataProvider(name = "DeviceDataProvider")
    public Object[][] getDeviceData() {
        return new Object[][]{
                {"spotlight_v2", "spotlight cam"},
                {"floodlight_v2", "floodlight cam"},
                {"stickup_cam_v4", "spotlight cam battery"},
        };
    }
}
