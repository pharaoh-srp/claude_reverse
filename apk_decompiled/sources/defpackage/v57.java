package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class v57 {
    public final Instant a;
    public final Instant b;
    public final f3a c;

    public v57(Instant instant, Instant instant2, f3a f3aVar) {
        this.a = instant;
        this.b = instant2;
        this.c = f3aVar;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (f3aVar != null) {
            double dA = f3aVar.a();
            if (0.0d > dA || dA > 1000000.0d) {
                sz6.p("length valid range: 0-1000000.");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v57)) {
            return false;
        }
        v57 v57Var = (v57) obj;
        return this.a.equals(v57Var.a) && this.b.equals(v57Var.b) && x44.r(this.c, v57Var.c);
    }

    public final int hashCode() {
        int i = ebh.i(this.b, this.a.hashCode() * 31, 31);
        f3a f3aVar = this.c;
        return i + (f3aVar != null ? f3aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ExerciseLap(startTime=" + this.a + ", endTime=" + this.b + ", length=" + this.c + ')';
    }
}
