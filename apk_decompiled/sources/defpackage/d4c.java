package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d4c {
    public static final o54 E = o54.U;
    public static final o54 F;
    public static final o54 G;
    public static final o54 H;
    public static final o54 I;
    public static final o54 J;
    public static final Class[] K;
    public static final StackTraceElement[] L;

    static {
        o54 o54Var = o54.L;
        F = o54Var;
        G = o54.V;
        o54 o54Var2 = o54.M;
        H = o54Var2;
        I = o54Var;
        J = o54Var2;
        K = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
        L = new StackTraceElement[0];
    }

    public static final void A(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1854833411);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = cw1.f;
                e18Var.k0(objN);
            }
            o5b o5bVar = (o5b) objN;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            i0(e18Var, cd4.f, o5bVar);
            i0(e18Var, cd4.e, hycVarL);
            i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            h0(e18Var, cd4.h);
            i0(e18Var, cd4.d, iqbVarE);
            vb7.y(6, ta4Var, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fga(iqbVar, ta4Var, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long B(float r17, float r18, float r19, float r20, defpackage.r54 r21) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.B(float, float, float, float, r54):long");
    }

    public static final Executor C(e45 e45Var) {
        Executor executorS0;
        j57 j57Var = e45Var instanceof j57 ? (j57) e45Var : null;
        return (j57Var == null || (executorS0 = j57Var.S0()) == null) ? new e86(e45Var) : executorS0;
    }

    public static final Object D(u82 u82Var, tp4 tp4Var) {
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        ua2Var.w(new g0(5, u82Var));
        u82Var.e(new tk5(17, ua2Var));
        return ua2Var.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(defpackage.vp4 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.hw5
            if (r0 == 0) goto L13
            r0 = r4
            hw5 r0 = (defpackage.hw5) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            hw5 r0 = new hw5
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.E
            int r1 = r0.F
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            defpackage.sf5.h0(r4)
            goto L45
        L2b:
            defpackage.sf5.h0(r4)
            r0.F = r2
            ua2 r4 = new ua2
            tp4 r0 = defpackage.zni.I(r0)
            r4.<init>(r2, r0)
            r4.t()
            java.lang.Object r4 = r4.r()
            m45 r0 = defpackage.m45.E
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.E(vp4):void");
    }

    public static final Object F(u82 u82Var, tp4 tp4Var) {
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        ua2Var.w(new qr9(u82Var, 0));
        u82Var.e(new z22(ua2Var, 5));
        return ua2Var.r();
    }

    public static final boolean G(Object obj) {
        if (obj instanceof ddg) {
            ddg ddgVar = (ddg) obj;
            if (ddgVar.c() == ql8.J || ddgVar.c() == a5.N || ddgVar.c() == zp3.X) {
                Object value = ddgVar.getValue();
                if (value == null) {
                    return true;
                }
                return G(value);
            }
        } else if (!(obj instanceof qz7) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (K[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static uc1 H(df5 df5Var) {
        uc1 uc1Var = new uc1();
        String str = (String) df5Var.e().get("session_id");
        HashMap map = uc1Var.a;
        if (str != null) {
            map.put("session.id", str);
        }
        String str2 = (String) df5Var.e().get("user_id");
        if (str2 != null) {
            map.put("user.id", str2);
        }
        String str3 = (String) df5Var.e().get("account_id");
        if (str3 != null) {
            map.put("account.id", str3);
        }
        return uc1Var;
    }

    public static final long I(long j, long j2) {
        float f;
        float f2;
        long jA = d54.a(j, d54.f(j2));
        float fD = d54.d(j2);
        float fD2 = d54.d(jA);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = d54.h(jA);
        float fH2 = d54.h(j2);
        float f5 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (f4 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = d54.g(jA);
        float fG2 = d54.g(j2);
        if (f4 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        float fE = d54.e(jA);
        float fE2 = d54.e(j2);
        if (f4 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            f5 = (((fE2 * fD) * f3) + (fE * fD2)) / f4;
        }
        return B(f, f2, f5, f4, d54.f(j2));
    }

    public static EnumMap J(vf4 vf4Var, Set set, Map map) {
        EnumMap enumMap = new EnumMap(h3i.class);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            h3i h3iVar = (h3i) it.next();
            int i = 0;
            int i2 = 1;
            switch (h3iVar.ordinal()) {
                case 0:
                    enumMap.put(h3iVar, new yj5(i, map));
                    break;
                case 1:
                    boolean z = vf4Var.Z;
                    String str = ua1.a;
                    enumMap.put(h3iVar, new ta1(z, 1));
                    break;
                case 2:
                    boolean z2 = vf4Var.Z;
                    String str2 = ua1.a;
                    enumMap.put(h3iVar, new ta1(z2, 0));
                    break;
                case 3:
                    enumMap.put(h3iVar, new yj5(i2, map));
                    break;
                case 4:
                    enumMap.put(h3iVar, new yj5(3, map));
                    break;
                case 5:
                    enumMap.put(h3iVar, new yj5(2, map));
                    break;
                case 6:
                    enumMap.put(h3iVar, zh4.k);
                    break;
            }
        }
        return enumMap;
    }

    public static final Object K(long j, tp4 tp4Var) {
        if (j > 0) {
            ua2 ua2Var = new ua2(1, zni.I(tp4Var));
            ua2Var.t();
            if (j < Long.MAX_VALUE) {
                R(ua2Var.I).l0(j, ua2Var);
            }
            Object objR = ua2Var.r();
            if (objR == m45.E) {
                return objR;
            }
        }
        return iei.a;
    }

    public static final Object L(long j, tp4 tp4Var) {
        Object objK = K(o0(j), tp4Var);
        return objK == m45.E ? objK : iei.a;
    }

    public static final float M(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final e45 N(Executor executor) {
        e45 e45Var;
        e86 e86Var = executor instanceof e86 ? (e86) executor : null;
        return (e86Var == null || (e45Var = e86Var.E) == null) ? new k57(executor) : e45Var;
    }

    public static c69 O(long j) {
        long j2 = j / 1000;
        if ((j ^ 1000) < 0 && j2 * 1000 != j) {
            j2--;
        }
        long j3 = j % 1000;
        return j2 < -31557014167219200L ? c69.G : j2 > 31556889864403199L ? c69.H : P((int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000), j2);
    }

    public static c69 P(int i, long j) {
        long j2 = i;
        long j3 = j2 / MathMethodsKt.NANOS_PER_SECOND;
        if ((j2 ^ MathMethodsKt.NANOS_PER_SECOND) < 0 && j3 * MathMethodsKt.NANOS_PER_SECOND != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? c69.H : c69.G;
        }
        if (j4 < -31557014167219200L) {
            return c69.G;
        }
        if (j4 > 31556889864403199L) {
            return c69.H;
        }
        long j5 = j2 % MathMethodsKt.NANOS_PER_SECOND;
        return new c69(j4, (int) (j5 + ((((j5 ^ MathMethodsKt.NANOS_PER_SECOND) & ((-j5) | j5)) >> 63) & MathMethodsKt.NANOS_PER_SECOND)));
    }

    public static y9 Q(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("name").m();
            strM.getClass();
            y9 y9Var = new y9();
            y9Var.a = strM;
            return y9Var;
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ActionEventActionTarget", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ActionEventActionTarget", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ActionEventActionTarget", e3);
            return null;
        }
    }

    public static final gw5 R(c45 c45Var) {
        a45 a45VarX0 = c45Var.x0(a5.G);
        gw5 gw5Var = a45VarX0 instanceof gw5 ? (gw5) a45VarX0 : null;
        return gw5Var == null ? er5.a : gw5Var;
    }

    public static final KSerializer S(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().c() ? kSerializer : new t9c(kSerializer);
    }

    public static final int T(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int iHashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int iE = serialDescriptor.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i2 = iE - 1;
            int i3 = i * 31;
            String strA = serialDescriptor.h(serialDescriptor.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iE = i2;
        }
        int iE2 = serialDescriptor.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iE2 - 1;
            int i5 = iHashCode3 * 31;
            u00 kind = serialDescriptor.h(serialDescriptor.e() - iE2).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iE2 = i4;
        }
    }

    public static final int U(ip0 ip0Var, Object obj, int i) {
        int i2 = ip0Var.G;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iH = sf5.h(i2, i, ip0Var.E);
            if (iH < 0 || x44.r(obj, ip0Var.F[iH])) {
                return iH;
            }
            int i3 = iH + 1;
            while (i3 < i2 && ip0Var.E[i3] == i) {
                if (x44.r(obj, ip0Var.F[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iH - 1; i4 >= 0 && ip0Var.E[i4] == i; i4--) {
                if (x44.r(obj, ip0Var.F[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            sz6.c();
            return 0;
        }
    }

    public static final void V(ld4 ld4Var, Integer num, pz7 pz7Var) {
        if (((e18) ld4Var).S) {
            ((e18) ld4Var).b(pz7Var, num);
        }
    }

    public static final float W(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int X(float f, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static final long Y(float f, long j, long j2) {
        kdc kdcVar = t54.x;
        long jA = d54.a(j, kdcVar);
        long jA2 = d54.a(j2, kdcVar);
        float fD = d54.d(jA);
        float fH = d54.h(jA);
        float fG = d54.g(jA);
        float fE = d54.e(jA);
        float fD2 = d54.d(jA2);
        float fH2 = d54.h(jA2);
        float fG2 = d54.g(jA2);
        float fE2 = d54.e(jA2);
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return d54.a(B(W(fH, fH2, f), W(fG, fG2, f), W(fE, fE2, f), W(fD, fD2, f), kdcVar), d54.f(j2));
    }

    public static final float Z(long j) {
        r54 r54VarF = d54.f(j);
        if (!yfd.y(r54VarF.b, 12884901888L)) {
            a39.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) yfd.k0(r54VarF.b)));
        }
        nse nseVar = ((rse) r54VarF).p;
        double dA = nseVar.a(d54.h(j));
        float fA = (float) ((nseVar.a(d54.e(j)) * 0.0722d) + (nseVar.a(d54.g(j)) * 0.7152d) + (dA * 0.2126d));
        if (fA < MTTypesetterKt.kLineSkipLimitMultiplier) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a0(hqb hqbVar, zy7 zy7Var) {
        mbc mbcVar = hqbVar.K;
        if (mbcVar == null) {
            mbcVar = new mbc((lbc) hqbVar);
            hqbVar.K = mbcVar;
        }
        omc snapshotObserver = yfd.X(hqbVar).getSnapshotObserver();
        snapshotObserver.a.d(mbcVar, j06.b0, zy7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.bpc r17, final java.lang.String r18, defpackage.iqb r19, boolean r20, long r21, float r23, final defpackage.zy7 r24, defpackage.ld4 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.d(bpc, java.lang.String, iqb, boolean, long, float, zy7, ld4, int, int):void");
    }

    public static final iqb d0(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new zdg(bz7Var));
    }

    public static final String e0(int i, int i2, ld4 ld4Var) {
        return ((Resources) ((e18) ld4Var).j(w00.c)).getQuantityString(i, i2);
    }

    public static final String f0(int i, int i2, Object[] objArr, ld4 ld4Var) {
        return ((Resources) ((e18) ld4Var).j(w00.c)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String g0(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[FreeTypeConstants.FT_LOAD_LINEAR_DESIGN];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.zy7 r14, defpackage.wu8 r15, defpackage.iqb r16, boolean r17, final defpackage.ta4 r18, defpackage.ld4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.h(zy7, wu8, iqb, boolean, ta4, ld4, int, int):void");
    }

    public static final void h0(ld4 ld4Var, bz7 bz7Var) {
        ((e18) ld4Var).b(new a21(26, bz7Var), iei.a);
    }

    public static final void i0(ld4 ld4Var, pz7 pz7Var, Object obj) {
        if (((e18) ld4Var).S || !x44.r(((e18) ld4Var).N(), obj)) {
            e18 e18Var = (e18) ld4Var;
            e18Var.k0(obj);
            e18Var.b(pz7Var, obj);
        }
    }

    public static final String j0(int i, ld4 ld4Var) {
        return ((Resources) ((e18) ld4Var).j(w00.c)).getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.bpc r14, java.lang.String r15, boolean r16, defpackage.bz7 r17, defpackage.iqb r18, boolean r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.k(bpc, java.lang.String, boolean, bz7, iqb, boolean, ld4, int, int):void");
    }

    public static final String k0(int i, Object[] objArr, ld4 ld4Var) {
        return ((Resources) ((e18) ld4Var).j(w00.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long l(float r21, float r22, float r23, float r24, defpackage.r54 r25) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.l(float, float, float, float, r54):long");
    }

    public static void l0(b4a b4aVar, wqi wqiVar, zy7 zy7Var, wqi wqiVar2, wqi wqiVar3, zy7 zy7Var2, zy7 zy7Var3, int i) {
        if ((i & 1) != 0) {
            wqiVar = null;
        }
        if ((i & 2) != 0) {
            zy7Var = null;
        }
        if ((i & 4) != 0) {
            wqiVar2 = null;
        }
        if ((i & 8) != 0) {
            wqiVar3 = null;
        }
        if ((i & 16) != 0) {
            zy7Var2 = null;
        }
        zy7 zy7Var4 = (i & 32) != 0 ? null : zy7Var3;
        b4aVar.getClass();
        zy7 zy7Var5 = zy7Var2;
        b4aVar.l(new j4a(wqiVar, zy7Var, wqiVar2, wqiVar3, zy7Var5, zy7Var4));
    }

    public static final long m(int i) {
        long j = ((long) i) << 32;
        int i2 = d54.i;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m0(java.lang.Throwable r4, defpackage.tp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.rr9
            if (r0 == 0) goto L13
            r0 = r5
            rr9 r0 = (defpackage.rr9) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            rr9 r0 = new rr9
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.F
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r5)
            throw r4
        L2c:
            defpackage.sf5.h0(r5)
            r0.F = r2
            ft5 r5 = defpackage.g86.a
            c45 r1 = r0.getContext()
            s2k r2 = new s2k
            r3 = 4
            r2.<init>(r0, r3, r4)
            r5.O0(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.m0(java.lang.Throwable, tp4):void");
    }

    public static final long n(int i, int i2, int i3, int i4) {
        return m(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final int n0(long j) {
        float[] fArr = t54.a;
        return (int) (d54.a(j, t54.e) >>> 32);
    }

    public static final long o(long j) {
        long j2 = j << 32;
        int i = d54.i;
        return j2;
    }

    public static final long o0(long j) {
        lz1 lz1Var = uh6.F;
        boolean z = j > 0;
        if (z) {
            return uh6.f(uh6.m(j, v40.R(999999L, zh6.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        mr9.b();
        return 0L;
    }

    public static final String p0(SerialDescriptor serialDescriptor) {
        return w44.S0(wd6.H0(0, serialDescriptor.e()), ", ", serialDescriptor.a() + '(', ")", new d6d(1, serialDescriptor), 24);
    }

    public static final void q(hp4 hp4Var, zy7 zy7Var, iqb iqbVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-195055274);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(hp4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            gp4 gp4Var = (gp4) hp4Var.a.getValue();
            if (!(gp4Var instanceof fp4)) {
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new fb0(hp4Var, zy7Var, bz7Var, i);
                    return;
                }
                return;
            }
            fp4 fp4Var = (fp4) gp4Var;
            boolean zF = e18Var.f(fp4Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new bp4(yfd.a0(fp4Var.a()));
                e18Var.k0(objN);
            }
            ip4.e((bp4) objN, zy7Var, bz7Var, e18Var, i3 & 8176);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new xo4(hp4Var, zy7Var, iqbVar2, bz7Var, i, 0);
        }
    }

    public static final void q0(ld4 ld4Var, pz7 pz7Var, Object obj) {
        boolean z = ((e18) ld4Var).S;
        if (z || !x44.r(((e18) ld4Var).N(), obj)) {
            e18 e18Var = (e18) ld4Var;
            e18Var.k0(obj);
            if (z) {
                return;
            }
            e18Var.b(pz7Var, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(defpackage.hp4 r17, defpackage.zy7 r18, defpackage.bz7 r19, defpackage.iqb r20, boolean r21, defpackage.zy7 r22, defpackage.ta4 r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4c.r(hp4, zy7, bz7, iqb, boolean, zy7, ta4, ld4, int, int):void");
    }

    public static final hz5 s(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        tu7 tu7VarA = uu7.a(f);
        if (tu7VarA == null) {
            tu7VarA = new f6a(f);
        }
        return new hz5(f2, f, tu7VarA);
    }

    public static final uo0 t(KSerializer kSerializer) {
        kSerializer.getClass();
        return new uo0(kSerializer, 0);
    }

    public static final f7a u(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new f7a(kSerializer, kSerializer2);
    }

    public static final l9e v(long j, long j2) {
        return new l9e(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final l9e w(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new l9e(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final l9e x(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new l9e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void y(ia0 ia0Var, ie3 ie3Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        ia0Var.getClass();
        ie3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(448840184);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ia0Var) : e18Var.h(ia0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ie3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            j8.c(twe.a.a(ie3Var.b), fd9.q0(938587832, new m63(ta4Var, ia0Var, ie3Var, 19), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(ia0Var, ie3Var, ta4Var, i);
        }
    }

    public static final void z(final ybg ybgVar, final zy7 zy7Var, final zy7 zy7Var2, d8f d8fVar, ld4 ld4Var, final int i) {
        final d8f d8fVar2;
        r7e r7eVarS;
        pz7 pz7Var;
        d8f d8fVar3;
        int i2;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2004128596);
        int i3 = i | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(d8f.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                d8fVar3 = (d8f) objN;
                i2 = i3 & (-7169);
            } else {
                e18Var.T();
                i2 = i3 & (-7169);
                d8fVar3 = d8fVar;
            }
            e18Var.q();
            Activity activity = (Activity) e18Var.j(tca.a);
            if (activity == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i5 = 0;
                    final d8f d8fVar4 = d8fVar3;
                    pz7Var = new pz7(ybgVar, zy7Var, zy7Var2, d8fVar4, i, i5) { // from class: e8f
                        public final /* synthetic */ int E;
                        public final /* synthetic */ ybg F;
                        public final /* synthetic */ zy7 G;
                        public final /* synthetic */ zy7 H;
                        public final /* synthetic */ d8f I;

                        {
                            this.E = i5;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.E;
                            iei ieiVar = iei.a;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(7);
                                    d4c.z(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(7);
                                    d4c.z(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            d8f d8fVar5 = d8fVar3;
            boolean zH = e18Var.h(d8fVar5) | e18Var.h(activity);
            Object objN2 = e18Var.N();
            Object obj = objN2;
            if (zH || objN2 == lz1Var) {
                e6f e6fVar = new e6f(d8fVar5, i, activity);
                e18Var.k0(e6fVar);
                obj = e6fVar;
            }
            fd9.e(activity, d8fVar5, (bz7) obj, e18Var);
            String strJ0 = j0(R.string.screenshot_feedback_prompt_message, e18Var);
            String strJ02 = j0(R.string.screenshot_feedback_prompt_action, e18Var);
            zy1 zy1Var = d8fVar5.b;
            int i6 = ((i2 & 112) == 32 ? 1 : 0) | (e18Var.f(strJ0) ? 1 : 0) | (e18Var.f(strJ02) ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
            Object objN3 = e18Var.N();
            Object obj2 = objN3;
            if (i6 != 0 || objN3 == lz1Var) {
                x25 x25Var = new x25(zy7Var, ybgVar, strJ0, strJ02, zy7Var2, null, 5);
                e18Var.k0(x25Var);
                obj2 = x25Var;
            }
            x44.b(zy1Var, (pz7) obj2, e18Var, 0);
            d8fVar2 = d8fVar5;
        } else {
            e18Var.T();
            d8fVar2 = d8fVar;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i7 = 1;
            pz7Var = new pz7(ybgVar, zy7Var, zy7Var2, d8fVar2, i, i7) { // from class: e8f
                public final /* synthetic */ int E;
                public final /* synthetic */ ybg F;
                public final /* synthetic */ zy7 G;
                public final /* synthetic */ zy7 H;
                public final /* synthetic */ d8f I;

                {
                    this.E = i7;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj3, Object obj22) {
                    int i62 = this.E;
                    iei ieiVar = iei.a;
                    switch (i62) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int iP0 = x44.p0(7);
                            d4c.z(this.F, this.G, this.H, this.I, (ld4) obj3, iP0);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int iP02 = x44.p0(7);
                            d4c.z(this.F, this.G, this.H, this.I, (ld4) obj3, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public abstract View b0(int i);

    public abstract boolean c0();
}
