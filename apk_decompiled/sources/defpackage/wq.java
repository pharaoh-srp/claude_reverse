package defpackage;

import com.anthropic.claude.conway.protocol.AgentState;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wq implements w28 {
    public static final wq a;
    private static final SerialDescriptor descriptor;

    static {
        wq wqVar = new wq();
        a = wqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.AgentState", wqVar, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("messages", true);
        pluginGeneratedSerialDescriptor.j("oldestSeq", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = AgentState.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AgentState.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        List list = null;
        Long l = null;
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
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                list = (List) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 4, xka.a, l);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AgentState(i, strV, strV2, strV3, list, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AgentState agentState = (AgentState) obj;
        encoder.getClass();
        agentState.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AgentState.write$Self$conway(agentState, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
