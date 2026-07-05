package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public final class pf8 {
    public final pv1 a;
    public final wg b;
    public final zf c;

    public pf8(pv1 pv1Var, wg wgVar, zf zfVar) {
        this.a = pv1Var;
        this.b = wgVar;
        this.c = zfVar;
        if (pv1Var.b() == 0 && pv1Var.a() == 0) {
            sz6.p("Bounds must be non zero");
            throw null;
        }
        if (pv1Var.a == 0 || pv1Var.b == 0) {
            return;
        }
        sz6.p("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final Rect a() {
        return this.a.c();
    }

    public final zf b() {
        pv1 pv1Var = this.a;
        return (pv1Var.b() == 0 || pv1Var.a() == 0) ? zf.N : zf.O;
    }

    public final wg c() {
        pv1 pv1Var = this.a;
        return pv1Var.b() > pv1Var.a() ? wg.Q : wg.P;
    }

    public final zf d() {
        return this.c;
    }

    public final boolean e() {
        wg wgVar = wg.S;
        wg wgVar2 = this.b;
        return wgVar2 == wgVar || (wgVar2 == wg.R && this.c == zf.Q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (pf8.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            pf8 pf8Var = (pf8) obj;
            return this.a.equals(pf8Var.a) && this.b == pf8Var.b && this.c == pf8Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return pf8.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
