package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h28 implements Cloneable {
    public final v28 E;
    public v28 F;

    public h28(v28 v28Var) {
        this.E = v28Var;
        if (v28Var.e()) {
            sz6.p("Default instance must be immutable.");
            throw null;
        }
        this.F = v28Var.f();
    }

    public final v28 a() {
        boolean zE = this.F.e();
        v28 v28Var = this.F;
        if (!zE) {
            return v28Var;
        }
        v28Var.getClass();
        rud rudVar = rud.c;
        rudVar.getClass();
        rudVar.a(v28Var.getClass()).b(v28Var);
        v28Var.b &= Integer.MAX_VALUE;
        return this.F;
    }

    public final Object clone() {
        h28 h28Var = (h28) this.E.a(5);
        h28Var.F = a();
        return h28Var;
    }
}
