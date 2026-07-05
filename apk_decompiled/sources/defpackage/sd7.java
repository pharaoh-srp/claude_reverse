package defpackage;

import com.anthropic.claude.api.usage.ExtraUsageResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sd7 implements w28 {
    public static final sd7 a;
    private static final SerialDescriptor descriptor;

    static {
        sd7 sd7Var = new sd7();
        a = sd7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.usage.ExtraUsageResponse", sd7Var, 5);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        pluginGeneratedSerialDescriptor.j("monthly_limit", true);
        pluginGeneratedSerialDescriptor.j("used_credits", true);
        pluginGeneratedSerialDescriptor.j("utilization", true);
        pluginGeneratedSerialDescriptor.j("currency", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(zt1.a);
        KSerializer kSerializerS2 = d4c.S(e79.a);
        na6 na6Var = na6.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(na6Var), d4c.S(na6Var), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        Double d = null;
        Double d2 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else if (iX == 2) {
                d = (Double) ud4VarC.m(serialDescriptor, 2, na6.a, d);
                i |= 4;
            } else if (iX == 3) {
                d2 = (Double) ud4VarC.m(serialDescriptor, 3, na6.a, d2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExtraUsageResponse(i, bool, num, d, d2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExtraUsageResponse extraUsageResponse = (ExtraUsageResponse) obj;
        encoder.getClass();
        extraUsageResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExtraUsageResponse.write$Self$api(extraUsageResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
