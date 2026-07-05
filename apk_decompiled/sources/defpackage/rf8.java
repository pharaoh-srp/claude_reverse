package defpackage;

import com.anthropic.claude.api.consent.HasConsentResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rf8 implements w28 {
    public static final rf8 a;
    private static final SerialDescriptor descriptor;

    static {
        rf8 rf8Var = new rf8();
        a = rf8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.consent.HasConsentResponse", rf8Var, 1);
        pluginGeneratedSerialDescriptor.j("has_consent", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new HasConsentResponse(i, zU, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 0);
                i = 1;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HasConsentResponse hasConsentResponse = (HasConsentResponse) obj;
        encoder.getClass();
        hasConsentResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.p(serialDescriptor, 0, hasConsentResponse.has_consent);
        vd4VarC.b(serialDescriptor);
    }
}
