package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ig9 extends bh9 implements Iterable {
    public final ArrayList E;

    public ig9() {
        this.E = new ArrayList();
    }

    @Override // defpackage.bh9
    public final boolean a() {
        return q().a();
    }

    @Override // defpackage.bh9
    public final int b() {
        return q().b();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ig9) && ((ig9) obj).E.equals(this.E);
        }
        return true;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.E.iterator();
    }

    @Override // defpackage.bh9
    public final long k() {
        return q().k();
    }

    @Override // defpackage.bh9
    public final Number l() {
        return q().l();
    }

    @Override // defpackage.bh9
    public final String m() {
        return q().m();
    }

    public final void o(bh9 bh9Var) {
        if (bh9Var == null) {
            bh9Var = oh9.E;
        }
        this.E.add(bh9Var);
    }

    public final void p(String str) {
        this.E.add(str == null ? oh9.E : new vh9(str));
    }

    public final bh9 q() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        if (size == 1) {
            return (bh9) arrayList.get(0);
        }
        sz6.j(grc.p(size, "Array must have size 1, but has size "));
        return null;
    }

    public ig9(int i) {
        this.E = new ArrayList(i);
    }
}
