package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.eve;
import defpackage.fb2;
import defpackage.fu9;
import defpackage.ge6;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.iz;
import defpackage.jz;
import defpackage.k8g;
import defpackage.kw9;
import defpackage.lsc;
import defpackage.mdj;
import defpackage.mee;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.mwa;
import defpackage.p7;
import defpackage.u0h;
import defpackage.u5;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lbpc;", "Lmee;", "drawablepainter_release"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class DrawablePainter extends bpc implements mee {
    public final Drawable J;
    public final lsc K;
    public final lsc L;
    public final u0h M;

    public DrawablePainter(Drawable drawable) {
        drawable.getClass();
        this.J = drawable;
        this.K = mpk.P(0);
        kw9 kw9Var = ge6.a;
        this.L = mpk.P(new k8g((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : eve.i(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.M = new u0h(new p7(21, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.mee
    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mee
    public final void b() {
        Drawable drawable = this.J;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.J.setAlpha(wd6.e0(mwa.L(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.J.setColorFilter(hr1Var != null ? hr1Var.a : null);
        return true;
    }

    @Override // defpackage.bpc
    public final void e(fu9 fu9Var) {
        int i;
        fu9Var.getClass();
        int iOrdinal = fu9Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                mr9.b();
                return;
            }
        } else {
            i = 0;
        }
        this.J.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mee
    public final void g() {
        Drawable.Callback callback = (Drawable.Callback) this.M.getValue();
        Drawable drawable = this.J;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getM() {
        return ((k8g) this.L.getValue()).a;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        fb2 fb2VarP = ib2Var.F.p();
        ((Number) this.K.getValue()).intValue();
        try {
            fb2VarP.g();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.J;
            if (i < 28 || i >= 31 || !u5.l(drawable)) {
                drawable.setBounds(0, 0, mwa.L(k8g.e(ib2Var.g())), mwa.L(k8g.c(ib2Var.g())));
            } else {
                fb2VarP.a(k8g.e(ib2Var.g()) / k8g.e(getM()), k8g.c(ib2Var.g()) / k8g.c(getM()));
            }
            Canvas canvas = jz.a;
            drawable.draw(((iz) fb2VarP).a);
            fb2VarP.p();
        } catch (Throwable th) {
            fb2VarP.p();
            throw th;
        }
    }
}
