package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.StreamMessage;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.xka;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k1 implements w28 {
    public static final k1 a;
    private static final SerialDescriptor descriptor;

    static {
        k1 k1Var = new k1();
        a = k1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.StreamMessage.HealthProbe", k1Var, 3);
        pluginGeneratedSerialDescriptor.j("seq", true);
        pluginGeneratedSerialDescriptor.j("ts", true);
        pluginGeneratedSerialDescriptor.j("probe_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{xkaVar, xkaVar, srg.a};
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StreamMessage.HealthProbe(i, j, j2, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StreamMessage.HealthProbe healthProbe = (StreamMessage.HealthProbe) obj;
        encoder.getClass();
        healthProbe.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StreamMessage.HealthProbe.write$Self$conway(healthProbe, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
