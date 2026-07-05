package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dta {
    public final p88 a;
    public final k2a b;

    public dta(p88 p88Var, k2a k2aVar) {
        this.a = p88Var;
        this.b = k2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dta)) {
            return false;
        }
        dta dtaVar = (dta) obj;
        return this.a == dtaVar.a && this.b == dtaVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MapTagData(componentCallbacks=" + this.a + ", lifecycleObserver=" + this.b + ')';
    }
}
