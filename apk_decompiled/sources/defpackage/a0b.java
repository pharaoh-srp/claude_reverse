package defpackage;

import com.anthropic.claude.api.chat.messages.McpAuthRequiredEvent;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.ToolUseId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0b implements w28 {
    public static final a0b a;
    private static final SerialDescriptor descriptor;

    static {
        a0b a0bVar = new a0b();
        a = a0bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mcp_auth_required", a0bVar, 2);
        pluginGeneratedSerialDescriptor.j("server_id", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p3b.a, c1i.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1035unboximpl = null;
        String strM1163unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                McpServerId mcpServerId = (McpServerId) ud4VarC.l(serialDescriptor, 0, p3b.a, strM1035unboximpl != null ? McpServerId.m1029boximpl(strM1035unboximpl) : null);
                strM1035unboximpl = mcpServerId != null ? mcpServerId.m1035unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 1, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpAuthRequiredEvent(i, strM1035unboximpl, strM1163unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpAuthRequiredEvent mcpAuthRequiredEvent = (McpAuthRequiredEvent) obj;
        encoder.getClass();
        mcpAuthRequiredEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpAuthRequiredEvent.write$Self$api(mcpAuthRequiredEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
