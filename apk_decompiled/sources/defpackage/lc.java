package defpackage;

import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
public final class lc implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ua2 F;

    public /* synthetic */ lc(ua2 ua2Var, int i) {
        this.E = i;
        this.F = ua2Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ua2 ua2Var = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ua2Var.resumeWith(bool);
                break;
            case 1:
                ua2Var.resumeWith((Location) obj);
                break;
            default:
                ua2Var.resumeWith((Location) obj);
                break;
        }
        return ieiVar;
    }
}
