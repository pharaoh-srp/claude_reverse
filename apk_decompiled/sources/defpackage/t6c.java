package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t6c extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ dpf G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6c(dpf dpfVar, int i) {
        super(1);
        this.F = i;
        this.G = dpfVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        lh3 lh3VarH;
        int i = this.F;
        dpf dpfVar = this.G;
        switch (i) {
            case 0:
                r6c r6cVar = (r6c) obj;
                r6cVar.getClass();
                gh3 gh3VarA = r6cVar.a();
                List listB = r6cVar.b();
                if (gh3VarA.c) {
                    poc.t("Unresolved local class: ", gh3VarA);
                    return null;
                }
                gh3 gh3VarF = gh3VarA.f();
                if (gh3VarF != null) {
                    lh3VarH = dpfVar.H(gh3VarF, w44.I0(listB, 1));
                } else {
                    afa afaVar = (afa) dpfVar.H;
                    ww7 ww7VarG = gh3VarA.g();
                    ww7VarG.getClass();
                    lh3VarH = (lh3) afaVar.invoke(ww7VarG);
                }
                lh3 lh3Var = lh3VarH;
                boolean z = !gh3VarA.b.e().d();
                gfa gfaVar = (gfa) dpfVar.F;
                sxb sxbVarI = gh3VarA.i();
                sxbVarI.getClass();
                Integer num = (Integer) w44.N0(listB);
                return new s6c(gfaVar, lh3Var, sxbVarI, z, num != null ? num.intValue() : 0);
            default:
                ww7 ww7Var = (ww7) obj;
                ww7Var.getClass();
                return new pm6((tqb) dpfVar.G, ww7Var);
        }
    }
}
