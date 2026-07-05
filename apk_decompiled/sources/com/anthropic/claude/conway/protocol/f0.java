package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.RichMessage;
import defpackage.e79;
import defpackage.kw9;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.xka;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements w28 {
    public static final f0 a;
    private static final SerialDescriptor descriptor;

    static {
        f0 f0Var = new f0();
        a = f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.RichMessage.Assistant", f0Var, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("tokenCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, xka.a, RichMessage.Assistant.$childSerializers[2].getValue(), e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = RichMessage.Assistant.$childSerializers;
        int i = 0;
        int iR = 0;
        String strV = null;
        List list = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RichMessage.Assistant(i, strV, j, list, iR, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RichMessage.Assistant assistant = (RichMessage.Assistant) obj;
        encoder.getClass();
        assistant.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RichMessage.Assistant.write$Self$conway(assistant, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
