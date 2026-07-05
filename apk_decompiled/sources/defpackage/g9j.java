package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class g9j implements i69 {
    public static final fva e;
    public static final vr f;
    public static final vr g;
    public static final vr h;
    public final Instant a;
    public final ZoneOffset b;
    public final fva c;
    public final ijb d;

    static {
        xua xuaVar = fva.G;
        e = xua.b(1000.0d);
        xua xuaVar2 = fva.G;
        f = pok.g("Weight", nr.AVERAGE, "weight", new b2g(1, xuaVar2, xua.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", 0, 16));
        int i = 0;
        g = pok.g("Weight", nr.MINIMUM, "weight", new b2g(1, xuaVar2, xua.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", i, 18));
        h = pok.g("Weight", nr.MAXIMUM, "weight", new b2g(1, xuaVar2, xua.class, "kilograms", "kilograms(D)Landroidx/health/connect/client/units/Mass;", i, 17));
    }

    public g9j(Instant instant, ZoneOffset zoneOffset, fva fvaVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = fvaVar;
        this.d = ijbVar;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
            return;
        }
        quj.l(fvaVar, (fva) sta.f0(fvaVar.F, fva.H), "weight");
        quj.m(fvaVar, e, "weight");
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
        if (!(obj instanceof g9j)) {
            return false;
        }
        g9j g9jVar = (g9j) obj;
        return this.c.equals(g9jVar.c) && this.a.equals(g9jVar.a) && x44.r(this.b, g9jVar.b) && this.d.equals(g9jVar.d);
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
        StringBuilder sb = new StringBuilder("WeightRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", weight=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
