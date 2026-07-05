package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class p40 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ r9d G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p40(r9d r9dVar, int i) {
        super(1);
        this.F = i;
        this.G = r9dVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        r9d r9dVar = this.G;
        switch (i) {
            case 0:
                cu9 cu9VarA = ((cu9) obj).A();
                cu9VarA.getClass();
                r9dVar.q(cu9VarA);
                break;
            case 1:
                r9dVar.m1204setPopupContentSizefhxjrPA(new g79(((g79) obj).a));
                r9dVar.r();
                break;
            default:
                zy7 zy7Var = (zy7) obj;
                Handler handler = r9dVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = r9dVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b60(5, zy7Var));
                    }
                } else {
                    zy7Var.a();
                }
                break;
        }
        return ieiVar;
    }
}
