package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class md4 {
    public final e18 a;
    public ch2 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final h79 d = new h79(1, false);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public md4(e18 e18Var, ch2 ch2Var) {
        this.a = e18Var;
        this.b = ch2Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            hjc hjcVar = this.b.f;
            hjcVar.a0(djc.d);
            hjcVar.q[hjcVar.r - hjcVar.o[hjcVar.p - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        ch2 ch2Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        ch2Var.getClass();
        if (size != 0) {
            hjc hjcVar2 = ch2Var.f;
            hjcVar2.a0(eic.d);
            zni.X(hjcVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                hjc hjcVar = this.b.f;
                hjcVar.a0(tic.d);
                int i3 = hjcVar.r - hjcVar.o[hjcVar.p - 1].b;
                int[] iArr = hjcVar.q;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                hjc hjcVar2 = this.b.f;
                hjcVar2.a0(pic.d);
                int i6 = hjcVar2.r - hjcVar2.o[hjcVar2.p - 1].b;
                int[] iArr2 = hjcVar2.q;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        rag ragVar = this.a.G;
        int i = z ? ragVar.i : ragVar.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            pd4.a("Tried to seek backward");
        }
        if (i2 > 0) {
            hjc hjcVar = this.b.f;
            hjcVar.a0(xhc.d);
            hjcVar.q[hjcVar.r - hjcVar.o[hjcVar.p - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                pd4.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
