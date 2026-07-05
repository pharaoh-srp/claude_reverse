package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudStallRecovered;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s2e implements w28 {
    public static final s2e a;
    private static final SerialDescriptor descriptor;

    static {
        s2e s2eVar = new s2e();
        a = s2eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_read_aloud_stall_recovered", s2eVar, 3);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("attempt", false);
        pluginGeneratedSerialDescriptor.j("stall_duration_ms", false);
        pluginGeneratedSerialDescriptor.k(new xmb(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, e79.a, xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        int iR = 0;
        String strV = null;
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
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ReadAloudEvents$MobileReadAloudStallRecovered(i, strV, iR, j, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ReadAloudEvents$MobileReadAloudStallRecovered readAloudEvents$MobileReadAloudStallRecovered = (ReadAloudEvents$MobileReadAloudStallRecovered) obj;
        encoder.getClass();
        readAloudEvents$MobileReadAloudStallRecovered.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ReadAloudEvents$MobileReadAloudStallRecovered.write$Self$analytics(readAloudEvents$MobileReadAloudStallRecovered, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
