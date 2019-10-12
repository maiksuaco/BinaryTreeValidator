package com.binarytree.validator;

import java.util.Arrays;
import java.util.NoSuchElementException;

public enum Portal {
    PERSONAS("personas"), ASOCIADOS("asociados"), EMPRESAS("empresas"), TMUNDO("tmundo");

    private String portalName;

    Portal(String portalName) {
        this.portalName = portalName;
    }

    public static Portal fromPortalName(String portal) {

        try {
            return Arrays.stream(values())
                    .filter(p -> p.portalName.equals(portal))
                    .findFirst().get();
        } catch (NoSuchElementException e) {
            throw e;
        }
    }
}

