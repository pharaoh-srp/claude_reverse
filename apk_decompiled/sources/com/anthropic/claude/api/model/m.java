package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.emh;
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

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements w28 {
    public static final m a;
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mode", mVar, 1);
        pluginGeneratedSerialDescriptor.j("mode", false);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{emh.a};
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
        String strM1149unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                ThinkingMode thinkingMode = (ThinkingMode) ud4VarC.l(serialDescriptor, 0, emh.a, strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
                strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ThinkingState.Mode(i, strM1149unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ThinkingState.Mode mode = (ThinkingState.Mode) obj;
        encoder.getClass();
        mode.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, emh.a, ThinkingMode.m1142boximpl(mode.mode));
        vd4VarC.b(serialDescriptor);
    }
}
