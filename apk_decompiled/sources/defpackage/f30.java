package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class f30 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f30(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                return new f30((k30) obj2, (Activity) obj, tp4Var, 0);
            case 1:
                return new f30((k30) obj2, (Activity) obj, tp4Var, 1);
            default:
                return new f30((a80) obj2, obj, tp4Var, 2);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((f30) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((f30) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((f30) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        int i2 = 1;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                gx gxVarE = ((k30) obj2).e();
                gxVarE.b().b(new lxe(i2, 10));
                break;
            case 1:
                sf5.h0(obj);
                gx gxVarE2 = ((k30) obj2).e();
                gxVarE2.b().b(new lxe(i2, 11));
                break;
            default:
                sf5.h0(obj);
                a80 a80Var = (a80) obj2;
                a80.a(a80Var);
                Object objD = a80Var.d(this.G);
                a80Var.c.F.setValue(objD);
                a80Var.e.setValue(objD);
                break;
        }
        return ieiVar;
    }
}
