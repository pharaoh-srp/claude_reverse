package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
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
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements w28 {
    public static final j a;
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.LocalToolApproval", jVar, 6);
        pluginGeneratedSerialDescriptor.j("toolName", false);
        pluginGeneratedSerialDescriptor.j("toolInput", false);
        pluginGeneratedSerialDescriptor.j("toolPreviewInfo", false);
        pluginGeneratedSerialDescriptor.j("toolUseId", false);
        pluginGeneratedSerialDescriptor.j("messageId", false);
        pluginGeneratedSerialDescriptor.j("fromVoice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), elb.a, c1i.a, d4c.S(ehb.a), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String str = null;
        MobileAppToolPreviewInfo mobileAppToolPreviewInfo = null;
        String strM1163unboximpl = null;
        String strM1057unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) ud4VarC.l(serialDescriptor, 2, elb.a, mobileAppToolPreviewInfo);
                    i |= 4;
                    break;
                case 3:
                    ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 3, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                    strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 4, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenModalBottomSheetDestination.LocalToolApproval(i, strV, str, mobileAppToolPreviewInfo, strM1163unboximpl, strM1057unboximpl, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenModalBottomSheetDestination.LocalToolApproval localToolApproval = (ChatScreenModalBottomSheetDestination.LocalToolApproval) obj;
        encoder.getClass();
        localToolApproval.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatScreenModalBottomSheetDestination.LocalToolApproval.write$Self$chat(localToolApproval, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
