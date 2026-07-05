package defpackage;

import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.r;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class f06 extends ts9 implements bz7 {
    public static final f06 G;
    public static final f06 H;
    public static final f06 I;
    public static final f06 J;
    public static final f06 K;
    public static final f06 L;
    public static final f06 M;
    public static final f06 N;
    public static final f06 O;
    public static final f06 P;
    public static final f06 Q;
    public static final f06 R;
    public static final f06 S;
    public static final f06 T;
    public static final f06 U;
    public static final f06 V;
    public static final f06 W;
    public static final f06 X;
    public static final f06 Y;
    public static final f06 Z;
    public static final f06 a0;
    public static final f06 b0;
    public static final f06 c0;
    public static final f06 d0;
    public static final f06 e0;
    public static final f06 f0;
    public static final f06 g0;
    public static final f06 h0;
    public static final f06 i0;
    public static final f06 j0;
    public final /* synthetic */ int F;

    static {
        int i = 1;
        G = new f06(i, 0);
        H = new f06(i, 1);
        I = new f06(i, 2);
        J = new f06(i, 3);
        K = new f06(i, 4);
        L = new f06(i, 5);
        M = new f06(i, 6);
        N = new f06(i, 7);
        O = new f06(i, 8);
        P = new f06(i, 9);
        Q = new f06(i, 10);
        R = new f06(i, 11);
        S = new f06(i, 12);
        T = new f06(i, 13);
        U = new f06(i, 14);
        V = new f06(i, 15);
        W = new f06(i, 16);
        X = new f06(i, 17);
        Y = new f06(i, 18);
        Z = new f06(i, 19);
        a0 = new f06(i, 20);
        b0 = new f06(i, 21);
        c0 = new f06(i, 22);
        d0 = new f06(i, 23);
        e0 = new f06(i, 24);
        f0 = new f06(i, 25);
        g0 = new f06(i, 26);
        h0 = new f06(i, 27);
        i0 = new f06(i, 28);
        j0 = new f06(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f06(int i, int i2) {
        super(i);
        this.F = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        j7g j7gVarW;
        fhi fhiVarE;
        yr9 returnType;
        gh3 gh3VarF;
        yr9 returnType2;
        boolean zB = false;
        switch (this.F) {
            case 0:
                yr9 yr9Var = (yr9) obj;
                yr9Var.getClass();
                return yr9Var;
            case 1:
                bo5 bo5Var = (bo5) obj;
                bo5Var.getClass();
                return bo5Var.h();
            case 2:
                return kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);
            case 3:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 4:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 5:
                return ((eri) obj).getType();
            case 6:
                ((gh3) obj).getClass();
                return 0;
            case 7:
                return Boolean.TRUE;
            case 8:
                String str = (String) obj;
                str.getClass();
                sxc sxcVarR = r.r();
                sxcVarR.b();
                r.p((r) sxcVarR.F, str);
                return new Permission((r) sxcVarR.a());
            case 9:
                return ((Permission) obj).F.q();
            case 10:
                yr9 yr9Var2 = (yr9) obj;
                yr9Var2.getClass();
                return yr9Var2.toString();
            case 11:
                yr9 yr9Var3 = (yr9) obj;
                yr9Var3.getClass();
                return yr9Var3.toString();
            case 12:
                tqb tqbVar = (tqb) obj;
                tqbVar.getClass();
                eri eriVarE = ac1.e(rd9.b, tqbVar.f().i(okg.t));
                yr9 type = eriVarE != null ? eriVarE.getType() : null;
                return type == null ? nu6.c(mu6.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
            case 13:
                Class<?> returnType3 = ((Method) obj).getReturnType();
                returnType3.getClass();
                return yae.b(returnType3);
            case 14:
                Class cls = (Class) obj;
                cls.getClass();
                return yae.b(cls);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                h08 h08Var = (h08) obj;
                h08Var.getClass();
                return g06.e.x(h08Var) + " | " + jze.c(h08Var).f();
            case 16:
                hrd hrdVar = (hrd) obj;
                hrdVar.getClass();
                return g06.e.x(hrdVar) + " | " + jze.b(hrdVar).e();
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((sbe) obj).getClass();
                return Boolean.valueOf(!r7.i());
            case g.AVG_FIELD_NUMBER /* 18 */:
                c7g c7gVar = (c7g) obj;
                c7gVar.getClass();
                return c7gVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sbe sbeVar = (sbe) obj;
                sbeVar.getClass();
                return Boolean.valueOf(sbeVar.i());
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                fab fabVar = (fab) obj;
                fabVar.getClass();
                return fabVar.f();
            case 21:
                xh3 xh3VarA = ((yr9) obj).O().a();
                if (xh3VarA instanceof qqb) {
                    return (qqb) xh3VarA;
                }
                return null;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((sxb) obj).getClass();
                return Boolean.TRUE;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((bz7) obj).getClass();
                return iei.a;
            case 24:
                cea ceaVar = (cea) obj;
                ceaVar.getClass();
                return new u4i(ceaVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                h69 h69Var = (h69) obj;
                h69Var.getClass();
                return new u4i(h69Var);
            case 26:
                h08 h08Var2 = (h08) obj;
                h08Var2.getClass();
                List listI = h08Var2.I();
                listI.getClass();
                eri eriVar = (eri) w44.V0(listI);
                boolean z = (eriVar == null || o06.a(eriVar) || eriVar.N != null) ? false : true;
                List list = ijc.a;
                if (z) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            case 27:
                h08 h08Var3 = (h08) obj;
                h08Var3.getClass();
                List list2 = ijc.a;
                bo5 bo5VarH = h08Var3.h();
                bo5VarH.getClass();
                if (bo5VarH instanceof qqb) {
                    sxb sxbVar = or9.e;
                    if (or9.b((qqb) bo5VarH, okg.a)) {
                        return null;
                    }
                }
                Collection collectionI = h08Var3.i();
                collectionI.getClass();
                Collection collection = collectionI;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        bo5 bo5VarH2 = ((h08) it.next()).h();
                        bo5VarH2.getClass();
                        if (bo5VarH2 instanceof qqb) {
                            sxb sxbVar2 = or9.e;
                            if (or9.b((qqb) bo5VarH2, okg.a)) {
                                return null;
                            }
                        }
                    }
                }
                bo5 bo5VarH3 = h08Var3.h();
                qqb qqbVar = bo5VarH3 instanceof qqb ? (qqb) bo5VarH3 : null;
                if (qqbVar != null) {
                    if (!g39.a(qqbVar) && !(qqbVar.o0() instanceof ntb)) {
                        qqbVar = null;
                    }
                    if (qqbVar != null && (j7gVarW = qqbVar.W()) != null && (fhiVarE = jwk.E(j7gVarW)) != null && (returnType = h08Var3.getReturnType()) != null && x44.r(((co5) h08Var3).getName(), jjc.d)) {
                        sxb sxbVar3 = or9.e;
                        if ((or9.A(returnType, okg.h) || or9.D(returnType)) && h08Var3.I().size() == 1) {
                            yr9 type2 = ((eri) h08Var3.I().get(0)).getType();
                            type2.getClass();
                            if (x44.r(jwk.E(type2), fhiVarE) && h08Var3.X().isEmpty() && h08Var3.S() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                bo5 bo5VarH4 = h08Var3.h();
                bo5VarH4.getClass();
                if (g39.a(bo5VarH4) || ((bo5VarH4 instanceof qqb) && (((qqb) bo5VarH4).o0() instanceof ntb))) {
                    g06 g06Var = g06.d;
                    bo5 bo5VarH5 = h08Var3.h();
                    bo5VarH5.getClass();
                    j7g j7gVarW2 = ((qqb) bo5VarH5).W();
                    j7gVarW2.getClass();
                    sb.append(" or define ''equals(other: " + g06Var.Z(jwk.E(j7gVarW2)) + "): Boolean''");
                }
                return sb.toString();
            case 28:
                h08 h08Var4 = (h08) obj;
                h08Var4.getClass();
                l6e l6eVarP = h08Var4.P();
                if (l6eVarP == null) {
                    l6eVarP = h08Var4.S();
                }
                List list3 = ijc.a;
                if (l6eVarP != null) {
                    yr9 returnType4 = h08Var4.getReturnType();
                    if (returnType4 != null ? as9.a.b(returnType4, ((mw9) l6eVarP).getType()) : false) {
                        return null;
                    }
                    m6e value = l6eVarP.getValue();
                    value.getClass();
                    if (value instanceof tz8) {
                        qqb qqbVar2 = ((tz8) value).E;
                        if (qqbVar2.x() && (gh3VarF = o06.f(qqbVar2)) != null) {
                            tqb tqbVarD = m06.d(qqbVar2);
                            tqbVarD.getClass();
                            xh3 xh3VarU = kxk.u(tqbVarD, gh3VarF);
                            q16 q16Var = xh3VarU instanceof q16 ? (q16) xh3VarU : null;
                            if (q16Var != null && (returnType2 = h08Var4.getReturnType()) != null) {
                                zB = as9.a.b(returnType2, q16Var.O0());
                            }
                        }
                    }
                    if (zB) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            default:
                wmc wmcVar = (wmc) obj;
                wmcVar.getClass();
                return ((xmc) wmcVar).I;
        }
    }
}
