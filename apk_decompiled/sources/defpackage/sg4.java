package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class sg4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg4(Context context, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = context;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                sg4 sg4Var = new sg4(this.G, this.H, tp4Var, 0);
                sg4Var.F = obj;
                return sg4Var;
            default:
                sg4 sg4Var2 = new sg4(this.G, this.H, tp4Var, 1);
                sg4Var2.F = obj;
                return sg4Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((sg4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object hreVar;
        Object hreVar2;
        int i = this.E;
        String str = this.H;
        Context context = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                try {
                    hreVar = context.getPackageManager().getApplicationIcon(str);
                    break;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                if (hreVar instanceof hre) {
                    return null;
                }
                return hreVar;
            default:
                sf5.h0(obj);
                try {
                    hreVar2 = context.getPackageManager().getApplicationIcon(str);
                    break;
                } catch (Throwable th2) {
                    hreVar2 = new hre(th2);
                }
                if (hreVar2 instanceof hre) {
                    return null;
                }
                return hreVar2;
        }
    }
}
