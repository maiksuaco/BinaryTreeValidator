package com.binarytree.validator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.NoSuchElementException;

@RunWith(MockitoJUnitRunner.class)
public class PortalTest {

    @Test
    public void testingFunctionalInterface() {
        Assert.assertEquals(Portal.PERSONAS, Portal.fromPortalName("personas"));
        Assert.assertEquals(Portal.EMPRESAS, Portal.fromPortalName("empresas"));
        Assert.assertEquals(Portal.ASOCIADOS, Portal.fromPortalName("asociados"));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldCheckNotFoundPortal(){
        Portal.fromPortalName("notexist");
    }
}