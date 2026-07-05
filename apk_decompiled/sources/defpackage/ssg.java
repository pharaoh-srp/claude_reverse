package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ssg extends usg {
    @Override // defpackage.av6
    public final int a() {
        return this.a.a() + 2;
    }

    @Override // defpackage.usg
    public final boolean g(yj6 yj6Var, c5c c5cVar) {
        c5c c5cVarI;
        if (yj6Var == c5cVar) {
            return false;
        }
        if (!this.b) {
            c5cVar.getClass();
            while (true) {
                c5cVar = c5cVar.I();
                if (c5cVar == null) {
                    c5cVarI = null;
                    break;
                }
                if (c5cVar instanceof yj6) {
                    c5cVarI = (yj6) c5cVar;
                    break;
                }
            }
        } else {
            c5cVarI = c5cVar.I();
        }
        return c5cVarI != null && h(yj6Var, c5cVarI);
    }

    public final String toString() {
        return String.format("%s + ", this.a);
    }
}
