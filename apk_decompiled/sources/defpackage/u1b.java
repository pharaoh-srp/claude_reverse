package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpSuggestionActioned;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionAction;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u1b implements w28 {
    public static final u1b a;
    private static final SerialDescriptor descriptor;

    static {
        u1b u1bVar = new u1b();
        a = u1bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.mcp.suggestion.actioned", u1bVar, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("directory_uuid", true);
        pluginGeneratedSerialDescriptor.k(new pi(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = McpEvents$McpSuggestionActioned.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = McpEvents$McpSuggestionActioned.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        McpEvents$SuggestionAction mcpEvents$SuggestionAction = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                mcpEvents$SuggestionAction = (McpEvents$SuggestionAction) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), mcpEvents$SuggestionAction);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpEvents$McpSuggestionActioned(i, strV, strV2, mcpEvents$SuggestionAction, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpEvents$McpSuggestionActioned mcpEvents$McpSuggestionActioned = (McpEvents$McpSuggestionActioned) obj;
        encoder.getClass();
        mcpEvents$McpSuggestionActioned.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpEvents$McpSuggestionActioned.write$Self$analytics(mcpEvents$McpSuggestionActioned, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
