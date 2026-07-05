package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ci4 extends ei4 {
    public final rse e;
    public final rse f;
    public final float[] g;

    public ci4(rse rseVar, rse rseVar2) {
        float[] fArrI;
        super(rseVar2, rseVar, rseVar2, null);
        this.e = rseVar;
        this.f = rseVar2;
        float[] fArr = (float[]) tk5.G.F;
        v9j v9jVar = rseVar.d;
        float[] fArr2 = rseVar.i;
        v9j v9jVar2 = rseVar2.d;
        float[] fArr3 = rseVar2.j;
        if (eve.q(v9jVar, v9jVar2)) {
            fArrI = eve.I(fArr3, fArr2);
        } else {
            float[] fArrA = v9jVar.a();
            float[] fArrA2 = v9jVar2.a();
            v9j v9jVar3 = eve.c;
            fArrI = eve.I(eve.q(v9jVar2, v9jVar3) ? fArr3 : eve.F(eve.I(eve.p(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), rseVar2.i)), eve.q(v9jVar, v9jVar3) ? fArr2 : eve.I(eve.p(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrI;
    }

    @Override // defpackage.ei4
    public final long a(long j) {
        float fH = d54.h(j);
        float fG = d54.g(j);
        float fE = d54.e(j);
        float fD = d54.d(j);
        nse nseVar = this.e.p;
        float fA = (float) nseVar.a(fH);
        float fA2 = (float) nseVar.a(fG);
        float fA3 = (float) nseVar.a(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f2 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        float f3 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
        rse rseVar = this.f;
        float fA4 = (float) rseVar.m.a(f);
        nse nseVar2 = rseVar.m;
        return d4c.l(fA4, (float) nseVar2.a(f2), (float) nseVar2.a(f3), fD, rseVar);
    }
}
