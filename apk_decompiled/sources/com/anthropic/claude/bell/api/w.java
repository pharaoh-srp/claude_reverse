package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiData;
import defpackage.q12;
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
public final /* synthetic */ class w implements w28 {
    public static final w a;
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.api.BellApiData.AudioData", wVar, 1);
        pluginGeneratedSerialDescriptor.j("bytes", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q12.c};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        byte[] bArr = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                bArr = (byte[]) ud4VarC.l(serialDescriptor, 0, q12.c, bArr);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiData.AudioData(i, bArr, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiData.AudioData audioData = (BellApiData.AudioData) obj;
        encoder.getClass();
        audioData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, q12.c, audioData.bytes);
        vd4VarC.b(serialDescriptor);
    }
}
