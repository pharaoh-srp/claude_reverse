package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yn5 implements gb0 {
    public final h61 a;
    public final c9i b;
    public final Object c;
    public final sb0 d;
    public final sb0 e;
    public final sb0 f;
    public final Object g;
    public final long h;

    public yn5(zn5 zn5Var, c9i c9iVar, Object obj, sb0 sb0Var) {
        h61 h61Var = new h61(zn5Var.a);
        this.a = h61Var;
        this.b = c9iVar;
        this.c = obj;
        sb0 sb0Var2 = (sb0) c9iVar.a().invoke(obj);
        this.d = sb0Var2;
        this.e = j8.w(sb0Var);
        this.g = c9iVar.b().invoke(h61Var.a(sb0Var2, sb0Var));
        if (((sb0) h61Var.d) == null) {
            h61Var.d = sb0Var2.c();
        }
        sb0 sb0Var3 = (sb0) h61Var.d;
        if (sb0Var3 == null) {
            x44.o0("velocityVector");
            throw null;
        }
        int iB = sb0Var3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            ro7 ro7Var = (ro7) h61Var.b;
            sb0Var2.getClass();
            jMax = Math.max(jMax, ro7Var.i(sb0Var.a(i)));
        }
        this.h = jMax;
        sb0 sb0VarW = j8.w(this.a.b(jMax, this.d, sb0Var));
        this.f = sb0VarW;
        int iB2 = sb0VarW.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            sb0 sb0Var4 = this.f;
            float fA = sb0Var4.a(i2);
            float f = this.a.a;
            sb0Var4.e(i2, wd6.d0(fA, -f, f));
        }
    }

    @Override // defpackage.gb0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.gb0
    public final long b() {
        return this.h;
    }

    @Override // defpackage.gb0
    public final c9i c() {
        return this.b;
    }

    @Override // defpackage.gb0
    public final sb0 d(long j) {
        if (e(j)) {
            return this.f;
        }
        return this.a.b(j, this.d, this.e);
    }

    @Override // defpackage.gb0
    public final Object f(long j) {
        if (e(j)) {
            return this.g;
        }
        bz7 bz7VarB = this.b.b();
        h61 h61Var = this.a;
        sb0 sb0Var = (sb0) h61Var.c;
        sb0 sb0Var2 = this.d;
        if (sb0Var == null) {
            h61Var.c = sb0Var2.c();
        }
        sb0 sb0Var3 = (sb0) h61Var.c;
        if (sb0Var3 == null) {
            x44.o0("valueVector");
            throw null;
        }
        int iB = sb0Var3.b();
        int i = 0;
        while (true) {
            sb0 sb0Var4 = (sb0) h61Var.c;
            if (i >= iB) {
                if (sb0Var4 != null) {
                    return bz7VarB.invoke(sb0Var4);
                }
                x44.o0("valueVector");
                throw null;
            }
            if (sb0Var4 == null) {
                x44.o0("valueVector");
                throw null;
            }
            sb0Var4.e(i, ((ro7) h61Var.b).t(j, sb0Var2.a(i), this.e.a(i)));
            i++;
        }
    }

    @Override // defpackage.gb0
    public final Object g() {
        return this.g;
    }
}
