package com.watschman.betterenhancement.proxy;

import com.watschman.betterenhancement.reference.Reference;

public class ServerProxy extends CommonProxy{
    @Override
    public void isSinglePlayer() {
        Reference.isSinglePlayer = false;
    }
}
