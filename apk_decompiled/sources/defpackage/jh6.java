package defpackage;

import android.graphics.Bitmap;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class jh6 extends xzf {
    public final tzf i;
    public final v30 j;
    public r20 k;
    public ee4 l;

    public jh6(tzf tzfVar, knk knkVar) {
        super(knkVar);
        this.i = tzfVar;
        this.j = dch.j();
    }

    @Override // defpackage.xzf
    public final void a(cv9 cv9Var, long j, long j2, c40 c40Var) {
        r20 r20VarC;
        tzf tzfVar = this.i;
        float fQ0 = cv9Var.q0(tzfVar.a);
        float fQ02 = cv9Var.q0(tzfVar.b);
        v30 v30Var = this.j;
        if (c40Var != null) {
            float f = 2.0f * fQ02;
            float f2 = (fQ0 * 2.0f) + f;
            r20VarC = sf5.c((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f2), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f2), 1, 24);
            iz izVarA = j8.a(r20VarC);
            if (fQ02 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                float f3 = fQ02 + fQ0;
                izVarA.n(f3, f3);
                v40.l(v30Var, 0, fQ0 > MTTypesetterKt.kLineSkipLimitMultiplier ? iv1.a(fQ0) : null, 11);
                izVarA.e(c40Var, v30Var);
                v40.l(v30Var, 0, fQ0 > MTTypesetterKt.kLineSkipLimitMultiplier ? iv1.a(fQ0) : null, 3);
                v30Var.l(f);
                izVarA.e(c40Var, v30Var);
            } else {
                v40.l(v30Var, 0, fQ0 > MTTypesetterKt.kLineSkipLimitMultiplier ? iv1.a(fQ0) : null, 11);
                izVarA.n(fQ0, fQ0);
                izVarA.e(c40Var, v30Var);
            }
        } else {
            float f4 = (fQ02 * 2.0f) + (fQ0 * 2.0f);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f4;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f4;
            r20VarC = sf5.c((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1, 24);
            iz izVarA2 = j8.a(r20VarC);
            float f5 = fIntBitsToFloat - fQ0;
            float f6 = fIntBitsToFloat2 - fQ0;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            v40.l(v30Var, 0, fQ0 > MTTypesetterKt.kLineSkipLimitMultiplier ? iv1.a(fQ0) : null, 11);
            izVarA2.a.drawRoundRect(fQ0, fQ0, f5, f6, fIntBitsToFloat3, fIntBitsToFloat4, v30Var.a);
        }
        this.k = r20VarC;
    }

    @Override // defpackage.xzf
    public final void c(cv9 cv9Var, long j, c40 c40Var, float f, hr1 hr1Var, jy1 jy1Var, int i) {
        jy1 jy1VarF = jy1Var;
        ib2 ib2Var = cv9Var.E;
        r20 r20Var = this.k;
        if (r20Var != null) {
            Bitmap bitmap = r20Var.a;
            tzf tzfVar = this.i;
            float f2 = -(cv9Var.q0(tzfVar.b) + cv9Var.q0(tzfVar.a));
            if (jy1VarF == null || hr1Var != null) {
                xd6.e0(cv9Var, r20Var, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), f, hr1Var, i, 8);
                return;
            }
            ee4 ee4Var = this.l;
            if (ee4Var == null || !ee4Var.d().equals(jy1VarF)) {
                ky1 ky1VarF = ssj.f(usj.c(r20Var));
                if (jy1VarF instanceof rzf) {
                    float width = bitmap.getWidth();
                    jy1VarF = ssj.f(((rzf) jy1VarF).c((((long) Float.floatToRawIntBits(bitmap.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)));
                }
                ee4Var = new ee4(ssj.t(ky1VarF), ssj.t(jy1VarF));
                this.l = ee4Var;
            }
            ee4 ee4Var2 = ee4Var;
            ((efe) ib2Var.F.E).G(f2, f2);
            try {
                xd6.S0(cv9Var, ee4Var2, 0L, (((long) Float.floatToRawIntBits(bitmap.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap.getHeight())) & 4294967295L), f, null, null, i, 50);
            } finally {
                float f3 = -f2;
                ((efe) ib2Var.F.E).G(f3, f3);
            }
        }
    }
}
