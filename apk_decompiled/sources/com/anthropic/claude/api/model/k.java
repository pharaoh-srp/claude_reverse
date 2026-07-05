package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.emh;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.zlh;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements w28 {
    public static final k a;
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("effort_and_mode", kVar, 2);
        pluginGeneratedSerialDescriptor.j("effort", false);
        pluginGeneratedSerialDescriptor.j("mode", false);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zlh.a, emh.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1141unboximpl = null;
        String strM1149unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ThinkingEffort thinkingEffort = (ThinkingEffort) ud4VarC.l(serialDescriptor, 0, zlh.a, strM1141unboximpl != null ? ThinkingEffort.m1135boximpl(strM1141unboximpl) : null);
                strM1141unboximpl = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                ThinkingMode thinkingMode = (ThinkingMode) ud4VarC.l(serialDescriptor, 1, emh.a, strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
                strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ThinkingState.EffortAndMode(i, strM1141unboximpl, strM1149unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ThinkingState.EffortAndMode effortAndMode = (ThinkingState.EffortAndMode) obj;
        encoder.getClass();
        effortAndMode.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ThinkingState.EffortAndMode.write$Self$api(effortAndMode, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
