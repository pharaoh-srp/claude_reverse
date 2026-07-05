package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c5g implements wbj {
    public final v4g a;

    public c5g(v4g v4gVar) {
        this.a = v4gVar;
    }

    @Override // defpackage.wbj
    public final int a(cz5 cz5Var) {
        int i;
        float fH = ((ry) this.a.d.F).j.h();
        if (!Float.isNaN(fH) && (i = (int) fH) >= 0) {
            return i;
        }
        return 0;
    }

    @Override // defpackage.wbj
    public final int b(cz5 cz5Var, fu9 fu9Var) {
        return 0;
    }

    @Override // defpackage.wbj
    public final int c(cz5 cz5Var) {
        return 0;
    }

    @Override // defpackage.wbj
    public final int d(cz5 cz5Var, fu9 fu9Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5g)) {
            return false;
        }
        return x44.r(this.a, ((c5g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
