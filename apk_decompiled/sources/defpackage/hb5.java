package defpackage;

import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestSuccess;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb5 implements w28 {
    public static final hb5 a;
    private static final SerialDescriptor descriptor;

    static {
        hb5 hb5Var = new hb5();
        a = hb5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.networking.cronet.request_success", hb5Var, 5);
        pluginGeneratedSerialDescriptor.j("endpoint", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("status_code", false);
        pluginGeneratedSerialDescriptor.j("protocol", false);
        pluginGeneratedSerialDescriptor.j("experiment_enabled", false);
        pluginGeneratedSerialDescriptor.k(new gl0(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(zt1.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, xka.a, e79.a, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        int iR = 0;
        String strV = null;
        String strV2 = null;
        Boolean bool = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                strV2 = ud4VarC.v(serialDescriptor, 3);
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
        return new CronetAnalyticsEvents$RequestSuccess(i, strV, j, iR, strV2, bool, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CronetAnalyticsEvents$RequestSuccess cronetAnalyticsEvents$RequestSuccess = (CronetAnalyticsEvents$RequestSuccess) obj;
        encoder.getClass();
        cronetAnalyticsEvents$RequestSuccess.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CronetAnalyticsEvents$RequestSuccess.write$Self$analytics(cronetAnalyticsEvents$RequestSuccess, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
