package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fzj extends hxj implements Set {
    public transient txj F;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.hxj
    public txj g() {
        txj txjVar = this.F;
        if (txjVar != null) {
            return txjVar;
        }
        txj txjVarL = l();
        this.F = txjVarL;
        return txjVarL;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return opk.n(this);
    }

    public txj l() {
        Object[] array = toArray(hxj.E);
        kxj kxjVar = txj.F;
        return txj.m(array.length, array);
    }
}
