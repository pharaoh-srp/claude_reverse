package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpAuthCompleted;
import com.anthropic.claude.analytics.events.McpEvents$McpAuthFailureType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b1b implements w28 {
    public static final b1b a;
    private static final SerialDescriptor descriptor;

    static {
        b1b b1bVar = new b1b();
        a = b1bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.mcp.auth.completed", b1bVar, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("result", true);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("redacted_url", true);
        pluginGeneratedSerialDescriptor.j("failure_type", true);
        pluginGeneratedSerialDescriptor.k(new pi(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = McpEvents$McpAuthCompleted.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[5].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = McpEvents$McpAuthCompleted.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String strV2 = null;
        String str2 = null;
        String str3 = null;
        McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    mcpEvents$McpAuthFailureType = (McpEvents$McpAuthFailureType) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), mcpEvents$McpAuthFailureType);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpEvents$McpAuthCompleted(i, strV, str, strV2, str2, str3, mcpEvents$McpAuthFailureType, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpEvents$McpAuthCompleted mcpEvents$McpAuthCompleted = (McpEvents$McpAuthCompleted) obj;
        encoder.getClass();
        mcpEvents$McpAuthCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpEvents$McpAuthCompleted.write$Self$analytics(mcpEvents$McpAuthCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
