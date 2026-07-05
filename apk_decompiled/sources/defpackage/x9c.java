package defpackage;

import android.content.Context;
import android.os.WorkSource;

/* JADX INFO: loaded from: classes3.dex */
public final class x9c implements fri, w9c, fsi, pi6 {
    public static final float[] G = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] H = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    public final /* synthetic */ int E;
    public int F;

    public x9c() {
        this.E = 1;
        this.F = 102;
    }

    @Override // defpackage.w9c
    public String Z() {
        switch (this.E) {
            case 6:
                return vb7.l(this.F, " digits", new StringBuilder("expected at least "));
            default:
                return vb7.l(this.F, " digits", new StringBuilder("expected at most "));
        }
    }

    @Override // defpackage.pi6
    public int b(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.pi6
    public int c(Context context, String str) {
        return this.F;
    }

    public jd5 d() {
        return new jd5(10000L, 0, this.F, Long.MAX_VALUE, false, 0, new WorkSource(null), null);
    }

    @Override // defpackage.dsi
    public sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return sb0Var3;
    }

    public int g() {
        int i = this.F;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0103, code lost:
    
        if (r23.F != r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0105, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0106, code lost:
    
        if (r4 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0108, code lost:
    
        r13 = r13 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010a, code lost:
    
        r13 = r13 + r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008a A[EDGE_INSN: B:107:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float h(int r24, int r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x9c.h(int, int, java.lang.String):float");
    }

    public void i(int i) {
        bsj.b(i);
        this.F = i;
    }

    @Override // defpackage.fsi
    public int k() {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    @Override // defpackage.fri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(com.airbnb.lottie.parser.moshi.a r21, float r22) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x9c.n(com.airbnb.lottie.parser.moshi.a, float):java.lang.Object");
    }

    @Override // defpackage.fsi
    public int o() {
        return 0;
    }

    @Override // defpackage.dsi
    public sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return j < ((long) this.F) * 1000000 ? sb0Var : sb0Var2;
    }

    public /* synthetic */ x9c(int i) {
        this.E = i;
    }

    public /* synthetic */ x9c(int i, int i2) {
        this.E = i2;
        this.F = i;
    }

    public x9c(int i, pl9 pl9Var) {
        this.E = 5;
        this.F = i;
    }
}
