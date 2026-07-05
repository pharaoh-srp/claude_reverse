package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Arrays;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class ex extends ts9 implements bz7 {
    public static final ex G;
    public static final ex H;
    public static final ex I;
    public static final ex J;
    public static final ex K;
    public static final ex L;
    public static final ex M;
    public static final ex N;
    public static final ex O;
    public static final ex P;
    public static final ex Q;
    public static final ex R;
    public static final ex S;
    public static final ex T;
    public static final ex U;
    public static final ex V;
    public static final ex W;
    public static final ex X;
    public static final ex Y;
    public static final ex Z;
    public static final ex a0;
    public static final ex b0;
    public static final ex c0;
    public static final ex d0;
    public static final ex e0;
    public static final ex f0;
    public static final ex g0;
    public static final ex h0;
    public static final ex i0;
    public static final ex j0;
    public final /* synthetic */ int F;

    static {
        int i = 1;
        G = new ex(i, 0);
        H = new ex(i, 1);
        I = new ex(i, 2);
        J = new ex(i, 3);
        K = new ex(i, 4);
        L = new ex(i, 5);
        M = new ex(i, 6);
        N = new ex(i, 7);
        O = new ex(i, 8);
        P = new ex(i, 9);
        Q = new ex(i, 10);
        R = new ex(i, 11);
        S = new ex(i, 12);
        T = new ex(i, 13);
        U = new ex(i, 14);
        V = new ex(i, 15);
        W = new ex(i, 16);
        X = new ex(i, 17);
        Y = new ex(i, 18);
        Z = new ex(i, 19);
        a0 = new ex(i, 20);
        b0 = new ex(i, 21);
        c0 = new ex(i, 22);
        d0 = new ex(i, 23);
        e0 = new ex(i, 24);
        f0 = new ex(i, 25);
        g0 = new ex(i, 26);
        h0 = new ex(i, 27);
        i0 = new ex(i, 28);
        j0 = new ex(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String string;
        int i = this.F;
        boolean z = false;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((n7d) obj).getClass();
                return ieiVar;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(((wjf) obj).k().E.c(akf.B));
            case 3:
                wn9[] wn9VarArr = ckf.a;
                ((ekf) obj).a(akf.y, ieiVar);
                return ieiVar;
            case 4:
                ((Number) obj).longValue();
                return ieiVar;
            case 5:
                return ieiVar;
            case 6:
                wn9[] wn9VarArr2 = ckf.a;
                ((ekf) obj).a(akf.x, ieiVar);
                return ieiVar;
            case 7:
                return ieiVar;
            case 8:
                n70 n70Var = (n70) obj;
                n70Var.getHandler().post(new b60(2, n70Var.V));
                return ieiVar;
            case 9:
                return ieiVar;
            case 10:
                return ieiVar;
            case 11:
                return ieiVar;
            case 12:
                return xn5.w0(gp6.e(kxk.N(220, 90, null, 4), 2).a(gp6.g(kxk.N(220, 90, null, 4), 0.92f, 4)), gp6.f(kxk.N(90, 0, null, 6), 2));
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 14:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    string.getClass();
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    string.getClass();
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    string.getClass();
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    string.getClass();
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    string.getClass();
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    string.getClass();
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    string.getClass();
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    string.getClass();
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    string.getClass();
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return (u01) obj;
            case g.AVG_FIELD_NUMBER /* 18 */:
                e92 e92Var = (e92) obj;
                e92Var.getClass();
                int i2 = zz1.l;
                return Boolean.valueOf(w44.G0(wgg.f, csk.f(e92Var)));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                e92 e92Var2 = (e92) obj;
                e92Var2.getClass();
                if (e92Var2 instanceof h08) {
                    int i3 = zz1.l;
                    if (w44.G0(wgg.f, csk.f(e92Var2))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                fhi fhiVar = (fhi) obj;
                fhiVar.getClass();
                return Boolean.valueOf(fhiVar.O() instanceof ic2);
            case 21:
                ((h08) obj).getClass();
                return null;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((h08) obj).getClass();
                return null;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((h08) obj).getClass();
                return null;
            case 24:
                e92 e92Var3 = (e92) obj;
                e92Var3.getClass();
                return Boolean.valueOf(mkk.h(e92Var3));
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Number) obj).longValue();
                return ieiVar;
            case 26:
                wc0 wc0Var = (wc0) obj;
                wc0Var.getClass();
                return new c54(0, wc0Var);
            case 27:
                float[] fArr = ((nwa) obj).a;
                return ieiVar;
            case 28:
                i06 i06Var = (i06) obj;
                i06Var.getClass();
                i06Var.e(dxf.p0(i06Var.k(), x44.X(okg.p, okg.q)));
                return ieiVar;
            default:
                return "";
        }
    }
}
