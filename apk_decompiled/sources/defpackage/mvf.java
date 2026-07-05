package defpackage;

import com.anthropic.claude.sessions.types.SessionV2;
import com.anthropic.claude.sessions.types.SessionV2Envelope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mvf implements w28 {
    public static final mvf a;
    private static final SerialDescriptor descriptor;

    static {
        mvf mvfVar = new mvf();
        a = mvfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionV2Envelope", mvfVar, 1);
        pluginGeneratedSerialDescriptor.j("session", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{jvf.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        SessionV2 sessionV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                sessionV2 = (SessionV2) ud4VarC.l(serialDescriptor, 0, jvf.a, sessionV2);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionV2Envelope(i, sessionV2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionV2Envelope sessionV2Envelope = (SessionV2Envelope) obj;
        encoder.getClass();
        sessionV2Envelope.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, jvf.a, sessionV2Envelope.session);
        vd4VarC.b(serialDescriptor);
    }
}
