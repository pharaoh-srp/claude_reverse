package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh9 extends bh9 {
    public final q7a E;

    public qh9() {
        iec iecVar = q7a.M;
        this.E = new q7a(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof qh9) && ((qh9) obj).E.equals(this.E);
        }
        return true;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final void o(String str, bh9 bh9Var) {
        if (bh9Var == null) {
            bh9Var = oh9.E;
        }
        this.E.put(str, bh9Var);
    }

    public final void p(Number number, String str) {
        o(str, number == null ? oh9.E : new vh9(number));
    }

    public final void q(String str, Boolean bool) {
        o(str, bool == null ? oh9.E : new vh9(bool));
    }

    public final void r(String str, String str2) {
        o(str, str2 == null ? oh9.E : new vh9(str2));
    }

    public final bh9 s(String str) {
        return (bh9) this.E.get(str);
    }
}
