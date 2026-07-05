package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.c1i;
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
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination.ViewAnalysis", bVar, 1);
        pluginGeneratedSerialDescriptor.j("toolUseId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c1i.a};
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
        String strM1163unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 0, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenArtifactSheetDestination.ViewAnalysis(i, strM1163unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenArtifactSheetDestination.ViewAnalysis viewAnalysis = (ChatScreenArtifactSheetDestination.ViewAnalysis) obj;
        encoder.getClass();
        viewAnalysis.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, c1i.a, ToolUseId.m1157boximpl(viewAnalysis.toolUseId));
        vd4VarC.b(serialDescriptor);
    }
}
