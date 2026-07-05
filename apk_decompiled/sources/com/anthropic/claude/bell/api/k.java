package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiClientMessage;
import defpackage.d4c;
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
public final /* synthetic */ class k implements w28 {
    public static final k a;
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("pause_endpointing", kVar, 1);
        pluginGeneratedSerialDescriptor.j("data", true);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(m.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        BellApiClientMessage.PauseEndpointing.Data data = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                data = (BellApiClientMessage.PauseEndpointing.Data) ud4VarC.m(serialDescriptor, 0, m.a, data);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiClientMessage.PauseEndpointing(i, data, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiClientMessage.PauseEndpointing pauseEndpointing = (BellApiClientMessage.PauseEndpointing) obj;
        encoder.getClass();
        pauseEndpointing.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiClientMessage.PauseEndpointing.write$Self$bell(pauseEndpointing, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
