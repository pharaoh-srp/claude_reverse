package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudPlaybackStarted;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o2e implements w28 {
    public static final o2e a;
    private static final SerialDescriptor descriptor;

    static {
        o2e o2eVar = new o2e();
        a = o2eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_read_aloud_playback_started", o2eVar, 2);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("ttfa_ms", false);
        pluginGeneratedSerialDescriptor.k(new xmb(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
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
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ReadAloudEvents$MobileReadAloudPlaybackStarted(i, strV, j, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ReadAloudEvents$MobileReadAloudPlaybackStarted readAloudEvents$MobileReadAloudPlaybackStarted = (ReadAloudEvents$MobileReadAloudPlaybackStarted) obj;
        encoder.getClass();
        readAloudEvents$MobileReadAloudPlaybackStarted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ReadAloudEvents$MobileReadAloudPlaybackStarted.write$Self$analytics(readAloudEvents$MobileReadAloudPlaybackStarted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
