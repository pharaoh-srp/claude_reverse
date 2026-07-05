package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class e59 {
    public static final e59 e = new e59(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public e59(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        return this.a + this.c;
    }

    public final float b(w5b w5bVar) {
        w5bVar.getClass();
        return w5bVar.b(w5bVar.g() ? this.a : this.c);
    }

    public final float c(w5b w5bVar) {
        w5bVar.getClass();
        return w5bVar.b(w5bVar.g() ? this.c : this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e59)) {
            return false;
        }
        e59 e59Var = (e59) obj;
        return this.a == e59Var.a && this.b == e59Var.b && this.c == e59Var.c && this.d == e59Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
