package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xzf {
    public final knk a;
    public c40 b;
    public hr1 c;
    public long d;
    public long e;
    public long f;
    public fu9 g;
    public float h;

    public xzf(knk knkVar) {
        this.a = knkVar;
        int i = d54.i;
        this.d = d54.h;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = fu9.E;
        this.h = 1.0f;
    }

    public abstract void a(cv9 cv9Var, long j, long j2, c40 c40Var);

    public final void b(cv9 cv9Var, hr1 hr1Var, long j, long j2, jy1 jy1Var, float f, int i) {
        ib2 ib2Var = cv9Var.E;
        knk knkVar = this.a;
        hr1 hr1Var2 = null;
        if (knkVar instanceof elc) {
            this.b = ((elc) knkVar).k;
            this.e = 0L;
        } else if (knkVar instanceof glc) {
            glc glcVar = (glc) knkVar;
            sve sveVar = glcVar.k;
            if (gb9.A(sveVar)) {
                this.b = null;
                this.e = sveVar.e;
            } else {
                this.b = glcVar.l;
                this.e = 0L;
            }
        } else if (!(knkVar instanceof flc)) {
            mr9.b();
            return;
        } else {
            this.b = null;
            this.e = 0L;
        }
        if (hr1Var != null) {
            hr1Var2 = hr1Var;
        } else if (jy1Var == null && j2 != 16) {
            hr1 hr1Var3 = this.c;
            if (hr1Var3 == null || !d54.c(this.d, j2)) {
                hr1Var3 = new hr1(j2, 5);
                this.d = j2;
                this.c = hr1Var3;
            }
            hr1Var2 = hr1Var3;
        }
        long j3 = this.f;
        if (j3 == 9205357640488583168L || !k8g.b(j3, j) || this.g != cv9Var.getLayoutDirection() || this.h != ib2Var.getDensity()) {
            a(cv9Var, j, this.e, this.b);
            this.f = j;
            this.g = cv9Var.getLayoutDirection();
            this.h = ib2Var.getDensity();
        }
        c(cv9Var, this.e, this.b, f, hr1Var2, jy1Var, i);
    }

    public abstract void c(cv9 cv9Var, long j, c40 c40Var, float f, hr1 hr1Var, jy1 jy1Var, int i);
}
