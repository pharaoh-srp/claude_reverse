package defpackage;

import com.anthropic.claude.api.account.FeatureAccess;
import com.anthropic.claude.api.account.FeatureAccessStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf7 implements w28 {
    public static final lf7 a;
    private static final SerialDescriptor descriptor;

    static {
        lf7 lf7Var = new lf7();
        a = lf7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.FeatureAccess", lf7Var, 2);
        pluginGeneratedSerialDescriptor.j("feature", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, tf7.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        FeatureAccessStatus featureAccessStatus = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                featureAccessStatus = (FeatureAccessStatus) ud4VarC.l(serialDescriptor, 1, tf7.d, featureAccessStatus);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new FeatureAccess(i, strV, featureAccessStatus, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FeatureAccess featureAccess = (FeatureAccess) obj;
        encoder.getClass();
        featureAccess.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FeatureAccess.write$Self$api(featureAccess, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
