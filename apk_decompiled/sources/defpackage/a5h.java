package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a5h implements gb0 {
    public final dsi a;
    public final c9i b;
    public Object c;
    public Object d;
    public sb0 e;
    public sb0 f;
    public final sb0 g;
    public long h;
    public sb0 i;

    public a5h(mb0 mb0Var, c9i c9iVar, Object obj, Object obj2, sb0 sb0Var) {
        this.a = mb0Var.a(c9iVar);
        this.b = c9iVar;
        this.c = obj2;
        this.d = obj;
        this.e = (sb0) c9iVar.a().invoke(obj);
        this.f = (sb0) c9iVar.a().invoke(obj2);
        this.g = sb0Var != null ? j8.w(sb0Var) : ((sb0) c9iVar.a().invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.gb0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.gb0
    public final long b() {
        if (this.h < 0) {
            this.h = this.a.e(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.gb0
    public final c9i c() {
        return this.b;
    }

    @Override // defpackage.gb0
    public final sb0 d(long j) {
        if (!e(j)) {
            return this.a.f(j, this.e, this.f, this.g);
        }
        sb0 sb0Var = this.i;
        if (sb0Var != null) {
            return sb0Var;
        }
        sb0 sb0VarQ = this.a.q(this.e, this.f, this.g);
        this.i = sb0VarQ;
        return sb0VarQ;
    }

    @Override // defpackage.gb0
    public final Object f(long j) {
        if (e(j)) {
            return this.c;
        }
        sb0 sb0VarP = this.a.p(j, this.e, this.f, this.g);
        int iB = sb0VarP.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(sb0VarP.a(i))) {
                bbd.b("AnimationVector cannot contain a NaN. " + sb0VarP + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b().invoke(sb0VarP);
    }

    @Override // defpackage.gb0
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (x44.r(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (sb0) this.b.a().invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (x44.r(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (sb0) this.b.a().invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
