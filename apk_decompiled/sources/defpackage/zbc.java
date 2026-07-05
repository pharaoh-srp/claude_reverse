package defpackage;

import com.anthropic.claude.analytics.events.OfflineEvents$PrefetchCompleted;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zbc implements w28 {
    public static final zbc a;
    private static final SerialDescriptor descriptor;

    static {
        zbc zbcVar = new zbc();
        a = zbcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.offline.prefetch.completed", zbcVar, 4);
        pluginGeneratedSerialDescriptor.j("conversations_synced", false);
        pluginGeneratedSerialDescriptor.j("conversations_needing_sync", false);
        pluginGeneratedSerialDescriptor.j("recent_count", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.k(new xmb(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, e79Var, xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR2 = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                iR3 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new OfflineEvents$PrefetchCompleted(i, iR, iR2, iR3, j, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        OfflineEvents$PrefetchCompleted offlineEvents$PrefetchCompleted = (OfflineEvents$PrefetchCompleted) obj;
        encoder.getClass();
        offlineEvents$PrefetchCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        OfflineEvents$PrefetchCompleted.write$Self$analytics(offlineEvents$PrefetchCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
