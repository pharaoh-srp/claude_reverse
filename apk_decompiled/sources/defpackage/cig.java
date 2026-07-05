package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class cig {
    public final Instant a;
    public final psi b;

    public cig(Instant instant, psi psiVar) {
        this.a = instant;
        this.b = psiVar;
        quj.l(psiVar, (psi) sta.f0(psiVar.F, psi.H), "speed");
        quj.m(psiVar, dig.g, "speed");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cig)) {
            return false;
        }
        cig cigVar = (cig) obj;
        return this.a.equals(cigVar.a) && this.b.equals(cigVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Sample(time=" + this.a + ", speed=" + this.b + ')';
    }
}
