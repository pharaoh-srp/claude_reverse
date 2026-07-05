package defpackage;

import com.anthropic.claude.api.usage.ExtraUsageResponse;
import com.anthropic.claude.api.usage.UsageResponse;
import com.anthropic.claude.api.usage.UsageWindow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vli implements w28 {
    public static final vli a;
    private static final SerialDescriptor descriptor;

    static {
        vli vliVar = new vli();
        a = vliVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.usage.UsageResponse", vliVar, 6);
        pluginGeneratedSerialDescriptor.j("five_hour", true);
        pluginGeneratedSerialDescriptor.j("seven_day", true);
        pluginGeneratedSerialDescriptor.j("seven_day_opus", true);
        pluginGeneratedSerialDescriptor.j("seven_day_sonnet", true);
        pluginGeneratedSerialDescriptor.j("seven_day_cowork", true);
        pluginGeneratedSerialDescriptor.j("extra_usage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        bmi bmiVar = bmi.a;
        return new KSerializer[]{d4c.S(bmiVar), d4c.S(bmiVar), d4c.S(bmiVar), d4c.S(bmiVar), d4c.S(bmiVar), d4c.S(rme.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        UsageWindow usageWindow = null;
        UsageWindow usageWindow2 = null;
        UsageWindow usageWindow3 = null;
        UsageWindow usageWindow4 = null;
        UsageWindow usageWindow5 = null;
        ExtraUsageResponse extraUsageResponse = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    usageWindow = (UsageWindow) ud4VarC.m(serialDescriptor, 0, bmi.a, usageWindow);
                    i |= 1;
                    break;
                case 1:
                    usageWindow2 = (UsageWindow) ud4VarC.m(serialDescriptor, 1, bmi.a, usageWindow2);
                    i |= 2;
                    break;
                case 2:
                    usageWindow3 = (UsageWindow) ud4VarC.m(serialDescriptor, 2, bmi.a, usageWindow3);
                    i |= 4;
                    break;
                case 3:
                    usageWindow4 = (UsageWindow) ud4VarC.m(serialDescriptor, 3, bmi.a, usageWindow4);
                    i |= 8;
                    break;
                case 4:
                    usageWindow5 = (UsageWindow) ud4VarC.m(serialDescriptor, 4, bmi.a, usageWindow5);
                    i |= 16;
                    break;
                case 5:
                    extraUsageResponse = (ExtraUsageResponse) ud4VarC.m(serialDescriptor, 5, rme.a, extraUsageResponse);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UsageResponse(i, usageWindow, usageWindow2, usageWindow3, usageWindow4, usageWindow5, extraUsageResponse, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UsageResponse usageResponse = (UsageResponse) obj;
        encoder.getClass();
        usageResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UsageResponse.write$Self$api(usageResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
