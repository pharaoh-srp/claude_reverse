package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class f67 {
    public final Instant a;
    public final double b;
    public final double c;
    public final f3a d;
    public final f3a e;
    public final f3a f;

    public f67(Instant instant, double d, double d2, f3a f3aVar, f3a f3aVar2, f3a f3aVar3) {
        this.a = instant;
        this.b = d;
        this.c = d2;
        this.d = f3aVar;
        this.e = f3aVar2;
        this.f = f3aVar3;
        quj.l(Double.valueOf(d), Double.valueOf(-90.0d), "latitude");
        quj.m(Double.valueOf(d), Double.valueOf(90.0d), "latitude");
        quj.l(Double.valueOf(d2), Double.valueOf(-180.0d), "longitude");
        quj.m(Double.valueOf(d2), Double.valueOf(180.0d), "longitude");
        if (f3aVar != null) {
            quj.l(f3aVar, (f3a) sta.f0(f3aVar.F, f3a.H), "horizontalAccuracy");
        }
        if (f3aVar2 != null) {
            quj.l(f3aVar2, (f3a) sta.f0(f3aVar2.F, f3a.H), "verticalAccuracy");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f67)) {
            return false;
        }
        f67 f67Var = (f67) obj;
        return this.a.equals(f67Var.a) && this.b == f67Var.b && this.c == f67Var.c && x44.r(this.d, f67Var.d) && x44.r(this.e, f67Var.e) && x44.r(this.f, f67Var.f);
    }

    public final int hashCode() {
        int iO = fsh.o(this.c, fsh.o(this.b, this.a.hashCode() * 31, 31), 31);
        f3a f3aVar = this.d;
        int iHashCode = (iO + (f3aVar != null ? f3aVar.hashCode() : 0)) * 31;
        f3a f3aVar2 = this.e;
        int iHashCode2 = (iHashCode + (f3aVar2 != null ? f3aVar2.hashCode() : 0)) * 31;
        f3a f3aVar3 = this.f;
        return iHashCode2 + (f3aVar3 != null ? f3aVar3.hashCode() : 0);
    }

    public final String toString() {
        return "Location(time=" + this.a + ", latitude=" + this.b + ", longitude=" + this.c + ", horizontalAccuracy=" + this.d + ", verticalAccuracy=" + this.e + ", altitude=" + this.f + ')';
    }
}
