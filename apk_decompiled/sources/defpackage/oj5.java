package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ oj5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.I;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                ((qj5) obj4).C().n.c((String) obj3, (String) obj2, (Map) obj);
                break;
            default:
                ly7 ly7Var = (ly7) obj3;
                Window window = (Window) obj2;
                Handler handler = (Handler) obj;
                boolean zIsHardwareAccelerated = ((View) obj4).isHardwareAccelerated();
                g99 g99Var = g99.F;
                if (!zIsHardwareAccelerated) {
                    dch.H(ly7Var.F, 4, g99Var, qs7.M, null, false, 56);
                } else {
                    jy7 jy7Var = ly7Var.L;
                    if (jy7Var != null) {
                        try {
                            window.addOnFrameMetricsAvailableListener(jy7Var, handler);
                        } catch (IllegalStateException e) {
                            dch.H(ly7Var.F, 5, g99Var, qs7.N, e, false, 48);
                        }
                    }
                }
                break;
        }
    }
}
