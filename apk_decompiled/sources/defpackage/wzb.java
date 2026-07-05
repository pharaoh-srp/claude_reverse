package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wzb extends kwb {
    public final kwb o;
    public boolean p;

    public wzb(long j, wcg wcgVar, bz7 bz7Var, bz7 bz7Var2, kwb kwbVar) {
        super(j, wcgVar, bz7Var, bz7Var2);
        this.o = kwbVar;
        kwbVar.k();
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.kwb
    public final iuj w() {
        wzb wzbVar;
        kwb kwbVar = this.o;
        if (kwbVar.m || kwbVar.c) {
            return new scg(this);
        }
        fwb fwbVar = this.h;
        long j = this.b;
        HashMap mapB = fwbVar != null ? ycg.b(kwbVar.g(), this, this.o.d()) : null;
        Object obj = ycg.c;
        synchronized (obj) {
            try {
                ycg.c(this);
                if (fwbVar == null || fwbVar.d == 0) {
                    wzbVar = this;
                    wzbVar.a();
                } else {
                    wzbVar = this;
                    iuj iujVarZ = wzbVar.z(this.o.g(), fwbVar, mapB, this.o.d());
                    if (!iujVarZ.equals(tcg.k)) {
                        return iujVarZ;
                    }
                    fwb fwbVarX = wzbVar.o.x();
                    if (fwbVarX != null) {
                        fwbVarX.k(fwbVar);
                    } else {
                        wzbVar.o.B(fwbVar);
                        wzbVar.h = null;
                    }
                }
                if (x44.A(wzbVar.o.g(), j) < 0) {
                    wzbVar.o.v();
                }
                kwb kwbVar2 = wzbVar.o;
                kwbVar2.r(kwbVar2.d().e(j).a(wzbVar.j));
                wzbVar.o.A(j);
                kwb kwbVar3 = wzbVar.o;
                int i = wzbVar.d;
                wzbVar.d = -1;
                if (i >= 0) {
                    int[] iArr = kwbVar3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    kwbVar3.k = iArrCopyOf;
                } else {
                    kwbVar3.getClass();
                }
                kwb kwbVar4 = wzbVar.o;
                wcg wcgVar = wzbVar.j;
                kwbVar4.getClass();
                synchronized (obj) {
                    kwbVar4.j = kwbVar4.j.h(wcgVar);
                    kwb kwbVar5 = wzbVar.o;
                    int[] iArr2 = wzbVar.k;
                    kwbVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = kwbVar5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        kwbVar5.k = iArr2;
                    }
                }
                wzbVar.m = true;
                if (!wzbVar.p) {
                    wzbVar.p = true;
                    wzbVar.o.l();
                }
                return tcg.k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
