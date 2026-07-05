package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudWsReconnected;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y2e implements w28 {
    public static final y2e a;
    private static final SerialDescriptor descriptor;

    static {
        y2e y2eVar = new y2e();
        a = y2eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_read_aloud_ws_reconnected", y2eVar, 4);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("attempt", false);
        pluginGeneratedSerialDescriptor.j("resume_chunk_index", true);
        pluginGeneratedSerialDescriptor.j("reconnect_latency_ms", true);
        pluginGeneratedSerialDescriptor.k(new xmb(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{srg.a, e79Var, d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        Integer num = null;
        Integer num2 = null;
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
            } else if (iX == 2) {
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ReadAloudEvents$MobileReadAloudWsReconnected(i, strV, iR, num, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ReadAloudEvents$MobileReadAloudWsReconnected readAloudEvents$MobileReadAloudWsReconnected = (ReadAloudEvents$MobileReadAloudWsReconnected) obj;
        encoder.getClass();
        readAloudEvents$MobileReadAloudWsReconnected.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ReadAloudEvents$MobileReadAloudWsReconnected.write$Self$analytics(readAloudEvents$MobileReadAloudWsReconnected, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
