package com.moss.javaassist;

import java.lang.instrument.Instrumentation;

public class MyAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        // Transformer registration 
        inst.addTransformer(new JavassistSimpleTransformer());
    }

}
