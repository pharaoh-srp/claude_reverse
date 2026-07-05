package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class u90 implements e0g {
    public final lsc a = mpk.P(new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
    public final /* synthetic */ k90 b;

    public u90(k90 k90Var) {
        this.b = k90Var;
    }

    @Override // defpackage.e0g
    public final knk a(long j, fu9 fu9Var, cz5 cz5Var) {
        k90 k90Var = this.b;
        vve vveVar = k90Var.a;
        k90Var.c = j;
        fq3 fq3Var = new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f);
        lsc lscVar = this.a;
        lscVar.setValue(fq3Var);
        long j2 = k90Var.c;
        cz5 cz5Var2 = k90Var.d;
        a80 a80VarA = k90Var.e;
        if (a80VarA == null) {
            a80VarA = zh4.a(vveVar.a.a(j2, cz5Var2));
            k90Var.e = a80VarA;
        }
        float fFloatValue = ((Number) wd6.i0(Float.valueOf(((Number) a80VarA.e()).floatValue()), (gq3) lscVar.getValue())).floatValue();
        long j3 = k90Var.c;
        cz5 cz5Var3 = k90Var.d;
        a80 a80VarA2 = k90Var.f;
        if (a80VarA2 == null) {
            a80VarA2 = zh4.a(vveVar.b.a(j3, cz5Var3));
            k90Var.f = a80VarA2;
        }
        float fFloatValue2 = ((Number) wd6.i0(Float.valueOf(((Number) a80VarA2.e()).floatValue()), (gq3) lscVar.getValue())).floatValue();
        long j4 = k90Var.c;
        cz5 cz5Var4 = k90Var.d;
        a80 a80VarA3 = k90Var.g;
        if (a80VarA3 == null) {
            a80VarA3 = zh4.a(vveVar.d.a(j4, cz5Var4));
            k90Var.g = a80VarA3;
        }
        float fFloatValue3 = ((Number) wd6.i0(Float.valueOf(((Number) a80VarA3.e()).floatValue()), (gq3) lscVar.getValue())).floatValue();
        long j5 = k90Var.c;
        cz5 cz5Var5 = k90Var.d;
        a80 a80VarA4 = k90Var.h;
        if (a80VarA4 == null) {
            a80VarA4 = zh4.a(vveVar.c.a(j5, cz5Var5));
            k90Var.h = a80VarA4;
        }
        float fFloatValue4 = ((Number) wd6.i0(Float.valueOf(((Number) a80VarA4.e()).floatValue()), (gq3) lscVar.getValue())).floatValue();
        vve vveVar2 = xve.a;
        return new vve(new nzd(fFloatValue), new nzd(fFloatValue2), new nzd(fFloatValue4), new nzd(fFloatValue3)).a(j, fu9Var, cz5Var);
    }
}
