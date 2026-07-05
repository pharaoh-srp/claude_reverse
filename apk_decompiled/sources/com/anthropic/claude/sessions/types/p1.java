package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.StdinMessage;
import defpackage.d4c;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sf0;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p1 implements w28 {
    public static final p1 a;
    private static final SerialDescriptor descriptor;

    static {
        p1 p1Var = new p1();
        a = p1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.StdinMessage.SdkUserMessage", p1Var, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.j("parent_tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("file_attachments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = StdinMessage.SdkUserMessage.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, sf0.a, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[4].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = StdinMessage.SdkUserMessage.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ApiUserMessage apiUserMessage = null;
        String str = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                apiUserMessage = (ApiUserMessage) ud4VarC.l(serialDescriptor, 2, sf0.a, apiUserMessage);
                i |= 4;
            } else if (iX == 3) {
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), list);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StdinMessage.SdkUserMessage(i, strV, strV2, apiUserMessage, str, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StdinMessage.SdkUserMessage sdkUserMessage = (StdinMessage.SdkUserMessage) obj;
        encoder.getClass();
        sdkUserMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StdinMessage.SdkUserMessage.write$Self$sessions(sdkUserMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
