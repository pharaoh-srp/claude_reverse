package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class ct5 {
    public final e45 a;
    public final e45 b;
    public final e45 c;
    public final e45 d;
    public final m6c e;
    public final uad f;
    public final Bitmap.Config g;
    public final boolean h;
    public final f52 i;
    public final f52 j;
    public final f52 k;

    public ct5() {
        ft5 ft5Var = g86.a;
        ye8 ye8Var = tpa.a.J;
        vr5 vr5Var = vr5.G;
        Bitmap.Config config = l.b;
        this.a = ye8Var;
        this.b = vr5Var;
        this.c = vr5Var;
        this.d = vr5Var;
        this.e = s5i.a;
        this.f = uad.G;
        this.g = config;
        this.h = true;
        f52 f52Var = f52.ENABLED;
        this.i = f52Var;
        this.j = f52Var;
        this.k = f52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct5)) {
            return false;
        }
        ct5 ct5Var = (ct5) obj;
        return x44.r(this.a, ct5Var.a) && x44.r(this.b, ct5Var.b) && x44.r(this.c, ct5Var.c) && x44.r(this.d, ct5Var.d) && x44.r(this.e, ct5Var.e) && this.f == ct5Var.f && this.g == ct5Var.g && this.h == ct5Var.h && this.i == ct5Var.i && this.j == ct5Var.j && this.k == ct5Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.e.getClass();
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + fsh.p(fsh.p((this.g.hashCode() + ((this.f.hashCode() + ((m6c.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.h), 923521, false)) * 31)) * 31);
    }
}
