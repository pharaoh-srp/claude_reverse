package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0Input;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r6e implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ qz7 I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    public /* synthetic */ r6e(String str, zy7 zy7Var, iqb iqbVar, float f, pz7 pz7Var, ta4 ta4Var, int i, int i2) {
        this.E = 2;
        this.K = str;
        this.J = zy7Var;
        this.F = iqbVar;
        this.G = f;
        this.H = pz7Var;
        this.I = ta4Var;
        this.L = i;
        this.M = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.L;
        qz7 qz7Var = this.I;
        Object obj3 = this.H;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                akk.b((RecipeDisplayV0Input) obj4, this.G, (v5b) obj3, (bz7) qz7Var, this.J, fqb.E, this.K, (ld4) obj, iP0, this.M);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                akk.b((RecipeDisplayV0Input) obj4, this.G, (v5b) obj3, (bz7) qz7Var, this.J, fqb.E, this.K, (ld4) obj, iP02, this.M);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                rqk.a(this.K, this.J, (iqb) obj4, this.G, (pz7) obj3, (ta4) qz7Var, (ld4) obj, iP03, this.M);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ r6e(RecipeDisplayV0Input recipeDisplayV0Input, float f, v5b v5bVar, bz7 bz7Var, zy7 zy7Var, String str, int i, int i2, int i3) {
        this.E = i3;
        this.F = recipeDisplayV0Input;
        this.G = f;
        this.H = v5bVar;
        this.I = bz7Var;
        this.J = zy7Var;
        this.K = str;
        this.L = i;
        this.M = i2;
    }
}
