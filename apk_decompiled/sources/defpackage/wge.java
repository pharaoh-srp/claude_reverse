package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class wge extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ che G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wge(che cheVar, int i) {
        super(0);
        this.F = i;
        this.G = cheVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        long jG;
        long j;
        int i = this.F;
        float fO = MTTypesetterKt.kLineSkipLimitMultiplier;
        che cheVar = this.G;
        switch (i) {
            case 0:
                bhe bheVarD = cheVar.d();
                if (bheVarD != null) {
                    p0a p0aVar = (p0a) cheVar.a.l().F;
                    int iOrdinal = p0aVar.p.ordinal();
                    if (iOrdinal == 0) {
                        jG = p0aVar.g() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            wg6.i();
                            return null;
                        }
                        jG = p0aVar.g() >> 32;
                    }
                    long jD = bheVarD.d();
                    fO = (((int) jG) - stj.o(hvk.b((int) (jD >> 32), (int) (jD & 4294967295L)), cheVar.f())) - 1.0f;
                }
                return Float.valueOf(fO);
            default:
                bhe bheVarD2 = cheVar.d();
                if (bheVarD2 != null) {
                    long jD2 = bheVarD2.d();
                    float fO2 = stj.o(hvk.b((int) (jD2 >> 32), (int) (jD2 & 4294967295L)), cheVar.f());
                    long jE = bheVarD2.e();
                    int iOrdinal2 = cheVar.f().ordinal();
                    if (iOrdinal2 == 0) {
                        j = jE & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            wg6.i();
                            return null;
                        }
                        j = jE >> 32;
                    }
                    fO = (fO2 + ((int) j)) - 1.0f;
                }
                return Float.valueOf(fO);
        }
    }
}
