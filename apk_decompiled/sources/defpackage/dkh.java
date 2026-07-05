package defpackage;

import androidx.compose.foundation.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dkh {
    public final lsc a = mpk.P(null);
    public zb0 b;
    public final kdg c;

    public dkh(zb0 zb0Var) {
        yeg yegVar = new yeg(16);
        zb0Var.getClass();
        xb0 xb0Var = new xb0(zb0Var);
        ArrayList arrayList = xb0Var.G;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) yegVar.invoke(((wb0) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                yb0 yb0Var = (yb0) list.get(i2);
                arrayList3.add(new wb0(yb0Var.b, yb0Var.c, yb0Var.a, yb0Var.d));
            }
            b54.t0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = xb0Var.n();
        this.c = new kdg();
    }

    public static yb0 c(yb0 yb0Var, yjh yjhVar) {
        int iC = yjhVar.b.c(r4.f - 1, false);
        if (yb0Var.b < iC) {
            return yb0.a(yb0Var, null, 0, Math.min(yb0Var.c, iC), 11);
        }
        return null;
    }

    public final void a(int i, ld4 ld4Var) {
        char c;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1154651354);
        char c2 = 2;
        int i2 = (e18Var.h(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            eli eliVar = (eli) e18Var.j(ve4.t);
            zb0 zb0Var = this.b;
            List listA = zb0Var.a(zb0Var.F.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                yb0 yb0Var = (yb0) listA.get(i3);
                int i4 = yb0Var.b;
                Object obj = yb0Var.a;
                if (i4 != yb0Var.c) {
                    e18Var.a0(725478935);
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    Object objF = objN;
                    if (objN == lz1Var) {
                        objF = vb7.f(e18Var);
                    }
                    zub zubVar = (zub) objF;
                    c = c2;
                    iqb iqbVarI0 = xn5.i0(fqb.E, new e6f(this, 8, yb0Var));
                    Object objN2 = e18Var.N();
                    Object obj2 = objN2;
                    if (objN2 == lz1Var) {
                        yeg yegVar = new yeg(17);
                        e18Var.k0(yegVar);
                        obj2 = yegVar;
                    }
                    iqb iqbVarT = x44.T(tjf.b(iqbVarI0, z2, (bz7) obj2).B(new lkh(new ja4(this, 6, yb0Var))), zubVar);
                    x7d.a.getClass();
                    iqb iqbVarO = eve.O(iqbVarT, csg.i);
                    boolean zH = e18Var.h(this) | e18Var.f(yb0Var) | e18Var.h(eliVar);
                    Object objN3 = e18Var.N();
                    Object obj3 = objN3;
                    if (zH || objN3 == lz1Var) {
                        vc8 vc8Var = new vc8(this, yb0Var, eliVar);
                        e18Var.k0(vc8Var);
                        obj3 = vc8Var;
                    }
                    dw1.a(b.d(iqbVarO, zubVar, (zy7) obj3), e18Var, 0);
                    o6a o6aVar = (o6a) obj;
                    ekh ekhVarB = o6aVar.b();
                    if (ekhVarB == null || (ekhVarB.a == null && ekhVarB.b == null && ekhVarB.c == null && ekhVarB.d == null)) {
                        z = false;
                        e18Var.a0(728331710);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(726303039);
                        Object objN4 = e18Var.N();
                        Object obj4 = objN4;
                        if (objN4 == lz1Var) {
                            b7a b7aVar = new b7a(zubVar);
                            e18Var.k0(b7aVar);
                            obj4 = b7aVar;
                        }
                        b7a b7aVar2 = (b7a) obj4;
                        Object objN5 = e18Var.N();
                        boolean z3 = false;
                        Object obj5 = objN5;
                        if (objN5 == lz1Var) {
                            fj fjVar = new fj(b7aVar2, z3 ? 1 : 0, 25);
                            e18Var.k0(fjVar);
                            obj5 = fjVar;
                        }
                        fd9.i(e18Var, (pz7) obj5, iei.a);
                        isc iscVar = b7aVar2.b;
                        isc iscVar2 = b7aVar2.b;
                        Boolean boolValueOf = Boolean.valueOf((iscVar.h() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((iscVar2.h() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((iscVar2.h() & 4) != 0);
                        ekh ekhVarB2 = o6aVar.b();
                        egg eggVar = ekhVarB2 != null ? ekhVarB2.a : null;
                        ekh ekhVarB3 = o6aVar.b();
                        egg eggVar2 = ekhVarB3 != null ? ekhVarB3.b : null;
                        ekh ekhVarB4 = o6aVar.b();
                        egg eggVar3 = ekhVarB4 != null ? ekhVarB4.c : null;
                        ekh ekhVarB5 = o6aVar.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, eggVar, eggVar2, eggVar3, ekhVarB5 != null ? ekhVarB5.d : null};
                        boolean zH2 = e18Var.h(this) | e18Var.f(yb0Var);
                        Object objN6 = e18Var.N();
                        Object obj6 = objN6;
                        if (zH2 || objN6 == lz1Var) {
                            e6f e6fVar = new e6f(this, yb0Var, b7aVar2, 7);
                            e18Var.k0(e6fVar);
                            obj6 = e6fVar;
                        }
                        b(objArr, (bz7) obj6, e18Var, (i2 << 6) & 896);
                        z = false;
                        e18Var.p(false);
                    }
                    e18Var.p(z);
                } else {
                    c = c2;
                    z = z2;
                    e18Var.a0(728345598);
                    e18Var.p(z);
                }
                i3++;
                z2 = z;
                c2 = c;
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a21(this, i, 25);
        }
    }

    public final void b(Object[] objArr, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2083052099);
        int i2 = (i & 48) == 0 ? (e18Var.h(bz7Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= e18Var.h(this) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        e18Var.X(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (e18Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= e18Var.h(obj) ? 4 : 0;
        }
        e18Var.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wig wigVar = new wig(2);
            wigVar.a(bz7Var);
            wigVar.b(objArr);
            ArrayList arrayList = wigVar.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = e18Var.h(this) | ((i3 & 112) == 32);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new dg1(this, bz7Var, i4);
                e18Var.k0(objN);
            }
            fd9.g(array, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(this, i, objArr, bz7Var, 17);
        }
    }
}
