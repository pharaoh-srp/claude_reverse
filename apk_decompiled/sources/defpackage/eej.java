package defpackage;

import com.anthropic.claude.api.common.WindowLimitStatus;
import com.anthropic.claude.api.common.WindowStatus;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eej implements w28 {
    public static final eej a;
    private static final SerialDescriptor descriptor;

    static {
        eej eejVar = new eej();
        a = eejVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.common.WindowStatus", eejVar, 4);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("resets_at", true);
        pluginGeneratedSerialDescriptor.j("utilization", true);
        pluginGeneratedSerialDescriptor.j("surpassed_threshold", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(fl5.a);
        na6 na6Var = na6.a;
        return new KSerializer[]{qdj.d, kSerializerS, d4c.S(na6Var), d4c.S(na6Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        WindowLimitStatus windowLimitStatus = null;
        Date date = null;
        Double d = null;
        Double d2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                windowLimitStatus = (WindowLimitStatus) ud4VarC.l(serialDescriptor, 0, qdj.d, windowLimitStatus);
                i |= 1;
            } else if (iX == 1) {
                date = (Date) ud4VarC.m(serialDescriptor, 1, fl5.a, date);
                i |= 2;
            } else if (iX == 2) {
                d = (Double) ud4VarC.m(serialDescriptor, 2, na6.a, d);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                d2 = (Double) ud4VarC.m(serialDescriptor, 3, na6.a, d2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WindowStatus(i, windowLimitStatus, date, d, d2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WindowStatus windowStatus = (WindowStatus) obj;
        encoder.getClass();
        windowStatus.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WindowStatus.write$Self$Claude_api_result(windowStatus, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
