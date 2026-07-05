package defpackage;

import androidx.compose.material3.d;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class due {
    public static final xe4 a = new xe4(new zcd(20));
    public static final xe4 b = new xe4(new u9e(5));
    public static final d c;
    public static final d d;

    static {
        long j = d54.h;
        c = new d(true, Float.NaN, j, null, true, true, true, true);
        d = new d(false, Float.NaN, j, null, true, true, true, true);
    }

    public static d a(boolean z, float f, long j, e0g e0gVar, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? true : z;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        long j2 = (i & 4) != 0 ? d54.h : j;
        e0g e0gVar2 = (i & 8) != 0 ? null : e0gVar;
        boolean z4 = (i & 16) != 0;
        boolean z5 = (i & 32) != 0 ? true : z2;
        boolean z6 = (i & 64) != 0;
        boolean z7 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0;
        return (va6.b(f2, Float.NaN) && d54.c(j2, d54.h) && e0gVar2 == null && z4 && z5 && z6 && z7) ? z3 ? c : d : new d(z3, f2, j2, e0gVar2, z4, z5, z6, z7);
    }
}
