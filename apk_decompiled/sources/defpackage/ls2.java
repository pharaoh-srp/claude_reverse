package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ls2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ r4g G;
    public final /* synthetic */ nwb H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls2(r4g r4gVar, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = r4gVar;
        this.H = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                ls2 ls2Var = new ls2(this.G, this.H, tp4Var, 0);
                ls2Var.F = obj;
                return ls2Var;
            case 1:
                ls2 ls2Var2 = new ls2(this.G, this.H, tp4Var, 1);
                ls2Var2.F = obj;
                return ls2Var2;
            default:
                ls2 ls2Var3 = new ls2(this.G, this.H, tp4Var, 2);
                ls2Var3.F = obj;
                return ls2Var3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((ls2) create((ds2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((ls2) create((vb8) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((ls2) create((dji) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        r4g r4gVar = this.G;
        nwb nwbVar = this.H;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                ds2 ds2Var = (ds2) obj2;
                sf5.h0(obj);
                if (ds2Var == null) {
                    wg6.i();
                } else {
                    List list = ns2.a;
                    nwbVar.setValue(ds2Var);
                    r4gVar.a();
                }
                break;
            case 1:
                vb8 vb8Var = (vb8) obj2;
                sf5.h0(obj);
                if (vb8Var == null) {
                    wg6.i();
                } else {
                    nwbVar.setValue(Boolean.TRUE);
                    r4gVar.a();
                }
                break;
            default:
                dji djiVar = (dji) obj2;
                sf5.h0(obj);
                if (djiVar == null) {
                    wg6.i();
                } else {
                    nwbVar.setValue(yii.a);
                    r4gVar.a();
                }
                break;
        }
        return null;
    }
}
