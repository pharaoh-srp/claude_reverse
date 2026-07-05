package defpackage;

import com.anthropic.claude.analytics.events.OfflineEvents$CacheAgeBucket;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineErrorKind;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineScreen;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolved;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolvedOutcome;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a8f {
    public final qi3 a;
    public final mn5 b;
    public final LinkedHashSet c = new LinkedHashSet();

    public a8f(qi3 qi3Var, mn5 mn5Var) {
        this.a = qi3Var;
        this.b = mn5Var;
    }

    public final void a(OfflineEvents$OfflineScreen offlineEvents$OfflineScreen, boolean z, boolean z2, int i, Long l, long j, boolean z3) {
        Long lValueOf;
        OfflineEvents$CacheAgeBucket offlineEvents$CacheAgeBucketE;
        offlineEvents$OfflineScreen.getClass();
        boolean zAdd = this.c.add(offlineEvents$OfflineScreen);
        if (l != null) {
            long jA = this.b.a() - l.longValue();
            if (jA < 0) {
                jA = 0;
            }
            lValueOf = Long.valueOf(jA);
        } else {
            lValueOf = null;
        }
        long jLongValue = 0;
        OfflineEvents$ScreenResolvedOutcome offlineEvents$ScreenResolvedOutcome = (z || !z2) ? (z && z2) ? OfflineEvents$ScreenResolvedOutcome.CACHED_THEN_UPDATED : z ? OfflineEvents$ScreenResolvedOutcome.CACHED_ONLY_SYNC_FAILED : OfflineEvents$ScreenResolvedOutcome.ERROR_EMPTY : OfflineEvents$ScreenResolvedOutcome.LIVE_DATA;
        long jLongValue2 = l != null ? l.longValue() : 0L;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        }
        if (lValueOf == null || (offlineEvents$CacheAgeBucketE = ouk.e(lValueOf.longValue())) == null) {
            offlineEvents$CacheAgeBucketE = OfflineEvents$CacheAgeBucket.UNSPECIFIED;
        }
        this.a.e(new OfflineEvents$ScreenResolved(offlineEvents$OfflineScreen, offlineEvents$ScreenResolvedOutcome, zAdd, i, jLongValue2, jLongValue, offlineEvents$CacheAgeBucketE, !z2 && z3, z2 ? OfflineEvents$OfflineErrorKind.UNSPECIFIED : z3 ? OfflineEvents$OfflineErrorKind.OFFLINE : OfflineEvents$OfflineErrorKind.SERVER_ERROR, j), OfflineEvents$ScreenResolved.Companion.serializer());
    }
}
