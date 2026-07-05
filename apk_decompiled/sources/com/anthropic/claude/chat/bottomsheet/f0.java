package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.types.strings.McpToolApprovalKey;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.c1i;
import defpackage.d4c;
import defpackage.h4b;
import defpackage.kw9;
import defpackage.s06;
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
public final /* synthetic */ class f0 implements w28 {
    public static final f0 a;
    private static final SerialDescriptor descriptor;

    static {
        f0 f0Var = new f0();
        a = f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.ToolApproval", f0Var, 8);
        pluginGeneratedSerialDescriptor.j("toolName", false);
        pluginGeneratedSerialDescriptor.j("displayContent", false);
        pluginGeneratedSerialDescriptor.j("integrationIconUrl", false);
        pluginGeneratedSerialDescriptor.j("integrationName", false);
        pluginGeneratedSerialDescriptor.j("iconName", true);
        pluginGeneratedSerialDescriptor.j("toolUseId", false);
        pluginGeneratedSerialDescriptor.j("approvalKey", false);
        pluginGeneratedSerialDescriptor.j("hasAllowAlways", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatScreenModalBottomSheetDestination.ToolApproval.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S((KSerializer) kw9VarArr[1].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), c1i.a, d4c.S(h4b.a), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatScreenModalBottomSheetDestination.ToolApproval.$childSerializers;
        McpToolApprovalKey mcpToolApprovalKey = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        ToolDisplayContent toolDisplayContent = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String strM1163unboximpl = null;
        String strM1042unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    toolDisplayContent = (ToolDisplayContent) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), toolDisplayContent);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 5, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                    strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    McpToolApprovalKey mcpToolApprovalKey2 = (McpToolApprovalKey) ud4VarC.m(serialDescriptor, 6, h4b.a, strM1042unboximpl != null ? McpToolApprovalKey.m1036boximpl(strM1042unboximpl) : mcpToolApprovalKey);
                    strM1042unboximpl = mcpToolApprovalKey2 != null ? mcpToolApprovalKey2.m1042unboximpl() : null;
                    i |= 64;
                    break;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                default:
                    sz6.e(iX);
                    return mcpToolApprovalKey;
            }
            mcpToolApprovalKey = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenModalBottomSheetDestination.ToolApproval(i, strV, toolDisplayContent, str, str2, str3, strM1163unboximpl, strM1042unboximpl, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenModalBottomSheetDestination.ToolApproval toolApproval = (ChatScreenModalBottomSheetDestination.ToolApproval) obj;
        encoder.getClass();
        toolApproval.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatScreenModalBottomSheetDestination.ToolApproval.write$Self$chat(toolApproval, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
