package defpackage;

import com.anthropic.claude.mcpapps.transport.McpExtensions;
import com.anthropic.claude.mcpapps.transport.McpUiExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k2b implements w28 {
    public static final k2b a;
    private static final SerialDescriptor descriptor;

    static {
        k2b k2bVar = new k2b();
        a = k2bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.McpExtensions", k2bVar, 1);
        pluginGeneratedSerialDescriptor.j("io.modelcontextprotocol/ui", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(d5b.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        McpUiExtension mcpUiExtension = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                mcpUiExtension = (McpUiExtension) ud4VarC.m(serialDescriptor, 0, d5b.a, mcpUiExtension);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpExtensions(i, mcpUiExtension, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpExtensions mcpExtensions = (McpExtensions) obj;
        encoder.getClass();
        mcpExtensions.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpExtensions.write$Self$Claude_mcpapp(mcpExtensions, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
