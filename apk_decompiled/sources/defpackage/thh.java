package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class thh extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zhh F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ thh(zhh zhhVar, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = zhhVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        zhh zhhVar = this.F;
        switch (i) {
            case 0:
                return new thh(zhhVar, tp4Var, 0);
            case 1:
                return new thh(zhhVar, tp4Var, 1);
            case 2:
                return new thh(zhhVar, tp4Var, 2);
            default:
                return new thh(zhhVar, tp4Var, 3);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((thh) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((thh) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((thh) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((thh) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        boolean z = false;
        iei ieiVar = iei.a;
        zhh zhhVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                zhhVar.C = false;
                break;
            case 1:
                sf5.h0(obj);
                zhhVar.k();
                break;
            case 2:
                sf5.h0(obj);
                if (knk.j) {
                    z = zhhVar.C;
                } else {
                    wkh wkhVar = zhhVar.k;
                    if ((wkhVar != null ? wkhVar.e() : null) == zkh.E) {
                        z = true;
                    }
                }
                zhhVar.i(z);
                break;
            default:
                sf5.h0(obj);
                zhhVar.v();
                break;
        }
        return ieiVar;
    }
}
