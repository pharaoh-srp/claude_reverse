package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c18 extends ge4 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final fwb e;
    public final lsc f;
    public final /* synthetic */ e18 g;

    public c18(e18 e18Var, long j, boolean z, boolean z2, n78 n78Var) {
        this.g = e18Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        fwb fwbVar = v6f.a;
        this.e = new fwb();
        this.f = new lsc(hyc.H, zp3.X);
    }

    @Override // defpackage.ge4
    public final void a(le4 le4Var, pz7 pz7Var) {
        this.g.b.a(le4Var, pz7Var);
    }

    @Override // defpackage.ge4
    public final fwb b(le4 le4Var, k5g k5gVar, pz7 pz7Var) {
        return this.g.b.b(le4Var, k5gVar, pz7Var);
    }

    @Override // defpackage.ge4
    public final void c() {
        e18 e18Var = this.g;
        e18Var.A--;
    }

    @Override // defpackage.ge4
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.ge4
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ge4
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.ge4
    public final long g() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final fe4 h() {
        return this.g.h;
    }

    @Override // defpackage.ge4
    public final hyc i() {
        return (hyc) this.f.getValue();
    }

    @Override // defpackage.ge4
    public final c45 j() {
        return this.g.b.j();
    }

    @Override // defpackage.ge4
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.ge4
    public final void l(le4 le4Var) {
        e18 e18Var = this.g;
        e18Var.b.l(e18Var.h);
        e18Var.b.l(le4Var);
    }

    @Override // defpackage.ge4
    public final jsb m(ksb ksbVar) {
        return this.g.b.m(ksbVar);
    }

    @Override // defpackage.ge4
    public final fwb n(le4 le4Var, k5g k5gVar, fwb fwbVar) {
        return this.g.b.n(le4Var, k5gVar, fwbVar);
    }

    @Override // defpackage.ge4
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.ge4
    public final void p(e18 e18Var) {
        this.e.a(e18Var);
    }

    @Override // defpackage.ge4
    public final void q(r7e r7eVar) {
        this.g.b.q(r7eVar);
    }

    @Override // defpackage.ge4
    public final void r(le4 le4Var) {
        this.g.b.r(le4Var);
    }

    @Override // defpackage.ge4
    public final za2 s(v01 v01Var) {
        return this.g.b.s(v01Var);
    }

    @Override // defpackage.ge4
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.ge4
    public final void u(e18 e18Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                e18Var.getClass();
                set.remove(e18Var.y());
            }
        }
        if (e18Var != null) {
            this.e.m(e18Var);
        }
    }

    @Override // defpackage.ge4
    public final void v(le4 le4Var) {
        this.g.b.v(le4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r15 = this;
            fwb r0 = r15.e
            boolean r1 = r0.i()
            if (r1 == 0) goto L69
            java.util.HashSet r15 = r15.d
            if (r15 == 0) goto L66
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L66
            r4 = 0
            r5 = r4
        L17:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L61
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L31:
            if (r10 >= r8) goto L5f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            e18 r11 = (defpackage.e18) r11
            java.util.Iterator r12 = r15.iterator()
        L47:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L5b
            java.lang.Object r13 = r12.next()
            java.util.Set r13 = (java.util.Set) r13
            ie4 r14 = r11.y()
            r13.remove(r14)
            goto L47
        L5b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L31
        L5f:
            if (r8 != r9) goto L66
        L61:
            if (r5 == r3) goto L66
            int r5 = r5 + 1
            goto L17
        L66:
            r0.b()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c18.w():void");
    }
}
