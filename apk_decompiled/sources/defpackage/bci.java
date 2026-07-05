package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class bci {
    public static final cci a;

    static {
        yb5.x(new nlh(27));
        a = new cci();
    }

    public static final tkh a(aci aciVar, ld4 ld4Var) {
        zbi zbiVar = ((gwa) ((e18) ld4Var).j(jwa.a)).b;
        switch (aciVar.ordinal()) {
            case 0:
                return zbiVar.j;
            case 1:
                return zbiVar.k;
            case 2:
                return zbiVar.l;
            case 3:
                return zbiVar.a;
            case 4:
                return zbiVar.b;
            case 5:
                return zbiVar.c;
            case 6:
                return zbiVar.d;
            case 7:
                return zbiVar.e;
            case 8:
                return zbiVar.f;
            case 9:
                return zbiVar.m;
            case 10:
                return zbiVar.n;
            case 11:
                return zbiVar.o;
            case 12:
                return zbiVar.g;
            case 13:
                return zbiVar.h;
            case 14:
                return zbiVar.i;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return zbiVar.y;
            case 16:
                return zbiVar.z;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return zbiVar.A;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return zbiVar.p;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return zbiVar.q;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return zbiVar.r;
            case 21:
                return zbiVar.s;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return zbiVar.t;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return zbiVar.u;
            case 24:
                return zbiVar.B;
            case BuildConfig.VERSION_CODE /* 25 */:
                return zbiVar.C;
            case 26:
                return zbiVar.D;
            case 27:
                return zbiVar.v;
            case 28:
                return zbiVar.w;
            case 29:
                return zbiVar.x;
            default:
                mr9.b();
                return null;
        }
    }
}
