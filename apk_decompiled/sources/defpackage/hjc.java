package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hjc extends dgj {
    public int p;
    public int r;
    public int t;
    public ln7[] o = new ln7[16];
    public int[] q = new int[16];
    public Object[] s = new Object[16];

    public final void X() {
        this.p = 0;
        this.r = 0;
        Arrays.fill(this.s, 0, this.t, (Object) null);
        this.t = 0;
    }

    public final void Y(hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        if (this.p != 0) {
            gjc gjcVar = new gjc(this);
            while (true) {
                hjc hjcVar = gjcVar.d;
                ln7 ln7Var = hjcVar.o[gjcVar.a];
                y08 y08VarD = ln7Var.d(gjcVar);
                hn0 hn0Var2 = hn0Var;
                vag vagVar2 = vagVar;
                p60 p60Var2 = p60Var;
                fjc fjcVar2 = fjcVar;
                try {
                    ln7Var.c(gjcVar, hn0Var2, vagVar2, p60Var2, fjcVar2);
                    int i = gjcVar.a;
                    int i2 = hjcVar.p;
                    if (i < i2) {
                        ln7 ln7Var2 = hjcVar.o[i];
                        gjcVar.b += ln7Var2.b;
                        gjcVar.c += ln7Var2.c;
                        int i3 = i + 1;
                        gjcVar.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        hn0Var = hn0Var2;
                        vagVar = vagVar2;
                        p60Var = p60Var2;
                        fjcVar = fjcVar2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    wvk.d(th, fjcVar2, vagVar2, y08VarD);
                    throw th;
                }
            }
        }
        X();
    }

    public final boolean Z() {
        return this.p == 0;
    }

    public final void a0(ln7 ln7Var) {
        int i = this.p;
        ln7[] ln7VarArr = this.o;
        int length = ln7VarArr.length;
        int i2 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i == length) {
            ln7[] ln7VarArr2 = new ln7[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(ln7VarArr, 0, ln7VarArr2, 0, i);
            this.o = ln7VarArr2;
        }
        int i3 = this.r;
        int i4 = ln7Var.b;
        int i5 = ln7Var.c;
        int i6 = i3 + i4;
        int[] iArr = this.q;
        int length2 = iArr.length;
        if (i6 > length2) {
            int i7 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i7 >= i6) {
                i6 = i7;
            }
            int[] iArr2 = new int[i6];
            mp0.r0(0, 0, length2, iArr, iArr2);
            this.q = iArr2;
        }
        int i8 = this.t + i5;
        Object[] objArr = this.s;
        int length3 = objArr.length;
        if (i8 > length3) {
            if (length3 <= 1024) {
                i2 = length3;
            }
            int i9 = i2 + length3;
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] objArr2 = new Object[i8];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.s = objArr2;
        }
        ln7[] ln7VarArr3 = this.o;
        int i10 = this.p;
        this.p = i10 + 1;
        ln7VarArr3[i10] = ln7Var;
        this.r += ln7Var.b;
        this.t += i5;
    }
}
