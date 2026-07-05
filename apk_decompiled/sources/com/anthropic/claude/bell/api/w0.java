package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiServerMessage;
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

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w0 implements w28 {
    public static final w0 a;
    private static final SerialDescriptor descriptor;

    static {
        w0 w0Var = new w0();
        a = w0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("tts_word", w0Var, 2);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("pts_ms", true);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiServerMessage.TTSWord(i, strV, num, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiServerMessage.TTSWord tTSWord = (BellApiServerMessage.TTSWord) obj;
        encoder.getClass();
        tTSWord.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiServerMessage.TTSWord.write$Self$bell(tTSWord, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
