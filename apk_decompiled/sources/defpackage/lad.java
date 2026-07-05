package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class lad {
    public final Instant a;
    public final jad b;

    public lad(Instant instant, jad jadVar) {
        this.a = instant;
        this.b = jadVar;
        quj.l(jadVar, (jad) sta.f0(jadVar.F, jad.H), "power");
        quj.m(jadVar, mad.g, "power");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lad)) {
            return false;
        }
        lad ladVar = (lad) obj;
        return this.a.equals(ladVar.a) && this.b.equals(ladVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Sample(time=" + this.a + ", power=" + this.b + ')';
    }
}
