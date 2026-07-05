package defpackage;

import com.anthropic.claude.sessions.types.GetSessionV2Response;
import com.anthropic.claude.sessions.types.SessionResourceV2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h48 implements w28 {
    public static final h48 a;
    private static final SerialDescriptor descriptor;

    static {
        h48 h48Var = new h48();
        a = h48Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GetSessionV2Response", h48Var, 1);
        pluginGeneratedSerialDescriptor.j("response_shape", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{utf.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        SessionResourceV2 sessionResourceV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                sessionResourceV2 = (SessionResourceV2) ud4VarC.l(serialDescriptor, 0, utf.a, sessionResourceV2);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GetSessionV2Response(i, sessionResourceV2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GetSessionV2Response getSessionV2Response = (GetSessionV2Response) obj;
        encoder.getClass();
        getSessionV2Response.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, utf.a, getSessionV2Response.session);
        vd4VarC.b(serialDescriptor);
    }
}
