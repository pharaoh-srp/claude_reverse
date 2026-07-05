package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m6i {
    public final g91 a;
    public final String b;
    public final en6 c;
    public final j5i d;
    public final n6i e;

    public m6i(g91 g91Var, String str, en6 en6Var, j5i j5iVar, n6i n6iVar) {
        this.a = g91Var;
        this.b = str;
        this.c = en6Var;
        this.d = j5iVar;
        this.e = n6iVar;
    }

    public final void a(n81 n81Var) {
        pmf pmfVar = new pmf(27);
        n6i n6iVar = this.e;
        gt5 gt5Var = n6iVar.c;
        agd agdVar = n81Var.b;
        fj0 fj0VarA = g91.a();
        g91 g91Var = this.a;
        fj0VarA.J(g91Var.a);
        fj0VarA.G = agdVar;
        fj0VarA.F = g91Var.b;
        g91 g91VarH = fj0VarA.h();
        rl rlVar = new rl();
        rlVar.J = new HashMap();
        rlVar.H = Long.valueOf(n6iVar.a.a());
        rlVar.I = Long.valueOf(n6iVar.b.a());
        rlVar.E = this.b;
        rlVar.G = new bn6(this.c, (byte[]) this.d.apply(n81Var.a));
        rlVar.F = null;
        gt5Var.b.execute(new fy1(gt5Var, g91VarH, pmfVar, rlVar.s()));
    }
}
