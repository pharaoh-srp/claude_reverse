package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiClientMessage;
import defpackage.d4c;
import defpackage.e79;
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
public final /* synthetic */ class g implements w28 {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.api.BellApiClientMessage.ClientMetrics.Data", gVar, 2);
        pluginGeneratedSerialDescriptor.j("client_perceived_latency_ms", true);
        pluginGeneratedSerialDescriptor.j("buffer_underrun_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(xka.a), d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                l = (Long) ud4VarC.m(serialDescriptor, 0, xka.a, l);
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
        return new BellApiClientMessage.ClientMetrics.Data(i, l, num, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiClientMessage.ClientMetrics.Data data = (BellApiClientMessage.ClientMetrics.Data) obj;
        encoder.getClass();
        data.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiClientMessage.ClientMetrics.Data.write$Self$bell(data, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
