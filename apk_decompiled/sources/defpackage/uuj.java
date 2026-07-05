package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.EOFException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uuj {
    public static final ta4 a = new ta4(-1211066475, false, new p6(26));
    public static final String[] b = {"image/*", "video/*"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r27, final defpackage.bpc r28, final defpackage.zy7 r29, defpackage.iqb r30, defpackage.bpc r31, boolean r32, java.lang.Boolean r33, defpackage.ycb r34, defpackage.e0g r35, defpackage.mnc r36, int r37, int r38, defpackage.ld4 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuj.a(java.lang.String, bpc, zy7, iqb, bpc, boolean, java.lang.Boolean, ycb, e0g, mnc, int, int, ld4, int, int):void");
    }

    public static final void b(String str, String str2, iqb iqbVar, qnc qncVar, xm8 xm8Var, ld4 ld4Var, int i) {
        xm8 xm8Var2;
        int i2;
        xm8 xm8Var3;
        om8 om8Var;
        xm8 xm8Var4;
        String str3;
        str.getClass();
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1456951986);
        int i3 = (e18Var.f(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.f(qncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i4 = i3 | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(xm8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i4 & (-57345);
                xm8Var3 = (xm8) objN;
            } else {
                e18Var.T();
                i2 = i4 & (-57345);
                xm8Var3 = xm8Var;
            }
            e18Var.q();
            om8 om8Var2 = v40.F(e18Var) ? q54.b : q54.c;
            boolean z = (i2 & 14) == 4;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                List listX0 = bsg.X0(str, new char[]{'\n'}, 6);
                ArrayList arrayList = new ArrayList(x44.y(listX0, 10));
                Iterator it = listX0.iterator();
                while (it.hasNext()) {
                    arrayList.add(bsg.T0((String) it.next(), "\r"));
                }
                e18Var.k0(arrayList);
                objN2 = arrayList;
            }
            List list = (List) objN2;
            boolean zF2 = e18Var.f(list);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = w44.F0(list, 2000);
                e18Var.k0(objN3);
            }
            List list2 = (List) objN3;
            boolean zF3 = e18Var.f(list);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = mpk.P(null);
                e18Var.k0(objN4);
            }
            nwb nwbVar = (nwb) objN4;
            boolean zF4 = ((i2 & 112) == 32) | e18Var.f(nwbVar) | e18Var.h(xm8Var3) | e18Var.h(list) | e18Var.h(om8Var2);
            Object objN5 = e18Var.N();
            if (zF4 || objN5 == lz1Var) {
                om8Var = om8Var2;
                k36 k36Var = new k36(xm8Var3, list, str2, om8Var, nwbVar, (tp4) null);
                xm8Var4 = xm8Var3;
                str3 = str2;
                e18Var.k0(k36Var);
                objN5 = k36Var;
            } else {
                xm8Var4 = xm8Var3;
                om8Var = om8Var2;
                str3 = str2;
            }
            fd9.k(list, str3, om8Var, (pz7) objN5, e18Var);
            boolean zF5 = e18Var.f(om8Var);
            Object objN6 = e18Var.N();
            if (zF5 || objN6 == lz1Var) {
                objN6 = new tkh(d4c.m(om8Var.a), eve.B(14), null, null, xt7.H, eve.B(0), 0L, 0, 0, 0L, null, 16777052);
                e18Var.k0(objN6);
            }
            tkh tkhVar = (tkh) objN6;
            iqb iqbVarB0 = mpk.b0(iqbVar.B(b.c), mpk.Y(e18Var), false);
            boolean zH = e18Var.h(list2) | e18Var.f(nwbVar) | e18Var.f(tkhVar);
            Object objN7 = e18Var.N();
            if (zH || objN7 == lz1Var) {
                objN7 = new ny4(list2, tkhVar, nwbVar, 13);
                e18Var.k0(objN7);
            }
            knk.h(iqbVarB0, null, qncVar, false, null, null, null, false, null, (bz7) objN7, e18Var, (i2 >> 3) & 896, 506);
            xm8Var2 = xm8Var4;
        } else {
            e18Var.T();
            xm8Var2 = xm8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new o34(str, str2, iqbVar, qncVar, xm8Var2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.zy7 r20, defpackage.zy7 r21, defpackage.iqb r22, boolean r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuj.c(zy7, zy7, iqb, boolean, ld4, int, int):void");
    }

    public static String d(Constructor constructor) {
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(yae.b(cls));
        }
        sb.append(")V");
        return sb.toString();
    }

    public static String e(Field field) {
        Class<?> type = field.getType();
        type.getClass();
        return yae.b(type);
    }

    public static final wa1 f(Iterable iterable) {
        Object objPrevious;
        List listI1 = w44.i1(iterable, new x8e(18));
        ListIterator listIterator = listI1.listIterator(listI1.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            va1 va1Var = ((wa1) objPrevious).c;
            wa1.d[0].getClass();
            if (((Boolean) va1Var.a).booleanValue()) {
                break;
            }
        }
        return (wa1) objPrevious;
    }

    public static String g(Method method) {
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(yae.b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(yae.b(returnType));
        return sb.toString();
    }

    public static m1c h(RealBufferedSource realBufferedSource) throws EOFException {
        int i = Integer.parseInt(realBufferedSource.O(Long.MAX_VALUE));
        long j = Long.parseLong(realBufferedSource.O(Long.MAX_VALUE));
        long j2 = Long.parseLong(realBufferedSource.O(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = Integer.parseInt(realBufferedSource.O(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strO = realBufferedSource.O(Long.MAX_VALUE);
            int iF0 = bsg.F0(strO, ':', 0, 6);
            if (iF0 == -1) {
                mr9.q("Unexpected header: ".concat(strO));
                return null;
            }
            String string = bsg.k1(strO.substring(0, iF0)).toString();
            String strSubstring = strO.substring(iF0 + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new m1c(i, j, j2, new z0c(sta.q0(linkedHashMap)), null, null);
    }

    public static final q2d i(int i, boolean z, bz7 bz7Var, ld4 ld4Var, int i2, int i3) {
        bz7Var.getClass();
        boolean z2 = (i3 & 2) != 0 ? false : z;
        e18 e18Var = (e18) ld4Var;
        Context applicationContext = ((Context) e18Var.j(w00.b)).getApplicationContext();
        int i4 = i2 & 14;
        nwb nwbVarZ = mpk.Z(Integer.valueOf(i), e18Var);
        int i5 = (i2 & 112) ^ 48;
        boolean z3 = (i5 > 32 && e18Var.g(z2)) || (i2 & 48) == 32;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (z3 || objN == lz1Var) {
            objN = z2 ? new l38() : new sc();
            e18Var.k0(objN);
        }
        sc scVar = (sc) objN;
        boolean z4 = (i5 > 32 && e18Var.g(z2)) || (i2 & 48) == 32;
        Object objN2 = e18Var.N();
        if (z4 || objN2 == lz1Var) {
            objN2 = z2 ? new y38() : new tc();
            e18Var.k0(objN2);
        }
        tc tcVar = (tc) objN2;
        String str = z2 ? "*/*" : "image/*";
        int i6 = (i2 & 896) ^ 384;
        boolean z5 = (i6 > 256 && e18Var.f(bz7Var)) || (i2 & 384) == 256;
        Object objN3 = e18Var.N();
        if (z5 || objN3 == lz1Var) {
            objN3 = new f7(16, bz7Var);
            e18Var.k0(objN3);
        }
        xpa xpaVarD0 = sf5.d0(scVar, (bz7) objN3, e18Var, 0);
        int i7 = 4;
        boolean zH = ((i6 > 256 && e18Var.f(bz7Var)) || (i2 & 384) == 256) | (((i4 ^ 6) > 4 && e18Var.d(i)) || (i2 & 6) == 4) | e18Var.h(applicationContext);
        Object objN4 = e18Var.N();
        if (zH || objN4 == lz1Var) {
            objN4 = new ov0(i, applicationContext, bz7Var, i7);
            e18Var.k0(objN4);
        }
        xpa xpaVarD02 = sf5.d0(tcVar, (bz7) objN4, e18Var, 0);
        boolean zF = e18Var.f(str);
        Object objN5 = e18Var.N();
        if (zF || objN5 == lz1Var) {
            objN5 = new q2d(nwbVarZ, xpaVarD0, xpaVarD02, str);
            e18Var.k0(objN5);
        }
        return (q2d) objN5;
    }

    public static void j(m1c m1cVar, RealBufferedSink realBufferedSink) {
        realBufferedSink.d(m1cVar.a);
        realBufferedSink.writeByte(10);
        realBufferedSink.d(m1cVar.b);
        realBufferedSink.writeByte(10);
        realBufferedSink.d(m1cVar.c);
        realBufferedSink.writeByte(10);
        Set<Map.Entry> setEntrySet = m1cVar.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        realBufferedSink.d(size);
        realBufferedSink.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                realBufferedSink.W((String) entry.getKey());
                realBufferedSink.W(":");
                realBufferedSink.W(str);
                realBufferedSink.writeByte(10);
            }
        }
    }
}
