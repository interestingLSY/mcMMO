package com.gmail.nossr50.config.skills.smelting;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import java.util.HashMap;

@ConfigSerializable
public class ConfigSmeltingSubSkills {

    @Setting(value = "Second-Smelt")
    private ConfigSmeltingSecondSmelt smeltingSecondSmelt = new ConfigSmeltingSecondSmelt();

    public ConfigSmeltingSecondSmelt getSmeltingSecondSmelt() {
        return smeltingSecondSmelt;
    }

    public double getMaxChance() {
        return smeltingSecondSmelt.getMaxChance();
    }

    public HashMap<Integer, Integer> getXpMultiplierTable() {
        return smeltingSecondSmelt.getXpMultiplierTable();
    }
}
