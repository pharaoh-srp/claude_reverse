package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lb1 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ lb1(int i, float f, qnc qncVar, ta4 ta4Var, ta4 ta4Var2, int i2) {
        this.F = i;
        this.G = f;
        this.H = qncVar;
        this.I = ta4Var;
        this.J = ta4Var2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                dgj.b((zy7) obj5, (iqb) obj4, (wu8) obj3, this.G, (ld4) obj, iP0, this.F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(27649);
                rw7.b(this.F, this.G, (qnc) obj5, (ta4) obj4, (ta4) obj3, (ld4) obj, iP02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(3073);
                kwj.c((iqb) obj4, this.G, (mnc) obj5, (ta4) obj3, (ld4) obj, iP03, this.F);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                ckk.d((RecipeDisplayV0InputIngredientsItem) obj5, this.G, (v5b) obj3, (iqb) obj4, (ld4) obj, iP04);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(1);
                dvj.d(this.F, (List) obj5, (bz7) obj3, this.G, (iqb) obj4, (ld4) obj, iP05);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP06 = x44.p0(i2 | 1);
                nrk.c((pz7) obj5, (iqb) obj4, this.G, (ta4) obj3, (ld4) obj, iP06);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lb1(int i, List list, bz7 bz7Var, float f, iqb iqbVar, int i2) {
        this.F = i;
        this.H = list;
        this.J = bz7Var;
        this.G = f;
        this.I = iqbVar;
    }

    public /* synthetic */ lb1(zy7 zy7Var, iqb iqbVar, wu8 wu8Var, float f, int i, int i2) {
        this.H = zy7Var;
        this.I = iqbVar;
        this.J = wu8Var;
        this.G = f;
        this.F = i2;
    }

    public /* synthetic */ lb1(pz7 pz7Var, iqb iqbVar, float f, ta4 ta4Var, int i) {
        this.H = pz7Var;
        this.I = iqbVar;
        this.G = f;
        this.J = ta4Var;
        this.F = i;
    }

    public /* synthetic */ lb1(iqb iqbVar, float f, mnc mncVar, ta4 ta4Var, int i, int i2) {
        this.I = iqbVar;
        this.G = f;
        this.H = mncVar;
        this.J = ta4Var;
        this.F = i2;
    }

    public /* synthetic */ lb1(RecipeDisplayV0InputIngredientsItem recipeDisplayV0InputIngredientsItem, float f, v5b v5bVar, iqb iqbVar, int i) {
        this.H = recipeDisplayV0InputIngredientsItem;
        this.G = f;
        this.J = v5bVar;
        this.I = iqbVar;
        this.F = i;
    }
}
