package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r94 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ba4 F;

    public /* synthetic */ r94(ba4 ba4Var, int i) {
        this.E = i;
        this.F = ba4Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 0;
        ba4 ba4Var = this.F;
        switch (i) {
            case 0:
                ba4Var.reportFullyDrawn();
                return iei.a;
            case 1:
                return new xy7(ba4Var.J, new r94(ba4Var, i2));
            case 2:
                b56 b56Var = new b56();
                ba4Var.b().u(b56Var);
                return b56Var;
            case 3:
                return new v5f(ba4Var.getApplication(), ba4Var, ba4Var.getIntent() != null ? ba4Var.getIntent().getExtras() : null);
            default:
                vdc vdcVar = new vdc(new q94(ba4Var, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (x44.r(Looper.myLooper(), Looper.getMainLooper())) {
                        ba4Var.E.a(new s94(vdcVar, i2, ba4Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new j01(ba4Var, 1, vdcVar));
                    }
                }
                return vdcVar;
        }
    }
}
