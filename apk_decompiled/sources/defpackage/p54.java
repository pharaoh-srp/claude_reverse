package defpackage;

import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class p54 {
    public static final umg a = new umg(new rk3(7));

    public static final long a(n54 n54Var, long j) {
        long j2 = n54Var.a;
        long j3 = n54Var.U;
        long j4 = n54Var.Q;
        long j5 = n54Var.M;
        long j6 = n54Var.q;
        if (d54.c(j, j2)) {
            return n54Var.b;
        }
        if (d54.c(j, n54Var.f)) {
            return n54Var.g;
        }
        if (d54.c(j, n54Var.j)) {
            return n54Var.k;
        }
        if (d54.c(j, n54Var.n)) {
            return n54Var.o;
        }
        if (d54.c(j, n54Var.w)) {
            return n54Var.x;
        }
        if (d54.c(j, n54Var.c)) {
            return n54Var.d;
        }
        if (d54.c(j, n54Var.h)) {
            return n54Var.i;
        }
        if (d54.c(j, n54Var.l)) {
            return n54Var.m;
        }
        if (d54.c(j, n54Var.y)) {
            return n54Var.z;
        }
        if (d54.c(j, n54Var.u)) {
            return n54Var.v;
        }
        if (d54.c(j, n54Var.p)) {
            return j6;
        }
        if (d54.c(j, n54Var.r)) {
            return n54Var.s;
        }
        if (d54.c(j, n54Var.D) || d54.c(j, n54Var.F) || d54.c(j, n54Var.G) || d54.c(j, n54Var.H) || d54.c(j, n54Var.I) || d54.c(j, n54Var.J) || d54.c(j, n54Var.E)) {
            return j6;
        }
        if (d54.c(j, n54Var.K) || d54.c(j, n54Var.L)) {
            return j5;
        }
        if (d54.c(j, n54Var.O) || d54.c(j, n54Var.P)) {
            return j4;
        }
        if (d54.c(j, n54Var.S) || d54.c(j, n54Var.T)) {
            return j3;
        }
        int i = d54.i;
        return d54.h;
    }

    public static final long b(long j, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(89373914);
        long jA = a(((gwa) e18Var.j(jwa.a)).a, j);
        if (jA == 16) {
            jA = ((d54) e18Var.j(on4.a)).a;
        }
        e18Var.p(false);
        return jA;
    }

    public static final long c(n54 n54Var, o54 o54Var) {
        switch (o54Var.ordinal()) {
            case 0:
                return n54Var.n;
            case 1:
                return n54Var.w;
            case 2:
                return n54Var.y;
            case 3:
                return n54Var.v;
            case 4:
                return n54Var.e;
            case 5:
                return n54Var.u;
            case 6:
                return n54Var.o;
            case 7:
                return n54Var.x;
            case 8:
                return n54Var.z;
            case 9:
                return n54Var.b;
            case 10:
                return n54Var.d;
            case 11:
                return n54Var.M;
            case 12:
                return n54Var.N;
            case 13:
                return n54Var.g;
            case 14:
                return n54Var.i;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return n54Var.Q;
            case 16:
                return n54Var.R;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return n54Var.q;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return n54Var.s;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return n54Var.k;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return n54Var.m;
            case 21:
                return n54Var.U;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return n54Var.V;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return n54Var.A;
            case 24:
                return n54Var.B;
            case BuildConfig.VERSION_CODE /* 25 */:
                return n54Var.a;
            case 26:
                return n54Var.c;
            case 27:
                return n54Var.K;
            case 28:
                return n54Var.L;
            case 29:
                return n54Var.C;
            case 30:
                return n54Var.f;
            case 31:
                return n54Var.h;
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                return n54Var.O;
            case 33:
                return n54Var.P;
            case 34:
                return n54Var.p;
            case 35:
                return n54Var.D;
            case 36:
                return n54Var.F;
            case 37:
                return n54Var.G;
            case 38:
                return n54Var.H;
            case 39:
                return n54Var.I;
            case 40:
                return n54Var.J;
            case 41:
                return n54Var.E;
            case 42:
                return n54Var.t;
            case 43:
                return n54Var.r;
            case 44:
                return n54Var.j;
            case 45:
                return n54Var.l;
            case 46:
                return n54Var.S;
            case 47:
                return n54Var.T;
            default:
                mr9.b();
                return 0L;
        }
    }

    public static final long d(o54 o54Var, ld4 ld4Var) {
        return c(((gwa) ((e18) ld4Var).j(jwa.a)).a, o54Var);
    }
}
