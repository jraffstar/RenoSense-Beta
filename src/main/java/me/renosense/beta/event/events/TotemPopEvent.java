package me.renosense.beta.event.events;

import me.renosense.beta.event.EventStage;
import net.minecraft.entity.player.EntityPlayer;

public class TotemPopEvent
        extends EventStage {
    private EntityPlayer entity;

    public TotemPopEvent(EntityPlayer entity) {
        this.entity = entity;
    }

    public EntityPlayer getEntity() {
        return this.entity;
    }
}