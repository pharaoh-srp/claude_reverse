package defpackage;

import com.anthropic.claude.analytics.health.HealthMetricAction;
import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import com.anthropic.claude.analytics.health.HealthMetricReport;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fl8 implements w28 {
    public static final fl8 a;
    private static final SerialDescriptor descriptor;

    static {
        fl8 fl8Var = new fl8();
        a = fl8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.analytics.health.HealthMetricReport", fl8Var, 7);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("variant", true);
        pluginGeneratedSerialDescriptor.j("error_type", true);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("duration_ms", true);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = HealthMetricReport.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xka.a), kw9VarArr[6].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HealthMetricReport.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        HealthMetricOutcome healthMetricOutcome = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l = null;
        HealthMetricAction healthMetricAction = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    healthMetricOutcome = (HealthMetricOutcome) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), healthMetricOutcome);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l);
                    i |= 32;
                    break;
                case 6:
                    healthMetricAction = (HealthMetricAction) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), healthMetricAction);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new HealthMetricReport(i, healthMetricOutcome, str, str2, str3, str4, l, healthMetricAction, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthMetricReport healthMetricReport = (HealthMetricReport) obj;
        encoder.getClass();
        healthMetricReport.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthMetricReport.write$Self$analytics(healthMetricReport, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
