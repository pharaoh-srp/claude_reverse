package defpackage;

import com.anthropic.claude.api.chat.tool.AgentSummary;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yq implements w28 {
    public static final yq a;
    private static final SerialDescriptor descriptor;

    static {
        yq yqVar = new yq();
        a = yqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.tool.AgentSummary", yqVar, 5);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("total_sources", false);
        pluginGeneratedSerialDescriptor.j("top_icon_urls", false);
        pluginGeneratedSerialDescriptor.j("started_at", false);
        pluginGeneratedSerialDescriptor.j("completed_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = AgentSummary.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, e79.a, kw9VarArr[2].getValue(), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AgentSummary.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            } else if (iX == 3) {
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AgentSummary(i, strV, iR, list, str, str2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AgentSummary agentSummary = (AgentSummary) obj;
        encoder.getClass();
        agentSummary.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AgentSummary.write$Self$api(agentSummary, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
