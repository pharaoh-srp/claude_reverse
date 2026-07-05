package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bb8 extends oqi {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = d54.h;
    public List f;
    public boolean g;
    public c40 h;
    public bz7 i;
    public final e0 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public bb8() {
        int i = asi.a;
        this.f = lm6.E;
        this.g = true;
        this.j = new e0(19, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.oqi
    public final void a(xd6 xd6Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = nwa.a();
                this.b = fArrA;
            } else {
                nwa.d(fArrA);
            }
            nwa.i(fArrA, this.q + this.m, this.r + this.n);
            nwa.f(this.l, fArrA);
            nwa.g(fArrA, this.o, this.p);
            nwa.i(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                c40 c40VarA = this.h;
                if (c40VarA == null) {
                    c40VarA = f40.a();
                    this.h = c40VarA;
                }
                sf5.j0(this.f, c40VarA);
            }
            this.g = false;
        }
        fj0 fj0VarB0 = xd6Var.B0();
        long jW = fj0VarB0.w();
        fj0VarB0.p().g();
        try {
            efe efeVar = (efe) fj0VarB0.E;
            float[] fArr = this.b;
            if (fArr != null) {
                ((fj0) efeVar.F).p().k(fArr);
            }
            c40 c40Var = this.h;
            if (!this.f.isEmpty() && c40Var != null) {
                efeVar.j(c40Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((oqi) arrayList.get(i)).a(xd6Var);
            }
            grc.y(fj0VarB0, jW);
        } catch (Throwable th) {
            grc.y(fj0VarB0, jW);
            throw th;
        }
    }

    @Override // defpackage.oqi
    public final bz7 b() {
        return this.i;
    }

    @Override // defpackage.oqi
    public final void d(e0 e0Var) {
        this.i = e0Var;
    }

    public final void e(int i, oqi oqiVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, oqiVar);
        } else {
            arrayList.add(oqiVar);
        }
        g(oqiVar);
        oqiVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = asi.a;
            if (d54.h(j2) == d54.h(j) && d54.g(j2) == d54.g(j) && d54.e(j2) == d54.e(j)) {
                return;
            }
            this.d = false;
            this.e = d54.h;
        }
    }

    public final void g(oqi oqiVar) {
        if (!(oqiVar instanceof puc)) {
            if (oqiVar instanceof bb8) {
                bb8 bb8Var = (bb8) oqiVar;
                if (bb8Var.d && this.d) {
                    f(bb8Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = d54.h;
                    return;
                }
            }
            return;
        }
        puc pucVar = (puc) oqiVar;
        jy1 jy1Var = pucVar.b;
        if (this.d && jy1Var != null) {
            if (jy1Var instanceof eeg) {
                f(((eeg) jy1Var).a);
            } else {
                this.d = false;
                this.e = d54.h;
            }
        }
        jy1 jy1Var2 = pucVar.g;
        if (this.d && jy1Var2 != null) {
            if (jy1Var2 instanceof eeg) {
                f(((eeg) jy1Var2).a);
            } else {
                this.d = false;
                this.e = d54.h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oqi oqiVar = (oqi) arrayList.get(i);
            sb.append("\t");
            sb.append(oqiVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
