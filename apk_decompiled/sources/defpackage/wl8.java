package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class wl8 {
    public final Instant a;
    public final long b;

    public wl8(Instant instant, long j) {
        this.a = instant;
        this.b = j;
        quj.l(Long.valueOf(j), 1L, "beatsPerMinute");
        quj.m(Long.valueOf(j), 300L, "beatsPerMinute");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl8)) {
            return false;
        }
        wl8 wl8Var = (wl8) obj;
        return this.a.equals(wl8Var.a) && this.b == wl8Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sample(time=");
        sb.append(this.a);
        sb.append(", beatsPerMinute=");
        return ebh.p(sb, this.b, ')');
    }
}
