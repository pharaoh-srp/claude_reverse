package defpackage;

import android.graphics.Bitmap;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class b49 extends xzf {
    public final tzf i;
    public final v30 j;
    public ky1 k;
    public ee4 l;

    public b49(tzf tzfVar, knk knkVar) {
        super(knkVar);
        this.i = tzfVar;
        this.j = dch.j();
    }

    @Override // defpackage.xzf
    public final void a(cv9 cv9Var, long j, long j2, c40 c40Var) {
        ky1 ky1Var;
        int i;
        char c;
        v30 v30Var;
        r20 r20VarC;
        tzf tzfVar = this.i;
        float fQ0 = cv9Var.q0(tzfVar.a);
        float fQ02 = cv9Var.q0(tzfVar.b);
        long j3 = tzfVar.c;
        float fQ03 = cv9Var.q0(ya6.a(j3));
        float fQ04 = cv9Var.q0(ya6.b(j3));
        v30 v30Var2 = this.j;
        if (c40Var != null) {
            int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)));
            int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)));
            if (fQ02 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                l9e l9eVarE = c40Var.e();
                c = ' ';
                float f = l9eVarE.c - l9eVarE.a;
                float f2 = l9eVarE.d - l9eVarE.b;
                i = iCeil;
                v30Var = v30Var2;
                r20VarC = sf5.c((int) Math.ceil(f), (int) Math.ceil(f2), 1, 24);
                iz izVarA = j8.a(r20VarC);
                izVarA.e(c40Var, v30Var);
                izVarA.m(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, f2, 1);
                v40.l(v30Var, 0, null, 5);
                v30Var.l(fQ02 * 2.0f);
                izVarA.e(c40Var, v30Var);
            } else {
                i = iCeil;
                c = ' ';
                v30Var = v30Var2;
                r20VarC = null;
            }
            int iCeil3 = ((int) Math.ceil(fQ0)) * 2;
            r20 r20VarC2 = sf5.c(i + iCeil3, iCeil2 + iCeil3, 1, 24);
            Bitmap bitmap = r20VarC2.a;
            iz izVarA2 = j8.a(r20VarC2);
            if (r20VarC != null) {
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                v40.l(v30Var, 0, null, 15);
                izVarA2.a.drawRect(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, width, height, v30Var.a);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fQ03)) << c) | (((long) Float.floatToRawIntBits(fQ04)) & 4294967295L);
                v40.l(v30Var, 11, fQ0 > MTTypesetterKt.kLineSkipLimitMultiplier ? iv1.a(fQ0) : null, 9);
                izVarA2.o(r20VarC, jFloatToRawIntBits, v30Var);
                ky1Var = new ky1(usj.c(r20VarC2));
            } else {
                izVarA2.g();
                izVarA2.n(fQ03, fQ04);
                v40.l(v30Var, 0, fQ0 > MTTypesetterKt.kLineSkipLimitMultiplier ? iv1.a(fQ0) : null, 11);
                izVarA2.e(c40Var, v30Var);
                izVarA2.p();
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                v40.l(v30Var, 11, null, 13);
                izVarA2.a.drawRect(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, width2, height2, v30Var.a);
                ky1Var = new ky1(usj.c(r20VarC2));
            }
        } else {
            r20 r20VarC3 = sf5.c((int) Math.ceil(Float.intBitsToFloat(r2)), (int) Math.ceil(Float.intBitsToFloat(r11)), 1, 24);
            iz izVarA3 = j8.a(r20VarC3);
            float f3 = fQ03 + fQ02;
            float f4 = fQ04 + fQ02;
            float fMax = Math.max(f3, (Float.intBitsToFloat((int) (j >> 32)) + fQ03) - fQ02);
            float fMax2 = Math.max(f4, (Float.intBitsToFloat((int) (j & 4294967295L)) + fQ04) - fQ02);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            v40.l(v30Var2, 0, fQ0 > MTTypesetterKt.kLineSkipLimitMultiplier ? iv1.a(fQ0) : null, 11);
            izVarA3.a.drawRoundRect(f3, f4, fMax, fMax2, fIntBitsToFloat, fIntBitsToFloat2, v30Var2.a);
            Bitmap bitmap2 = r20VarC3.a;
            float width3 = bitmap2.getWidth();
            float height3 = bitmap2.getHeight();
            v40.l(v30Var2, 11, null, 13);
            izVarA3.a.drawRect(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, width3, height3, v30Var2.a);
            ky1Var = new ky1(usj.c(r20VarC3));
        }
        this.k = ky1Var;
    }

    @Override // defpackage.xzf
    public final void c(cv9 cv9Var, long j, c40 c40Var, float f, hr1 hr1Var, jy1 jy1Var, int i) {
        jy1 jy1Var2 = this.k;
        if (jy1Var2 != null) {
            tzf tzfVar = this.i;
            jy1 jy1Var3 = tzfVar.f;
            if (jy1Var3 instanceof rzf) {
                ee4 ee4Var = this.l;
                if (ee4Var == null || !ee4Var.d.equals(jy1Var3)) {
                    ee4Var = new ee4(ssj.t(jy1Var2), ssj.t(jy1Var3));
                    this.l = ee4Var;
                }
                jy1Var2 = ee4Var;
            }
            jy1 jy1Var4 = jy1Var2;
            if (c40Var != null) {
                xd6.Y0(cv9Var, c40Var, jy1Var4, f, null, hr1Var, i, 8);
            } else if (ntk.f(j, 0L)) {
                xd6.S0(cv9Var, jy1Var4, 0L, 0L, f, null, hr1Var, i, 22);
            } else {
                xd6.r0(cv9Var, jy1Var4, 0L, 0L, j, f, null, hr1Var, tzfVar.d, 38);
            }
        }
    }
}
