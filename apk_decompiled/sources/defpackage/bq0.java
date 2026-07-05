package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bq0 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Context F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ xpa H;
    public final /* synthetic */ zy7 I;

    public /* synthetic */ bq0(nwb nwbVar, xpa xpaVar, Context context, zy7 zy7Var) {
        this.G = nwbVar;
        this.H = xpaVar;
        this.F = context;
        this.I = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Throwable {
        Object hreVar;
        Object hreVar2;
        int i = this.E;
        ozf ozfVar = ozf.F;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.I;
        xpa xpaVar = this.H;
        nwb nwbVar = this.G;
        Context context = this.F;
        tp0 tp0Var = (tp0) obj;
        switch (i) {
            case 0:
                tp0Var.getClass();
                nwbVar.setValue(tp0Var);
                try {
                    xpaVar.t(zr0.c(tp0Var, context));
                    hreVar = ieiVar;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                Throwable thA = jre.a(hreVar);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    nwbVar.setValue(null);
                    List list = xah.a;
                    xah.f(thA, "Failed to launch SAF PDF save picker", ozfVar, null, 24);
                    zy7Var.a();
                }
                return ieiVar;
            default:
                tp0Var.getClass();
                String strA = rq0.a(tp0Var, context);
                if (strA != null) {
                    nwbVar.setValue(tp0Var);
                    try {
                        xpaVar.t(strA);
                        hreVar2 = ieiVar;
                    } catch (Throwable th2) {
                        hreVar2 = new hre(th2);
                    }
                    Throwable thA2 = jre.a(hreVar2);
                    if (thA2 != null) {
                        if (thA2 instanceof CancellationException) {
                            throw thA2;
                        }
                        nwbVar.setValue(null);
                        List list2 = xah.a;
                        xah.f(thA2, "Failed to launch SAF save picker", ozfVar, null, 24);
                        zy7Var.a();
                    }
                }
                return ieiVar;
        }
    }

    public /* synthetic */ bq0(Context context, nwb nwbVar, xpa xpaVar, zy7 zy7Var) {
        this.F = context;
        this.G = nwbVar;
        this.H = xpaVar;
        this.I = zy7Var;
    }
}
