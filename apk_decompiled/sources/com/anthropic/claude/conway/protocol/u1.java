package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.StreamMessage;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.xka;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u1 implements w28 {
    public static final u1 a;
    private static final SerialDescriptor descriptor;

    static {
        u1 u1Var = new u1();
        a = u1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.StreamMessage.ToolCall", u1Var, 5);
        pluginGeneratedSerialDescriptor.j("seq", true);
        pluginGeneratedSerialDescriptor.j("ts", true);
        pluginGeneratedSerialDescriptor.j("request_id", false);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("input", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        srg srgVar = srg.a;
        return new KSerializer[]{xkaVar, xkaVar, srgVar, srgVar, uh9.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        long j = 0;
        long j2 = 0;
        String strV = null;
        String strV2 = null;
        JsonObject jsonObject = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                j = ud4VarC.j(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j2 = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject = (JsonObject) ud4VarC.l(serialDescriptor, 4, uh9.a, jsonObject);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StreamMessage.ToolCall(i, j, j2, strV, strV2, jsonObject, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StreamMessage.ToolCall toolCall = (StreamMessage.ToolCall) obj;
        encoder.getClass();
        toolCall.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StreamMessage.ToolCall.write$Self$conway(toolCall, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
