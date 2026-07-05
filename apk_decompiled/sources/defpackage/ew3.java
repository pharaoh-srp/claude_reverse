package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionPrimerOutcome;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ew3 implements w28 {
    public static final ew3 a;
    private static final SerialDescriptor descriptor;

    static {
        ew3 ew3Var = new ew3();
        a = ew3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_session_primer_outcome", ew3Var, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        qy1.z(pluginGeneratedSerialDescriptor, "head_start_ms", true, "model_reconciled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(xka.a);
        KSerializer kSerializerS2 = d4c.S(zt1.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kSerializerS, kSerializerS2};
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
        String strV3 = null;
        Long l = null;
        Boolean bool = null;
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
                l = (Long) ud4VarC.m(serialDescriptor, 3, xka.a, l);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$SessionPrimerOutcome(i, strV, strV2, strV3, l, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionPrimerOutcome codeEvents$SessionPrimerOutcome = (CodeEvents$SessionPrimerOutcome) obj;
        encoder.getClass();
        codeEvents$SessionPrimerOutcome.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionPrimerOutcome.write$Self$analytics(codeEvents$SessionPrimerOutcome, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
