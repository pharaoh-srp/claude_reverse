package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gdj {
    public static final WeakHashMap x = new WeakHashMap();
    public final w70 a;
    public final w70 b;
    public final w70 c;
    public final w70 d;
    public final w70 e;
    public final w70 f;
    public final w70 g;
    public final w70 h;
    public final w70 i;
    public final ari j;
    public final lsc k;
    public final fei l;
    public final fei m;
    public final ari n;
    public final ari o;
    public final ari p;
    public final ari q;
    public final ari r;
    public final ari s;
    public final ari t;
    public final boolean u;
    public int v;
    public final j59 w;

    public gdj(View view) {
        w70 w70VarB = s4i.b(4, "captionBar");
        this.a = w70VarB;
        w70 w70VarB2 = s4i.b(FreeTypeConstants.FT_LOAD_PEDANTIC, "displayCutout");
        this.b = w70VarB2;
        w70 w70VarB3 = s4i.b(8, "ime");
        this.c = w70VarB3;
        w70 w70VarB4 = s4i.b(32, "mandatorySystemGestures");
        this.d = w70VarB4;
        w70 w70VarB5 = s4i.b(2, "navigationBars");
        this.e = w70VarB5;
        w70 w70VarB6 = s4i.b(1, "statusBars");
        this.f = w70VarB6;
        w70 w70VarB7 = s4i.b(519, "systemBars");
        this.g = w70VarB7;
        w70 w70VarB8 = s4i.b(16, "systemGestures");
        this.h = w70VarB8;
        w70 w70VarB9 = s4i.b(64, "tappableElement");
        this.i = w70VarB9;
        ari ariVar = new ari(new o59(0, 0, 0, 0), "waterfall");
        this.j = ariVar;
        this.k = mpk.P(null);
        fei feiVar = new fei(new fei(w70VarB7, w70VarB3), w70VarB2);
        this.l = feiVar;
        this.m = new fei(feiVar, new fei(new fei(new fei(w70VarB9, w70VarB4), w70VarB8), ariVar));
        this.n = s4i.c(4, "captionBarIgnoringVisibility");
        this.o = s4i.c(2, "navigationBarsIgnoringVisibility");
        this.p = s4i.c(1, "statusBarsIgnoringVisibility");
        this.q = s4i.c(519, "systemBarsIgnoringVisibility");
        this.r = s4i.c(64, "tappableElementIgnoringVisibility");
        this.s = new ari(new o59(0, 0, 0, 0), "imeAnimationTarget");
        this.t = new ari(new o59(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.u = bool != null ? bool.booleanValue() : false;
        this.w = new j59(this);
        WeakHashMap weakHashMap = mvi.a;
        bdj bdjVarA = gvi.a(view);
        if (bdjVarA != null) {
            xcj xcjVar = bdjVarA.a;
            w70VarB.f(xcjVar.u(4));
            w70VarB2.f(xcjVar.u(FreeTypeConstants.FT_LOAD_PEDANTIC));
            w70VarB3.f(xcjVar.u(8));
            w70VarB4.f(xcjVar.u(32));
            w70VarB5.f(xcjVar.u(2));
            w70VarB6.f(xcjVar.u(1));
            w70VarB7.f(xcjVar.u(519));
            w70VarB8.f(xcjVar.u(16));
            w70VarB9.f(xcjVar.u(64));
        }
    }

    public static void b(gdj gdjVar, bdj bdjVar) {
        boolean z = false;
        gdjVar.a.g(bdjVar, 0);
        gdjVar.c.g(bdjVar, 0);
        gdjVar.b.g(bdjVar, 0);
        gdjVar.e.g(bdjVar, 0);
        gdjVar.f.g(bdjVar, 0);
        gdjVar.g.g(bdjVar, 0);
        gdjVar.h.g(bdjVar, 0);
        gdjVar.i.g(bdjVar, 0);
        gdjVar.d.g(bdjVar, 0);
        gdjVar.n.f(ndj.b(bdjVar.a.j(4)));
        gdjVar.o.f(ndj.b(bdjVar.a.j(2)));
        gdjVar.p.f(ndj.b(bdjVar.a.j(1)));
        gdjVar.q.f(ndj.b(bdjVar.a.j(519)));
        gdjVar.r.f(ndj.b(bdjVar.a.j(64)));
        j86 j86VarH = bdjVar.a.h();
        gdjVar.j.f(ndj.b(j86VarH != null ? j86VarH.a() : f59.e));
        c40 c40Var = null;
        if (j86VarH != null) {
            Path pathA = Build.VERSION.SDK_INT >= 31 ? i86.a(j86VarH.a) : null;
            if (pathA != null) {
                c40Var = new c40(pathA);
            }
        }
        gdjVar.k.setValue(c40Var);
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

    public final void a(View view) {
        if (this.v == 0) {
            WeakHashMap weakHashMap = mvi.a;
            j59 j59Var = this.w;
            fvi.c(view, j59Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(j59Var);
            mvi.j(view, j59Var);
        }
        this.v++;
    }
}
