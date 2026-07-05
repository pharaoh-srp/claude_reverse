package defpackage;

import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$InitializationFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ya5 implements w28 {
    public static final ya5 a;
    private static final SerialDescriptor descriptor;

    static {
        ya5 ya5Var = new ya5();
        a = ya5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.networking.cronet.initialization_failed", ya5Var, 2);
        pluginGeneratedSerialDescriptor.j("failure_reason", false);
        pluginGeneratedSerialDescriptor.j("error_message", false);
        pluginGeneratedSerialDescriptor.k(new gl0(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar)};
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
        String str = null;
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
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CronetAnalyticsEvents$InitializationFailed(i, strV, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CronetAnalyticsEvents$InitializationFailed cronetAnalyticsEvents$InitializationFailed = (CronetAnalyticsEvents$InitializationFailed) obj;
        encoder.getClass();
        cronetAnalyticsEvents$InitializationFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CronetAnalyticsEvents$InitializationFailed.write$Self$analytics(cronetAnalyticsEvents$InitializationFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
