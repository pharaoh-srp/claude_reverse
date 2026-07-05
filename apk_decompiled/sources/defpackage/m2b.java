package defpackage;

import com.anthropic.claude.mcpapps.transport.HostInfo;
import com.anthropic.claude.mcpapps.transport.McpClientCapabilities;
import com.anthropic.claude.mcpapps.transport.McpInitializeParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m2b implements w28 {
    public static final m2b a;
    private static final SerialDescriptor descriptor;

    static {
        m2b m2bVar = new m2b();
        a = m2bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.McpInitializeParams", m2bVar, 3);
        pluginGeneratedSerialDescriptor.j("protocolVersion", false);
        pluginGeneratedSerialDescriptor.j("capabilities", false);
        pluginGeneratedSerialDescriptor.j("clientInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, m0b.a, dp8.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        McpClientCapabilities mcpClientCapabilities = null;
        HostInfo hostInfo = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                mcpClientCapabilities = (McpClientCapabilities) ud4VarC.l(serialDescriptor, 1, m0b.a, mcpClientCapabilities);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                hostInfo = (HostInfo) ud4VarC.l(serialDescriptor, 2, dp8.a, hostInfo);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpInitializeParams(i, strV, mcpClientCapabilities, hostInfo, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpInitializeParams mcpInitializeParams = (McpInitializeParams) obj;
        encoder.getClass();
        mcpInitializeParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpInitializeParams.write$Self$Claude_mcpapp(mcpInitializeParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
