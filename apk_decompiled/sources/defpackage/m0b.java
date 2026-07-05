package defpackage;

import com.anthropic.claude.mcpapps.transport.McpClientCapabilities;
import com.anthropic.claude.mcpapps.transport.McpExtensions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0b implements w28 {
    public static final m0b a;
    private static final SerialDescriptor descriptor;

    static {
        m0b m0bVar = new m0b();
        a = m0bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.McpClientCapabilities", m0bVar, 1);
        pluginGeneratedSerialDescriptor.j("extensions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(k2b.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        McpExtensions mcpExtensions = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                mcpExtensions = (McpExtensions) ud4VarC.m(serialDescriptor, 0, k2b.a, mcpExtensions);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpClientCapabilities(i, mcpExtensions, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpClientCapabilities mcpClientCapabilities = (McpClientCapabilities) obj;
        encoder.getClass();
        mcpClientCapabilities.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpClientCapabilities.write$Self$Claude_mcpapp(mcpClientCapabilities, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
