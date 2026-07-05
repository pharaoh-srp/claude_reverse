package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiData;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.znf;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements w28 {
    public static final z a;
    private static final SerialDescriptor descriptor;

    static {
        z zVar = new z();
        a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.api.BellApiData.MessageData", zVar, 1);
        pluginGeneratedSerialDescriptor.j("message", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BellApiData.MessageData.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = BellApiData.MessageData.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        BellApiServerMessage bellApiServerMessage = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                bellApiServerMessage = (BellApiServerMessage) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), bellApiServerMessage);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiData.MessageData(i, bellApiServerMessage, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiData.MessageData messageData = (BellApiData.MessageData) obj;
        encoder.getClass();
        messageData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) BellApiData.MessageData.$childSerializers[0].getValue(), messageData.message);
        vd4VarC.b(serialDescriptor);
    }
}
