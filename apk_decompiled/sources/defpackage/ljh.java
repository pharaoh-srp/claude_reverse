package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ljh implements x5d {
    public final View a;
    public final fj0 b;
    public final mjh c;
    public boolean d;
    public bz7 e;
    public bz7 f;
    public cjh g;
    public xy8 h;
    public final ArrayList i;
    public final kw9 j;
    public Rect k;
    public final md5 l;
    public final wwb m;
    public y0 n;

    public ljh(View view, AndroidComposeView androidComposeView) {
        fj0 fj0Var = new fj0();
        fj0Var.E = view;
        l4 l4Var = new l4(17, fj0Var);
        w1a w1aVar = w1a.G;
        fj0Var.F = yb5.w(w1aVar, l4Var);
        fj0Var.G = new efe(view);
        mjh mjhVar = new mjh(Choreographer.getInstance());
        this.a = view;
        this.b = fj0Var;
        this.c = mjhVar;
        this.e = lxe.L;
        this.f = lxe.M;
        this.g = new cjh("", kkh.b, 4);
        this.h = xy8.g;
        this.i = new ArrayList();
        this.j = yb5.w(w1aVar, new x7f(4, this));
        this.l = new md5(androidComposeView, fj0Var);
        this.m = new wwb(0, new kjh[16]);
    }

    @Override // defpackage.x5d
    public final void a() {
        i(kjh.E);
    }

    @Override // defpackage.x5d
    public final void b() {
        i(kjh.G);
    }

    @Override // defpackage.x5d
    public final void c() {
        this.d = false;
        this.e = pgg.H;
        this.f = pgg.I;
        this.k = null;
        i(kjh.F);
    }

    @Override // defpackage.x5d
    public final void d(cjh cjhVar, xy8 xy8Var, f2d f2dVar, u25 u25Var) {
        this.d = true;
        this.g = cjhVar;
        this.h = xy8Var;
        this.e = f2dVar;
        this.f = u25Var;
        i(kjh.E);
    }

    @Override // defpackage.x5d
    public final void e(cjh cjhVar, cjh cjhVar2) {
        boolean z = (kkh.c(this.g.b, cjhVar2.b) && x44.r(this.g.c, cjhVar2.c)) ? false : true;
        this.g = cjhVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            g9e g9eVar = (g9e) ((WeakReference) this.i.get(i)).get();
            if (g9eVar != null) {
                g9eVar.d(cjhVar2);
            }
        }
        md5 md5Var = this.l;
        synchronized (md5Var.c) {
            md5Var.j = null;
            md5Var.l = null;
            md5Var.k = null;
            md5Var.m = ex.h0;
            md5Var.n = null;
            md5Var.o = null;
        }
        if (x44.r(cjhVar, cjhVar2)) {
            if (z) {
                fj0 fj0Var = this.b;
                int iG = kkh.g(cjhVar2.b);
                int iF = kkh.f(cjhVar2.b);
                kkh kkhVar = this.g.c;
                int iG2 = kkhVar != null ? kkh.g(kkhVar.a) : -1;
                kkh kkhVar2 = this.g.c;
                ((InputMethodManager) ((kw9) fj0Var.F).getValue()).updateSelection((View) fj0Var.E, iG, iF, iG2, kkhVar2 != null ? kkh.f(kkhVar2.a) : -1);
                return;
            }
            return;
        }
        if (cjhVar != null && (!x44.r(cjhVar.a.F, cjhVar2.a.F) || (kkh.c(cjhVar.b, cjhVar2.b) && !x44.r(cjhVar.c, cjhVar2.c)))) {
            fj0 fj0Var2 = this.b;
            ((InputMethodManager) ((kw9) fj0Var2.F).getValue()).restartInput((View) fj0Var2.E);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            g9e g9eVar2 = (g9e) ((WeakReference) this.i.get(i2)).get();
            if (g9eVar2 != null) {
                g9eVar2.e(this.g, this.b);
            }
        }
    }

    @Override // defpackage.x5d
    public final void f(cjh cjhVar, occ occVar, yjh yjhVar, u3a u3aVar, l9e l9eVar, l9e l9eVar2) {
        md5 md5Var = this.l;
        synchronized (md5Var.c) {
            try {
                md5Var.j = cjhVar;
                md5Var.l = occVar;
                md5Var.k = yjhVar;
                md5Var.m = u3aVar;
                md5Var.n = l9eVar;
                md5Var.o = l9eVar2;
                if (md5Var.e || md5Var.d) {
                    md5Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.x5d
    public final void g() {
        i(kjh.H);
    }

    @Override // defpackage.x5d
    public final void h(l9e l9eVar) {
        Rect rect;
        this.k = new Rect(mwa.L(l9eVar.a), mwa.L(l9eVar.b), mwa.L(l9eVar.c), mwa.L(l9eVar.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(kjh kjhVar) {
        this.m.b(kjhVar);
        if (this.n == null) {
            y0 y0Var = new y0(11, this);
            this.c.execute(y0Var);
            this.n = y0Var;
        }
    }
}
