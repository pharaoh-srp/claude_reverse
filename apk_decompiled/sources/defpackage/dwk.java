package defpackage;

import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dwk {
    public static final byte[] a = new byte[0];
    public static Constructor b = null;
    public static final float c = 0.38f;

    public static final void a(u9d u9dVar, ta4 ta4Var, l2i l2iVar, iqb iqbVar, ta4 ta4Var2, ld4 ld4Var, int i) {
        u9d u9dVar2;
        int i2;
        nwb nwbVar;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1221877520);
        if ((i & 6) == 0) {
            u9dVar2 = u9dVar;
            i2 = (e18Var.f(u9dVar2) ? 4 : 2) | i;
        } else {
            u9dVar2 = u9dVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(l2iVar) : e18Var.h(l2iVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(null) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i2 |= e18Var.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.g(true) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var.h(ta4Var2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            e18Var.a0(-1104742522);
            e18Var.p(false);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            if (l2iVar.b()) {
                e18Var.a0(-1891243071);
                c(u9dVar2, l2iVar, l45Var, false, nwbVar2, ta4Var, e18Var, ((i3 << 15) & 3670016) | (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896));
                nwbVar = nwbVar2;
                e18Var = e18Var;
                z = false;
                e18Var.p(false);
            } else {
                nwbVar = nwbVar2;
                z = false;
                e18Var.a0(-1890863476);
                e18Var.p(false);
            }
            int i4 = 14;
            d(l2iVar, nwbVar, iqbVar, ta4Var2, e18Var, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            e18Var.p(true);
            boolean z2 = ((i3 & 896) == 256 || ((i3 & 512) != 0 && e18Var.h(l2iVar))) ? true : z;
            Object objN3 = e18Var.N();
            if (z2 || objN3 == lz1Var) {
                objN3 = new v0(i4, l2iVar);
                e18Var.k0(objN3);
            }
            fd9.d(l2iVar, (bz7) objN3, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) u9dVar, (Object) ta4Var, (Object) l2iVar, iqbVar, (Object) ta4Var2, i, 3);
        }
    }

    public static final void b(final j4d j4dVar, final tw0 tw0Var, final List list, final boolean z, final zy7 zy7Var, final zy7 zy7Var2, final bz7 bz7Var, final bz7 bz7Var2, final bz7 bz7Var3, final rz7 rz7Var, iqb iqbVar, final boolean z2, ld4 ld4Var, final int i) {
        iqb iqbVar2;
        int i2;
        zy7 zy7Var3;
        list.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        rz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1332666284);
        int i3 = i | (e18Var.h(j4dVar) ? 4 : 2) | (e18Var.f(tw0Var) ? 32 : 16) | (e18Var.f(list) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var2) ? 131072 : 65536) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(bz7Var2) ? 8388608 : 4194304) | (e18Var.h(bz7Var3) ? 67108864 : 33554432) | (e18Var.h(rz7Var) ? 536870912 : 268435456);
        int i4 = (e18Var.f(iqbVar) ? 4 : 2) | (e18Var.g(z2) ? 32 : 16);
        int i5 = 1;
        if (!e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            iqbVar2 = iqbVar;
            e18Var.T();
        } else if (tw0Var != null) {
            e18Var.a0(1217027166);
            fuk.a(tw0Var, iqbVar, e18Var, ((i3 >> 3) & 14) | ((i4 << 3) & 112));
            e18Var.p(false);
            iqbVar2 = iqbVar;
        } else if (j4dVar != null) {
            e18Var.a0(1217213073);
            uuj.c(zy7Var, zy7Var2, iqbVar, z, e18Var, ((i4 << 6) & 896) | ((i3 >> 12) & 126) | (i3 & 7168), 0);
            iqbVar2 = iqbVar;
            e18Var.p(false);
        } else {
            iqbVar2 = iqbVar;
            if (list.isEmpty()) {
                e18Var.a0(1218372814);
                e18Var.p(false);
            } else {
                e18Var.a0(1217528870);
                q64 q64VarA = p64.a(new ho0(8.0f, true, new sz6(i5)), lja.S, e18Var, 6);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, iqbVar2);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, q64VarA);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                final lwc lwcVar = (lwc) w44.L0(list);
                boolean zH = ((i3 & 3670016) == 1048576) | e18Var.h(lwcVar);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zH || objN == lz1Var) {
                    final int i6 = 0;
                    objN = new zy7() { // from class: c89
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i7 = i6;
                            iei ieiVar = iei.a;
                            lwc lwcVar2 = lwcVar;
                            bz7 bz7Var4 = bz7Var;
                            switch (i7) {
                                case 0:
                                    bz7Var4.invoke(lwcVar2.b);
                                    break;
                                case 1:
                                    bz7Var4.invoke(lwcVar2.b);
                                    break;
                                default:
                                    bz7Var4.invoke(lwcVar2.b);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN);
                }
                zy7 zy7Var4 = (zy7) objN;
                if (lwcVar.h) {
                    e18Var.a0(297270503);
                    boolean zH2 = ((29360128 & i3) == 8388608) | e18Var.h(lwcVar);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        final int i7 = 1;
                        objN2 = new zy7() { // from class: c89
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i72 = i7;
                                iei ieiVar = iei.a;
                                lwc lwcVar2 = lwcVar;
                                bz7 bz7Var4 = bz7Var2;
                                switch (i72) {
                                    case 0:
                                        bz7Var4.invoke(lwcVar2.b);
                                        break;
                                    case 1:
                                        bz7Var4.invoke(lwcVar2.b);
                                        break;
                                    default:
                                        bz7Var4.invoke(lwcVar2.b);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var.k0(objN2);
                    }
                    zy7Var3 = (zy7) objN2;
                    i2 = 3670016;
                    e18Var.p(false);
                } else {
                    i2 = 3670016;
                    e18Var.a0(297367440);
                    e18Var.p(false);
                    zy7Var3 = null;
                }
                boolean zH3 = ((234881024 & i3) == 67108864) | e18Var.h(lwcVar);
                Object objN3 = e18Var.N();
                if (zH3 || objN3 == lz1Var) {
                    final int i8 = 2;
                    objN3 = new zy7() { // from class: c89
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i72 = i8;
                            iei ieiVar = iei.a;
                            lwc lwcVar2 = lwcVar;
                            bz7 bz7Var4 = bz7Var3;
                            switch (i72) {
                                case 0:
                                    bz7Var4.invoke(lwcVar2.b);
                                    break;
                                case 1:
                                    bz7Var4.invoke(lwcVar2.b);
                                    break;
                                default:
                                    bz7Var4.invoke(lwcVar2.b);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN3);
                }
                nvh.b(lwcVar, zy7Var4, zy7Var3, (zy7) objN3, rz7Var, null, z2, e18Var, ((i3 >> 15) & 57344) | 8 | ((i4 << 15) & i2), 32);
                e18Var = e18Var;
                e18Var.p(true);
                e18Var.p(false);
            }
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final iqb iqbVar3 = iqbVar2;
            r7eVarS.d = new pz7(tw0Var, list, z, zy7Var, zy7Var2, bz7Var, bz7Var2, bz7Var3, rz7Var, iqbVar3, z2, i) { // from class: d89
                public final /* synthetic */ tw0 F;
                public final /* synthetic */ List G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ zy7 I;
                public final /* synthetic */ zy7 J;
                public final /* synthetic */ bz7 K;
                public final /* synthetic */ bz7 L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ rz7 N;
                public final /* synthetic */ iqb O;
                public final /* synthetic */ boolean P;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    dwk.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(u9d u9dVar, l2i l2iVar, l45 l45Var, boolean z, nwb nwbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1413720282);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(u9dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(l2iVar) : e18Var.h(l2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(null) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(l45Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(nwbVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            String strJ0 = d4c.j0(R.string.tooltip_description, e18Var);
            boolean zH = ((i2 & 112) == 32 || ((i2 & 64) != 0 && e18Var.h(l2iVar))) | ((i2 & 896) == 256) | e18Var.h(l45Var) | ((458752 & i2) == 131072);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new ei(l2iVar, l45Var, nwbVar, 7);
                e18Var.k0(objN);
            }
            u40.a(u9dVar, (zy7) objN, new v9d(z, 22), fd9.q0(-1287705660, new og1(strJ0, ta4Var), e18Var), e18Var, (i2 & 14) | 3072, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(u9dVar, l2iVar, l45Var, z, nwbVar, ta4Var, i, 0);
        }
    }

    public static final void d(l2i l2iVar, nwb nwbVar, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1873232064);
        int i3 = 1;
        if ((i & 6) == 0) {
            i2 = (e18Var.g(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(l2iVar) : e18Var.h(l2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(nwbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = 0;
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(false) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(ta4Var) ? 131072 : 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            String strJ0 = d4c.j0(R.string.tooltip_label, e18Var);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            iqb iqbVarN = dch.N(u00.C(a0h.a(a0h.a(iqbVar, l2iVar, new tg1(l2iVar, i4)), l2iVar, new tg1(l2iVar, i3)).B(new psc(new l6(strJ0, l45Var, l2iVar, 8))), new l6(l45Var, nwbVar2, l2iVar, 7)), new kc(l2iVar, nwbVar, nwbVar2, i3));
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
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
            vb7.y((i2 >> 15) & 14, ta4Var, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(l2iVar, nwbVar, iqbVar, ta4Var, i, 7);
        }
    }

    public static final j7g e(yr9 yr9Var) {
        yr9Var.getClass();
        fhi fhiVarK0 = yr9Var.k0();
        j7g j7gVar = fhiVarK0 instanceof j7g ? (j7g) fhiVarK0 : null;
        if (j7gVar != null) {
            return j7gVar;
        }
        xh6.d("This is should be simple type: ", yr9Var);
        return null;
    }

    public static final d8g f(yjh yjhVar, int i, int i2, int i3, long j, boolean z, boolean z2) {
        ohf ohfVar;
        if (z) {
            ohfVar = null;
        } else {
            int i4 = kkh.c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            ohfVar = new ohf(new nhf(bwk.i(yjhVar, i5), i5, 1L), new nhf(bwk.i(yjhVar, i6), i6, 1L), kkh.h(j));
        }
        return new d8g(z2, 1, 1, ohfVar, new tgf(1L, 1, i, i2, i3, yjhVar));
    }

    public static Object g(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = b;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            b = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static final j7g h(j7g j7gVar, List list, r9i r9iVar) {
        j7gVar.getClass();
        list.getClass();
        r9iVar.getClass();
        if (list.isEmpty() && r9iVar == j7gVar.K()) {
            return j7gVar;
        }
        if (list.isEmpty()) {
            return j7gVar.n0(r9iVar);
        }
        if (!(j7gVar instanceof ku6)) {
            return yfd.c0(r9iVar, j7gVar.O(), list, j7gVar.b0());
        }
        ku6 ku6Var = (ku6) j7gVar;
        u9i u9iVar = ku6Var.F;
        gu6 gu6Var = ku6Var.G;
        mu6 mu6Var = ku6Var.H;
        boolean z = ku6Var.J;
        String[] strArr = ku6Var.K;
        return new ku6(u9iVar, gu6Var, mu6Var, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static yr9 i(yr9 yr9Var, List list, wc0 wc0Var, int i) {
        if ((i & 2) != 0) {
            wc0Var = yr9Var.getAnnotations();
        }
        yr9Var.getClass();
        if ((list.isEmpty() || list == yr9Var.H()) && wc0Var == yr9Var.getAnnotations()) {
            return yr9Var;
        }
        r9i r9iVarK = yr9Var.K();
        if ((wc0Var instanceof zk7) && ((zk7) wc0Var).isEmpty()) {
            wc0Var = dd8.F;
        }
        r9i r9iVarM = rvk.m(r9iVarK, wc0Var);
        fhi fhiVarK0 = yr9Var.k0();
        if (fhiVarK0 instanceof sn7) {
            sn7 sn7Var = (sn7) fhiVarK0;
            return yfd.z(h(sn7Var.F, list, r9iVarM), h(sn7Var.G, list, r9iVarM));
        }
        if (fhiVarK0 instanceof j7g) {
            return h((j7g) fhiVarK0, list, r9iVarM);
        }
        wg6.i();
        return null;
    }

    public static /* synthetic */ j7g j(j7g j7gVar, List list, r9i r9iVar, int i) {
        if ((i & 1) != 0) {
            list = j7gVar.H();
        }
        if ((i & 2) != 0) {
            r9iVar = j7gVar.K();
        }
        return h(j7gVar, list, r9iVar);
    }

    public static final c56 k(c56 c56Var, c56 c56Var2) {
        int iOrdinal = c56Var2.ordinal();
        c56 c56Var3 = c56.E;
        if (iOrdinal != 0) {
            c56 c56Var4 = c56.G;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return c56Var4;
                }
                wg6.i();
                return null;
            }
            int iOrdinal2 = c56Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return c56.F;
                }
                if (iOrdinal2 == 2) {
                    return c56Var4;
                }
                wg6.i();
                return null;
            }
        }
        return c56Var3;
    }
}
