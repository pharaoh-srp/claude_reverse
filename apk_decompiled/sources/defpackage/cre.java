package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class cre implements i69 {
    public static final vr e = new vr(new or(), "RestingHeartRate", nr.AVERAGE, "bpm");
    public static final vr f = new vr(new or(), "RestingHeartRate", nr.MINIMUM, "bpm");
    public static final vr g = new vr(new or(), "RestingHeartRate", nr.MAXIMUM, "bpm");
    public final Instant a;
    public final ZoneOffset b;
    public final long c;
    public final ijb d;

    public cre(Instant instant, ZoneOffset zoneOffset, long j, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = j;
        this.d = ijbVar;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else if (j >= 0) {
            quj.m(Long.valueOf(j), 300L, "beatsPerMinute");
        } else {
            mr9.q("beatsPerMinute".concat(" must not be negative"));
            throw null;
        }
    }

    @Override // defpackage.i69
    public final Instant a() {
        return this.a;
    }

    @Override // defpackage.i69
    public final ZoneOffset c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cre)) {
            return false;
        }
        cre creVar = (cre) obj;
        return this.c == creVar.c && this.a.equals(creVar.a) && x44.r(this.b, creVar.b) && this.d.equals(creVar.d);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, Long.hashCode(this.c) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestingHeartRateRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", beatsPerMinute=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
