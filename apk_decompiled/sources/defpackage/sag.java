package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sag implements ie4, Iterable, mm9 {
    public int F;
    public int H;
    public int I;
    public boolean K;
    public int L;
    public HashMap N;
    public xub O;
    public int[] E = new int[0];
    public Object[] G = new Object[0];
    public final Object J = new Object();
    public ArrayList M = new ArrayList();

    public final int a(y08 y08Var) {
        if (this.K) {
            pd4.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!y08Var.a()) {
            zad.a("Anchor refers to a group that was removed");
        }
        return y08Var.a;
    }

    public final void e() {
        this.N = new HashMap();
    }

    public final rag g() {
        if (this.K) {
            sz6.j("Cannot read while a writer is pending");
            return null;
        }
        this.I++;
        return new rag(this);
    }

    public final vag h() {
        if (this.K) {
            pd4.a("Cannot start a writer when another writer is pending");
        }
        if (this.I > 0) {
            pd4.a("Cannot start a writer when a reader is pending");
        }
        this.K = true;
        this.L++;
        return new vag(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new db8(this, 0, this.F);
    }

    public final boolean k(y08 y08Var) {
        int iE;
        return y08Var.a() && (iE = uag.e(this.M, y08Var.a, this.F)) >= 0 && x44.r(this.M.get(iE), y08Var);
    }

    public final g18 l(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.N;
        if (map != null) {
            if (this.K) {
                pd4.a("use active SlotWriter to crate an anchor for location instead");
            }
            y08 y08Var = (i < 0 || i >= (i2 = this.F) || (iE = uag.e((arrayList = this.M), i, i2)) < 0) ? null : (y08) arrayList.get(iE);
            if (y08Var != null) {
                return (g18) map.get(y08Var);
            }
        }
        return null;
    }
}
