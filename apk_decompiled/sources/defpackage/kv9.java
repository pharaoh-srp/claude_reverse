package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kv9 extends wu9 {
    public final /* synthetic */ nv9 b;
    public final /* synthetic */ pz7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv9(nv9 nv9Var, pz7 pz7Var, String str) {
        super(str);
        this.b = nv9Var;
        this.c = pz7Var;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        nv9 nv9Var = this.b;
        iv9 iv9Var = nv9Var.L;
        iv9Var.E = q5bVar.getLayoutDirection();
        iv9Var.F = q5bVar.getDensity();
        iv9Var.G = q5bVar.k0();
        boolean zN0 = q5bVar.n0();
        pz7 pz7Var = this.c;
        if (zN0 || nv9Var.E.M == null) {
            nv9Var.H = 0;
            p5b p5bVar = (p5b) pz7Var.invoke(iv9Var, new rl4(j));
            return new jv9(p5bVar, nv9Var, nv9Var.H, p5bVar, 1);
        }
        nv9Var.I = 0;
        p5b p5bVar2 = (p5b) pz7Var.invoke(nv9Var.M, new rl4(j));
        return new jv9(p5bVar2, nv9Var, nv9Var.I, p5bVar2, 0);
    }
}
