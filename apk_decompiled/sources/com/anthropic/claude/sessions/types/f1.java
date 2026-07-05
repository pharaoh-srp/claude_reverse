package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.SdkStreamEvent;
import defpackage.d4c;
import defpackage.e79;
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
public final /* synthetic */ class f1 implements w28 {
    public static final f1 a;
    private static final SerialDescriptor descriptor;

    static {
        f1 f1Var = new f1();
        a = f1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkStreamEvent.Payload", f1Var, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("index", true);
        pluginGeneratedSerialDescriptor.j("delta", true);
        pluginGeneratedSerialDescriptor.j("content_block", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), d4c.S(e79.a), d4c.S(b1.a), d4c.S(z0.a), d4c.S(d1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        SdkStreamEvent.Delta delta = null;
        SdkStreamEvent.ContentBlock contentBlock = null;
        SdkStreamEvent.MessageStart messageStart = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else if (iX == 2) {
                delta = (SdkStreamEvent.Delta) ud4VarC.m(serialDescriptor, 2, b1.a, delta);
                i |= 4;
            } else if (iX == 3) {
                contentBlock = (SdkStreamEvent.ContentBlock) ud4VarC.m(serialDescriptor, 3, z0.a, contentBlock);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                messageStart = (SdkStreamEvent.MessageStart) ud4VarC.m(serialDescriptor, 4, d1.a, messageStart);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkStreamEvent.Payload(i, str, num, delta, contentBlock, messageStart, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkStreamEvent.Payload payload = (SdkStreamEvent.Payload) obj;
        encoder.getClass();
        payload.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkStreamEvent.Payload.write$Self$sessions(payload, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
