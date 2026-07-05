package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fei implements wbj {
    public final wbj a;
    public final wbj b;

    public fei(wbj wbjVar, wbj wbjVar2) {
        this.a = wbjVar;
        this.b = wbjVar2;
    }

    @Override // defpackage.wbj
    public final int a(cz5 cz5Var) {
        return Math.max(this.a.a(cz5Var), this.b.a(cz5Var));
    }

    @Override // defpackage.wbj
    public final int b(cz5 cz5Var, fu9 fu9Var) {
        return Math.max(this.a.b(cz5Var, fu9Var), this.b.b(cz5Var, fu9Var));
    }

    @Override // defpackage.wbj
    public final int c(cz5 cz5Var) {
        return Math.max(this.a.c(cz5Var), this.b.c(cz5Var));
    }

    @Override // defpackage.wbj
    public final int d(cz5 cz5Var, fu9 fu9Var) {
        return Math.max(this.a.d(cz5Var, fu9Var), this.b.d(cz5Var, fu9Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fei)) {
            return false;
        }
        fei feiVar = (fei) obj;
        return x44.r(feiVar.a, this.a) && x44.r(feiVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
