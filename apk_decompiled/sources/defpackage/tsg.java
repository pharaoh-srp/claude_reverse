package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tsg extends usg {
    @Override // defpackage.av6
    public final int a() {
        return this.a.a() * 3;
    }

    @Override // defpackage.usg
    public final boolean g(yj6 yj6Var, c5c c5cVar) {
        if (yj6Var == c5cVar) {
            return false;
        }
        yj6 yj6Var2 = c5cVar.E;
        for (c5c c5cVarT = yj6Var2 != null ? yj6Var2.t() : c5cVar; c5cVarT != null && c5cVarT != c5cVar; c5cVarT = c5cVarT.z()) {
            if (h(yj6Var, c5cVarT)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.a);
    }
}
