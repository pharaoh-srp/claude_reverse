package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public class t9i {
    public final boolean a;
    public final boolean b;
    public final wh3 c;
    public final ds9 d;
    public final es9 e;
    public int f;
    public ArrayDeque g;
    public qbg h;

    public t9i(boolean z, boolean z2, wh3 wh3Var, ds9 ds9Var, es9 es9Var) {
        wh3Var.getClass();
        ds9Var.getClass();
        es9Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = wh3Var;
        this.d = ds9Var;
        this.e = es9Var;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        qbg qbgVar = this.h;
        qbgVar.getClass();
        qbgVar.clear();
    }

    public boolean b(cs9 cs9Var, cs9 cs9Var2) {
        return true;
    }

    public final void c() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            this.h = new qbg();
        }
    }

    public final fhi d(cs9 cs9Var) {
        cs9Var.getClass();
        return this.d.a(cs9Var);
    }

    public final yr9 e(cs9 cs9Var) {
        cs9Var.getClass();
        this.e.getClass();
        return (yr9) cs9Var;
    }
}
