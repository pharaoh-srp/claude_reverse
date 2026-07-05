package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.types.strings.ThinkingEffort;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.zlh;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements w28 {
    public static final h a;
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("effort", hVar, 1);
        pluginGeneratedSerialDescriptor.j("effort", false);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zlh.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM1141unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                ThinkingEffort thinkingEffort = (ThinkingEffort) ud4VarC.l(serialDescriptor, 0, zlh.a, strM1141unboximpl != null ? ThinkingEffort.m1135boximpl(strM1141unboximpl) : null);
                strM1141unboximpl = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ThinkingState.Effort(i, strM1141unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ThinkingState.Effort effort = (ThinkingState.Effort) obj;
        encoder.getClass();
        effort.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, zlh.a, ThinkingEffort.m1135boximpl(effort.effort));
        vd4VarC.b(serialDescriptor);
    }
}
