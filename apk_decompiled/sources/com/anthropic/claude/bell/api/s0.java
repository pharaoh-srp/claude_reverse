package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiServerMessage;
import defpackage.d4c;
import defpackage.e79;
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
public final /* synthetic */ class s0 implements w28 {
    public static final s0 a;
    private static final SerialDescriptor descriptor;

    static {
        s0 s0Var = new s0();
        a = s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("playback_start", s0Var, 1);
        pluginGeneratedSerialDescriptor.j("server_vad_to_tts_start_ms", true);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiServerMessage.PlaybackStart(i, num, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiServerMessage.PlaybackStart playbackStart = (BellApiServerMessage.PlaybackStart) obj;
        encoder.getClass();
        playbackStart.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiServerMessage.PlaybackStart.write$Self$bell(playbackStart, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
