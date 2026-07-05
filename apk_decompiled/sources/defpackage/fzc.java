package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fzc extends c4 implements rz8 {
    public static final fzc H;
    public final Object E;
    public final Object F;
    public final iyc G;

    static {
        a5 a5Var = a5.H;
        iyc iycVar = iyc.G;
        iycVar.getClass();
        H = new fzc(a5Var, a5Var, iycVar);
    }

    public fzc(Object obj, Object obj2, iyc iycVar) {
        iycVar.getClass();
        this.E = obj;
        this.F = obj2;
        this.G = iycVar;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.G.containsKey(obj);
    }

    @Override // defpackage.c4, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        boolean z = set instanceof fzc;
        iyc iycVar = this.G;
        return z ? iycVar.E.g(((fzc) obj).G.E, new oua(21)) : set instanceof hzc ? iycVar.E.g(((hzc) obj).g().g(), new oua(22)) : super.equals(obj);
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.G.d();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jzc(this.E, this.G, 0);
    }
}
