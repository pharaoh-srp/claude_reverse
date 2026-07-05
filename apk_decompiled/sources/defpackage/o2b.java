package defpackage;

import com.anthropic.claude.mcpapps.transport.McpInitializeResult;
import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o2b implements w28 {
    public static final o2b a;
    private static final SerialDescriptor descriptor;

    static {
        o2b o2bVar = new o2b();
        a = o2bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.McpInitializeResult", o2bVar, 1);
        pluginGeneratedSerialDescriptor.j("capabilities", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(m3b.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        McpServerCapabilities mcpServerCapabilities = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                mcpServerCapabilities = (McpServerCapabilities) ud4VarC.m(serialDescriptor, 0, m3b.a, mcpServerCapabilities);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpInitializeResult(i, mcpServerCapabilities, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpInitializeResult mcpInitializeResult = (McpInitializeResult) obj;
        encoder.getClass();
        mcpInitializeResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpInitializeResult.write$Self$Claude_mcpapp(mcpInitializeResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
