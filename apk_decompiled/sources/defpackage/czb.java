package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class czb implements lp7 {
    public final /* synthetic */ nf6 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ aae G;
    public final /* synthetic */ aae H;
    public final /* synthetic */ aae I;

    public czb(nf6 nf6Var, boolean z, aae aaeVar, aae aaeVar2, aae aaeVar3) {
        this.E = nf6Var;
        this.F = z;
        this.G = aaeVar;
        this.H = aaeVar2;
        this.I = aaeVar3;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        ab1 ab1Var = (ab1) obj;
        float fA = kb1.a.a(ab1Var.c);
        boolean z = ab1Var.d == 0;
        float f = this.G.E;
        float f2 = this.H.E;
        float f3 = this.I.E;
        nf6 nf6Var = this.E;
        nf6Var.getClass();
        nf6Var.a.setValue(Boolean.valueOf(z != this.F));
        if (!nf6Var.a()) {
            f = f2;
        }
        nf6Var.b.i(d4c.W(MTTypesetterKt.kLineSkipLimitMultiplier, f, fA));
        nf6Var.c.i(d4c.W(MTTypesetterKt.kLineSkipLimitMultiplier, f3, fA));
        return iei.a;
    }
}
