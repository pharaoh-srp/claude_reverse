package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.RefusalStopDetails;
import com.anthropic.claude.api.chat.messages.MessageDelta;
import defpackage.d4c;
import defpackage.ede;
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
public final /* synthetic */ class e implements w28 {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.messages.MessageDelta.Wire", eVar, 3);
        pluginGeneratedSerialDescriptor.j("stop_reason", true);
        pluginGeneratedSerialDescriptor.j("stop_sequence", true);
        pluginGeneratedSerialDescriptor.j("stop_details", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(ede.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        RefusalStopDetails refusalStopDetails = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                refusalStopDetails = (RefusalStopDetails) ud4VarC.m(serialDescriptor, 2, ede.a, refusalStopDetails);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageDelta.Wire(i, str, str2, refusalStopDetails, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageDelta.Wire wire = (MessageDelta.Wire) obj;
        encoder.getClass();
        wire.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageDelta.Wire.write$Self$api(wire, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
