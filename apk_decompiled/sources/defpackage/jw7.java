package defpackage;

import android.text.TextUtils;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class jw7 {
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final f54 E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public int Q;
    public final String a;
    public final String b;
    public final nz8 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final gjb l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final rg6 s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new iw7().a();
        tpi.w(0);
        tpi.w(1);
        tpi.w(2);
        tpi.w(3);
        tpi.w(4);
        ebh.w(5, 6, 7, 8, 9);
        ebh.w(10, 11, 12, 13, 14);
        ebh.w(15, 16, 17, 18, 19);
        ebh.w(20, 21, 22, 23, 24);
        ebh.w(25, 26, 27, 28, 29);
        ebh.w(30, 31, 32, 33, 34);
        tpi.w(35);
        tpi.w(36);
        tpi.w(37);
    }

    public jw7(iw7 iw7Var) {
        boolean z;
        String str;
        this.a = iw7Var.a;
        String strD = tpi.D(iw7Var.d);
        this.d = strD;
        if (iw7Var.c.isEmpty() && iw7Var.b != null) {
            this.c = nz8.u(new rs9(strD, iw7Var.b));
            this.b = iw7Var.b;
        } else if (!iw7Var.c.isEmpty() && iw7Var.b == null) {
            nz8 nz8Var = iw7Var.c;
            this.c = nz8Var;
            Iterator it = nz8Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((rs9) nz8Var.get(0)).b;
                    break;
                }
                rs9 rs9Var = (rs9) it.next();
                if (TextUtils.equals(rs9Var.a, strD)) {
                    str = rs9Var.b;
                    break;
                }
            }
            this.b = str;
        } else if (iw7Var.c.isEmpty() && iw7Var.b == null) {
            z = true;
            fd9.M(z);
            this.c = iw7Var.c;
            this.b = iw7Var.b;
        } else {
            for (int i = 0; i < iw7Var.c.size(); i++) {
                if (((rs9) iw7Var.c.get(i)).b.equals(iw7Var.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            fd9.M(z);
            this.c = iw7Var.c;
            this.b = iw7Var.b;
        }
        this.e = iw7Var.e;
        fd9.L("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", iw7Var.g == 0 || (iw7Var.f & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0);
        this.f = iw7Var.f;
        this.g = iw7Var.g;
        int i2 = iw7Var.h;
        this.h = i2;
        int i3 = iw7Var.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = iw7Var.j;
        this.l = iw7Var.k;
        this.m = iw7Var.l;
        this.n = iw7Var.m;
        this.o = iw7Var.n;
        this.p = iw7Var.o;
        this.q = iw7Var.p;
        List list = iw7Var.q;
        this.r = list == null ? Collections.EMPTY_LIST : list;
        rg6 rg6Var = iw7Var.r;
        this.s = rg6Var;
        this.t = iw7Var.s;
        this.u = iw7Var.t;
        this.v = iw7Var.u;
        this.w = iw7Var.v;
        this.x = iw7Var.w;
        this.y = iw7Var.x;
        this.z = iw7Var.y;
        int i4 = iw7Var.z;
        this.A = i4 == -1 ? 0 : i4;
        float f = iw7Var.A;
        this.B = f == -1.0f ? 1.0f : f;
        this.C = iw7Var.B;
        this.D = iw7Var.C;
        this.E = iw7Var.D;
        this.F = iw7Var.E;
        this.G = iw7Var.F;
        this.H = iw7Var.G;
        this.I = iw7Var.H;
        int i5 = iw7Var.I;
        this.J = i5 == -1 ? 0 : i5;
        int i6 = iw7Var.J;
        this.K = i6 != -1 ? i6 : 0;
        this.L = iw7Var.K;
        this.M = iw7Var.L;
        this.N = iw7Var.M;
        this.O = iw7Var.N;
        int i7 = iw7Var.O;
        if (i7 != 0 || rg6Var == null) {
            this.P = i7;
        } else {
            this.P = 1;
        }
    }

    public static String c(jw7 jw7Var) {
        int i;
        String str;
        String str2;
        if (jw7Var == null) {
            return "null";
        }
        int i2 = jw7Var.e;
        nz8 nz8Var = jw7Var.c;
        String str3 = jw7Var.d;
        int i3 = jw7Var.H;
        int i4 = jw7Var.G;
        int i5 = jw7Var.F;
        float f = jw7Var.z;
        f54 f54Var = jw7Var.E;
        float f2 = jw7Var.B;
        int i6 = jw7Var.y;
        int i7 = jw7Var.x;
        int i8 = jw7Var.w;
        int i9 = jw7Var.v;
        rg6 rg6Var = jw7Var.s;
        String str4 = jw7Var.k;
        int i10 = jw7Var.j;
        String str5 = jw7Var.m;
        String str6 = jw7Var.n;
        int i11 = jw7Var.f;
        wg wgVar = new wg(String.valueOf(','), 12);
        StringBuilder sbO = ij0.o("id=");
        sbO.append(jw7Var.a);
        sbO.append(", mimeType=");
        sbO.append(jw7Var.o);
        if (str6 != null) {
            sbO.append(", container=");
            sbO.append(str6);
        }
        if (str5 != null) {
            sbO.append(", primaryGroupId=");
            sbO.append(str5);
        }
        if (i10 != -1) {
            sbO.append(", bitrate=");
            sbO.append(i10);
        }
        if (str4 != null) {
            sbO.append(", codecs=");
            sbO.append(str4);
        }
        if (rg6Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < rg6Var.H; i12++) {
                UUID uuid = rg6Var.E[i12].F;
                if (uuid.equals(o22.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(o22.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(o22.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(o22.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(o22.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbO.append(", drm=[");
            wgVar.a(sbO, linkedHashSet.iterator());
            sbO.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            ij0.s(i9, i8, ", res=", "x", sbO);
        }
        if (i7 != -1 && i6 != -1) {
            ij0.s(i7, i6, ", decRes=", "x", sbO);
        }
        double d = f2;
        int i13 = ma6.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbO.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = tpi.a;
            sbO.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (f54Var != null) {
            int i14 = f54Var.f;
            int i15 = f54Var.e;
            if ((i15 != -1 && i14 != -1) || f54Var.d()) {
                sbO.append(", color=");
                if (f54Var.d()) {
                    String strB = f54.b(f54Var.a);
                    String strA = f54.a(f54Var.b);
                    String strC = f54.c(f54Var.c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbO.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        if (f != -1.0f) {
            sbO.append(", fps=");
            sbO.append(f);
        }
        if (i5 != -1) {
            sbO.append(", maxSubLayers=");
            sbO.append(i5);
        }
        if (i4 != -1) {
            sbO.append(", channels=");
            sbO.append(i4);
        }
        if (i3 != -1) {
            sbO.append(", sample_rate=");
            sbO.append(i3);
        }
        if (str3 != null) {
            sbO.append(", language=");
            sbO.append(str3);
        }
        boolean zIsEmpty = nz8Var.isEmpty();
        int i16 = 3;
        if (!zIsEmpty) {
            sbO.append(", labels=[");
            wgVar.a(sbO, ywj.l(nz8Var, new rl7(i16)).iterator());
            sbO.append("]");
        }
        if (i2 != 0) {
            sbO.append(", selectionFlags=[");
            String str8 = tpi.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            wgVar.a(sbO, arrayList.iterator());
            sbO.append("]");
        }
        if (i11 != 0) {
            sbO.append(", roleFlags=[");
            String str9 = tpi.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0) {
                arrayList2.add("auxiliary");
            }
            wgVar.a(sbO, arrayList2.iterator());
            sbO.append("]");
        } else {
            i = i11;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0) {
            sbO.append(", auxiliaryTrackType=");
            int i17 = jw7Var.g;
            String str10 = tpi.a;
            if (i17 == 0) {
                str = "undefined";
            } else if (i17 == 1) {
                str = "original";
            } else if (i17 == 2) {
                str = "depth-linear";
            } else if (i17 == 3) {
                str = "depth-inverse";
            } else {
                if (i17 != 4) {
                    sz6.j("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbO.append(str);
        }
        return sbO.toString();
    }

    public final iw7 a() {
        iw7 iw7Var = new iw7();
        iw7Var.a = this.a;
        iw7Var.b = this.b;
        iw7Var.c = this.c;
        iw7Var.d = this.d;
        iw7Var.e = this.e;
        iw7Var.f = this.f;
        iw7Var.h = this.h;
        iw7Var.i = this.i;
        iw7Var.j = this.k;
        iw7Var.k = this.l;
        iw7Var.l = this.m;
        iw7Var.m = this.n;
        iw7Var.n = this.o;
        iw7Var.o = this.p;
        iw7Var.p = this.q;
        iw7Var.q = this.r;
        iw7Var.r = this.s;
        iw7Var.s = this.t;
        iw7Var.t = this.u;
        iw7Var.u = this.v;
        iw7Var.v = this.w;
        iw7Var.w = this.x;
        iw7Var.x = this.y;
        iw7Var.y = this.z;
        iw7Var.z = this.A;
        iw7Var.A = this.B;
        iw7Var.B = this.C;
        iw7Var.C = this.D;
        iw7Var.D = this.E;
        iw7Var.E = this.F;
        iw7Var.F = this.G;
        iw7Var.G = this.H;
        iw7Var.H = this.I;
        iw7Var.I = this.J;
        iw7Var.J = this.K;
        iw7Var.K = this.L;
        iw7Var.L = this.M;
        iw7Var.M = this.N;
        iw7Var.N = this.O;
        iw7Var.O = this.P;
        return iw7Var;
    }

    public final boolean b(jw7 jw7Var) {
        List list = this.r;
        if (list.size() != jw7Var.r.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) jw7Var.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || jw7.class != obj.getClass()) {
            return false;
        }
        jw7 jw7Var = (jw7) obj;
        int i2 = this.Q;
        return (i2 == 0 || (i = jw7Var.Q) == 0 || i2 == i) && this.e == jw7Var.e && this.f == jw7Var.f && this.g == jw7Var.g && this.h == jw7Var.h && this.i == jw7Var.i && this.p == jw7Var.p && this.t == jw7Var.t && this.v == jw7Var.v && this.w == jw7Var.w && this.x == jw7Var.x && this.y == jw7Var.y && this.A == jw7Var.A && this.D == jw7Var.D && this.F == jw7Var.F && this.G == jw7Var.G && this.H == jw7Var.H && this.I == jw7Var.I && this.J == jw7Var.J && this.K == jw7Var.K && this.L == jw7Var.L && this.N == jw7Var.N && this.O == jw7Var.O && this.P == jw7Var.P && Float.compare(this.z, jw7Var.z) == 0 && Float.compare(this.B, jw7Var.B) == 0 && Objects.equals(this.a, jw7Var.a) && Objects.equals(this.b, jw7Var.b) && this.c.equals(jw7Var.c) && Objects.equals(this.k, jw7Var.k) && Objects.equals(this.m, jw7Var.m) && Objects.equals(this.n, jw7Var.n) && Objects.equals(this.o, jw7Var.o) && Objects.equals(this.d, jw7Var.d) && Arrays.equals(this.C, jw7Var.C) && Objects.equals(this.l, jw7Var.l) && Objects.equals(this.E, jw7Var.E) && Objects.equals(this.s, jw7Var.s) && b(jw7Var);
    }

    public final int hashCode() {
        if (this.Q == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            gjb gjbVar = this.l;
            int iHashCode5 = (iHashCode4 + (gjbVar == null ? 0 : gjbVar.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.o;
            this.Q = ((((((((((((((((((((((Float.floatToIntBits(this.B) + ((((Float.floatToIntBits(this.z) + ((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.N) * 31) + this.O) * 31) + this.P;
        }
        return this.Q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.z);
        sb.append(", ");
        sb.append(this.E);
        sb.append("], [");
        sb.append(this.G);
        sb.append(", ");
        return vb7.l(this.H, "])", sb);
    }
}
