package defpackage;

import com.anthropic.claude.analytics.events.OfflineEvents$CacheAgeBucket;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineErrorKind;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineScreen;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolved;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolvedOutcome;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bcc implements w28 {
    public static final bcc a;
    private static final SerialDescriptor descriptor;

    static {
        bcc bccVar = new bcc();
        a = bccVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.offline.screen.resolved", bccVar, 10);
        pluginGeneratedSerialDescriptor.j("screen", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("is_first_load", false);
        pluginGeneratedSerialDescriptor.j("cached_count", false);
        pluginGeneratedSerialDescriptor.j("cached_at_ms", false);
        pluginGeneratedSerialDescriptor.j("cache_age_ms", false);
        pluginGeneratedSerialDescriptor.j("cache_age_bucket", false);
        pluginGeneratedSerialDescriptor.j("is_connectivity_failure", false);
        pluginGeneratedSerialDescriptor.j("error_kind", false);
        pluginGeneratedSerialDescriptor.j("sync_duration_ms", false);
        pluginGeneratedSerialDescriptor.k(new xmb(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = OfflineEvents$ScreenResolved.$childSerializers;
        zt1 zt1Var = zt1.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), zt1Var, e79.a, xkaVar, xkaVar, kw9VarArr[6].getValue(), zt1Var, kw9VarArr[8].getValue(), xkaVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = OfflineEvents$ScreenResolved.$childSerializers;
        Object obj = null;
        OfflineEvents$OfflineErrorKind offlineEvents$OfflineErrorKind = null;
        OfflineEvents$OfflineScreen offlineEvents$OfflineScreen = null;
        OfflineEvents$ScreenResolvedOutcome offlineEvents$ScreenResolvedOutcome = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        boolean zU = false;
        int iR = 0;
        boolean zU2 = false;
        boolean z = true;
        OfflineEvents$CacheAgeBucket offlineEvents$CacheAgeBucket = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    offlineEvents$OfflineScreen = (OfflineEvents$OfflineScreen) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), offlineEvents$OfflineScreen);
                    i |= 1;
                    break;
                case 1:
                    offlineEvents$ScreenResolvedOutcome = (OfflineEvents$ScreenResolvedOutcome) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), offlineEvents$ScreenResolvedOutcome);
                    i |= 2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j2 = ud4VarC.j(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    offlineEvents$CacheAgeBucket = (OfflineEvents$CacheAgeBucket) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), offlineEvents$CacheAgeBucket);
                    i |= 64;
                    break;
                case 7:
                    zU2 = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    offlineEvents$OfflineErrorKind = (OfflineEvents$OfflineErrorKind) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), offlineEvents$OfflineErrorKind);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    j3 = ud4VarC.j(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new OfflineEvents$ScreenResolved(i, offlineEvents$OfflineScreen, offlineEvents$ScreenResolvedOutcome, zU, iR, j, j2, offlineEvents$CacheAgeBucket, zU2, offlineEvents$OfflineErrorKind, j3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        OfflineEvents$ScreenResolved offlineEvents$ScreenResolved = (OfflineEvents$ScreenResolved) obj;
        encoder.getClass();
        offlineEvents$ScreenResolved.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        OfflineEvents$ScreenResolved.write$Self$analytics(offlineEvents$ScreenResolved, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
