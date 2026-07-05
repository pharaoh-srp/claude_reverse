package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e2i {
    public static final qnc a = new qnc(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final k2i k2iVar, iqb iqbVar, float f, e0g e0gVar, long j, long j2, final ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var;
        final iqb iqbVar2;
        final float f2;
        final e0g e0gVar2;
        final long j3;
        final long j4;
        long jD;
        int i3;
        long jD2;
        iqb iqbVar3;
        e0g e0gVar3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(k2iVar) : e18Var2.h(k2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= e18Var2.h(ta4Var) ? 536870912 : 268435456;
        }
        if (e18Var2.Q(i5 & 1, (306783379 & i5) != 306783378)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                f2 = c2i.a;
                e0g e0gVarB = k1g.b(yuj.e, e18Var2);
                jD = p54.d(yuj.f, e18Var2);
                i3 = i5 & (-4186113);
                jD2 = p54.d(yuj.d, e18Var2);
                iqbVar3 = fqb.E;
                e0gVar3 = e0gVarB;
            } else {
                e18Var2.T();
                i3 = i5 & (-4186113);
                iqbVar3 = iqbVar;
                f2 = f;
                e0gVar3 = e0gVar;
                jD = j;
                jD2 = j2;
            }
            e18Var2.q();
            e18Var2.a0(-1719869687);
            e18Var2.p(false);
            int i6 = i3 >> 9;
            e18Var = e18Var2;
            pzg.a(iqbVar3, e0gVar3, jD2, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-1573998995, new j96(f2, jD, ta4Var), e18Var2), e18Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            j3 = jD;
            iqbVar2 = iqbVar3;
            e0gVar2 = e0gVar3;
            j4 = jD2;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            f2 = f;
            e0gVar2 = e0gVar;
            j3 = j;
            j4 = j2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: d2i
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e2i.a(k2iVar, iqbVar2, f2, e0gVar2, j3, j4, ta4Var, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.u9d r26, defpackage.ta4 r27, defpackage.l2i r28, defpackage.iqb r29, boolean r30, defpackage.pz7 r31, defpackage.ld4 r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2i.b(u9d, ta4, l2i, iqb, boolean, pz7, ld4, int, int):void");
    }

    public static final l2i c(ld4 ld4Var) {
        fxb fxbVar = ng1.a;
        boolean zG = ((e18) ld4Var).g(false) | ((e18) ld4Var).f(fxbVar);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zG || objN == jd4.a) {
            objN = new l2i(fxbVar);
            e18Var.k0(objN);
        }
        return (l2i) objN;
    }
}
