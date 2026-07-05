package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class lpg {
    public final ArrayList a;
    public final ArrayList b;
    public final mp4 c = fd9.c(iuj.g());
    public final c45 d;
    public final c45 e;

    public lpg() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.d = nai.Z(new k57(executorServiceNewSingleThreadExecutor), new h45("state.sync.sovran.com"));
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor2.getClass();
        this.e = nai.Z(new k57(executorServiceNewSingleThreadExecutor2), new h45("state.update.sovran.com"));
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.pl9 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gpg
            if (r0 == 0) goto L13
            r0 = r6
            gpg r0 = (defpackage.gpg) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            gpg r0 = new gpg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.F
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L3a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            r0.F = r3
            java.lang.Object r6 = r4.e(r5, r0)
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L3a
            return r4
        L3a:
            java.util.List r6 = (java.util.List) r6
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L52
            r4 = 0
            java.lang.Object r4 = r6.get(r4)
            epg r4 = (defpackage.epg) r4
            vlg r4 = r4.a
            if (r4 != 0) goto L51
            goto L52
        L51:
            return r4
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpg.a(pl9, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.m9 r18, defpackage.pl9 r19, defpackage.vp4 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpg.b(m9, pl9, vp4):java.lang.Object");
    }

    public final Object c(List list, vlg vlgVar, vp4 vp4Var) {
        mp4 mp4Var;
        tp4 tp4Var;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mp4Var = this.c;
            tp4Var = null;
            if (!zHasNext) {
                break;
            }
            fpg fpgVar = (fpg) it.next();
            pz7 pz7Var = fpgVar.c;
            if (!(pz7Var instanceof uzg ? nai.N(2, pz7Var) : false)) {
                pz7Var = null;
            }
            if (pz7Var != null && fpgVar.b.get() != null) {
                gb9.D(mp4Var, fpgVar.e, null, new rrb(pz7Var, vlgVar, tp4Var, 12), 2);
            }
        }
        Object objN = gb9.D(mp4Var, this.d, null, new i30(this, tp4Var, 7), 2).n(vp4Var);
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (objN != m45Var) {
            objN = ieiVar;
        }
        return objN == m45Var ? objN : ieiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vlg r9, defpackage.vp4 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ipg
            if (r0 == 0) goto L13
            r0 = r10
            ipg r0 = (defpackage.ipg) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            ipg r0 = new ipg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.F
            iei r2 = defpackage.iei.a
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.sf5.h0(r10)
            return r2
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r5
        L33:
            vlg r9 = r0.I
            lpg r8 = r0.H
            defpackage.sf5.h0(r10)
            goto L55
        L3b:
            defpackage.sf5.h0(r10)
            java.lang.Class r10 = r9.getClass()
            kce r1 = defpackage.jce.a
            pl9 r10 = r1.b(r10)
            r0.H = r8
            r0.I = r9
            r0.F = r4
            java.lang.Object r10 = r8.e(r10, r0)
            if (r10 != r6) goto L55
            goto L85
        L55:
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L60
            goto L86
        L60:
            epg r10 = new epg
            r9.getClass()
            r10.<init>()
            r10.a = r9
            mp4 r9 = r8.c
            c45 r1 = r8.e
            ab0 r4 = new ab0
            r7 = 18
            r4.<init>(r8, r10, r5, r7)
            fkg r8 = defpackage.gb9.D(r9, r1, r5, r4, r3)
            r0.H = r5
            r0.I = r5
            r0.F = r3
            java.lang.Object r8 = r8.n(r0)
            if (r8 != r6) goto L86
        L85:
            return r6
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpg.d(vlg, vp4):java.lang.Object");
    }

    public final Object e(pl9 pl9Var, vp4 vp4Var) {
        return gb9.k(this.c, this.e, new jpg(this, pl9Var, null, 0), 2).w(vp4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r9.c(r10, r14, r0) == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.lvg r9, defpackage.pl9 r10, boolean r11, defpackage.e45 r12, defpackage.pz7 r13, defpackage.vp4 r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.kpg
            if (r0 == 0) goto L13
            r0 = r14
            kpg r0 = (defpackage.kpg) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            kpg r0 = new kpg
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.E
            int r1 = r0.F
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L58
            if (r1 == r4) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L33
            java.lang.Object r8 = r0.H
            fpg r8 = (defpackage.fpg) r8
            defpackage.sf5.h0(r14)
            goto Laa
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r5
        L39:
            java.lang.Object r8 = r0.I
            fpg r8 = (defpackage.fpg) r8
            java.lang.Object r9 = r0.H
            lpg r9 = (defpackage.lpg) r9
            defpackage.sf5.h0(r14)
            goto L95
        L45:
            boolean r11 = r0.K
            fpg r8 = r0.J
            java.lang.Object r9 = r0.I
            r10 = r9
            pl9 r10 = (defpackage.pl9) r10
            java.lang.Object r9 = r0.H
            lpg r9 = (defpackage.lpg) r9
            defpackage.sf5.h0(r14)
            r14 = r8
            r8 = r9
            goto L80
        L58:
            defpackage.sf5.h0(r14)
            fpg r14 = new fpg
            r14.<init>(r9, r13, r10, r12)
            ab0 r9 = new ab0
            r12 = 19
            r9.<init>(r8, r14, r5, r12)
            mp4 r12 = r8.c
            c45 r13 = r8.d
            fkg r9 = defpackage.gb9.D(r12, r13, r5, r9, r3)
            r0.H = r8
            r0.I = r10
            r0.J = r14
            r0.K = r11
            r0.F = r4
            java.lang.Object r9 = r9.n(r0)
            if (r9 != r6) goto L80
            goto La9
        L80:
            if (r11 == 0) goto Lab
            r0.H = r8
            r0.I = r14
            r0.J = r5
            r0.F = r3
            java.lang.Object r9 = r8.a(r10, r0)
            if (r9 != r6) goto L91
            goto La9
        L91:
            r7 = r9
            r9 = r8
            r8 = r14
            r14 = r7
        L95:
            vlg r14 = (defpackage.vlg) r14
            if (r14 == 0) goto Laa
            java.util.List r10 = defpackage.x44.W(r8)
            r0.H = r8
            r0.I = r5
            r0.F = r2
            java.lang.Object r9 = r9.c(r10, r14, r0)
            if (r9 != r6) goto Laa
        La9:
            return r6
        Laa:
            r14 = r8
        Lab:
            int r8 = r14.a
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpg.f(lvg, pl9, boolean, e45, pz7, vp4):java.lang.Object");
    }
}
