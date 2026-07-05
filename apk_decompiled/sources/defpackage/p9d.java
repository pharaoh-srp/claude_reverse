package defpackage;

import androidx.health.platform.client.proto.g;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class p9d extends ts9 implements bz7 {
    public static final p9d G;
    public static final p9d H;
    public static final p9d I;
    public static final p9d J;
    public static final p9d K;
    public static final p9d L;
    public static final p9d M;
    public static final p9d N;
    public static final p9d O;
    public static final p9d P;
    public static final p9d Q;
    public static final p9d R;
    public static final p9d S;
    public static final p9d T;
    public static final p9d U;
    public static final p9d V;
    public static final p9d W;
    public static final p9d X;
    public static final p9d Y;
    public static final p9d Z;
    public static final p9d a0;
    public static final p9d b0;
    public static final p9d c0;
    public static final p9d d0;
    public static final p9d e0;
    public static final p9d f0;
    public static final p9d g0;
    public static final p9d h0;
    public static final p9d i0;
    public static final p9d j0;
    public final /* synthetic */ int F;

    static {
        int i = 1;
        G = new p9d(i, 0);
        H = new p9d(i, 1);
        I = new p9d(i, 2);
        J = new p9d(i, 3);
        K = new p9d(i, 4);
        L = new p9d(i, 5);
        M = new p9d(i, 6);
        N = new p9d(i, 7);
        O = new p9d(i, 8);
        P = new p9d(i, 9);
        Q = new p9d(i, 10);
        R = new p9d(i, 11);
        S = new p9d(i, 12);
        T = new p9d(i, 13);
        U = new p9d(i, 14);
        V = new p9d(i, 15);
        W = new p9d(i, 16);
        X = new p9d(i, 17);
        Y = new p9d(i, 18);
        Z = new p9d(i, 19);
        a0 = new p9d(i, 20);
        b0 = new p9d(i, 21);
        c0 = new p9d(i, 22);
        d0 = new p9d(i, 23);
        e0 = new p9d(i, 24);
        f0 = new p9d(i, 25);
        g0 = new p9d(i, 26);
        h0 = new p9d(i, 27);
        i0 = new p9d(i, 28);
        j0 = new p9d(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9d(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        um6 um6Var = um6.E;
        iei ieiVar = iei.a;
        int i2 = 8;
        switch (i) {
            case 0:
                r9d r9dVar = (r9d) obj;
                if (r9dVar.isAttachedToWindow()) {
                    r9dVar.r();
                }
                return ieiVar;
            case 1:
                ((dvd) obj).getClass();
                jg4 jg4Var = new jg4();
                new prb(new mrb());
                return jg4Var;
            case 2:
                dvd dvdVar = (dvd) obj;
                dvdVar.getClass();
                zl4 zl4Var = new zl4(i2);
                dvdVar.b.getClass();
                return zl4Var;
            case 3:
                dvd dvdVar2 = (dvd) obj;
                dvdVar2.getClass();
                am4 am4Var = new am4(i2);
                dvdVar2.b.getClass();
                return am4Var;
            case 4:
                String str = (String) obj;
                str.getClass();
                return "(raw) ".concat(str);
            case 5:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 6:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return mp0.m0(actualTypeArguments);
            case 7:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case 8:
                String simpleName = ((Class) obj).getSimpleName();
                if (!sxb.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return sxb.e(simpleName);
                }
                return null;
            case 9:
                g06 g06Var = pce.a;
                yr9 type = ((eri) obj).getType();
                type.getClass();
                return pce.a.Z(type);
            case 10:
                g06 g06Var2 = pce.a;
                yr9 type2 = ((eri) obj).getType();
                type2.getClass();
                return pce.a.Z(type2);
            case 11:
                long j = ((fcc) obj).a;
                return ieiVar;
            case 12:
                ((bhe) obj).getClass();
                return Boolean.TRUE;
            case 13:
                Throwable th = (Throwable) obj;
                th.getClass();
                return String.valueOf(th.getMessage());
            case 14:
                bje.n(obj).getClass();
                return um6Var;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                bje.n(obj).getClass();
                return um6Var;
            case 16:
                or9 or9Var = (or9) obj;
                or9Var.getClass();
                return or9Var.r(vfd.BOOLEAN);
            case g.MAX_FIELD_NUMBER /* 17 */:
                or9 or9Var2 = (or9) obj;
                or9Var2.getClass();
                return or9Var2.r(vfd.INT);
            case g.AVG_FIELD_NUMBER /* 18 */:
                or9 or9Var3 = (or9) obj;
                or9Var3.getClass();
                return or9Var3.v();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                Class cls = (Class) obj;
                cls.getClass();
                return yae.b(cls);
            case 21:
                return Integer.valueOf(((w8f) obj).b);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Integer.valueOf(((w8f) obj).c.c());
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String str2 = (String) obj;
                str2.getClass();
                return str2.length() > 1 ? grc.n(';', "L", str2) : str2;
            case 24:
                xh3 xh3VarA = ((fhi) obj).O().a();
                if (xh3VarA == null) {
                    return Boolean.FALSE;
                }
                sxb name = xh3VarA.getName();
                ww7 ww7Var = ue9.f;
                if (x44.r(name, ww7Var.f()) && x44.r(o06.c(xh3VarA), ww7Var)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case BuildConfig.VERSION_CODE /* 25 */:
                e92 e92Var = (e92) obj;
                e92Var.getClass();
                l6e l6eVarS = e92Var.S();
                l6eVarS.getClass();
                return ((mw9) l6eVarS).getType();
            case 26:
                e92 e92Var2 = (e92) obj;
                e92Var2.getClass();
                yr9 returnType = e92Var2.getReturnType();
                returnType.getClass();
                return returnType;
            case 27:
                fhi fhiVar = (fhi) obj;
                fhiVar.getClass();
                return Boolean.valueOf(fhiVar instanceof j2e);
            case 28:
                e92 e92Var3 = (e92) obj;
                e92Var3.getClass();
                return Boolean.valueOf(mkk.h(o06.i(e92Var3)));
            default:
                e92 e92Var4 = (e92) obj;
                e92Var4.getClass();
                int i3 = yz1.l;
                c7g c7gVar = (c7g) e92Var4;
                if (or9.y(c7gVar) && o06.b(c7gVar, new h4(i2, c7gVar)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
