package defpackage;

import android.util.Log;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gpk {
    public static final ta4 a = new ta4(2100963517, false, new sb4(29));

    public static final void a(ml3 ml3Var, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, zy7 zy7Var2, zy7 zy7Var3, uv uvVar, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var4;
        iqb iqbVar2;
        zy7 zy7Var5;
        e18 e18Var;
        uv uvVar2;
        qi3 qi3Var2;
        qi3 qi3Var3;
        int i3;
        uv uvVar3;
        int i4;
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1599652481);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(ml3Var) : e18Var2.h(ml3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var4 = zy7Var;
            i2 |= e18Var2.h(zy7Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var4 = zy7Var;
        }
        if ((i & 3072) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var2.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 24576) == 0) {
            zy7Var5 = zy7Var2;
            i2 |= e18Var2.h(zy7Var5) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            zy7Var5 = zy7Var2;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var2.V();
            int i5 = i & 1;
            int i6 = 3;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, i6);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                uv uvVar4 = (uv) fd9.r0(kceVar.b(uv.class), oq5.B(kceVar.b(uv.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN2;
                i3 = i2 & (-33030145);
                uvVar3 = uvVar4;
            } else {
                e18Var2.T();
                i3 = i2 & (-33030145);
                uvVar3 = uvVar;
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            boolean zH2 = e18Var2.h(qi3Var3);
            Object objN3 = e18Var2.N();
            if (zH2 || objN3 == lz1Var) {
                i4 = 0;
                objN3 = new gw(qi3Var3, tp4Var, i4);
                e18Var2.k0(objN3);
            } else {
                i4 = 0;
            }
            csg.g((bz7) objN3, e18Var2, i4, 1);
            boolean zH3 = e18Var2.h(uvVar3);
            Object objN4 = e18Var2.N();
            if (zH3 || objN4 == lz1Var) {
                objN4 = new dw(uvVar3, i4);
                e18Var2.k0(objN4);
            }
            int i7 = uv.x;
            mwa.d(uvVar3, null, (bz7) objN4, e18Var2, 8);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = sq6.p(e18Var2);
            }
            ybg ybgVar = (ybg) objN5;
            mxd mxdVarD = fxd.d(e18Var2);
            qnc qncVar = n2i.a;
            g77 g77VarA = n2i.a(eg0.h(e18Var2), e18Var2, 14);
            x0a x0aVarA = a1a.a(0, 3, e18Var2);
            zni.g(uvVar3.j, ybgVar, e18Var2, 48);
            e18Var = e18Var2;
            iqb iqbVar3 = iqbVar2;
            v40.b(iqbVar3, null, fd9.q0(-1666169340, new m6(uvVar3, g77VarA, ml3Var, 6), e18Var2), null, fd9.q0(1278387846, new rn(ybgVar, 2), e18Var2), fd9.q0(-1544300857, new fn(uvVar3, zy7Var3, zy7Var5, x0aVarA, 2), e18Var2), 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1097328311, new fw(uvVar3, mxdVarD, g77VarA, bz7Var, zy7Var3, zy7Var4, x0aVarA, 0), e18Var2), e18Var, ((i3 >> 9) & 14) | 221568, 1994);
            qi3Var2 = qi3Var3;
            uvVar2 = uvVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            uvVar2 = uvVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new we((Object) ml3Var, (Object) bz7Var, zy7Var, (Object) iqbVar, (qz7) zy7Var2, (qz7) zy7Var3, (Object) uvVar2, (Object) qi3Var2, i, 1);
        }
    }

    public static final void b(gnd gndVar, List list, bz7 bz7Var, q2i q2iVar, ml3 ml3Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1084151359);
        int i2 = 4;
        int i3 = i | (e18Var.d(gndVar.ordinal()) ? 4 : 2) | (e18Var.f(list) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(q2iVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(ml3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            iqb iqbVarW = zni.w(fqb.E, zh4.n(0L, e18Var, 1).a, null, 6);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarW);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            m2i m2iVarN = zh4.n(0L, e18Var, 1);
            long j = d54.g;
            cok.f(quj.a, q2iVar, null, m2iVarN.a(j, (60 & 2) != 0 ? m2iVarN.b : j, (60 & 4) != 0 ? m2iVarN.c : 0L, (60 & 8) != 0 ? m2iVarN.d : 0L, (60 & 16) != 0 ? m2iVarN.e : 0L, m2iVarN.f), fd9.q0(1940946929, new gl(ml3Var, i2), e18Var), fd9.q0(723004648, new ye((Object) gndVar, list, bz7Var, i2), e18Var), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, ((i3 >> 6) & 112) | 221190, 196);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(gndVar, list, bz7Var, q2iVar, ml3Var, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.z4b r26, java.util.List r27, defpackage.bz7 r28, defpackage.iqb r29, boolean r30, defpackage.mnc r31, defpackage.ld4 r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpk.c(z4b, java.util.List, bz7, iqb, boolean, mnc, ld4, int, int):void");
    }

    public static final void d(String str, char[] cArr, int i) {
        str.getChars(0, str.length(), cArr, i);
    }

    public static String e(f22 f22Var) {
        StringBuilder sb = new StringBuilder(f22Var.size());
        for (int i = 0; i < f22Var.size(); i++) {
            byte bA = f22Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method f(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (str.equals(method.getName()) || isg.q0(method.getName(), str.concat("-"), z)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z2 = z;
                    ?? r12 = z2;
                    for (?? r11 = z2; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        cls.getClass();
                        kce kceVar = jce.a;
                        pl9 pl9VarB = kceVar.b(cls);
                        cls2.getClass();
                        arrayList.add(Boolean.valueOf(pl9VarB.equals(kceVar.b(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i2;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i++;
            z = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method g(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                b79 b79VarH0 = wd6.H0(0, iCeil);
                ArrayList arrayList2 = new ArrayList(x44.y(b79VarH0, 10));
                Iterator it = b79VarH0.iterator();
                while (((a79) it).G) {
                    ((a79) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                wig wigVar = new wig(3);
                ArrayList arrayList3 = wigVar.a;
                wigVar.b(clsArr);
                wigVar.a(ld4.class);
                wigVar.b(clsArr2);
                return f(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!x44.r(method.getName(), str)) {
                    if (!isg.q0(method.getName(), str + '-', false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    public static noe h(qh9 qh9Var) {
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("plan");
            bpe bpeVarE = (bh9VarS == null || (strM2 = bh9VarS.m()) == null) ? null : dqk.e(strM2);
            bh9 bh9VarS2 = qh9Var.s("session_precondition");
            int i = 0;
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (grc.j(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new noe(bpeVarE, i);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type DdSession", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type DdSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type DdSession", e3);
            return null;
        }
    }

    public static void i(String str, String str2, e18 e18Var, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodG = g(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodG != null) {
                methodG.setAccessible(true);
                if (Modifier.isStatic(methodG.getModifiers())) {
                    j(methodG, null, e18Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    j(methodG, cls.getConstructor(null).newInstance(null), e18Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.lang.reflect.Method r10, java.lang.Object r11, defpackage.ld4 r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpk.j(java.lang.reflect.Method, java.lang.Object, ld4, java.lang.Object[]):void");
    }

    public static final String k(z4b z4bVar, ld4 ld4Var) {
        e18 e18Var;
        int i;
        int i2;
        z4bVar.getClass();
        int iOrdinal = z4bVar.ordinal();
        if (iOrdinal == 0) {
            e18Var = (e18) ld4Var;
            i = R.string.mcp_tool_permission_label_allow;
            i2 = -1006388100;
        } else if (iOrdinal == 1) {
            e18Var = (e18) ld4Var;
            i = R.string.mcp_tool_permission_label_ask;
            i2 = -1006385222;
        } else {
            if (iOrdinal != 2) {
                throw ebh.u((e18) ld4Var, -1006389435, false);
            }
            e18Var = (e18) ld4Var;
            i = R.string.mcp_tool_permission_label_never;
            i2 = -1006382276;
        }
        return vb7.n(e18Var, i2, i, e18Var, false);
    }

    public static int l(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
