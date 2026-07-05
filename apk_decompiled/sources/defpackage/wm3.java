package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wm3 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ vm3 F;
    public final /* synthetic */ ukg G;
    public final /* synthetic */ ukg H;
    public final /* synthetic */ ukg I;

    public /* synthetic */ wm3(vm3 vm3Var, ukg ukgVar, ukg ukgVar2, ukg ukgVar3) {
        this.F = vm3Var;
        this.G = ukgVar;
        this.H = ukgVar2;
        this.I = ukgVar3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dlk.c(this.F, this.G, this.H, this.I, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    vm3 vm3Var = this.F;
                    float f = vm3Var.a;
                    q68 q68VarD = new gaj(new n46(f)).d(new km8(new n46(f))).d(new bc1(new j50(R.drawable.claude_widget_background), new e54(new irh(((ni6) e18Var.j(te4.e)).q))));
                    hnc hncVar = new hnc(2, vm3Var.b);
                    qok.a(q68VarD.d(new jnc(hncVar, hncVar, hncVar, hncVar)), 1, fd9.q0(284551279, new bn(this.G, vm3Var, this.H, this.I, 12), e18Var), e18Var, 3072);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wm3(vm3 vm3Var, ukg ukgVar, ukg ukgVar2, ukg ukgVar3, int i) {
        this.F = vm3Var;
        this.G = ukgVar;
        this.H = ukgVar2;
        this.I = ukgVar3;
    }
}
