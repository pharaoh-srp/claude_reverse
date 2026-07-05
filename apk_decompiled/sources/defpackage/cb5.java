package defpackage;

import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$InitializationSucceeded;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cb5 implements w28 {
    public static final cb5 a;
    private static final SerialDescriptor descriptor;

    static {
        cb5 cb5Var = new cb5();
        a = cb5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.networking.cronet.initialization_succeeded", cb5Var, 1);
        pluginGeneratedSerialDescriptor.j("provider_name", false);
        pluginGeneratedSerialDescriptor.k(new gl0(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a};
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
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 0);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CronetAnalyticsEvents$InitializationSucceeded(i, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CronetAnalyticsEvents$InitializationSucceeded cronetAnalyticsEvents$InitializationSucceeded = (CronetAnalyticsEvents$InitializationSucceeded) obj;
        encoder.getClass();
        cronetAnalyticsEvents$InitializationSucceeded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.q(serialDescriptor, 0, cronetAnalyticsEvents$InitializationSucceeded.provider_name);
        vd4VarC.b(serialDescriptor);
    }
}
