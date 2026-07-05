package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionCreationFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qv3 implements w28 {
    public static final qv3 a;
    private static final SerialDescriptor descriptor;

    static {
        qv3 qv3Var = new qv3();
        a = qv3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_session_creation_failed", qv3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "error_message", true, "latency_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
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
        return new CodeEvents$SessionCreationFailed(i, strV, str, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionCreationFailed codeEvents$SessionCreationFailed = (CodeEvents$SessionCreationFailed) obj;
        encoder.getClass();
        codeEvents$SessionCreationFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionCreationFailed.write$Self$analytics(codeEvents$SessionCreationFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
