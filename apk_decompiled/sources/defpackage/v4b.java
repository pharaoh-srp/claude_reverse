package defpackage;

import com.anthropic.claude.api.mcp.McpToolUiMeta;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v4b implements w28 {
    public static final v4b a;
    private static final SerialDescriptor descriptor;

    static {
        v4b v4bVar = new v4b();
        a = v4bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.McpToolUiMeta", v4bVar, 2);
        pluginGeneratedSerialDescriptor.j("resourceUri", true);
        pluginGeneratedSerialDescriptor.j("visibility", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), d4c.S((KSerializer) McpToolUiMeta.$childSerializers[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = McpToolUiMeta.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpToolUiMeta(i, str, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpToolUiMeta mcpToolUiMeta = (McpToolUiMeta) obj;
        encoder.getClass();
        mcpToolUiMeta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpToolUiMeta.write$Self$api(mcpToolUiMeta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
