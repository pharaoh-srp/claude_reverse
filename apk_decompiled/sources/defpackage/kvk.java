package defpackage;

import androidx.compose.foundation.b;
import androidx.compose.material3.d;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kvk {
    public static final ta4 a = new ta4(-54378496, false, new ic4(7));

    public static final void a(s51 s51Var, List list, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1827325489);
        int i2 = i | (e18Var.h(s51Var) ? 4 : 2) | (e18Var.f(list) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            String strK0 = d4c.k0(R.string.audio_route_chip_a11y, new Object[]{j(s51Var, e18Var)}, e18Var);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
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
            mo8 mo8Var = z79.a;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = vb7.f(e18Var);
            }
            zub zubVar = (zub) objN2;
            d dVarA = due.a(false, 24.0f, 0L, null, false, 252);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new ve(13, nwbVar);
                e18Var.k0(objN3);
            }
            iqb iqbVarB = b.b(pkb.E, zubVar, dVarA, false, null, null, (zy7) objN3, 28);
            boolean zF = e18Var.f(strK0);
            Object objN4 = e18Var.N();
            int i3 = 14;
            if (zF || objN4 == lz1Var) {
                objN4 = new o8(strK0, i3);
                e18Var.k0(objN4);
            }
            iqb iqbVarB2 = tjf.b(iqbVarB, true, (bz7) objN4);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarB2);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            wo1 wo1Var = lja.Q;
            iqb iqbVarP = yfd.p(xn5.V(xn5.t0(fqbVar, 6.0f, gm3.b(e18Var).k, 0L, 0L, 28), gm3.b(e18Var).k), gm3.a(e18Var).n, zni.b);
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v);
            iqb iqbVarN = gb9.N(androidx.compose.foundation.layout.b.g(ez1.u(iqbVarP, qu1VarA.a, qu1VarA.b, gm3.b(e18Var).k), 36.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 10.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 10);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            ud0 ud0VarI = i(s51Var);
            long j = gm3.a(e18Var).M;
            ud0 ud0Var = ud0.d;
            ef2 ef2Var = ef2.F;
            iv1.b(ud0VarI, null, null, ef2Var, j, e18Var, 3120, 4);
            iv1.b(ud0.B, null, gb9.N(fqbVar, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), ef2Var, gm3.a(e18Var).N, e18Var, 3504, 0);
            e18Var.p(true);
            e18Var.p(true);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new ve(14, nwbVar);
                e18Var.k0(objN5);
            }
            j8.b(zBooleanValue, (zy7) objN5, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-452746696, new bn(4, nwbVar, list, s51Var, bz7Var), e18Var), e18Var, 48, 2044);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn((Object) s51Var, (Object) list, bz7Var, iqbVar2, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r36, final defpackage.zy7 r37, final defpackage.iqb r38, java.lang.String r39, boolean r40, defpackage.pz7 r41, defpackage.pz7 r42, boolean r43, defpackage.zy7 r44, int r45, defpackage.mnc r46, defpackage.nxf r47, defpackage.ld4 r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvk.b(java.lang.String, zy7, iqb, java.lang.String, boolean, pz7, pz7, boolean, zy7, int, mnc, nxf, ld4, int, int, int):void");
    }

    public static final Object c(Object obj, e92 e92Var) {
        yr9 yr9VarG;
        Class clsN;
        return (((e92Var instanceof hrd) && g39.c((iri) e92Var)) || (yr9VarG = g(e92Var)) == null || (clsN = n(yr9VarG)) == null) ? obj : h(clsN, e92Var).invoke(obj, null);
    }

    public static final d9j d(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return null;
        }
        return i == 0 ? d9j.E : d9j.F;
    }

    public static long e(int i, d9j d9jVar) {
        int i2 = od5.a[d9jVar.ordinal()];
        int i3 = -1;
        if (i2 != -1) {
            i3 = 1;
            if (i2 == 1) {
                i3 = 0;
            } else if (i2 != 2) {
                wg6.i();
                return 0L;
            }
        }
        return (((long) i) << 32) | (((long) i3) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.q92 f(defpackage.e92 r2, defpackage.q92 r3, boolean r4) {
        /*
            r2.getClass()
            int r0 = defpackage.g39.a
            boolean r0 = r2 instanceof defpackage.krd
            if (r0 == 0) goto L1a
            r0 = r2
            krd r0 = (defpackage.krd) r0
            hrd r0 = r0.N0()
            r0.getClass()
            boolean r0 = defpackage.g39.c(r0)
            if (r0 == 0) goto L1a
            goto L6d
        L1a:
            java.util.List r0 = r2.I()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L31
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L31
            goto L4f
        L31:
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            eri r1 = (defpackage.eri) r1
            yr9 r1 = r1.getType()
            r1.getClass()
            boolean r1 = defpackage.g39.b(r1)
            if (r1 == 0) goto L35
            goto L6d
        L4f:
            yr9 r0 = r2.getReturnType()
            r1 = 1
            if (r0 == 0) goto L5d
            boolean r0 = defpackage.g39.b(r0)
            if (r0 != r1) goto L5d
            goto L6d
        L5d:
            boolean r0 = r3 instanceof defpackage.kv1
            if (r0 != 0) goto L73
            yr9 r0 = g(r2)
            if (r0 == 0) goto L73
            boolean r0 = defpackage.g39.b(r0)
            if (r0 != r1) goto L73
        L6d:
            w29 r0 = new w29
            r0.<init>(r2, r3, r4)
            return r0
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvk.f(e92, q92, boolean):q92");
    }

    public static final yr9 g(e92 e92Var) {
        l6e l6eVarS = e92Var.S();
        l6e l6eVarP = e92Var.P();
        if (l6eVarS != null) {
            return ((mw9) l6eVarS).getType();
        }
        if (l6eVarP != null) {
            if (e92Var instanceof dm4) {
                return ((mw9) l6eVarP).getType();
            }
            bo5 bo5VarH = e92Var.h();
            qqb qqbVar = bo5VarH instanceof qqb ? (qqb) bo5VarH : null;
            if (qqbVar != null) {
                return qqbVar.W();
            }
        }
        return null;
    }

    public static final Method h(Class cls, e92 e92Var) {
        e92Var.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + e92Var + ')');
        }
    }

    public static final ud0 i(s51 s51Var) {
        if (x44.r(s51Var, r51.a) || s51Var == null) {
            return ud0.q1;
        }
        if (s51Var instanceof q51) {
            return ud0.v;
        }
        wg6.i();
        return null;
    }

    public static final String j(s51 s51Var, ld4 ld4Var) {
        if (x44.r(s51Var, r51.a) || s51Var == null) {
            e18 e18Var = (e18) ld4Var;
            return vb7.n(e18Var, 2079407733, R.string.audio_route_speaker, e18Var, false);
        }
        if (!(s51Var instanceof q51)) {
            throw ebh.u((e18) ld4Var, 2079406400, false);
        }
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.a0(37207103);
        String strJ0 = ((q51) s51Var).b;
        if (bsg.I0(strJ0)) {
            strJ0 = d4c.j0(R.string.audio_route_bluetooth, e18Var2);
        }
        e18Var2.p(false);
        return strJ0;
    }

    public static long k(ssc sscVar, int i, int i2) {
        sscVar.M(i);
        if (sscVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = sscVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || sscVar.z() < 7 || sscVar.a() < 7 || (sscVar.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        sscVar.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final uoh l(ha1 ha1Var, l0 l0Var) {
        av9 av9VarW = yfd.W(ha1Var);
        int i = av9VarW.F;
        n9e rectManager = dv9.a(av9VarW).getRectManager();
        voh vohVar = rectManager.c;
        vohVar.getClass();
        xub xubVar = vohVar.a;
        uoh uohVar = new uoh(vohVar, i, ha1Var, l0Var);
        Object objB = xubVar.b(i);
        if (objB == null) {
            xubVar.i(i, uohVar);
            objB = uohVar;
        }
        uoh uohVar2 = (uoh) objB;
        if (uohVar2 != uohVar) {
            while (true) {
                uoh uohVar3 = uohVar2.d;
                if (uohVar3 == null) {
                    break;
                }
                uohVar2 = uohVar3;
            }
            uohVar2.d = uohVar;
        }
        if (yfd.W(ha1Var.E).K) {
            rectManager.b.i(i, true);
        }
        rectManager.e = true;
        rectManager.i();
        return uohVar;
    }

    public static final Class m(bo5 bo5Var) {
        if (!(bo5Var instanceof qqb) || !g39.a(bo5Var)) {
            return null;
        }
        qqb qqbVar = (qqb) bo5Var;
        Class clsJ = vpi.j(qqbVar);
        if (clsJ != null) {
            return clsJ;
        }
        StringBuilder sb = new StringBuilder("Class object for the class ");
        sb.append(qqbVar.getName());
        gh3 gh3VarF = o06.f((xh3) bo5Var);
        sb.append(" cannot be found (classId=");
        sb.append(gh3VarF);
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }

    public static final Class n(yr9 yr9Var) {
        j7g j7gVarD;
        yr9Var.getClass();
        Class clsM = m(yr9Var.O().a());
        if (clsM == null) {
            return null;
        }
        if (fbi.e(yr9Var) && ((j7gVarD = g39.d(yr9Var)) == null || fbi.e(j7gVarD) || or9.E(j7gVarD))) {
            return null;
        }
        return clsM;
    }
}
