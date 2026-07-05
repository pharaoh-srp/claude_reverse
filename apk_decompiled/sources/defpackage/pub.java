package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class pub implements ge2, w5b {
    public final he2 a;
    public final i52 b;
    public final RectF c;
    public final float d;
    public final uub e;
    public final boolean f;
    public final ed2 g;
    public final xd2 h;
    public final boolean i;
    public final fe2 j;
    public final q7d k;

    public pub(RectF rectF, float f, uub uubVar, boolean z, he2 he2Var, ed2 ed2Var, xd2 xd2Var, boolean z2, fe2 fe2Var, q7d q7dVar, i52 i52Var) {
        ed2Var.getClass();
        xd2Var.getClass();
        i52Var.getClass();
        this.a = he2Var;
        this.b = i52Var;
        this.c = rectF;
        this.d = f;
        this.e = uubVar;
        this.f = z;
        this.g = ed2Var;
        this.h = xd2Var;
        this.i = z2;
        this.j = fe2Var;
        this.k = q7dVar;
    }

    @Override // defpackage.w5b
    public final float a(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.ge2
    public final q7d c() {
        return this.k;
    }

    @Override // defpackage.ge2
    public final xd2 d() {
        return this.h;
    }

    @Override // defpackage.w5b
    public final uub e() {
        return this.e;
    }

    @Override // defpackage.ge2
    public final boolean f() {
        return this.i;
    }

    @Override // defpackage.w5b
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.w5b
    public final float getDensity() {
        return this.d;
    }

    @Override // defpackage.w5b
    public final RectF h() {
        return this.c;
    }

    @Override // defpackage.ge2
    public final ed2 i() {
        return this.g;
    }

    @Override // defpackage.w5b
    public final i52 k() {
        return this.b;
    }

    @Override // defpackage.ge2
    public final fe2 m() {
        return this.j;
    }
}
