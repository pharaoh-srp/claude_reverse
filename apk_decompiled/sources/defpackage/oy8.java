package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oy8 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final ny8 j;
    public boolean k;

    public oy8(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? d54.h : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ny8 ny8Var = new ny8(null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 1023);
        this.j = ny8Var;
        arrayList.add(ny8Var);
    }

    public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        if (this.k) {
            b39.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.i.add(new ny8(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, jy1 jy1Var, jy1 jy1Var2, String str, List list) {
        if (this.k) {
            b39.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((ny8) this.i.get(r0.size() - 1)).j.add(new csi(f, f2, f3, f4, f5, f6, f7, i, i2, i3, jy1Var, jy1Var2, str, list));
    }

    public final py8 e() {
        if (this.k) {
            b39.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.i.size() > 1) {
            f();
        }
        ny8 ny8Var = this.j;
        py8 py8Var = new py8(this.a, this.b, this.c, this.d, this.e, new zri(ny8Var.a, ny8Var.b, ny8Var.c, ny8Var.d, ny8Var.e, ny8Var.f, ny8Var.g, ny8Var.h, ny8Var.i, ny8Var.j), this.f, this.g, this.h);
        this.k = true;
        return py8Var;
    }

    public final void f() {
        if (this.k) {
            b39.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.i;
        ny8 ny8Var = (ny8) arrayList.remove(arrayList.size() - 1);
        ((ny8) arrayList.get(arrayList.size() - 1)).j.add(new zri(ny8Var.a, ny8Var.b, ny8Var.c, ny8Var.d, ny8Var.e, ny8Var.f, ny8Var.g, ny8Var.h, ny8Var.i, ny8Var.j));
    }
}
