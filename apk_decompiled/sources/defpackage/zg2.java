package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zg2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ zy7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg2(zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                zg2 zg2Var = new zg2(this.G, tp4Var, 0);
                zg2Var.F = obj;
                return zg2Var;
            case 1:
                zg2 zg2Var2 = new zg2(this.G, tp4Var, 1);
                zg2Var2.F = obj;
                return zg2Var2;
            case 2:
                zg2 zg2Var3 = new zg2(this.G, tp4Var, 2);
                zg2Var3.F = obj;
                return zg2Var3;
            case 3:
                zg2 zg2Var4 = new zg2(this.G, tp4Var, 3);
                zg2Var4.F = obj;
                return zg2Var4;
            default:
                zg2 zg2Var5 = new zg2(this.G, tp4Var, 4);
                zg2Var5.F = obj;
                return zg2Var5;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((zg2) create((bh2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((zg2) create((tx5) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((zg2) create((sja) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((zg2) create((jbb) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((zg2) create((gti) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (!x44.r((bh2) obj2, bh2.a)) {
                    wg6.i();
                } else {
                    zy7Var.a();
                }
                break;
            case 1:
                tx5 tx5Var = (tx5) obj2;
                sf5.h0(obj);
                if (tx5Var == null) {
                    wg6.i();
                } else {
                    zy7Var.a();
                }
                break;
            case 2:
                sja sjaVar = (sja) obj2;
                sf5.h0(obj);
                if (sjaVar == null) {
                    wg6.i();
                } else {
                    zy7Var.a();
                }
                break;
            case 3:
                sf5.h0(obj);
                if (!x44.r((jbb) obj2, jbb.a)) {
                    wg6.i();
                } else {
                    zy7Var.a();
                }
                break;
            default:
                sf5.h0(obj);
                if (!x44.r((gti) obj2, gti.a)) {
                    wg6.i();
                } else {
                    zy7Var.a();
                }
                break;
        }
        return null;
    }
}
