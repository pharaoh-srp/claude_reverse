package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j59 extends s34 implements Runnable, ldc, View.OnAttachStateChangeListener {
    public final gdj G;
    public boolean H;
    public boolean I;
    public bdj J;

    public j59(gdj gdjVar) {
        super(!gdjVar.u ? 1 : 0);
        this.G = gdjVar;
    }

    @Override // defpackage.s34
    public final void a(ecj ecjVar) {
        this.H = false;
        this.I = false;
        bdj bdjVar = this.J;
        if (ecjVar.a.b() > 0 && bdjVar != null) {
            xcj xcjVar = bdjVar.a;
            gdj gdjVar = this.G;
            gdjVar.t.f(ndj.b(xcjVar.i(8)));
            gdjVar.s.f(ndj.b(xcjVar.i(8)));
            gdj.b(gdjVar, bdjVar);
        }
        this.J = null;
    }

    @Override // defpackage.s34
    public final void b(ecj ecjVar) {
        this.H = true;
        this.I = true;
    }

    @Override // defpackage.s34
    public final bdj c(bdj bdjVar, List list) {
        gdj gdjVar = this.G;
        gdj.b(gdjVar, bdjVar);
        return gdjVar.u ? bdj.b : bdjVar;
    }

    @Override // defpackage.s34
    public final cbf d(ecj ecjVar, cbf cbfVar) {
        this.H = false;
        return cbfVar;
    }

    @Override // defpackage.ldc
    public final bdj j(View view, bdj bdjVar) {
        this.J = bdjVar;
        gdj gdjVar = this.G;
        ari ariVar = gdjVar.s;
        xcj xcjVar = bdjVar.a;
        ariVar.f(ndj.b(xcjVar.i(8)));
        if (this.H) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.I) {
            gdjVar.t.f(ndj.b(xcjVar.i(8)));
            gdj.b(gdjVar, bdjVar);
        }
        return gdjVar.u ? bdj.b : bdjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.H) {
            this.H = false;
            this.I = false;
            bdj bdjVar = this.J;
            if (bdjVar != null) {
                gdj gdjVar = this.G;
                gdjVar.t.f(ndj.b(bdjVar.a.i(8)));
                gdj.b(gdjVar, bdjVar);
                this.J = null;
            }
        }
    }
}
