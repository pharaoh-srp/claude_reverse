package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public final class e9g {
    public static final xch c = new xch(-30.0d);
    public static final xch d = new xch(30.0d);
    public final Instant a;
    public final xch b;

    public e9g(Instant instant, xch xchVar) {
        this.a = instant;
        this.b = xchVar;
        quj.l(xchVar, c, "delta");
        quj.m(xchVar, d, "delta");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e9g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        e9g e9gVar = (e9g) obj;
        return this.a.equals(e9gVar.a) && this.b.equals(e9gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Delta(time=" + this.a + ", delta=" + this.b + ')';
    }
}
