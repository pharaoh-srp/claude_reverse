package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0Input;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t05 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ float F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ String H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qz7 M;
    public final /* synthetic */ qz7 N;

    public /* synthetic */ t05(ud0 ud0Var, String str, String str2, iqb iqbVar, rz7 rz7Var, float f, ta4 ta4Var, int i, int i2) {
        this.K = ud0Var;
        this.H = str;
        this.L = str2;
        this.G = iqbVar;
        this.M = rz7Var;
        this.F = f;
        this.N = ta4Var;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        qz7 qz7Var = this.N;
        qz7 qz7Var2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                zsk.c((ud0) obj4, this.H, (String) obj3, this.G, (rz7) qz7Var2, this.F, (ta4) qz7Var, (ld4) obj, iP0, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                akk.b((RecipeDisplayV0Input) obj4, this.F, (v5b) obj3, (bz7) qz7Var2, (zy7) qz7Var, this.G, this.H, (ld4) obj, iP02, this.J);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ t05(RecipeDisplayV0Input recipeDisplayV0Input, float f, v5b v5bVar, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, String str, int i, int i2) {
        this.K = recipeDisplayV0Input;
        this.F = f;
        this.L = v5bVar;
        this.M = bz7Var;
        this.N = zy7Var;
        this.G = iqbVar;
        this.H = str;
        this.I = i;
        this.J = i2;
    }
}
