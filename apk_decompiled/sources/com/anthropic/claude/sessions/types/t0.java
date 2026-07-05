package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.SdkEnvManagerLogEvent;
import defpackage.d4c;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements w28 {
    public static final t0 a;
    private static final SerialDescriptor descriptor;

    static {
        t0 t0Var = new t0();
        a = t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkEnvManagerLogEvent.EnvManagerLogData", t0Var, 5);
        pluginGeneratedSerialDescriptor.j("level", false);
        pluginGeneratedSerialDescriptor.j("category", true);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("timestamp", true);
        pluginGeneratedSerialDescriptor.j("extra", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(uh9.a)};
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
        String strV2 = null;
        String str2 = null;
        JsonObject jsonObject = null;
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
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 4, uh9.a, jsonObject);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkEnvManagerLogEvent.EnvManagerLogData(i, strV, str, strV2, str2, jsonObject, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkEnvManagerLogEvent.EnvManagerLogData envManagerLogData = (SdkEnvManagerLogEvent.EnvManagerLogData) obj;
        encoder.getClass();
        envManagerLogData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkEnvManagerLogEvent.EnvManagerLogData.write$Self$sessions(envManagerLogData, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
