package defpackage;

import com.anthropic.claude.api.mcp.AttachMcpResourceRequest;
import com.anthropic.claude.api.mcp.McpResourceReference;
import com.anthropic.claude.types.strings.McpServerId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y11 implements w28 {
    public static final y11 a;
    private static final SerialDescriptor descriptor;

    static {
        y11 y11Var = new y11();
        a = y11Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.AttachMcpResourceRequest", y11Var, 2);
        pluginGeneratedSerialDescriptor.j("server_uuid", false);
        pluginGeneratedSerialDescriptor.j("resource", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p3b.a, i3b.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1035unboximpl = null;
        McpResourceReference mcpResourceReference = null;
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
                mcpResourceReference = (McpResourceReference) ud4VarC.l(serialDescriptor, 1, i3b.a, mcpResourceReference);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AttachMcpResourceRequest(i, strM1035unboximpl, mcpResourceReference, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AttachMcpResourceRequest attachMcpResourceRequest = (AttachMcpResourceRequest) obj;
        encoder.getClass();
        attachMcpResourceRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AttachMcpResourceRequest.write$Self$api(attachMcpResourceRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
