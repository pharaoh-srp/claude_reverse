package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.SdkStreamEvent;
import defpackage.d4c;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y0 implements w28 {
    public static final y0 a;
    private static final SerialDescriptor descriptor;

    static {
        y0 y0Var = new y0();
        a = y0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkStreamEvent", y0Var, 5);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("parent_tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("event", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(f1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        SdkStreamEvent.Payload payload = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else if (iX == 3) {
                str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                payload = (SdkStreamEvent.Payload) ud4VarC.m(serialDescriptor, 4, f1.a, payload);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkStreamEvent(i, strV, str, str2, str3, payload, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkStreamEvent sdkStreamEvent = (SdkStreamEvent) obj;
        encoder.getClass();
        sdkStreamEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkStreamEvent.write$Self$sessions(sdkStreamEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
