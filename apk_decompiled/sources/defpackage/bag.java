package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bag implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mag F;

    public /* synthetic */ bag(mag magVar, int i) {
        this.E = i;
        this.F = magVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Throwable {
        int i;
        int i2 = this.E;
        iei ieiVar = iei.a;
        mag magVar = this.F;
        switch (i2) {
            case 0:
                hsc hscVar = magVar.d;
                float fFloatValue = ((Float) obj).floatValue();
                fq3 fq3Var = magVar.c;
                float fFloatValue2 = Float.valueOf(fq3Var.E).floatValue();
                float f = fq3Var.F;
                float fD0 = wd6.d0(fFloatValue, fFloatValue2, Float.valueOf(f).floatValue());
                int i3 = magVar.a;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fD0;
                    float f2 = fAbs;
                    int i4 = 0;
                    while (true) {
                        float fW = d4c.W(Float.valueOf(fq3Var.E).floatValue(), Float.valueOf(f).floatValue(), i4 / i);
                        float f3 = fW - fD0;
                        if (Math.abs(f3) <= fAbs) {
                            fAbs = Math.abs(f3);
                            f2 = fW;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            fD0 = f2;
                        }
                    }
                }
                if (fD0 != hscVar.h()) {
                    if (fD0 != hscVar.h()) {
                        bz7 bz7Var = magVar.e;
                        if (bz7Var != null) {
                            bz7Var.invoke(Float.valueOf(fD0));
                        } else {
                            magVar.d(fD0);
                        }
                    }
                    zy7 zy7Var = magVar.b;
                    if (zy7Var != null) {
                        zy7Var.a();
                    }
                    z = true;
                }
                break;
            case 1:
                Float f4 = (Float) obj;
                float fFloatValue3 = f4.floatValue();
                bz7 bz7Var2 = magVar.e;
                if (bz7Var2 == null) {
                    magVar.d(fFloatValue3);
                } else {
                    bz7Var2.invoke(f4);
                }
                break;
            case 2:
                g79 g79Var = (g79) obj;
                magVar.k.i((int) (g79Var.a >> 32));
                magVar.l.i((int) (g79Var.a & 4294967295L));
                break;
            default:
                magVar.b(MTTypesetterKt.kLineSkipLimitMultiplier);
                magVar.o.a();
                break;
        }
        return ieiVar;
    }
}
