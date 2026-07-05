package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlinx.serialization.modules.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class bx extends ts9 implements bz7 {
    public static final bx G;
    public static final bx H;
    public static final bx I;
    public static final bx J;
    public static final bx K;
    public static final bx L;
    public static final bx M;
    public static final bx N;
    public static final bx O;
    public static final bx P;
    public static final bx Q;
    public static final bx R;
    public static final bx S;
    public static final bx T;
    public static final bx U;
    public static final bx V;
    public static final bx W;
    public static final bx X;
    public static final bx Y;
    public static final bx Z;
    public static final bx a0;
    public static final bx b0;
    public static final bx c0;
    public static final bx d0;
    public static final bx e0;
    public static final bx f0;
    public static final bx g0;
    public static final bx h0;
    public static final bx i0;
    public static final bx j0;
    public final /* synthetic */ int F;

    static {
        int i = 1;
        G = new bx(i, 0);
        H = new bx(i, 1);
        I = new bx(i, 2);
        J = new bx(i, 3);
        K = new bx(i, 4);
        L = new bx(i, 5);
        M = new bx(i, 6);
        N = new bx(i, 7);
        O = new bx(i, 8);
        P = new bx(i, 9);
        Q = new bx(i, 10);
        R = new bx(i, 11);
        S = new bx(i, 12);
        T = new bx(i, 13);
        U = new bx(i, 14);
        V = new bx(i, 15);
        W = new bx(i, 16);
        X = new bx(i, 17);
        Y = new bx(i, 18);
        Z = new bx(i, 19);
        a0 = new bx(i, 20);
        b0 = new bx(i, 21);
        c0 = new bx(i, 22);
        d0 = new bx(i, 23);
        e0 = new bx(i, 24);
        f0 = new bx(i, 25);
        g0 = new bx(i, 26);
        h0 = new bx(i, 27);
        i0 = new bx(i, 28);
        j0 = new bx(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        h07 h07Var;
        int i = this.F;
        lm6 lm6Var = lm6.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                n7d n7dVar = (n7d) obj;
                n7dVar.getClass();
                w16 w16Var = n7dVar instanceof w16 ? (w16) n7dVar : null;
                if (w16Var != null && (h07Var = ((pff) w16Var).H) != null) {
                    h07Var.e.r(h07.i);
                }
                return ieiVar;
            case 1:
                return Boolean.valueOf(((wjf) obj).k().E.c(akf.B));
            case 2:
                ne4 ne4Var = (ne4) obj;
                ne4Var.u0(w00.a);
                return ((Context) ne4Var.u0(w00.b)).getResources();
            case 3:
                return obj;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 7:
                ((List) obj).getClass();
                return ce0.a;
            case 8:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                a aVar = new a();
                aVar.g(jce.a.b(Object.class), N);
                og9Var.k = aVar.b();
                return ieiVar;
            case 9:
                Class cls = (Class) obj;
                cls.getClass();
                return wd6.k0(i62.a(cls), lm6Var, false, lm6Var);
            case 10:
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 11:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return wd6.k0(i62.a(cls2), lm6Var, true, lm6Var);
            case 12:
                Class cls3 = (Class) obj;
                cls3.getClass();
                return new xl9(cls3);
            case 13:
                Class cls4 = (Class) obj;
                cls4.getClass();
                return new fn9(cls4);
            case 14:
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                long jA = d54.a(((d54) obj).a, t54.x);
                return new rb0(d54.d(jA), d54.h(jA), d54.g(jA), d54.e(jA));
            case 16:
                dd4 dd4Var = (dd4) obj;
                av9 av9Var = dd4Var instanceof av9 ? (av9) dd4Var : null;
                if (av9Var != null && av9Var.u0) {
                    b39.c("Apply is called on deactivated node " + dd4Var);
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(!(((gqb) obj) instanceof id4));
            case g.AVG_FIELD_NUMBER /* 18 */:
                return (eea) w44.K0((Iterable) ((ne4) obj).u0(ve4.o));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                obj.getClass();
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                obj.getClass();
                return ieiVar;
            case 21:
                return obj;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                float[] fArr = ((nwa) obj).a;
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                k99 k99Var = (k99) obj;
                k99Var.getClass();
                return new rl(k99Var);
            case 24:
                String str = (String) obj;
                str.getClass();
                Locale locale = Locale.US;
                return ij0.n(locale, str, locale);
            case BuildConfig.VERSION_CODE /* 25 */:
                String str2 = (String) obj;
                str2.getClass();
                qi2 qi2Var = new qi2();
                Character chC0 = bsg.C0(0, str2);
                if (chC0 == null || !qi2Var.h(chC0.charValue())) {
                    return null;
                }
                return str2;
            case 26:
                String str3 = (String) obj;
                str3.getClass();
                Pattern patternCompile = Pattern.compile("[^a-z0-9_:./-]");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(str3).replaceAll("_");
                strReplaceAll.getClass();
                return strReplaceAll;
            case 27:
                String str4 = (String) obj;
                str4.getClass();
                return bsg.z0(str4, ':') ? vb7.j(1, 0, str4) : str4;
            case 28:
                String str5 = (String) obj;
                str5.getClass();
                return str5.length() > 200 ? str5.substring(0, 200) : str5;
            default:
                n3i n3iVar = (n3i) obj;
                n3iVar.getClass();
                return zk5.a[n3iVar.ordinal()] == 1 ? "B3SINGLE" : n3iVar.name();
        }
    }
}
