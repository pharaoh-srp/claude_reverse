package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class li6 implements h6e {
    public int a;
    public final /* synthetic */ mi6 b;

    public li6(mi6 mi6Var) {
        this.b = mi6Var;
    }

    @Override // defpackage.h6e
    public final o5l a(o5l o5lVar) {
        i6e i6eVar = this.b.a;
        o5l o5lVarA = i6eVar.U.a(o5lVar);
        if (o5lVarA == null) {
            return null;
        }
        mi6 mi6VarA = e6e.a(i6eVar);
        li6 li6Var = mi6VarA != null ? mi6VarA.b : null;
        return li6Var == null ? o5lVarA : li6Var.a(o5lVarA);
    }

    @Override // defpackage.h6e
    public final void b() {
        this.a = 0;
        this.b.a.U.b();
    }

    @Override // defpackage.h6e
    public final void c() {
        i6e i6eVar = this.b.a;
        int i = this.a;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        this.a = i2;
        if (i2 == 0 && i > 0) {
            i6eVar.U.c();
        }
        mi6 mi6VarA = e6e.a(i6eVar);
        li6 li6Var = mi6VarA != null ? mi6VarA.b : null;
        if (li6Var != null) {
            li6Var.c();
        }
    }

    @Override // defpackage.h6e
    public final void d() {
        i6e i6eVar = this.b.a;
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            i6eVar.U.d();
        }
        mi6 mi6VarA = e6e.a(i6eVar);
        li6 li6Var = mi6VarA != null ? mi6VarA.b : null;
        if (li6Var != null) {
            li6Var.d();
        }
    }

    @Override // defpackage.h6e
    public final void e() {
        this.b.a.U.e();
        this.a = 0;
    }
}
