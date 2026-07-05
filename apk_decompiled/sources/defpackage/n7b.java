package defpackage;

import android.text.TextUtils;
import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;
import java.util.Objects;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class n7b {
    public static final n7b B;
    public final nz8 A;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    static {
        m7b m7bVar = new m7b();
        iz8 iz8Var = nz8.F;
        m7bVar.z = vde.I;
        B = new n7b(m7bVar);
        ebh.w(0, 1, 2, 3, 4);
        ebh.w(5, 6, 8, 9, 10);
        ebh.w(11, 12, 13, 14, 15);
        ebh.w(16, 17, 18, 19, 20);
        ebh.w(21, 22, 23, 24, 25);
        ebh.w(26, 27, 28, 29, 30);
        ebh.w(31, 32, 33, 34, 1000);
    }

    public n7b(m7b m7bVar) {
        Boolean boolValueOf = m7bVar.k;
        Integer numValueOf = m7bVar.j;
        Integer numValueOf2 = m7bVar.y;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        case 16:
                        case g.MAX_FIELD_NUMBER /* 17 */:
                        case g.AVG_FIELD_NUMBER /* 18 */:
                        case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 31:
                        case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            i = 3;
                            break;
                        case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case BuildConfig.VERSION_CODE /* 25 */:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = m7bVar.a;
        this.b = m7bVar.b;
        this.c = m7bVar.c;
        this.d = m7bVar.d;
        this.e = m7bVar.e;
        this.f = m7bVar.f;
        this.g = m7bVar.g;
        this.h = m7bVar.h;
        this.i = m7bVar.i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = m7bVar.l;
        this.l = num;
        this.m = num;
        this.n = m7bVar.m;
        this.o = m7bVar.n;
        this.p = m7bVar.o;
        this.q = m7bVar.p;
        this.r = m7bVar.q;
        this.s = m7bVar.r;
        this.t = m7bVar.s;
        this.u = m7bVar.t;
        this.v = m7bVar.u;
        this.w = m7bVar.v;
        this.x = m7bVar.w;
        this.y = m7bVar.x;
        this.z = numValueOf2;
        this.A = m7bVar.z;
    }

    public final m7b a() {
        m7b m7bVar = new m7b();
        m7bVar.a = this.a;
        m7bVar.b = this.b;
        m7bVar.c = this.c;
        m7bVar.d = this.d;
        m7bVar.e = this.e;
        m7bVar.f = this.f;
        m7bVar.g = this.g;
        m7bVar.h = this.h;
        m7bVar.i = this.i;
        m7bVar.j = this.j;
        m7bVar.k = this.k;
        m7bVar.l = this.m;
        m7bVar.m = this.n;
        m7bVar.n = this.o;
        m7bVar.o = this.p;
        m7bVar.p = this.q;
        m7bVar.q = this.r;
        m7bVar.r = this.s;
        m7bVar.s = this.t;
        m7bVar.t = this.u;
        m7bVar.u = this.v;
        m7bVar.v = this.w;
        m7bVar.w = this.x;
        m7bVar.x = this.y;
        m7bVar.y = this.z;
        m7bVar.z = this.A;
        return m7bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n7b.class != obj.getClass()) {
            return false;
        }
        n7b n7bVar = (n7b) obj;
        return TextUtils.equals(this.a, n7bVar.a) && TextUtils.equals(this.b, n7bVar.b) && TextUtils.equals(this.c, n7bVar.c) && TextUtils.equals(this.d, n7bVar.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, n7bVar.e) && Arrays.equals(this.f, n7bVar.f) && Objects.equals(this.g, n7bVar.g) && Objects.equals(this.h, n7bVar.h) && Objects.equals(this.i, n7bVar.i) && Objects.equals(this.j, n7bVar.j) && Objects.equals(this.k, n7bVar.k) && Objects.equals(this.m, n7bVar.m) && Objects.equals(this.n, n7bVar.n) && Objects.equals(this.o, n7bVar.o) && Objects.equals(this.p, n7bVar.p) && Objects.equals(this.q, n7bVar.q) && Objects.equals(this.r, n7bVar.r) && TextUtils.equals(this.s, n7bVar.s) && TextUtils.equals(this.t, n7bVar.t) && TextUtils.equals(this.u, n7bVar.u) && Objects.equals(this.v, n7bVar.v) && Objects.equals(this.w, n7bVar.w) && TextUtils.equals(this.x, n7bVar.x) && TextUtils.equals(null, null) && TextUtils.equals(this.y, n7bVar.y) && Objects.equals(this.z, n7bVar.z) && Objects.equals(this.A, n7bVar.A);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}
