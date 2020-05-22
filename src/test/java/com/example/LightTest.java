package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class LightTest {
    @BeforeGroups(groups = "lightcamera")
    public void setupLightCameras() {
        System.out.println("Setup light cameras");
    }

    @AfterGroups(groups = "lightcamera")
    public void teardownLightCameras() {
        System.out.println("Teardown light cameras");
    }


    @Test(groups = "lightcamera", dependsOnGroups = {"lightgroup"})
    public void testLightCameraOn() {
        System.out.println("Light camera is on");
    }

    @Test(groups = "lightcamera", dependsOnGroups = {"lightgroup"}, dependsOnMethods = {"testLightCameraOn"})
    public void testLightCameraOff() {
        System.out.println("Light camera is off");
    }

    @Test(groups = "beam")
    public void testBeamOn() {
        System.out.println("Beam is on");
    }

    @Test(groups = "beam", dependsOnMethods = {"testBeamOn"})
    public void testBeamOff() {
        System.out.println("Beam is off");
    }

    @Test(groups = "lightgroup")
    public void testLightGroupOn() {
        System.out.println("LightGroup is on");
    }

    @Test(groups = "lightgroup", dependsOnMethods = {"testLightGroupOn"})
    public void testLightGroupOff() {
        System.out.println("LightGroup is off");
    }
}
