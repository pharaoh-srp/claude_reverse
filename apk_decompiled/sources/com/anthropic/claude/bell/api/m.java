package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiClientMessage;
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
public final /* synthetic */ class m implements w28 {
    public static final m a;
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.api.BellApiClientMessage.PauseEndpointing.Data", mVar, 1);
        pluginGeneratedSerialDescriptor.j("timeout_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        long j = 0;
        boolean z = true;
        int i = 0;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new BellApiClientMessage.PauseEndpointing.Data(i, j, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 0);
                i = 1;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiClientMessage.PauseEndpointing.Data data = (BellApiClientMessage.PauseEndpointing.Data) obj;
        encoder.getClass();
        data.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiClientMessage.PauseEndpointing.Data.write$Self$bell(data, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
