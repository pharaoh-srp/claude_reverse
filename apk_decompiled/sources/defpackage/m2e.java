package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudCompleted;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudInterruptReason;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudOutcome;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m2e implements w28 {
    public static final m2e a;
    private static final SerialDescriptor descriptor;

    static {
        m2e m2eVar = new m2e();
        a = m2eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_read_aloud_completed", m2eVar, 12);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("audio_bytes_received", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("audio_seconds_played", true);
        pluginGeneratedSerialDescriptor.j("expected_audio_seconds", true);
        pluginGeneratedSerialDescriptor.j("stream_ended_cleanly", true);
        pluginGeneratedSerialDescriptor.j("interrupt_reason", true);
        pluginGeneratedSerialDescriptor.j("track_recoveries", true);
        pluginGeneratedSerialDescriptor.j("ws_reconnects", true);
        pluginGeneratedSerialDescriptor.j("buffer_underruns", true);
        pluginGeneratedSerialDescriptor.j("min_buffer_ms", true);
        pluginGeneratedSerialDescriptor.k(new xmb(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ReadAloudEvents$MobileReadAloudCompleted.$childSerializers;
        xka xkaVar = xka.a;
        na6 na6Var = na6.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srg.a, kw9VarArr[1].getValue(), xkaVar, xkaVar, d4c.S(na6Var), d4c.S(na6Var), d4c.S(zt1.a), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        long j;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ReadAloudEvents$MobileReadAloudCompleted.$childSerializers;
        long j2 = 0;
        long j3 = 0;
        Integer num = null;
        Integer num2 = null;
        ReadAloudEvents$ReadAloudInterruptReason readAloudEvents$ReadAloudInterruptReason = null;
        Boolean bool = null;
        Integer num3 = null;
        Double d = null;
        Double d2 = null;
        int i = 0;
        Integer num4 = null;
        ReadAloudEvents$ReadAloudOutcome readAloudEvents$ReadAloudOutcome = null;
        boolean z = true;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    j = j2;
                    z = false;
                    break;
                case 0:
                    j = j2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = j2;
                    readAloudEvents$ReadAloudOutcome = (ReadAloudEvents$ReadAloudOutcome) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), readAloudEvents$ReadAloudOutcome);
                    i |= 2;
                    break;
                case 2:
                    j2 = ud4VarC.j(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    j = j2;
                    j3 = ud4VarC.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j = j2;
                    d = (Double) ud4VarC.m(serialDescriptor, 4, na6.a, d);
                    i |= 16;
                    break;
                case 5:
                    j = j2;
                    d2 = (Double) ud4VarC.m(serialDescriptor, 5, na6.a, d2);
                    i |= 32;
                    break;
                case 6:
                    j = j2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 6, zt1.a, bool);
                    i |= 64;
                    break;
                case 7:
                    j = j2;
                    readAloudEvents$ReadAloudInterruptReason = (ReadAloudEvents$ReadAloudInterruptReason) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), readAloudEvents$ReadAloudInterruptReason);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    j = j2;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 8, e79.a, num2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    j = j2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 9, e79.a, num);
                    i |= 512;
                    break;
                case 10:
                    j = j2;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 10, e79.a, num3);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    j = j2;
                    num4 = (Integer) ud4VarC.m(serialDescriptor, 11, e79.a, num4);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            j2 = j;
        }
        ud4VarC.b(serialDescriptor);
        return new ReadAloudEvents$MobileReadAloudCompleted(i, strV, readAloudEvents$ReadAloudOutcome, j2, j3, d, d2, bool, readAloudEvents$ReadAloudInterruptReason, num2, num, num3, num4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ReadAloudEvents$MobileReadAloudCompleted readAloudEvents$MobileReadAloudCompleted = (ReadAloudEvents$MobileReadAloudCompleted) obj;
        encoder.getClass();
        readAloudEvents$MobileReadAloudCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ReadAloudEvents$MobileReadAloudCompleted.write$Self$analytics(readAloudEvents$MobileReadAloudCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
