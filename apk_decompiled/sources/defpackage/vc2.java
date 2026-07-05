package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class vc2 implements be2 {
    public static final hj6 u = new hj6(27);
    public final bz7 a;
    public final ro8 b;
    public final List c;
    public final bz7 d;
    public final UUID e;
    public final LinkedHashMap f;
    public Integer g;
    public final sp0 h = new sp0();
    public final Canvas i = new Canvas();
    public final sa1 j;
    public final TreeMap k;
    public final i49 l;
    public final qb5 m;
    public final ive n;
    public final xv8 o;
    public final epk p;
    public final i49 q;
    public final RectF r;
    public final List s;
    public final TreeMap t;

    public vc2(pd1[] pd1VarArr, xti xtiVar, oo8 oo8Var, bz7 bz7Var, ro8 ro8Var, List list, bz7 bz7Var2, UUID uuid, LinkedHashMap linkedHashMap, Integer num) {
        this.a = bz7Var;
        this.b = ro8Var;
        this.c = list;
        this.d = bz7Var2;
        this.e = uuid;
        this.f = linkedHashMap;
        this.g = num;
        sa1 sa1Var = new sa1();
        this.j = sa1Var;
        TreeMap treeMap = new TreeMap();
        sta.n0(treeMap, new cpc[0]);
        this.k = treeMap;
        this.l = new i49(this);
        this.m = new qb5();
        this.n = new ive(18, false);
        this.o = new xv8(13);
        this.p = new epk();
        this.q = new i49(9);
        this.r = new RectF();
        this.s = mp0.Y0(pd1VarArr);
        this.t = treeMap;
        wn9[] wn9VarArr = sa1.f;
        sa1Var.b.B(sa1Var, wn9VarArr[0], xtiVar);
        sa1Var.c.B(sa1Var, wn9VarArr[1], null);
        sa1Var.d.B(sa1Var, wn9VarArr[2], null);
        sa1Var.e.B(sa1Var, wn9VarArr[3], oo8Var);
    }

    @Override // defpackage.be2
    public final void a(ge2 ge2Var, sp0 sp0Var, oub oubVar, Object obj) {
        ge2Var.getClass();
        oubVar.getClass();
        ((ed2) obj).getClass();
        ed2 ed2VarI = ge2Var.i();
        xv8 xv8Var = this.o;
        xv8Var.getClass();
        xv8Var.F = ge2Var;
        xv8Var.G = oubVar;
        xv8Var.H = sp0Var;
        c(ed2VarI, xv8Var);
    }

    @Override // defpackage.be2
    public final void b(ge2 ge2Var, sp0 sp0Var, float f, Object obj) {
        ge2Var.getClass();
        ((ed2) obj).getClass();
        ed2 ed2VarI = ge2Var.i();
        epk epkVar = this.p;
        epkVar.getClass();
        epkVar.E = ge2Var;
        epkVar.F = sp0Var;
        c(ed2VarI, epkVar);
    }

    public final void c(ed2 ed2Var, tc2 tc2Var) {
        ed2Var.getClass();
        tc2Var.getClass();
        ArrayList arrayList = new ArrayList(ed2Var.a);
        for (pd1 pd1Var : this.s) {
            if (pd1Var instanceof e64) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof m64) {
                        arrayList2.add(obj);
                    }
                }
                ee2 ee2Var = (ee2) w44.N0(arrayList2);
                tc2Var.p0(ee2Var, pd1Var);
                if (ee2Var != null) {
                    arrayList.remove(ee2Var);
                }
            } else {
                if (!(pd1Var instanceof o5a)) {
                    sz6.p("Unexpected `CartesianLayer` implementation.");
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof w5a) {
                        arrayList3.add(obj2);
                    }
                }
                ee2 ee2Var2 = (ee2) w44.N0(arrayList3);
                tc2Var.p0(ee2Var2, pd1Var);
                if (ee2Var2 != null) {
                    arrayList.remove(ee2Var2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.uub r6, float r7, defpackage.tp4 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.uc2
            if (r0 == 0) goto L13
            r0 = r8
            uc2 r0 = (defpackage.uc2) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L1a
        L13:
            uc2 r0 = new uc2
            vp4 r8 = (defpackage.vp4) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r5 = r0.H
            float r6 = r0.G
            java.util.Iterator r7 = r0.F
            uub r1 = r0.E
            defpackage.sf5.h0(r8)
            r8 = r6
            r6 = r1
            goto L48
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L38:
            defpackage.sf5.h0(r8)
            java.util.List r5 = r5.s
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r8 = 0
            r4 = r7
            r7 = r5
            r5 = r8
            r8 = r4
        L48:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            pd1 r1 = (defpackage.pd1) r1
            r0.E = r6
            r0.F = r7
            r0.G = r8
            r0.H = r5
            r0.K = r2
            java.lang.Object r1 = r1.f(r6, r8, r0)
            m45 r3 = defpackage.m45.E
            if (r1 != r3) goto L48
            return r3
        L67:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc2.d(uub, float, tp4):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc2)) {
            return false;
        }
        vc2 vc2Var = (vc2) obj;
        sa1 sa1Var = vc2Var.j;
        if (!this.e.equals(vc2Var.e) || !this.a.equals(vc2Var.a) || !x44.r(this.b, vc2Var.b) || !this.c.equals(vc2Var.c) || !this.d.equals(vc2Var.d) || !x44.r(this.s, vc2Var.s)) {
            return false;
        }
        sa1 sa1Var2 = this.j;
        return x44.r(sa1Var2.c(), sa1Var.c()) && x44.r(sa1Var2.d(), sa1Var.d()) && x44.r(sa1Var2.b(), sa1Var.b()) && x44.r(sa1Var2.a(), sa1Var.a());
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ro8 ro8Var = this.b;
        int iM = kgh.m(qy1.e(this.d, kgh.m((iHashCode + (ro8Var != null ? ro8Var.hashCode() : 0)) * 961, 961, this.c), 31), 31, this.s);
        sa1 sa1Var = this.j;
        od1 od1VarC = sa1Var.c();
        int iHashCode2 = (iM + (od1VarC != null ? od1VarC.hashCode() : 0)) * 31;
        od1 od1VarD = sa1Var.d();
        int iHashCode3 = (iHashCode2 + (od1VarD != null ? od1VarD.hashCode() : 0)) * 31;
        od1 od1VarB = sa1Var.b();
        int iHashCode4 = (iHashCode3 + (od1VarB != null ? od1VarB.hashCode() : 0)) * 31;
        od1 od1VarA = sa1Var.a();
        return this.e.hashCode() + ((iHashCode4 + (od1VarA != null ? od1VarA.hashCode() : 0)) * 31);
    }
}
