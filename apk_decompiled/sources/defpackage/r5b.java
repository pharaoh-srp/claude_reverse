package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r5b {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final wo1 e;
    public final fu9 f;
    public final boolean g = false;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public r5b(int i, int i2, List list, long j, Object obj, wo1 wo1Var, fu9 fu9Var) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = wo1Var;
        this.f = fu9Var;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c3d c3dVar = (c3d) list.get(i3);
            iMax = Math.max(iMax, !this.g ? c3dVar.F : c3dVar.E);
        }
        this.h = iMax;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            c3d c3dVar = (c3d) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                float f = (i2 - c3dVar.E) / 2.0f;
                fu9 fu9Var = this.f;
                fu9 fu9Var2 = fu9.E;
                float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (fu9Var != fu9Var2) {
                    f2 = MTTypesetterKt.kLineSkipLimitMultiplier * (-1.0f);
                }
                iArr[i6] = Math.round((1.0f + f2) * f);
                iArr[i6 + 1] = i;
                i4 = c3dVar.F;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                wo1 wo1Var = this.e;
                if (wo1Var == null) {
                    throw vb7.x("null verticalAlignment");
                }
                iArr[i7] = wo1Var.a(c3dVar.F, i3);
                i4 = c3dVar.E;
            }
            i += i4;
        }
    }
}
