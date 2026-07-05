package defpackage;

import android.view.animation.Interpolator;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ke1 {
    public final he1 c;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = MTTypesetterKt.kLineSkipLimitMultiplier;
    public Object e = null;
    public float f = -1.0f;
    public float g = -1.0f;

    public ke1(List list) {
        he1 je1Var;
        if (list.isEmpty()) {
            je1Var = new tqh(24);
        } else {
            je1Var = list.size() == 1 ? new je1(list) : new ie1(list);
        }
        this.c = je1Var;
    }

    public final void a(ge1 ge1Var) {
        this.a.add(ge1Var);
    }

    public final float b() {
        Interpolator interpolator;
        rp9 rp9VarK = this.c.k();
        return (rp9VarK == null || rp9VarK.c() || (interpolator = rp9VarK.d) == null) ? MTTypesetterKt.kLineSkipLimitMultiplier : interpolator.getInterpolation(c());
    }

    public final float c() {
        if (this.b) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        rp9 rp9VarK = this.c.k();
        return rp9VarK.c() ? MTTypesetterKt.kLineSkipLimitMultiplier : (this.d - rp9VarK.b()) / (rp9VarK.a() - rp9VarK.b());
    }

    public Object d() {
        float fC = c();
        he1 he1Var = this.c;
        if (he1Var.i(fC) && !h()) {
            return this.e;
        }
        rp9 rp9VarK = he1Var.k();
        Interpolator interpolator = rp9VarK.e;
        Interpolator interpolator2 = rp9VarK.f;
        Object objE = (interpolator == null || interpolator2 == null) ? e(rp9VarK, b()) : f(rp9VarK, fC, interpolator.getInterpolation(fC), interpolator2.getInterpolation(fC));
        this.e = objE;
        return objE;
    }

    public abstract Object e(rp9 rp9Var, float f);

    public Object f(rp9 rp9Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void g(float f) {
        he1 he1Var = this.c;
        if (he1Var.isEmpty()) {
            return;
        }
        if (this.f == -1.0f) {
            this.f = he1Var.r();
        }
        float f2 = this.f;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f = he1Var.r();
            }
            f = this.f;
        } else {
            if (this.g == -1.0f) {
                this.g = he1Var.q();
            }
            float f3 = this.g;
            if (f > f3) {
                if (f3 == -1.0f) {
                    this.g = he1Var.q();
                }
                f = this.g;
            }
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (!he1Var.l(f)) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((ge1) arrayList.get(i)).a();
            i++;
        }
    }

    public boolean h() {
        return false;
    }
}
