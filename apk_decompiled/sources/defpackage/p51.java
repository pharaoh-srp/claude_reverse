package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p51 implements Runnable {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ p51(d87 d87Var, int i, boolean z) {
        this.G = d87Var;
        this.F = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        int i2 = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                r77 r77Var = (r77) ((i49) obj).G;
                String str = tpi.a;
                ig0 ig0Var = r77Var.E.C;
                dp5 dp5Var = new dp5(i2, 2);
                ig0Var.getClass();
                fd9.M(Looper.myLooper() == ((k1h) ig0Var.G).a.getLooper());
                ig0Var.E++;
                ig0Var.p(new fd(ig0Var, 8, dp5Var));
                ig0Var.u(Integer.valueOf(i2));
                break;
            default:
                d87 d87Var = (d87) obj;
                hp5 hp5Var = d87Var.a0;
                int i3 = ((pe1) d87Var.E[i2].e).F;
                hp5Var.H(hp5Var.G(), 1033, new ed5(14));
                break;
        }
    }

    public /* synthetic */ p51(i49 i49Var, int i) {
        this.G = i49Var;
        this.F = i;
    }
}
