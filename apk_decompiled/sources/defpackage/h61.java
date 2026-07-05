package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class h61 {
    public final float a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public h61(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
        this.d = hj6.I;
        if (context == null) {
            this.e = u31.f;
        }
        this.a = 8.0f;
    }

    public sb0 a(sb0 sb0Var, sb0 sb0Var2) {
        if (((sb0) this.e) == null) {
            this.e = sb0Var.c();
        }
        sb0 sb0Var3 = (sb0) this.e;
        if (sb0Var3 == null) {
            x44.o0("targetVector");
            throw null;
        }
        int iB = sb0Var3.b();
        int i = 0;
        while (true) {
            sb0 sb0Var4 = (sb0) this.e;
            if (i >= iB) {
                if (sb0Var4 != null) {
                    return sb0Var4;
                }
                x44.o0("targetVector");
                throw null;
            }
            if (sb0Var4 == null) {
                x44.o0("targetVector");
                throw null;
            }
            sb0Var4.e(i, ((ro7) this.b).o(sb0Var.a(i), sb0Var2.a(i)));
            i++;
        }
    }

    public sb0 b(long j, sb0 sb0Var, sb0 sb0Var2) {
        if (((sb0) this.d) == null) {
            this.d = sb0Var.c();
        }
        sb0 sb0Var3 = (sb0) this.d;
        if (sb0Var3 == null) {
            x44.o0("velocityVector");
            throw null;
        }
        int iB = sb0Var3.b();
        int i = 0;
        while (true) {
            sb0 sb0Var4 = (sb0) this.d;
            if (i >= iB) {
                if (sb0Var4 != null) {
                    return sb0Var4;
                }
                x44.o0("velocityVector");
                throw null;
            }
            if (sb0Var4 == null) {
                x44.o0("velocityVector");
                throw null;
            }
            ro7 ro7Var = (ro7) this.b;
            sb0Var.getClass();
            sb0Var4.e(i, ro7Var.g(sb0Var2.a(i), j));
            i++;
        }
    }

    public h61(ro7 ro7Var) {
        this.b = ro7Var;
        this.a = ro7Var.f();
    }
}
