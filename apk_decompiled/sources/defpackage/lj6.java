package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lj6 {
    public final bi0 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public lj6(zb0 zb0Var, long j) {
        String str = zb0Var.F;
        bi0 bi0Var = new bi0((byte) 0, 2);
        bi0Var.d = str;
        bi0Var.b = -1;
        bi0Var.c = -1;
        this.a = bi0Var;
        this.b = kkh.g(j);
        this.c = kkh.f(j);
        this.d = -1;
        this.e = -1;
        int iG = kkh.g(j);
        int iF = kkh.f(j);
        if (iG < 0 || iG > str.length()) {
            mr9.e(str.length(), vb7.u("start (", iG, ") offset is outside of text region "));
            throw null;
        }
        if (iF < 0 || iF > str.length()) {
            mr9.e(str.length(), vb7.u("end (", iF, ") offset is outside of text region "));
            throw null;
        }
        if (iG <= iF) {
            return;
        }
        sz6.p(grc.o(iG, iF, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jM = mwa.m(i, i2);
        this.a.O(i, i2, "");
        long jG = gvj.g(mwa.m(this.b, this.c), jM);
        h(kkh.g(jG));
        g(kkh.f(jG));
        int i3 = this.d;
        if (i3 != -1) {
            long jG2 = gvj.g(mwa.m(i3, this.e), jM);
            if (kkh.d(jG2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = kkh.g(jG2);
                this.e = kkh.f(jG2);
            }
        }
    }

    public final char b(int i) {
        bi0 bi0Var = this.a;
        z08 z08Var = (z08) bi0Var.e;
        if (z08Var != null && i >= bi0Var.b) {
            int iD = z08Var.d();
            int i2 = bi0Var.b;
            return i < iD + i2 ? z08Var.c(i - i2) : ((String) bi0Var.d).charAt(i - ((iD - bi0Var.c) + i2));
        }
        return ((String) bi0Var.d).charAt(i);
    }

    public final kkh c() {
        int i = this.d;
        if (i != -1) {
            return new kkh(mwa.m(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        bi0 bi0Var = this.a;
        if (i < 0 || i > bi0Var.s()) {
            mr9.e(bi0Var.s(), vb7.u("start (", i, ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > bi0Var.s()) {
            mr9.e(bi0Var.s(), vb7.u("end (", i2, ") offset is outside of text region "));
        } else {
            if (i > i2) {
                sz6.p(grc.o(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            bi0Var.O(i, i2, str);
            h(str.length() + i);
            g(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    public final void e(int i, int i2) {
        bi0 bi0Var = this.a;
        if (i < 0 || i > bi0Var.s()) {
            mr9.e(bi0Var.s(), vb7.u("start (", i, ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > bi0Var.s()) {
            mr9.e(bi0Var.s(), vb7.u("end (", i2, ") offset is outside of text region "));
        } else if (i >= i2) {
            sz6.p(grc.o(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        bi0 bi0Var = this.a;
        if (i < 0 || i > bi0Var.s()) {
            mr9.e(bi0Var.s(), vb7.u("start (", i, ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > bi0Var.s()) {
            mr9.e(bi0Var.s(), vb7.u("end (", i2, ") offset is outside of text region "));
        } else if (i > i2) {
            sz6.p(grc.o(i, i2, "Do not set reversed range: ", " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            c39.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            c39.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
