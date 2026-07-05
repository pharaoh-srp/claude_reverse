package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class cp5 {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public ow[] f = new ow[100];

    public final synchronized ow a() {
        ow owVar;
        try {
            int i = this.d + 1;
            this.d = i;
            int i2 = this.e;
            if (i2 > 0) {
                ow[] owVarArr = this.f;
                int i3 = i2 - 1;
                this.e = i3;
                owVar = owVarArr[i3];
                owVar.getClass();
                this.f[this.e] = null;
            } else {
                ow owVar2 = new ow(new byte[this.b], 0);
                ow[] owVarArr2 = this.f;
                if (i > owVarArr2.length) {
                    this.f = (ow[]) Arrays.copyOf(owVarArr2, owVarArr2.length * 2);
                }
                owVar = owVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return owVar;
    }

    public final synchronized void b(hw1 hw1Var) {
        while (hw1Var != null) {
            ow[] owVarArr = this.f;
            int i = this.e;
            this.e = i + 1;
            ow owVar = (ow) hw1Var.G;
            owVar.getClass();
            owVarArr[i] = owVar;
            this.d--;
            hw1Var = (hw1) hw1Var.H;
            if (hw1Var == null || ((ow) hw1Var.G) == null) {
                hw1Var = null;
            }
        }
    }

    public final synchronized void c(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            d();
        }
    }

    public final synchronized void d() {
        int iMax = Math.max(0, tpi.e(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }
}
