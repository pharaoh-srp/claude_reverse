package com.anthropic.claude.bell;

import com.anthropic.claude.bell.BellOverlayDestination;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.c1i;
import defpackage.d4c;
import defpackage.ehb;
import defpackage.elb;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements w28 {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.BellOverlayDestination.ToolApproval", fVar, 5);
        pluginGeneratedSerialDescriptor.j("toolName", false);
        pluginGeneratedSerialDescriptor.j("toolInput", false);
        pluginGeneratedSerialDescriptor.j("toolPreviewInfo", false);
        pluginGeneratedSerialDescriptor.j("toolUseId", false);
        pluginGeneratedSerialDescriptor.j("messageId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), elb.a, c1i.a, d4c.S(ehb.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        MobileAppToolPreviewInfo mobileAppToolPreviewInfo = null;
        String strM1163unboximpl = null;
        String strM1057unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) ud4VarC.l(serialDescriptor, 2, elb.a, mobileAppToolPreviewInfo);
                i |= 4;
            } else if (iX == 3) {
                ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 3, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 4, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellOverlayDestination.ToolApproval(i, strV, str, mobileAppToolPreviewInfo, strM1163unboximpl, strM1057unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellOverlayDestination.ToolApproval toolApproval = (BellOverlayDestination.ToolApproval) obj;
        encoder.getClass();
        toolApproval.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellOverlayDestination.ToolApproval.write$Self$bell(toolApproval, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
