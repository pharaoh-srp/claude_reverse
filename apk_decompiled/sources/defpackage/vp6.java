package defpackage;

import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes3.dex */
public final class vp6 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ bz7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp6(int i, tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.E = i;
        this.G = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                vp6 vp6Var = new vp6(0, tp4Var, this.G);
                vp6Var.F = obj;
                return vp6Var;
            case 1:
                vp6 vp6Var2 = new vp6(1, tp4Var, this.G);
                vp6Var2.F = obj;
                return vp6Var2;
            case 2:
                vp6 vp6Var3 = new vp6(2, tp4Var, this.G);
                vp6Var3.F = obj;
                return vp6Var3;
            default:
                vp6 vp6Var4 = new vp6(3, tp4Var, this.G);
                vp6Var4.F = obj;
                return vp6Var4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((vp6) create((sp6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((vp6) create((qji) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((vp6) create((ofe) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((vp6) create((rfe) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sp6 sp6Var = (sp6) obj2;
                sf5.h0(obj);
                if (sp6Var == null) {
                    wg6.i();
                } else {
                    bz7Var.invoke(sp6Var.a);
                }
                break;
            case 1:
                qji qjiVar = (qji) obj2;
                sf5.h0(obj);
                if (qjiVar == null) {
                    wg6.i();
                } else {
                    bz7Var.invoke(ProjectId.m1079boximpl(ProjectId.m1080constructorimpl(qjiVar.a)));
                }
                break;
            case 2:
                ofe ofeVar = (ofe) obj2;
                sf5.h0(obj);
                if (ofeVar == null) {
                    wg6.i();
                } else {
                    bz7Var.invoke(ofeVar.a);
                }
                break;
            default:
                rfe rfeVar = (rfe) obj2;
                sf5.h0(obj);
                if (rfeVar == null) {
                    wg6.i();
                } else {
                    bz7Var.invoke(rfeVar.a);
                }
                break;
        }
        return null;
    }
}
