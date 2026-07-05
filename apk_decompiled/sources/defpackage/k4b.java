package defpackage;

import com.anthropic.claude.api.mcp.McpToolMeta;
import com.anthropic.claude.mcpapps.transport.McpToolDefinition;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k4b implements w28 {
    public static final k4b a;
    private static final SerialDescriptor descriptor;

    static {
        k4b k4bVar = new k4b();
        a = k4bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.McpToolDefinition", k4bVar, 2);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("_meta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(q4b.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        McpToolMeta mcpToolMeta = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                mcpToolMeta = (McpToolMeta) ud4VarC.m(serialDescriptor, 1, q4b.a, mcpToolMeta);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpToolDefinition(i, strV, mcpToolMeta, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpToolDefinition mcpToolDefinition = (McpToolDefinition) obj;
        encoder.getClass();
        mcpToolDefinition.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpToolDefinition.write$Self$Claude_mcpapp(mcpToolDefinition, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
