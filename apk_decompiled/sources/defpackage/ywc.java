package defpackage;

import com.anthropic.claude.analytics.events.PerfEvents$LongTask;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ywc implements w28 {
    public static final ywc a;
    private static final SerialDescriptor descriptor;

    static {
        ywc ywcVar = new ywc();
        a = ywcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.perf.long_task", ywcVar, 3);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("threshold_ms", false);
        pluginGeneratedSerialDescriptor.j("target", false);
        pluginGeneratedSerialDescriptor.k(new xmb(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{xkaVar, xkaVar, srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        long j = 0;
        long j2 = 0;
        String strV = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                j = ud4VarC.j(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j2 = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PerfEvents$LongTask(i, j, j2, strV, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PerfEvents$LongTask perfEvents$LongTask = (PerfEvents$LongTask) obj;
        encoder.getClass();
        perfEvents$LongTask.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PerfEvents$LongTask.write$Self$analytics(perfEvents$LongTask, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
