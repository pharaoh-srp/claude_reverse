package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpSuggestionOptInActioned;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionOptInAction;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w1b implements w28 {
    public static final w1b a;
    private static final SerialDescriptor descriptor;

    static {
        w1b w1bVar = new w1b();
        a = w1bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.mcp.suggestion.opt_in.actioned", w1bVar, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.k(new pi(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = McpEvents$McpSuggestionOptInActioned.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = McpEvents$McpSuggestionOptInActioned.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        McpEvents$SuggestionOptInAction mcpEvents$SuggestionOptInAction = null;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                mcpEvents$SuggestionOptInAction = (McpEvents$SuggestionOptInAction) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), mcpEvents$SuggestionOptInAction);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpEvents$McpSuggestionOptInActioned(i, strV, strV2, mcpEvents$SuggestionOptInAction, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpEvents$McpSuggestionOptInActioned mcpEvents$McpSuggestionOptInActioned = (McpEvents$McpSuggestionOptInActioned) obj;
        encoder.getClass();
        mcpEvents$McpSuggestionOptInActioned.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpEvents$McpSuggestionOptInActioned.write$Self$analytics(mcpEvents$McpSuggestionOptInActioned, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
