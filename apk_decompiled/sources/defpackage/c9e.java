package defpackage;

import com.anthropic.claude.api.chat.RecordToolApprovalRequest;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.types.strings.McpToolApprovalKey;
import com.anthropic.claude.types.strings.ToolUseId;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c9e implements w28 {
    public static final c9e a;
    private static final SerialDescriptor descriptor;

    static {
        c9e c9eVar = new c9e();
        a = c9eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.RecordToolApprovalRequest", c9eVar, 5);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.j("is_approved", false);
        pluginGeneratedSerialDescriptor.j("approval_key", true);
        pluginGeneratedSerialDescriptor.j("approval_option", true);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = RecordToolApprovalRequest.$childSerializers;
        return new KSerializer[]{c1i.a, zt1.a, d4c.S(h4b.a), d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S((KSerializer) kw9VarArr[4].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = RecordToolApprovalRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strM1163unboximpl = null;
        String strM1042unboximpl = null;
        McpToolApprovalOption mcpToolApprovalOption = null;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 0, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                McpToolApprovalKey mcpToolApprovalKey = (McpToolApprovalKey) ud4VarC.m(serialDescriptor, 2, h4b.a, strM1042unboximpl != null ? McpToolApprovalKey.m1036boximpl(strM1042unboximpl) : null);
                strM1042unboximpl = mcpToolApprovalKey != null ? mcpToolApprovalKey.m1042unboximpl() : null;
                i |= 4;
            } else if (iX == 3) {
                mcpToolApprovalOption = (McpToolApprovalOption) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), mcpToolApprovalOption);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), map);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RecordToolApprovalRequest(i, strM1163unboximpl, zU, strM1042unboximpl, mcpToolApprovalOption, map, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RecordToolApprovalRequest recordToolApprovalRequest = (RecordToolApprovalRequest) obj;
        encoder.getClass();
        recordToolApprovalRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RecordToolApprovalRequest.write$Self$api(recordToolApprovalRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
