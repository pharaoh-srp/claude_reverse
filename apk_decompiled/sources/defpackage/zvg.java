package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zvg extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cji F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zvg(cji cjiVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = cjiVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new zvg(this.F, tp4Var, 0);
            default:
                return new zvg(this.F, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((zvg) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((zvg) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 12;
        tp4 tp4Var = null;
        cji cjiVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (cjiVar != null && !((Boolean) cjiVar.p.getValue()).booleanValue()) {
                    cjiVar.k.setValue(Boolean.TRUE);
                    gb9.D(cjiVar.a, null, null, new bff(cjiVar, tp4Var, i2), 3);
                }
                break;
            default:
                sf5.h0(obj);
                cjiVar.k.setValue(Boolean.TRUE);
                gb9.D(cjiVar.a, null, null, new bff(cjiVar, tp4Var, i2), 3);
                break;
        }
        return ieiVar;
    }
}
