package defpackage;

import com.squareup.wire.internal.MathMethodsKt;

/* JADX INFO: loaded from: classes.dex */
public final class xag {
    public static final xag a = new xag();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xag);
    }

    public final int hashCode() {
        return Long.hashCode(MathMethodsKt.NANOS_PER_SECOND) + vb7.e(vb7.e(vb7.e(Integer.hashCode(1000) * 31, 31, 700000000L), 31, 16666666L), 31, 5000000000L);
    }

    public final String toString() {
        return "SlowFramesConfiguration(maxSlowFramesAmount=1000, maxSlowFrameThresholdNs=700000000, continuousSlowFrameThresholdNs=16666666, freezeDurationThresholdNs=5000000000, minViewLifetimeThresholdNs=1000000000)";
    }
}
