package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class joa {
    public final u0e a;
    public final dg3 b;
    public final o5l c;
    public final o5l d;
    public ioa[] e;
    public int f;
    public boolean g;
    public int[] h;
    public int i;
    public joa j;

    public joa(joa joaVar) {
        this.e = new ioa[10];
        this.a = joaVar.a;
        this.b = joaVar.b;
        this.c = joaVar.c;
        this.d = joaVar.d;
        this.e = joaVar.e;
        this.f = joaVar.f;
        this.g = joaVar.g;
        this.h = joaVar.h;
        this.i = joaVar.i;
    }

    public final ioa a(o5l o5lVar, int i, int i2, int[] iArr, int i3, ioa ioaVar) {
        ioa ioaVar2;
        int[] iArr2;
        ioa ioaVar3;
        if (i == 0) {
            return ioaVar;
        }
        int[] iArr3 = (int[]) o5lVar.I;
        ioa[] ioaVarArr = (ioa[]) o5lVar.G;
        int[] iArr4 = (int[]) o5lVar.H;
        int i4 = iArr3[i];
        int i5 = o5lVar.F;
        if (i4 < i5 && iArr4[i4] == i) {
            return ioaVar;
        }
        o5lVar.F = i5 + 1;
        iArr3[i] = i5;
        ioaVarArr[i5] = null;
        iArr4[i5] = i;
        s59 s59Var = ((s59[]) this.b.e)[i];
        switch (s59Var.a) {
            case 1:
            case 2:
                return a(o5lVar, s59Var.c, i2, iArr, i3, a(o5lVar, s59Var.b, i2, iArr, i3, ioaVar));
            case 3:
                int i6 = s59Var.c;
                if (i6 >= this.i) {
                    return a(o5lVar, s59Var.b, i2, iArr, i3, ioaVar);
                }
                int i7 = iArr[i6];
                iArr[i6] = i2;
                a(o5lVar, s59Var.b, i2, iArr, i3, null);
                iArr[s59Var.c] = i7;
                return ioaVar;
            case 4:
                return (s59Var.c & (~i3)) == 0 ? a(o5lVar, s59Var.b, i2, iArr, i3, ioaVar) : ioaVar;
            case 5:
                return ioaVar;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                if (ioaVar == null) {
                    int i8 = this.f;
                    if (i8 > 0) {
                        int i9 = i8 - 1;
                        this.f = i9;
                        ioaVar3 = this.e[i9];
                    } else {
                        int length = this.h.length;
                        ioaVar3 = new ioa();
                        ioaVar3.a = new int[length];
                    }
                    ioaVar2 = ioaVar3;
                    ioaVar2.b = s59Var;
                } else {
                    ioaVar.b = s59Var;
                    ioaVar2 = ioaVar;
                }
                int i10 = this.i;
                if (i10 > 0 && (iArr2 = ioaVar2.a) != iArr) {
                    System.arraycopy(iArr, 0, iArr2, 0, i10);
                }
                ioaVarArr[i5] = ioaVar2;
                return null;
            case 7:
                return a(o5lVar, s59Var.b, i2, iArr, i3, ioaVar);
            default:
                sz6.j("unhandled");
                return null;
        }
    }

    public final void b(ioa ioaVar) {
        ioa[] ioaVarArr = this.e;
        if (ioaVarArr.length <= this.f) {
            this.e = (ioa[]) Arrays.copyOf(ioaVarArr, ioaVarArr.length * 2);
        }
        ioa[] ioaVarArr2 = this.e;
        int i = this.f;
        ioaVarArr2[i] = ioaVar;
        this.f = i + 1;
    }

    public final void c(o5l o5lVar, int i) {
        int i2 = this.f + (o5lVar.F - i);
        ioa[] ioaVarArr = this.e;
        if (ioaVarArr.length < i2) {
            this.e = (ioa[]) Arrays.copyOf(ioaVarArr, Math.max(ioaVarArr.length * 2, i2));
        }
        while (i < o5lVar.F) {
            ioa ioaVar = ((ioa[]) o5lVar.G)[i];
            if (ioaVar != null) {
                ioa[] ioaVarArr2 = this.e;
                int i3 = this.f;
                ioaVarArr2[i3] = ioaVar;
                this.f = i3 + 1;
            }
            i++;
        }
        o5lVar.F = 0;
    }

    public joa(u0e u0eVar) {
        this.e = new ioa[10];
        dg3 dg3Var = u0eVar.b;
        this.b = dg3Var;
        this.a = u0eVar;
        this.c = new o5l(dg3Var.b, 5);
        this.d = new o5l(dg3Var.b, 5);
        int i = dg3Var.d;
        this.h = new int[i < 2 ? 2 : i];
    }
}
