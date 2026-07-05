package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import defpackage.ntc;
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
public final /* synthetic */ class g1 implements w28 {
    public static final g1 a;
    private static final SerialDescriptor descriptor;

    static {
        g1 g1Var = new g1();
        a = g1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination.ToolContent", g1Var, 1);
        pluginGeneratedSerialDescriptor.j("blockId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ntc.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ParsedContentBlockId parsedContentBlockId = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                parsedContentBlockId = (ParsedContentBlockId) ud4VarC.l(serialDescriptor, 0, ntc.a, parsedContentBlockId);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CollapsedToolsSheetDestination.ToolContent(i, parsedContentBlockId, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CollapsedToolsSheetDestination.ToolContent toolContent = (CollapsedToolsSheetDestination.ToolContent) obj;
        encoder.getClass();
        toolContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, ntc.a, toolContent.blockId);
        vd4VarC.b(serialDescriptor);
    }
}
