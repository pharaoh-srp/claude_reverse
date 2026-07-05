package defpackage;

import com.anthropic.claude.sessions.types.ControlResponseBody;
import com.anthropic.claude.sessions.types.ControlResponsePayload;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aq4 implements w28 {
    public static final aq4 a;
    private static final SerialDescriptor descriptor;

    static {
        aq4 aq4Var = new aq4();
        a = aq4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ControlResponseBody", aq4Var, 3);
        pluginGeneratedSerialDescriptor.j("subtype", true);
        pluginGeneratedSerialDescriptor.j("request_id", false);
        pluginGeneratedSerialDescriptor.j("response", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(eq4.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ControlResponsePayload controlResponsePayload = null;
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
                controlResponsePayload = (ControlResponsePayload) ud4VarC.m(serialDescriptor, 2, eq4.a, controlResponsePayload);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ControlResponseBody(i, strV, strV2, controlResponsePayload, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ControlResponseBody controlResponseBody = (ControlResponseBody) obj;
        encoder.getClass();
        controlResponseBody.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ControlResponseBody.write$Self$sessions(controlResponseBody, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
