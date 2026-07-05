package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.StreamMessage;
import com.anthropic.claude.types.strings.ForkId;
import defpackage.aw7;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.xka;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e1 implements w28 {
    public static final e1 a;
    private static final SerialDescriptor descriptor;

    static {
        e1 e1Var = new e1();
        a = e1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.StreamMessage.ForkJoined", e1Var, 4);
        pluginGeneratedSerialDescriptor.j("seq", true);
        pluginGeneratedSerialDescriptor.j("ts", true);
        pluginGeneratedSerialDescriptor.j("agentId", false);
        pluginGeneratedSerialDescriptor.j("summary", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{xkaVar, xkaVar, aw7.a, srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        long j = 0;
        long j2 = 0;
        String strM1028unboximpl = null;
        String strV = null;
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
                ForkId forkId = (ForkId) ud4VarC.l(serialDescriptor, 2, aw7.a, strM1028unboximpl != null ? ForkId.m1021boximpl(strM1028unboximpl) : null);
                strM1028unboximpl = forkId != null ? forkId.m1028unboximpl() : null;
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StreamMessage.ForkJoined(i, j, j2, strM1028unboximpl, strV, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StreamMessage.ForkJoined forkJoined = (StreamMessage.ForkJoined) obj;
        encoder.getClass();
        forkJoined.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StreamMessage.ForkJoined.write$Self$conway(forkJoined, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
