package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiClientMessage;
import defpackage.d4c;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.uo7;
import defpackage.vd4;
import defpackage.w28;
import defpackage.y4j;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements w28 {
    public static final u a;
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.api.BellApiClientMessage.VoiceSelect.Data", uVar, 3);
        pluginGeneratedSerialDescriptor.j("voice", true);
        pluginGeneratedSerialDescriptor.j("speed", true);
        pluginGeneratedSerialDescriptor.j("language", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(y4j.a), d4c.S(uo7.a), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM579unboximpl = null;
        Float f = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                VoiceSelection voiceSelection = (VoiceSelection) ud4VarC.m(serialDescriptor, 0, y4j.a, strM579unboximpl != null ? VoiceSelection.m573boximpl(strM579unboximpl) : null);
                strM579unboximpl = voiceSelection != null ? voiceSelection.m579unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                f = (Float) ud4VarC.m(serialDescriptor, 1, uo7.a, f);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiClientMessage.VoiceSelect.Data(i, strM579unboximpl, f, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiClientMessage.VoiceSelect.Data data = (BellApiClientMessage.VoiceSelect.Data) obj;
        encoder.getClass();
        data.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiClientMessage.VoiceSelect.Data.write$Self$bell(data, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
