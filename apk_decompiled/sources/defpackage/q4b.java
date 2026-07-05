package defpackage;

import com.anthropic.claude.api.mcp.McpToolMeta;
import com.anthropic.claude.api.mcp.McpToolUiMeta;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q4b implements w28 {
    public static final q4b a;
    private static final SerialDescriptor descriptor;

    static {
        q4b q4bVar = new q4b();
        a = q4bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.McpToolMeta", q4bVar, 2);
        pluginGeneratedSerialDescriptor.j("ui", true);
        pluginGeneratedSerialDescriptor.j("ui/resourceUri", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(v4b.a), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        McpToolUiMeta mcpToolUiMeta = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                mcpToolUiMeta = (McpToolUiMeta) ud4VarC.m(serialDescriptor, 0, v4b.a, mcpToolUiMeta);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpToolMeta(i, mcpToolUiMeta, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpToolMeta mcpToolMeta = (McpToolMeta) obj;
        encoder.getClass();
        mcpToolMeta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpToolMeta.write$Self$api(mcpToolMeta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
