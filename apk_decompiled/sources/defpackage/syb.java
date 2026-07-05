package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class syb {
    public static final /* synthetic */ int a = 0;

    static {
        gb9.b(12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
    }

    public static yq5 a(long j, long j2, long j3, long j4, ld4 ld4Var, int i) {
        long jD = (i & 1) != 0 ? p54.d(ez1.g, ld4Var) : j;
        long j5 = (i & 2) != 0 ? d54.g : j2;
        long jD2 = p54.d(ez1.f, ld4Var);
        long jD3 = (i & 8) != 0 ? p54.d(ez1.m, ld4Var) : j3;
        long jD4 = p54.d(ez1.j, ld4Var);
        long jD5 = p54.d(ez1.n, ld4Var);
        return new yq5(jD2, jD3, jD4, jD5, jD, j5, jD4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? jD5 : j4);
    }
}
