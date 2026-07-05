package defpackage;

import com.anthropic.claude.api.usage.UsageWindow;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bmi implements w28 {
    public static final bmi a;
    private static final SerialDescriptor descriptor;

    static {
        bmi bmiVar = new bmi();
        a = bmiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.usage.UsageWindow", bmiVar, 2);
        pluginGeneratedSerialDescriptor.j("resets_at", true);
        pluginGeneratedSerialDescriptor.j("utilization", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(bc9.a), d4c.S(na6.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Date date = null;
        Double d = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                date = (Date) ud4VarC.m(serialDescriptor, 0, bc9.a, date);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                d = (Double) ud4VarC.m(serialDescriptor, 1, na6.a, d);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UsageWindow(i, date, d, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UsageWindow usageWindow = (UsageWindow) obj;
        encoder.getClass();
        usageWindow.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UsageWindow.write$Self$api(usageWindow, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
