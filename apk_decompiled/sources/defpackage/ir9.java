package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ir9 {
    public final oqb a;
    public final x59 b;

    public ir9(oqb oqbVar, x59 x59Var) {
        oqbVar.getClass();
        this.a = oqbVar;
        this.b = x59Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir9)) {
            return false;
        }
        ir9 ir9Var = (ir9) obj;
        return x44.r(this.a, ir9Var.a) && this.b.equals(ir9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "KoinDefinition(module=" + this.a + ", factory=" + this.b + ')';
    }
}
