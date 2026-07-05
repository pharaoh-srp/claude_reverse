package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rnc implements wbj {
    public final mnc a;

    public rnc(mnc mncVar) {
        this.a = mncVar;
    }

    @Override // defpackage.wbj
    public final int a(cz5 cz5Var) {
        return cz5Var.M0(this.a.d());
    }

    @Override // defpackage.wbj
    public final int b(cz5 cz5Var, fu9 fu9Var) {
        return cz5Var.M0(this.a.c(fu9Var));
    }

    @Override // defpackage.wbj
    public final int c(cz5 cz5Var) {
        return cz5Var.M0(this.a.a());
    }

    @Override // defpackage.wbj
    public final int d(cz5 cz5Var, fu9 fu9Var) {
        return cz5Var.M0(this.a.b(fu9Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rnc) {
            return x44.r(((rnc) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        mnc mncVar = this.a;
        fu9 fu9Var = fu9.E;
        return "PaddingValues(" + ((Object) va6.c(mncVar.b(fu9Var))) + ", " + ((Object) va6.c(mncVar.d())) + ", " + ((Object) va6.c(mncVar.c(fu9Var))) + ", " + ((Object) va6.c(mncVar.a())) + ')';
    }
}
