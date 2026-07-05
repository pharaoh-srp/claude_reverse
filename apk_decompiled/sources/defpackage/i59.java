package defpackage;

import android.os.Build;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i59 extends s34 implements Runnable, ldc, View.OnAttachStateChangeListener {
    public boolean G;
    public int H;
    public bdj I;
    public final ewb J;
    public final isc K;
    public final qvb L;
    public final kdg M;

    public i59() {
        super(1);
        ewb ewbVar = new ewb(9);
        jdj.a.getClass();
        ewbVar.m(idj.b, new hej("caption bar"));
        ewbVar.m(idj.c, new hej("display cutout"));
        ewbVar.m(idj.d, new hej("ime"));
        ewbVar.m(idj.e, new hej("mandatory system gestures"));
        ewbVar.m(idj.f, new hej("navigation bars"));
        ewbVar.m(idj.g, new hej("status bars"));
        ewbVar.m(idj.h, new hej("system gestures"));
        ewbVar.m(idj.i, new hej("tappable element"));
        ewbVar.m(idj.j, new hej("waterfall"));
        this.J = ewbVar;
        this.K = new isc(0);
        this.L = new qvb(4);
        this.M = new kdg();
    }

    @Override // defpackage.s34
    public final void a(ecj ecjVar) {
        boolean z = false;
        this.G = false;
        int iD = ecjVar.a.d();
        this.H &= ~iD;
        this.I = null;
        jdj jdjVar = (jdj) ldj.a.b(iD);
        if (jdjVar != null) {
            Object objG = this.J.g(jdjVar);
            objG.getClass();
            hej hejVar = (hej) objG;
            hejVar.c.i(MTTypesetterKt.kLineSkipLimitMultiplier);
            hejVar.e.i(1.0f);
            hejVar.d.i(0L);
            hejVar.c.i(MTTypesetterKt.kLineSkipLimitMultiplier);
            hejVar.b.setValue(Boolean.FALSE);
            hejVar.j = -1L;
            hejVar.k = -1L;
            isc iscVar = this.K;
            iscVar.i(iscVar.h() + 1);
            synchronized (ycg.c) {
                fwb fwbVar = ycg.j.h;
                if (fwbVar != null) {
                    if (fwbVar.i()) {
                        z = true;
                    }
                }
            }
            if (z) {
                ycg.a();
            }
        }
    }

    @Override // defpackage.s34
    public final void b(ecj ecjVar) {
        this.G = true;
    }

    @Override // defpackage.s34
    public final bdj c(bdj bdjVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ecj ecjVar = (ecj) list.get(i);
            jdj jdjVar = (jdj) ldj.a.b(ecjVar.a.d());
            if (jdjVar != null) {
                Object objG = this.J.g(jdjVar);
                objG.getClass();
                hej hejVar = (hej) objG;
                if (((Boolean) hejVar.b.getValue()).booleanValue()) {
                    dcj dcjVar = ecjVar.a;
                    hejVar.c.i(dcjVar.c());
                    hejVar.e.i(dcjVar.a());
                    hejVar.d.i(dcjVar.b());
                }
            }
        }
        f(bdjVar);
        return bdjVar;
    }

    @Override // defpackage.s34
    public final cbf d(ecj ecjVar, cbf cbfVar) {
        bdj bdjVar = this.I;
        boolean z = false;
        this.G = false;
        this.I = null;
        if (ecjVar.a.b() > 0 && bdjVar != null) {
            int iD = ecjVar.a.d();
            this.H |= iD;
            jdj jdjVar = (jdj) ldj.a.b(iD);
            if (jdjVar != null) {
                Object objG = this.J.g(jdjVar);
                objG.getClass();
                hej hejVar = (hej) objG;
                f59 f59VarI = bdjVar.a.i(iD);
                long j = (((long) f59VarI.a) << 48) | (((long) f59VarI.b) << 32) | (((long) f59VarI.c) << 16) | ((long) f59VarI.d);
                long j2 = hejVar.h;
                if (!kxk.r(j, j2)) {
                    hejVar.j = j2;
                    hejVar.k = j;
                    hejVar.b.setValue(Boolean.TRUE);
                    dcj dcjVar = ecjVar.a;
                    hejVar.c.i(dcjVar.c());
                    hejVar.e.i(dcjVar.a());
                    hejVar.d.i(dcjVar.b());
                    isc iscVar = this.K;
                    iscVar.i(iscVar.h() + 1);
                    synchronized (ycg.c) {
                        fwb fwbVar = ycg.j.h;
                        if (fwbVar != null) {
                            if (fwbVar.i()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ycg.a();
                        return cbfVar;
                    }
                }
            }
        }
        return cbfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.bdj r28) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i59.f(bdj):void");
    }

    @Override // defpackage.ldc
    public final bdj j(View view, bdj bdjVar) {
        if (this.G) {
            this.I = bdjVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return bdjVar;
            }
        } else if (this.H == 0) {
            f(bdjVar);
        }
        return bdjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = mvi.a;
        fvi.c(view, this);
        mvi.j(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = mvi.a;
        fvi.c(view, null);
        mvi.j(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.G) {
            this.H = 0;
            this.G = false;
            bdj bdjVar = this.I;
            if (bdjVar != null) {
                f(bdjVar);
                this.I = null;
            }
        }
    }
}
