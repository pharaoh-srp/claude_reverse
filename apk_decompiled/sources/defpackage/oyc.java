package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes3.dex */
public class oyc extends kyc {
    public final myc H;
    public Object I;
    public boolean J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyc(myc mycVar, y6i[] y6iVarArr) {
        super(mycVar.G, y6iVarArr);
        mycVar.getClass();
        this.H = mycVar;
        this.K = mycVar.I;
    }

    public final void d(int i, w6i w6iVar, Object obj, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2 * 5;
        y6i[] y6iVarArr = this.E;
        if (i5 <= 30) {
            int iZ = 1 << iv1.z(i, i5);
            if (!w6iVar.i(iZ)) {
                int iT = w6iVar.t(iZ);
                w6i w6iVarS = w6iVar.s(iT);
                y6i y6iVar = y6iVarArr[i2];
                Object[] objArr = w6iVar.d;
                int iBitCount = Integer.bitCount(w6iVar.a) * 2;
                y6iVar.getClass();
                objArr.getClass();
                y6iVar.E = objArr;
                y6iVar.F = iBitCount;
                y6iVar.G = iT;
                d(i, w6iVarS, obj, i2 + 1, i3, z);
                return;
            }
            int iF = w6iVar.f(iZ);
            if (iZ == (z ? 1 << iv1.z(i3, i5) : 0) && i2 < (i4 = this.F)) {
                y6i y6iVar2 = y6iVarArr[i4];
                Object[] objArr2 = w6iVar.d;
                Object[] objArr3 = {objArr2[iF], objArr2[iF + 1]};
                y6iVar2.getClass();
                y6iVar2.E = objArr3;
                y6iVar2.F = 2;
                y6iVar2.G = 0;
                return;
            }
            y6i y6iVar3 = y6iVarArr[i2];
            Object[] objArr4 = w6iVar.d;
            int iBitCount2 = Integer.bitCount(w6iVar.a) * 2;
            y6iVar3.getClass();
            objArr4.getClass();
            y6iVar3.E = objArr4;
            y6iVar3.F = iBitCount2;
            y6iVar3.G = iF;
            this.F = i2;
            return;
        }
        y6i y6iVar4 = y6iVarArr[i2];
        Object[] objArr5 = w6iVar.d;
        int length = objArr5.length;
        y6iVar4.getClass();
        y6iVar4.E = objArr5;
        y6iVar4.F = length;
        y6iVar4.G = 0;
        while (true) {
            y6i y6iVar5 = y6iVarArr[i2];
            if (x44.r(y6iVar5.E[y6iVar5.G], obj)) {
                this.F = i2;
                return;
            } else {
                y6iVarArr[i2].G += 2;
            }
        }
    }

    @Override // defpackage.kyc, java.util.Iterator
    public final Object next() {
        if (this.H.I != this.K) {
            sz6.c();
            return null;
        }
        if (!this.G) {
            pmf.d();
            return null;
        }
        y6i y6iVar = this.E[this.F];
        this.I = y6iVar.E[y6iVar.G];
        this.J = true;
        return super.next();
    }

    @Override // defpackage.kyc, java.util.Iterator
    public final void remove() {
        oyc oycVar;
        if (!this.J) {
            e0.b();
            return;
        }
        boolean z = this.G;
        myc mycVar = this.H;
        if (!z) {
            oycVar = this;
            nai.l(mycVar).remove(oycVar.I);
        } else {
            if (!z) {
                pmf.d();
                return;
            }
            y6i y6iVar = this.E[this.F];
            Object obj = y6iVar.E[y6iVar.G];
            nai.l(mycVar).remove(this.I);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            w6i w6iVar = mycVar.G;
            Object obj2 = this.I;
            oycVar = this;
            oycVar.d(iHashCode, w6iVar, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        oycVar.I = null;
        oycVar.J = false;
        oycVar.K = mycVar.I;
    }
}
