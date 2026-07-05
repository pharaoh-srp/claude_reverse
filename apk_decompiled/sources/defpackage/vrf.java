package defpackage;

import com.anthropic.claude.sessions.types.SessionGrouping;
import com.anthropic.claude.sessions.types.SessionGroupingEnvelope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vrf implements w28 {
    public static final vrf a;
    private static final SerialDescriptor descriptor;

    static {
        vrf vrfVar = new vrf();
        a = vrfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionGroupingEnvelope", vrfVar, 1);
        pluginGeneratedSerialDescriptor.j("session_grouping", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{trf.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        SessionGrouping sessionGrouping = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                sessionGrouping = (SessionGrouping) ud4VarC.l(serialDescriptor, 0, trf.a, sessionGrouping);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionGroupingEnvelope(i, sessionGrouping, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionGroupingEnvelope sessionGroupingEnvelope = (SessionGroupingEnvelope) obj;
        encoder.getClass();
        sessionGroupingEnvelope.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, trf.a, sessionGroupingEnvelope.session_grouping);
        vd4VarC.b(serialDescriptor);
    }
}
