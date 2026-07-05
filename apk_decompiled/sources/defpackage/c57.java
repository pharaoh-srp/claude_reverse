package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c57 implements wbj {
    public final wbj a;
    public final wbj b;

    public c57(wbj wbjVar, wbj wbjVar2) {
        this.a = wbjVar;
        this.b = wbjVar2;
    }

    @Override // defpackage.wbj
    public final int a(cz5 cz5Var) {
        int iA = this.a.a(cz5Var) - this.b.a(cz5Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.wbj
    public final int b(cz5 cz5Var, fu9 fu9Var) {
        int iB = this.a.b(cz5Var, fu9Var) - this.b.b(cz5Var, fu9Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.wbj
    public final int c(cz5 cz5Var) {
        int iC = this.a.c(cz5Var) - this.b.c(cz5Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.wbj
    public final int d(cz5 cz5Var, fu9 fu9Var) {
        int iD = this.a.d(cz5Var, fu9Var) - this.b.d(cz5Var, fu9Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c57)) {
            return false;
        }
        c57 c57Var = (c57) obj;
        return x44.r(c57Var.a, this.a) && x44.r(c57Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
