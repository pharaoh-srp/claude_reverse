package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n59 implements mnc {
    public final wbj b;
    public final cz5 c;

    public n59(wbj wbjVar, cz5 cz5Var) {
        this.b = wbjVar;
        this.c = cz5Var;
    }

    @Override // defpackage.mnc
    public final float a() {
        wbj wbjVar = this.b;
        cz5 cz5Var = this.c;
        return cz5Var.c0(wbjVar.c(cz5Var));
    }

    @Override // defpackage.mnc
    public final float b(fu9 fu9Var) {
        wbj wbjVar = this.b;
        cz5 cz5Var = this.c;
        return cz5Var.c0(wbjVar.d(cz5Var, fu9Var));
    }

    @Override // defpackage.mnc
    public final float c(fu9 fu9Var) {
        wbj wbjVar = this.b;
        cz5 cz5Var = this.c;
        return cz5Var.c0(wbjVar.b(cz5Var, fu9Var));
    }

    @Override // defpackage.mnc
    public final float d() {
        wbj wbjVar = this.b;
        cz5 cz5Var = this.c;
        return cz5Var.c0(wbjVar.a(cz5Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n59)) {
            return false;
        }
        n59 n59Var = (n59) obj;
        return x44.r(this.b, n59Var.b) && x44.r(this.c, n59Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.b + ", density=" + this.c + ')';
    }
}
