package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class af implements wbj {
    public final wbj a;
    public final rnc b;

    public af(wbj wbjVar, rnc rncVar) {
        this.a = wbjVar;
        this.b = rncVar;
    }

    @Override // defpackage.wbj
    public final int a(cz5 cz5Var) {
        return this.b.a(cz5Var) + this.a.a(cz5Var);
    }

    @Override // defpackage.wbj
    public final int b(cz5 cz5Var, fu9 fu9Var) {
        return this.b.b(cz5Var, fu9Var) + this.a.b(cz5Var, fu9Var);
    }

    @Override // defpackage.wbj
    public final int c(cz5 cz5Var) {
        return this.b.c(cz5Var) + this.a.c(cz5Var);
    }

    @Override // defpackage.wbj
    public final int d(cz5 cz5Var, fu9 fu9Var) {
        return this.b.d(cz5Var, fu9Var) + this.a.d(cz5Var, fu9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return x44.r(afVar.a, this.a) && afVar.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
