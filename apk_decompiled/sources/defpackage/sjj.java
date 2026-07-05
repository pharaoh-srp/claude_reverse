package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class sjj {
    public final Path a;
    public final boolean b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final ArrayList q;

    public /* synthetic */ sjj(Path path, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, int i4) {
        this(path, z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? -1L : j4, (i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? -1 : i2, (i4 & 512) != 0 ? -1 : i3, (i4 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : l, (i4 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : l2, (i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : l3, null, null, null);
    }

    public sjj(Path path, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        path.getClass();
        str.getClass();
        this.a = path;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = j4;
        this.i = i2;
        this.j = i3;
        this.k = l;
        this.l = l2;
        this.m = l3;
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = new ArrayList();
    }
}
