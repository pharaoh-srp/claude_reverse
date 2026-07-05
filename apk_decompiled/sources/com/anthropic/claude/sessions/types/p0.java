package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.SdkControlResponseEvent;
import defpackage.d4c;
import defpackage.pbf;
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
public final /* synthetic */ class p0 implements w28 {
    public static final p0 a;
    private static final SerialDescriptor descriptor;

    static {
        p0 p0Var = new p0();
        a = p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkControlResponseEvent", p0Var, 6);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("response", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("parent_tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(q0.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(pbf.c)};
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
        SdkControlResponseEvent.Response response = null;
        String str2 = null;
        String str3 = null;
        SdkMessage sdkMessage = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    response = (SdkControlResponseEvent.Response) ud4VarC.m(serialDescriptor, 2, q0.a, response);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    sdkMessage = (SdkMessage) ud4VarC.m(serialDescriptor, 5, pbf.c, sdkMessage);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkControlResponseEvent(i, strV, str, response, str2, str3, sdkMessage, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkControlResponseEvent sdkControlResponseEvent = (SdkControlResponseEvent) obj;
        encoder.getClass();
        sdkControlResponseEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkControlResponseEvent.write$Self$sessions(sdkControlResponseEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
