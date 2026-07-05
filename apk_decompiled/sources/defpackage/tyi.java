package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tyi {
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public tyi(long j, List list, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = list;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyi)) {
            return false;
        }
        tyi tyiVar = (tyi) obj;
        return this.a == tyiVar.a && this.b.equals(tyiVar.b) && this.c == tyiVar.c && this.d == tyiVar.d && this.e == tyiVar.e && this.f == tyiVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + vb7.e(vb7.e(vb7.e(kgh.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Snapshot(viewStartedTimeStamp=");
        sb.append(this.a);
        sb.append(", slowFramesRecords=");
        sb.append(this.b);
        ij0.u(this.c, ", totalFramesDurationNs=", ", slowFramesDurationNs=", sb);
        sb.append(this.d);
        ij0.u(this.e, ", freezeFramesDuration=", ", minViewLifetimeThresholdNs=", sb);
        return grc.r(this.f, ")", sb);
    }
}
