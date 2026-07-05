package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpPromptsUsed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m1b implements w28 {
    public static final m1b a;
    private static final SerialDescriptor descriptor;

    static {
        m1b m1bVar = new m1b();
        a = m1bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mcp.prompts.used", m1bVar, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("argument_count", false);
        pluginGeneratedSerialDescriptor.j("assistant_messages", false);
        pluginGeneratedSerialDescriptor.j("user_messages", false);
        pluginGeneratedSerialDescriptor.j("text_messages", false);
        pluginGeneratedSerialDescriptor.j("image_messages", false);
        pluginGeneratedSerialDescriptor.k(new pi(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{srg.a, e79Var, e79Var, e79Var, e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        String strV = null;
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
                    iR = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iR2 = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR3 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iR4 = ud4VarC.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iR5 = ud4VarC.r(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpEvents$McpPromptsUsed(i, strV, iR, iR2, iR3, iR4, iR5, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpEvents$McpPromptsUsed mcpEvents$McpPromptsUsed = (McpEvents$McpPromptsUsed) obj;
        encoder.getClass();
        mcpEvents$McpPromptsUsed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpEvents$McpPromptsUsed.write$Self$analytics(mcpEvents$McpPromptsUsed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
