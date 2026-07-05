package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionCreated;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ov3 implements w28 {
    public static final ov3 a;
    private static final SerialDescriptor descriptor;

    static {
        ov3 ov3Var = new ov3();
        a = ov3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_session_created", ov3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "session_id", false, "latency_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(xka.a);
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 2, xka.a, l);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$SessionCreated(i, strV, strV2, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionCreated codeEvents$SessionCreated = (CodeEvents$SessionCreated) obj;
        encoder.getClass();
        codeEvents$SessionCreated.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionCreated.write$Self$analytics(codeEvents$SessionCreated, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
