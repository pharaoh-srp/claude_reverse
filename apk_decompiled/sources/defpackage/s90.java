package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class s90 implements e0g {
    public final lsc a = mpk.P(new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
    public final /* synthetic */ v90 b;

    public s90(v90 v90Var) {
        this.b = v90Var;
    }

    @Override // defpackage.e0g
    public final knk a(long j, fu9 fu9Var, cz5 cz5Var) {
        v90 v90Var = this.b;
        v90Var.c = j;
        fq3 fq3Var = new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f);
        lsc lscVar = this.a;
        lscVar.setValue(fq3Var);
        vve vveVar = v90Var.a;
        long j2 = v90Var.c;
        cz5 cz5Var2 = v90Var.d;
        a80 a80VarA = v90Var.e;
        if (a80VarA == null) {
            a80VarA = zh4.a(vveVar.a.a(j2, cz5Var2));
            v90Var.e = a80VarA;
        }
        nzd nzdVar = new nzd(((Number) wd6.i0(Float.valueOf(((Number) a80VarA.e()).floatValue()), (gq3) lscVar.getValue())).floatValue());
        long j3 = v90Var.c;
        cz5 cz5Var3 = v90Var.d;
        a80 a80VarA2 = v90Var.f;
        if (a80VarA2 == null) {
            a80VarA2 = zh4.a(vveVar.b.a(j3, cz5Var3));
            v90Var.f = a80VarA2;
        }
        nzd nzdVar2 = new nzd(((Number) wd6.i0(Float.valueOf(((Number) a80VarA2.e()).floatValue()), (gq3) lscVar.getValue())).floatValue());
        long j4 = v90Var.c;
        cz5 cz5Var4 = v90Var.d;
        a80 a80VarA3 = v90Var.g;
        if (a80VarA3 == null) {
            a80VarA3 = zh4.a(vveVar.d.a(j4, cz5Var4));
            v90Var.g = a80VarA3;
        }
        nzd nzdVar3 = new nzd(((Number) wd6.i0(Float.valueOf(((Number) a80VarA3.e()).floatValue()), (gq3) lscVar.getValue())).floatValue());
        long j5 = v90Var.c;
        cz5 cz5Var5 = v90Var.d;
        a80 a80VarA4 = v90Var.h;
        if (a80VarA4 == null) {
            a80VarA4 = zh4.a(vveVar.c.a(j5, cz5Var5));
            v90Var.h = a80VarA4;
        }
        return new vve(nzdVar, nzdVar2, new nzd(((Number) wd6.i0(Float.valueOf(((Number) a80VarA4.e()).floatValue()), (gq3) lscVar.getValue())).floatValue()), nzdVar3).a(j, fu9Var, cz5Var);
    }
}
