package edu.szebo.ppke.survival;

import edu.szebo.ppke.survival.brain.Brain;
import edu.szebo.ppke.survival.proto.Communication;

public class SimpleMind1 implements Brain {

    @Override
    public Communication.Answer decideBasedOn(Communication.Message message) {
        return Communication.Answer.newBuilder()
                .setId(message.getId())
                .setWay(1) // Always that way
                .build();
    }
}
