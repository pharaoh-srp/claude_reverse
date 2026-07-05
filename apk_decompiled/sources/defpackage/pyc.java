package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public class pyc extends lyc {
    public final nyc H;
    public Object I;
    public boolean J;
    public int K;

    public pyc(nyc nycVar, z6i[] z6iVarArr) {
        super(nycVar.G, z6iVarArr);
        this.H = nycVar;
        this.K = nycVar.I;
    }

    public final void d(int i, x6i x6iVar, Object obj, int i2) {
        int i3 = i2 * 5;
        z6i[] z6iVarArr = this.E;
        if (i3 <= 30) {
            int iM = 1 << ez1.M(i, i3);
            if (x6iVar.h(iM)) {
                z6iVarArr[i2].a(x6iVar.d, Integer.bitCount(x6iVar.a) * 2, x6iVar.f(iM));
                this.F = i2;
                return;
            } else {
                int iT = x6iVar.t(iM);
                x6i x6iVarS = x6iVar.s(iT);
                z6iVarArr[i2].a(x6iVar.d, Integer.bitCount(x6iVar.a) * 2, iT);
                d(i, x6iVarS, obj, i2 + 1);
                return;
            }
        }
        z6i z6iVar = z6iVarArr[i2];
        Object[] objArr = x6iVar.d;
        z6iVar.a(objArr, objArr.length, 0);
        while (true) {
            z6i z6iVar2 = z6iVarArr[i2];
            if (x44.r(z6iVar2.E[z6iVar2.G], obj)) {
                this.F = i2;
                return;
            } else {
                z6iVarArr[i2].G += 2;
            }
        }
    }

    @Override // defpackage.lyc, java.util.Iterator
    public final Object next() {
        if (this.H.I != this.K) {
            sz6.c();
            return null;
        }
        if (!this.G) {
            pmf.d();
            return null;
        }
        z6i z6iVar = this.E[this.F];
        this.I = z6iVar.E[z6iVar.G];
        this.J = true;
        return super.next();
    }

    @Override // defpackage.lyc, java.util.Iterator
    public final void remove() {
        if (!this.J) {
            e0.b();
            return;
        }
        boolean z = this.G;
        nyc nycVar = this.H;
        if (!z) {
            nai.l(nycVar).remove(this.I);
        } else {
            if (!z) {
                pmf.d();
                return;
            }
            z6i z6iVar = this.E[this.F];
            Object obj = z6iVar.E[z6iVar.G];
            nai.l(nycVar).remove(this.I);
            d(obj != null ? obj.hashCode() : 0, nycVar.G, obj, 0);
        }
        this.I = null;
        this.J = false;
        this.K = nycVar.I;
    }
}
