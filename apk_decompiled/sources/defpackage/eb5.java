package defpackage;

import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestFailed;
import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestFailureReason;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eb5 implements w28 {
    public static final eb5 a;
    private static final SerialDescriptor descriptor;

    static {
        eb5 eb5Var = new eb5();
        a = eb5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.networking.cronet.request_failed", eb5Var, 8);
        pluginGeneratedSerialDescriptor.j("endpoint", false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.j("error_code", false);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("error_message", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("protocol", false);
        pluginGeneratedSerialDescriptor.j("experiment_enabled", false);
        pluginGeneratedSerialDescriptor.k(new gl0(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CronetAnalyticsEvents$RequestFailed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kw9VarArr[1].getValue(), d4c.S(e79.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xka.a), d4c.S(srgVar), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CronetAnalyticsEvents$RequestFailed.$childSerializers;
        Object obj = null;
        boolean z = true;
        Boolean bool = null;
        String strV = null;
        CronetAnalyticsEvents$RequestFailureReason cronetAnalyticsEvents$RequestFailureReason = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    cronetAnalyticsEvents$RequestFailureReason = (CronetAnalyticsEvents$RequestFailureReason) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), cronetAnalyticsEvents$RequestFailureReason);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str3);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 7, zt1.a, bool);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new CronetAnalyticsEvents$RequestFailed(i, strV, cronetAnalyticsEvents$RequestFailureReason, num, str, str2, l, str3, bool, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CronetAnalyticsEvents$RequestFailed cronetAnalyticsEvents$RequestFailed = (CronetAnalyticsEvents$RequestFailed) obj;
        encoder.getClass();
        cronetAnalyticsEvents$RequestFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CronetAnalyticsEvents$RequestFailed.write$Self$analytics(cronetAnalyticsEvents$RequestFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
