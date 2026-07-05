package defpackage;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.FillElement;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.mcpapps.transport.ContainerDimensions;
import com.anthropic.claude.mcpapps.transport.SafeAreaInsets;
import com.anthropic.claude.types.strings.ChatId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NotImplementedError;
import kotlin.time.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class csg {
    public static final q0g a = q0g.I;
    public static final float b = 8.0f;
    public static final int[] c = {1, 10, 100, 1000, yr6.INVALID_OWNERSHIP, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] d = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] e = {3, 6};
    public static final int[] f = {1, 2, 4, 5, 7, 8};
    public static final l40 g = new l40(1000);
    public static final l40 h;
    public static final l40 i;

    static {
        new l40(1007);
        h = new l40(1008);
        i = new l40(1002);
    }

    public static final float A(int i2, ld4 ld4Var) {
        return ((cz5) ((e18) ld4Var).j(ve4.h)).D(eve.B(i2));
    }

    public static boolean B(byte b2) {
        return b2 > -65;
    }

    public static ece C(e92 e92Var, zy7 zy7Var) {
        if (zy7Var != null) {
            return new ece(e92Var, zy7Var);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static final us8 D(k99 k99Var, lj5 lj5Var, bz7 bz7Var, hi5 hi5Var, int i2, zy7 zy7Var) {
        k99Var.getClass();
        lj5Var.getClass();
        bz7Var.getClass();
        hi5Var.getClass();
        sq6.a(i2);
        return new us8(k99Var, lj5Var, bz7Var, hi5Var, i2, zy7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(zff zffVar, long j, bz7 bz7Var) {
        oec oecVar = new oec(j);
        nec necVar = nec.E;
        nai.n(3, necVar);
        xff xffVar = new xff(zffVar, oecVar, necVar, bgf.E, cgf.e, (xzg) bz7Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zff.J;
        zffVar.j(xffVar, false);
    }

    public static final a F(int i2, bz7 bz7Var, String str, String str2) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) bz7Var.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return G(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final a G(String str, String str2) {
        return new a(str2 + " when parsing an Instant from \"" + X(64, str) + '\"', str);
    }

    public static final int H(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static String I(String str, String str2) {
        return bnf.a0(bnf.b0(new pp0(4, str), new cm5(str2, 26)), "\n");
    }

    public static final vx5 J(String str, ld4 ld4Var, int i2) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        ChatId chatIdM978boximpl = ChatId.m978boximpl(str);
        int i3 = 0;
        boolean zH = ((((i2 & 14) ^ 6) > 4 && e18Var.f(str)) || (i2 & 6) == 4) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new wx5(str, m7fVar, i3);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (vx5) fd9.r0(kceVar.b(vx5.class), x44.X(oq5.B(kceVar.b(vx5.class)), chatIdM978boximpl), (bz7) objN, e18Var);
    }

    public static final void K(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final long L(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void M(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void N(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final iqb O(iqb iqbVar) {
        return Build.VERSION.SDK_INT < 29 ? iqbVar : iqbVar.B(new a57());
    }

    public static final mz8 P(Iterable iterable) {
        iterable.getClass();
        mz8 mz8Var = iterable instanceof mz8 ? (mz8) iterable : null;
        return mz8Var == null ? S(iterable) : mz8Var;
    }

    public static final rz8 Q(Iterable iterable) {
        rz8 rz8Var = iterable instanceof rz8 ? (rz8) iterable : null;
        if (rz8Var != null) {
            return rz8Var;
        }
        hzc hzcVar = iterable instanceof hzc ? (hzc) iterable : null;
        fzc fzcVarE = hzcVar != null ? hzcVar.e() : null;
        if (fzcVarE != null) {
            return fzcVarE;
        }
        fzc fzcVar = fzc.H;
        fzcVar.getClass();
        if (!(iterable instanceof Collection)) {
            hzc hzcVar2 = new hzc(fzcVar);
            b54.t0(hzcVar2, iterable);
            return hzcVar2.e();
        }
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return fzcVar;
        }
        hzc hzcVar3 = new hzc(fzcVar);
        hzcVar3.addAll(collection);
        return hzcVar3.e();
    }

    public static final long R(long j) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    public static final k3 S(Iterable iterable) {
        iterable.getClass();
        k3 k3Var = iterable instanceof k3 ? (k3) iterable : null;
        if (k3Var != null) {
            return k3Var;
        }
        ozc ozcVar = iterable instanceof ozc ? (ozc) iterable : null;
        k3 k3VarA = ozcVar != null ? ozcVar.a() : null;
        if (k3VarA != null) {
            return k3VarA;
        }
        bbg bbgVarN = nuj.n();
        bbgVarN.getClass();
        if (iterable instanceof Collection) {
            return bbgVarN.g((Collection) iterable);
        }
        ozc ozcVarH = bbgVarN.h();
        b54.t0(ozcVarH, iterable);
        return ozcVarH.a();
    }

    public static final long T(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static String U(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static String V(String str) throws IOException {
        int length;
        Comparable comparable;
        List listN0 = bsg.N0(str);
        List list = listN0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!bsg.I0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!gb9.B(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listN0.size();
        z1g z1gVar = new z1g(23);
        int size = listN0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = length + 1;
            if (length < 0) {
                x44.n0();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && bsg.I0(str3)) {
                str3 = null;
            } else {
                String str4 = (String) z1gVar.invoke(bsg.x0(iIntValue, str3));
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i2;
        }
        StringBuilder sb = new StringBuilder(length3);
        w44.R0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String W(String str) throws IOException {
        String str2;
        if (bsg.I0("|")) {
            sz6.p("marginPrefix must be non-blank string.");
            return null;
        }
        List listN0 = bsg.N0(str);
        int length = str.length();
        listN0.size();
        z1g z1gVar = new z1g(23);
        int size = listN0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listN0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            String str3 = (String) obj;
            if ((i2 == 0 || i2 == size) && bsg.I0(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!gb9.B(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                String strSubstring = (i4 != -1 && isg.p0(str3, "|", i4, false)) ? str3.substring("|".length() + i4) : null;
                if (strSubstring != null && (str2 = (String) z1gVar.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(length);
        w44.R0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static final String X(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.zy7 r29, defpackage.iqb r30, boolean r31, defpackage.e0g r32, final defpackage.n02 r33, defpackage.s02 r34, defpackage.qu1 r35, defpackage.mnc r36, defpackage.zub r37, final defpackage.rz7 r38, defpackage.ld4 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csg.a(zy7, iqb, boolean, e0g, n02, s02, qu1, mnc, zub, rz7, ld4, int, int):void");
    }

    public static final void b(zy7 zy7Var, szh szhVar, bz7 bz7Var, ta4 ta4Var, iqb iqbVar, pz7 pz7Var, iqb iqbVar2, ld4 ld4Var, int i2) {
        ta4 ta4Var2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-576840526);
        int i3 = i2 | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.f(szhVar) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(pz7Var) ? 131072 : 65536) | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            wo1 wo1Var = lja.Q;
            cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var, 54);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            iqb iqbVarB0 = mpk.b0(iqbVar2, mpk.Y(e18Var), false);
            fxe fxeVar = fxe.a;
            iqb iqbVarA = fxeVar.a(iqbVarB0, 1.0f, false);
            fo0 fo0Var = ko0.a;
            cxe cxeVarA2 = axe.a(fo0Var, wo1Var, e18Var, 48);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarA);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            c(zy7Var != null, "add button", fd9.q0(1248414564, new gx2(0, zy7Var), e18Var), e18Var, 432);
            c(pz7Var != null, "model picker pill", fd9.q0(703968987, new vu2(1, pz7Var), e18Var), e18Var, 432);
            c(szhVar.a && szhVar.c, "research pill", fd9.q0(-715355044, new ow1(szhVar, 5, bz7Var), e18Var), e18Var, 432);
            fqb fqbVar = fqb.E;
            vb7.A(fqbVar, 8.0f, e18Var, true);
            cxe cxeVarA3 = axe.a(fo0Var, wo1Var, e18Var, 48);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA3);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            ta4Var2 = ta4Var;
            ta4Var2.invoke(fxeVar, e18Var, 54);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            ta4Var2 = ta4Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hx2(zy7Var, szhVar, bz7Var, ta4Var2, iqbVar, pz7Var, iqbVar2, i2);
        }
    }

    public static final void c(boolean z, String str, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-348658451);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wd6.M(z, null, gp6.e(null, 3).a(gp6.g(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7)), gp6.f(null, 3).a(gp6.h(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7)), str, fd9.q0(-1578606651, new ix2(ta4Var, i4), e18Var), e18Var, (i3 & 14) | 200064 | ((i3 << 9) & 57344), 2);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nb1(z, str, ta4Var, i2, 1);
        }
    }

    public static final void d(vx5 vx5Var, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i2) {
        int i3;
        vx5Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(113876506);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(vx5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            rwk.d(vx5Var, zy7Var, zy7Var2, d4c.j0(R.string.chat_menu_delete_conversation_dialog_title, e18Var), d4c.j0(R.string.chat_menu_delete, e18Var), d4c.j0(R.string.chat_menu_delete_conversation_dialog_subtitle, e18Var), 0, e18Var, i3 & 1022, 64);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(vx5Var, i2, zy7Var, zy7Var2, 26);
        }
    }

    public static final void e(int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1859608116);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            k4g k4gVar = k4g.a;
            ho0 ho0Var = new ho0(k4g.k, true, new sz6(i4));
            iqb iqbVarI = gb9.I(iqbVar, k4g.i);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            float fA = A(44, e18Var);
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(v(androidx.compose.foundation.layout.b.o(fqbVar, fA), xve.a, e18Var), false, null, new vue(0), null, zy7Var, 11);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            cv8.b(com.anthropic.claude.design.icon.a.a(ud0.M1, e18Var), d4c.j0(R.string.generic_button_close, e18Var), androidx.compose.foundation.layout.b.o(fqbVar, A(24, e18Var)), gm3.a(e18Var).M, e18Var, 8, 0);
            e18Var.p(true);
            hw9 hw9Var = new hw9(1.0f, true);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            iqb iqbVarL = gb9.L(v(androidx.compose.foundation.layout.b.g(fqbVar, A(44, e18Var), MTTypesetterKt.kLineSkipLimitMultiplier, 2), xve.b(A(44, e18Var) / 2.0f), e18Var), 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            o5b o5bVarD3 = dw1.d(xo1Var, false);
            int iHashCode4 = Long.hashCode(e18Var.T);
            hyc hycVarL4 = e18Var.l();
            iqb iqbVarE4 = kxk.E(e18Var, iqbVarL);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD3);
            d4c.i0(e18Var, z80Var2, hycVarL4);
            ij0.t(iHashCode4, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE4);
            tjh.b(str, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).f, e18Var, i3 & 14, 24960, 110586);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.o(fqbVar, A(44, e18Var)));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uf2(str, zy7Var, iqbVar, i2, 2);
        }
    }

    public static final long f(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final void g(bz7 bz7Var, ld4 ld4Var, int i2, int i3) {
        z3a z3aVar = z3a.G;
        bz7Var.getClass();
        boolean z = true;
        if ((i3 & 1) != 0) {
            z3aVar = z3a.I;
        }
        z3a z3aVar2 = z3aVar;
        e18 e18Var = (e18) ld4Var;
        long j = e18Var.T;
        swe sweVar = (swe) e18Var.j(twe.a);
        e18Var.a0(-1115753208);
        kd4 kd4VarB = sweVar.a.b();
        Long lValueOf = Long.valueOf(j);
        kd4VarB.getClass();
        y59 z59Var = (y59) ((HashMap) kd4VarB.b).get(lValueOf);
        if (z59Var == null) {
            ft5 ft5Var = g86.a;
            ye8 ye8Var = tpa.a;
            ye8Var.getClass();
            if (fd9.n) {
                try {
                    ye8Var = ye8Var.J;
                } catch (UnsupportedOperationException | NotImplementedError unused) {
                    fd9.n = false;
                }
            }
            ye8Var.getClass();
            mp4 mp4VarC = fd9.c(ye8Var);
            b4a b4aVarA = sweVar.a.a();
            b4aVarA.getClass();
            tp4 tp4Var = null;
            if (b4aVarA.a() == z3a.E) {
                fd9.z(mp4VarC, null);
            } else {
                b4aVarA.l(new hf3(2, mp4VarC));
            }
            boolean zH = e18Var.h(sweVar);
            if ((((i2 & 14) ^ 6) <= 4 || !e18Var.d(z3aVar2.ordinal())) && (i2 & 6) != 4) {
                z = false;
            }
            boolean zH2 = zH | z | e18Var.h(bz7Var);
            Object objN = e18Var.N();
            if (zH2 || objN == jd4.a) {
                cx cxVar = new cx(sweVar, z3aVar2, bz7Var, tp4Var, 21);
                e18Var.k0(cxVar);
                objN = cxVar;
            }
            gb9.D(mp4VarC, null, null, (pz7) objN, 3);
            z59Var = new z59();
            kd4VarB.k(lValueOf, z59Var);
        }
        e18Var.p(false);
    }

    public static final void h(zxa zxaVar, final fj0 fj0Var, final float f2, final zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        fj0Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1394958997);
        int i3 = (e18Var.f(zxaVar) ? 4 : 2) | i2 | (e18Var.f(fj0Var) ? 32 : 16) | (e18Var.c(f2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = mpk.P(zxaVar);
                e18Var.k0(objN);
            }
            final nwb nwbVar = (nwb) objN;
            if (zxaVar != null) {
                nwbVar.setValue(zxaVar);
            }
            boolean z = zxaVar != null;
            yb5.c((i3 >> 6) & 112, 0, e18Var, zy7Var, z);
            wd6.M(z, iqbVar, gp6.e(kxk.N(220, 0, null, 6), 2), gp6.f(kxk.N(220, 0, null, 6), 2), null, fd9.q0(-1591101373, new rz7() { // from class: yxa
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ContainerDimensions containerDimensions;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ia0) obj).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    boolean zQ = e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16);
                    iei ieiVar = iei.a;
                    if (!zQ) {
                        e18Var2.T();
                        return ieiVar;
                    }
                    zxa zxaVar2 = (zxa) nwbVar.getValue();
                    if (zxaVar2 == null) {
                        return ieiVar;
                    }
                    eli eliVar = (eli) e18Var2.j(ve4.t);
                    Object objN2 = e18Var2.N();
                    lz1 lz1Var = jd4.a;
                    if (objN2 == lz1Var) {
                        objN2 = mpk.P(null);
                        e18Var2.k0(objN2);
                    }
                    nwb nwbVar2 = (nwb) objN2;
                    String str = (String) nwbVar2.getValue();
                    if (str == null) {
                        e18Var2.a0(-1241459231);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1241459230);
                        Object objN3 = e18Var2.N();
                        if (objN3 == lz1Var) {
                            objN3 = new d29(8, nwbVar2);
                            e18Var2.k0(objN3);
                        }
                        skk.a(str, (zy7) objN3, e18Var2, 48);
                        e18Var2.p(false);
                    }
                    umg umgVar = ve4.h;
                    float density = ((cz5) e18Var2.j(umgVar)).getDensity();
                    WeakHashMap weakHashMap = gdj.x;
                    w70 w70Var = s4i.d(e18Var2).f;
                    cz5 cz5Var = (cz5) e18Var2.j(umgVar);
                    float fC0 = cz5Var.c0(w70Var.a(cz5Var));
                    Object objN4 = e18Var2.N();
                    if (objN4 == lz1Var) {
                        objN4 = vb7.g(0, e18Var2);
                    }
                    isc iscVar = (isc) objN4;
                    Object objN5 = e18Var2.N();
                    if (objN5 == lz1Var) {
                        objN5 = mpk.P(null);
                        e18Var2.k0(objN5);
                    }
                    nwb nwbVar3 = (nwb) objN5;
                    boolean zD = e18Var2.d(iscVar.h()) | e18Var2.c(fC0);
                    float f3 = f2;
                    boolean zC = zD | e18Var2.c(f3) | e18Var2.c(density);
                    Object objN6 = e18Var2.N();
                    if (zC || objN6 == lz1Var) {
                        objN6 = new SafeAreaInsets(mwa.L((iscVar.h() / density) + fC0), 0, mwa.L(f3), 0);
                        e18Var2.k0(objN6);
                    }
                    SafeAreaInsets safeAreaInsets = (SafeAreaInsets) objN6;
                    boolean zF = e18Var2.f((g79) nwbVar3.getValue()) | e18Var2.c(density);
                    Object objN7 = e18Var2.N();
                    if (zF || objN7 == lz1Var) {
                        g79 g79Var = (g79) nwbVar3.getValue();
                        if (g79Var != null) {
                            long j = g79Var.a;
                            containerDimensions = new ContainerDimensions(Integer.valueOf(mwa.L(((int) (j >> 32)) / density)), (Integer) null, Integer.valueOf(mwa.L(((int) (4294967295L & j)) / density)), (Integer) null, 10, (mq5) null);
                        } else {
                            containerDimensions = null;
                        }
                        e18Var2.k0(containerDimensions);
                        objN7 = containerDimensions;
                    }
                    ContainerDimensions containerDimensions2 = (ContainerDimensions) objN7;
                    FillElement fillElement = androidx.compose.foundation.layout.b.c;
                    iqb iqbVarP = yfd.p(fillElement, gm3.a(e18Var2).o, zni.b);
                    Object objN8 = e18Var2.N();
                    if (objN8 == lz1Var) {
                        objN8 = new ol5(14, nwbVar3);
                        e18Var2.k0(objN8);
                    }
                    iqb iqbVarV0 = wd6.v0(iqbVarP, (bz7) objN8);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarV0);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    String strB = zxaVar2.b();
                    boolean zF2 = e18Var2.f(zxaVar2) | e18Var2.h(eliVar);
                    Object objN9 = e18Var2.N();
                    if (zF2 || objN9 == lz1Var) {
                        objN9 = new ny4(zxaVar2, eliVar, nwbVar2, 18);
                        e18Var2.k0(objN9);
                    }
                    int i4 = (SafeAreaInsets.$stable << 6) | 1572864 | (ContainerDimensions.$stable << 9);
                    fj0 fj0Var2 = fj0Var;
                    zy7 zy7Var2 = zy7Var;
                    lok.b(strB, fj0Var2, safeAreaInsets, containerDimensions2, zy7Var2, (bz7) objN9, fillElement, null, null, null, e18Var2, i4);
                    String strA = zxaVar2.a();
                    iqb iqbVarM = knk.M(nw1.a.a(androidx.compose.foundation.layout.b.c(fqb.E, 1.0f), lja.H), s4i.d(e18Var2).f);
                    Object objN10 = e18Var2.N();
                    if (objN10 == lz1Var) {
                        objN10 = new tn(iscVar, 5);
                        e18Var2.k0(objN10);
                    }
                    csg.e(0, e18Var2, zy7Var2, wd6.v0(iqbVarM, (bz7) objN10), strA);
                    e18Var2.p(true);
                    return ieiVar;
                }
            }, e18Var), e18Var, ((i3 >> 9) & 112) | 200064, 16);
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ja3(zxaVar, fj0Var, f2, zy7Var, iqbVar2, i2);
        }
    }

    public static final void i(zy7 zy7Var, iqb iqbVar, boolean z, e0g e0gVar, n02 n02Var, qu1 qu1Var, mnc mncVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        boolean z2;
        n02 n02Var2;
        mnc mncVar2;
        n02 n02Var3;
        int i3;
        mnc mncVar3;
        boolean z3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(399974542);
        int i4 = i2 | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16) | 384 | (e18Var.f(e0gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 204800 | (e18Var.f(qu1Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | 113246208;
        if (e18Var.Q(i4 & 1, (306783379 & i4) != 306783378)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                qnc qncVar = q02.a;
                n54 n54Var = ((gwa) e18Var.j(jwa.a)).a;
                n02Var3 = n54Var.X;
                if (n02Var3 == null) {
                    long j = d54.g;
                    n02Var3 = new n02(j, p54.c(n54Var, tuj.i()), j, d54.b(tuj.g(), p54.c(n54Var, tuj.f())));
                    n54Var.X = n02Var3;
                }
                i3 = i4 & (-57345);
                mncVar3 = q02.a;
                z3 = true;
            } else {
                e18Var.T();
                i3 = i4 & (-57345);
                z3 = z;
                n02Var3 = n02Var;
                mncVar3 = mncVar;
            }
            e18Var.q();
            a(zy7Var, iqbVar, z3, e0gVar, n02Var3, null, qu1Var, mncVar3, null, ta4Var, e18Var, i3 & 2147483646, 0);
            z2 = z3;
            n02Var2 = n02Var3;
            mncVar2 = mncVar3;
        } else {
            e18Var.T();
            z2 = z;
            n02Var2 = n02Var;
            mncVar2 = mncVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new su(zy7Var, iqbVar, z2, e0gVar, n02Var2, qu1Var, mncVar2, ta4Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.zy7 r23, defpackage.iqb r24, boolean r25, defpackage.e0g r26, defpackage.n02 r27, defpackage.qu1 r28, defpackage.mnc r29, defpackage.rz7 r30, defpackage.ld4 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csg.j(zy7, iqb, boolean, e0g, n02, qu1, mnc, rz7, ld4, int, int):void");
    }

    public static final void k(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String) {
                    editorEdit.putString(entry.getKey(), (String) value);
                } else if (value instanceof Set) {
                    editorEdit.putStringSet(entry.getKey(), (Set) value);
                } else if (value instanceof Integer) {
                    editorEdit.putInt(entry.getKey(), ((Number) value).intValue());
                } else if (value instanceof Long) {
                    editorEdit.putLong(entry.getKey(), ((Number) value).longValue());
                } else if (value instanceof Float) {
                    editorEdit.putFloat(entry.getKey(), ((Number) value).floatValue());
                } else if (value instanceof Boolean) {
                    editorEdit.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
                } else {
                    SilentException.a(new SilentException(ij0.h("Unsupported value type for preference key: ", entry.getKey())), null, false, 3);
                }
            }
        }
        editorEdit.apply();
    }

    public static final String l(Object[] objArr, int i2, int i3, f3 f3Var) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == f3Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void m(Appendable appendable, Object obj, bz7 bz7Var) throws IOException {
        appendable.getClass();
        if (bz7Var != null) {
            appendable.append((CharSequence) bz7Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final String n(Thread.State state) {
        switch (snh.a[state.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "blocked";
            case 3:
                return "runnable";
            case 4:
                return "terminated";
            case 5:
                return "timed_waiting";
            case 6:
                return "waiting";
            default:
                mr9.b();
                return null;
        }
    }

    public static final void o(AutoCloseable autoCloseable, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    vb7.C(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    mwa.p(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    mr9.y();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final Object p(tp4 tp4Var, lp7 lp7Var, zy7 zy7Var, rz7 rz7Var, kp7[] kp7VarArr) throws Throwable {
        w64 w64Var = new w64(null, lp7Var, zy7Var, rz7Var, kp7VarArr);
        np7 np7Var = new np7(tp4Var, tp4Var.getContext());
        Object objW = gb9.W(np7Var, true, np7Var, w64Var);
        return objW == m45.E ? objW : iei.a;
    }

    public static fu5 q(rwe rweVar, ld4 ld4Var, int i2) {
        rweVar.getClass();
        bb1 bb1VarD = ((swe) ((e18) ld4Var).j(twe.a)).a.d();
        int i3 = 1;
        return iv1.P(new hu5(new hu5(nai.x(), i3, new hu5(kxk.N(0, 0, null, 7), 0, new ke7(i3))), i3, dch.Q(3)), r(rweVar, bb1VarD, ld4Var, i2 & 1022, 0), 2);
    }

    public static bz7 r(rwe rweVar, bb1 bb1Var, ld4 ld4Var, int i2, int i3) {
        rweVar.getClass();
        if ((i3 & 2) != 0) {
            bb1Var = ((swe) ((e18) ld4Var).j(twe.a)).a.d();
        }
        boolean z = ((((i2 & 112) ^ 48) > 32 && ((e18) ld4Var).h(bb1Var)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && ((e18) ld4Var).h(rweVar)) || (i2 & 6) == 4);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (z || objN == jd4.a) {
            objN = new vk3(bb1Var, 28, rweVar);
            e18Var.k0(objN);
        }
        return (bz7) objN;
    }

    public static final iqb s(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new lh6(bz7Var));
    }

    public static final void t(xd6 xd6Var, ja8 ja8Var) {
        ja8Var.c(xd6Var.B0().p(), (ja8) xd6Var.B0().F);
    }

    public static final boolean u(long j, long j2) {
        return j == j2;
    }

    public static final iqb v(iqb iqbVar, e0g e0gVar, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new jua(7);
            e18Var.k0(objN);
        }
        return yfd.p(ez1.t(xn5.V(iqbVar.B(new lr1(e0gVar, (bz7) objN)), e0gVar), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).t, e0gVar), gm3.a(e18Var).n, e0gVar);
    }

    public static final void w(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static ca x(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("current_locale");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            strM.getClass();
            return new ca(strM, strM2);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Application", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Application", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Application", e4);
            return null;
        }
    }

    public static final long y(long j) {
        return (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
    }

    public static final float z(float f2, ld4 ld4Var) {
        return ((cz5) ((e18) ld4Var).j(ve4.h)).D(eve.L(f2, 4294967296L));
    }
}
