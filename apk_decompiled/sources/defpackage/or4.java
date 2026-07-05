package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class or4 {
    public final fx4 a;
    public final fx4 b;
    public final float c;
    public final float d;
    public final fx4 e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public or4(fx4 fx4Var, fx4 fx4Var2, float f, float f2, fx4 fx4Var3, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a = fx4Var;
        this.b = fx4Var2;
        this.c = f;
        this.d = f2;
        this.e = fx4Var3;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
    }

    public static or4 a(or4 or4Var, fx4 fx4Var, fx4 fx4Var2, float f, float f2, fx4 fx4Var3, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        if ((i & 1) != 0) {
            fx4Var = or4Var.a;
        }
        fx4 fx4Var4 = fx4Var;
        if ((i & 2) != 0) {
            fx4Var2 = or4Var.b;
        }
        fx4 fx4Var5 = fx4Var2;
        if ((i & 4) != 0) {
            f = or4Var.c;
        }
        return new or4(fx4Var4, fx4Var5, f, (i & 8) != 0 ? or4Var.d : f2, (i & 16) != 0 ? or4Var.e : fx4Var3, (i & 32) != 0 ? or4Var.f : f3, (i & 64) != 0 ? or4Var.g : f4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? or4Var.h : f5, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? or4Var.i : f6, (i & 512) != 0 ? or4Var.j : f7, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? or4Var.k : f8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or4)) {
            return false;
        }
        or4 or4Var = (or4) obj;
        return x44.r(this.a, or4Var.a) && x44.r(this.b, or4Var.b) && Float.compare(this.c, or4Var.c) == 0 && Float.compare(this.d, or4Var.d) == 0 && x44.r(this.e, or4Var.e) && Float.compare(this.f, or4Var.f) == 0 && Float.compare(this.g, or4Var.g) == 0 && Float.compare(this.h, or4Var.h) == 0 && Float.compare(this.i, or4Var.i) == 0 && Float.compare(this.j, or4Var.j) == 0 && Float.compare(this.k, or4Var.k) == 0;
    }

    public final int hashCode() {
        fx4 fx4Var = this.a;
        int iHashCode = (fx4Var == null ? 0 : fx4Var.hashCode()) * 31;
        fx4 fx4Var2 = this.b;
        int iB = vb7.b(this.d, vb7.b(this.c, (iHashCode + (fx4Var2 == null ? 0 : fx4Var2.hashCode())) * 31, 31), 31);
        fx4 fx4Var3 = this.e;
        return Float.hashCode(this.k) + vb7.b(this.j, vb7.b(this.i, vb7.b(this.h, vb7.b(this.g, vb7.b(this.f, (iB + (fx4Var3 != null ? fx4Var3.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ConwayBoxStyle(background=" + this.a + ", borderLeftColor=" + this.b + ", borderLeftWidth=" + this.c + ", cornerRadius=" + this.d + ", textColor=" + this.e + ", opacity=" + this.f + ", fontScale=" + this.g + ", paddingTop=" + this.h + ", paddingStart=" + this.i + ", paddingBottom=" + this.j + ", paddingEnd=" + this.k + ")";
    }
}
