package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.SdkControlResponseEvent;
import defpackage.d4c;
import defpackage.eh9;
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
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q0 implements w28 {
    public static final q0 a;
    private static final SerialDescriptor descriptor;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkControlResponseEvent.Response", q0Var, 4);
        pluginGeneratedSerialDescriptor.j("request_id", true);
        pluginGeneratedSerialDescriptor.j("subtype", false);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("response", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(eh9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String strV = null;
        String str2 = null;
        JsonElement jsonElement = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                jsonElement = (JsonElement) ud4VarC.m(serialDescriptor, 3, eh9.a, jsonElement);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkControlResponseEvent.Response(i, str, strV, str2, jsonElement, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkControlResponseEvent.Response response = (SdkControlResponseEvent.Response) obj;
        encoder.getClass();
        response.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkControlResponseEvent.Response.write$Self$sessions(response, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
