package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudTrackRecovered;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w2e implements w28 {
    public static final w2e a;
    private static final SerialDescriptor descriptor;

    static {
        w2e w2eVar = new w2e();
        a = w2eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_read_aloud_track_recovered", w2eVar, 4);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("attempt", false);
        pluginGeneratedSerialDescriptor.j("write_error", false);
        pluginGeneratedSerialDescriptor.j("skipped_frames", false);
        pluginGeneratedSerialDescriptor.k(new xmb(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{srg.a, e79Var, e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        String strV = null;
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
                iR2 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                iR3 = ud4VarC.r(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ReadAloudEvents$MobileReadAloudTrackRecovered(i, strV, iR, iR2, iR3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ReadAloudEvents$MobileReadAloudTrackRecovered readAloudEvents$MobileReadAloudTrackRecovered = (ReadAloudEvents$MobileReadAloudTrackRecovered) obj;
        encoder.getClass();
        readAloudEvents$MobileReadAloudTrackRecovered.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ReadAloudEvents$MobileReadAloudTrackRecovered.write$Self$analytics(readAloudEvents$MobileReadAloudTrackRecovered, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
