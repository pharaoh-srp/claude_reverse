package defpackage;

import com.anthropic.claude.api.mcp.AttachMcpPromptRequest;
import com.anthropic.claude.api.mcp.McpPromptReference;
import com.anthropic.claude.types.strings.McpServerId;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u11 implements w28 {
    public static final u11 a;
    private static final SerialDescriptor descriptor;

    static {
        u11 u11Var = new u11();
        a = u11Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.AttachMcpPromptRequest", u11Var, 3);
        pluginGeneratedSerialDescriptor.j("server_uuid", false);
        pluginGeneratedSerialDescriptor.j("prompt", false);
        pluginGeneratedSerialDescriptor.j("arguments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p3b.a, z2b.a, AttachMcpPromptRequest.$childSerializers[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AttachMcpPromptRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM1035unboximpl = null;
        McpPromptReference mcpPromptReference = null;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                McpServerId mcpServerId = (McpServerId) ud4VarC.l(serialDescriptor, 0, p3b.a, strM1035unboximpl != null ? McpServerId.m1029boximpl(strM1035unboximpl) : null);
                strM1035unboximpl = mcpServerId != null ? mcpServerId.m1035unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                mcpPromptReference = (McpPromptReference) ud4VarC.l(serialDescriptor, 1, z2b.a, mcpPromptReference);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), map);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AttachMcpPromptRequest(i, strM1035unboximpl, mcpPromptReference, map, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AttachMcpPromptRequest attachMcpPromptRequest = (AttachMcpPromptRequest) obj;
        encoder.getClass();
        attachMcpPromptRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AttachMcpPromptRequest.write$Self$api(attachMcpPromptRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
