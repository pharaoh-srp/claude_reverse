package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e66 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Date F;
    public final /* synthetic */ long G;

    public /* synthetic */ e66(Date date, long j) {
        this.F = date;
        this.G = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        long j = this.G;
        Date date = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    h66.u(date, j, e18Var, 0);
                }
                break;
            default:
                num.getClass();
                h66.u(date, j, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ e66(Date date, long j, int i) {
        this.F = date;
        this.G = j;
    }
}
