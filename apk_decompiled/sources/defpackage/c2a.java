package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class c2a implements i69 {
    public static final fva e;
    public final Instant a;
    public final ZoneOffset b;
    public final fva c;
    public final ijb d;

    static {
        xua xuaVar = fva.G;
        e = xua.b(1000.0d);
    }

    public c2a(Instant instant, ZoneOffset zoneOffset, fva fvaVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = fvaVar;
        this.d = ijbVar;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
            return;
        }
        quj.l(fvaVar, (fva) sta.f0(fvaVar.F, fva.H), "mass");
        quj.m(fvaVar, e, "mass");
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
        if (!(obj instanceof c2a)) {
            return false;
        }
        c2a c2aVar = (c2a) obj;
        return this.c.equals(c2aVar.c) && this.a.equals(c2aVar.a) && x44.r(this.b, c2aVar.b) && this.d.equals(c2aVar.d);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, this.c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeanBodyMassRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", mass=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
