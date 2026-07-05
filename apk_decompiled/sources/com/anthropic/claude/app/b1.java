package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.bc9;
import defpackage.d4c;
import defpackage.emd;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements w28 {
    public static final b1 a;
    private static final SerialDescriptor descriptor;

    static {
        b1 b1Var = new b1();
        a = b1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppOverlay.MemoryPreview", b1Var, 3);
        pluginGeneratedSerialDescriptor.j("memorySynthesis", false);
        pluginGeneratedSerialDescriptor.j("updatedAt", false);
        pluginGeneratedSerialDescriptor.j("projectId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, bc9.a, d4c.S(emd.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        Date date = null;
        String strM1085unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                date = (Date) ud4VarC.l(serialDescriptor, 1, bc9.a, date);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 2, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppOverlay.MemoryPreview(i, strV, date, strM1085unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppOverlay.MemoryPreview memoryPreview = (ClaudeAppOverlay.MemoryPreview) obj;
        encoder.getClass();
        memoryPreview.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAppOverlay.MemoryPreview.write$Self$app(memoryPreview, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
