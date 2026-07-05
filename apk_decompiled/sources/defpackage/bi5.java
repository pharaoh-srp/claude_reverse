package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bi5 implements vg5 {
    public final kj7 a;
    public final mp4 b;
    public final b3f c;
    public final jxb d;
    public int e;
    public fkg f;
    public final gmf g;
    public final el5 h;
    public final u0h i;
    public final u0h j;
    public final dpf k;

    public bi5(kj7 kj7Var, List list, a5 a5Var, c45 c45Var) {
        this.a = kj7Var;
        lf9 lf9Var = (lf9) c45Var.x0(dd8.J);
        tp4 tp4Var = null;
        if (lf9Var == null) {
            mr9.k("Missing Job on Coroutine context: ", c45Var);
            throw null;
        }
        mp4 mp4VarC = fd9.c(c45Var.r0(lf9Var));
        this.b = mp4VarC;
        this.c = new b3f(new cx(this, tp4Var, 9));
        this.d = new jxb();
        this.g = new gmf(11);
        this.h = new el5(this, list, mp4VarC.E);
        final int i = 0;
        this.i = new u0h(new zy7(this) { // from class: ch5
            public final /* synthetic */ bi5 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() throws IOException {
                int i2 = i;
                bi5 bi5Var = this.F;
                switch (i2) {
                    case 0:
                        kj7 kj7Var2 = bi5Var.a;
                        File canonicalFile = ((File) kj7Var2.c.a()).getCanonicalFile();
                        synchronized (kj7.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = kj7.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new nj7(canonicalFile, kj7Var2.a, (z7g) kj7Var2.b.invoke(canonicalFile), new p7(26, canonicalFile));
                    default:
                        return ((nj7) bi5Var.i.getValue()).c;
                }
            }
        });
        final int i2 = 1;
        this.j = new u0h(new zy7(this) { // from class: ch5
            public final /* synthetic */ bi5 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() throws IOException {
                int i22 = i2;
                bi5 bi5Var = this.F;
                switch (i22) {
                    case 0:
                        kj7 kj7Var2 = bi5Var.a;
                        File canonicalFile = ((File) kj7Var2.c.a()).getCanonicalFile();
                        synchronized (kj7.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = kj7.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new nj7(canonicalFile, kj7Var2.a, (z7g) kj7Var2.b.invoke(canonicalFile), new p7(26, canonicalFile));
                    default:
                        return ((nj7) bi5Var.i.getValue()).c;
                }
            }
        });
        int i3 = 22;
        this.k = new dpf(mp4VarC, new a2(i3, this), new z35(13), new dx(this, tp4Var, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.bi5 r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.lh5
            if (r0 == 0) goto L13
            r0 = r5
            lh5 r0 = (defpackage.lh5) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            lh5 r0 = new lh5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            jxb r0 = r0.E
            defpackage.sf5.h0(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r5)
            jxb r5 = r4.d
            r0.E = r5
            r0.H = r2
            java.lang.Object r0 = r5.c(r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.e     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + (-1)
            r4.e = r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L55
            fkg r5 = r4.f     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            r5.d(r3)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            r4.f = r3     // Catch: java.lang.Throwable -> L51
        L55:
            r0.d(r3)
            iei r4 = defpackage.iei.a
            return r4
        L5b:
            r0.d(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.b(bi5, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.bi5 r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.mh5
            if (r0 == 0) goto L13
            r0 = r5
            mh5 r0 = (defpackage.mh5) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            mh5 r0 = new mh5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            jxb r0 = r0.E
            defpackage.sf5.h0(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r5)
            jxb r5 = r4.d
            r0.E = r5
            r0.H = r2
            java.lang.Object r0 = r5.c(r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.e     // Catch: java.lang.Throwable -> L58
            int r5 = r5 + r2
            r4.e = r5     // Catch: java.lang.Throwable -> L58
            if (r5 != r2) goto L5a
            mp4 r5 = r4.b     // Catch: java.lang.Throwable -> L58
            eh5 r1 = new eh5     // Catch: java.lang.Throwable -> L58
            r2 = 2
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L58
            r2 = 3
            fkg r5 = defpackage.gb9.D(r5, r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L58
            r4.f = r5     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L60
        L5a:
            r0.d(r3)
            iei r4 = defpackage.iei.a
            return r4
        L60:
            r0.d(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.c(bi5, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [pz7] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [pz7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.bi5 r11, boolean r12, defpackage.pz7 r13, defpackage.vp4 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.sh5
            if (r0 == 0) goto L13
            r0 = r14
            sh5 r0 = (defpackage.sh5) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            sh5 r0 = new sh5
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L29
            defpackage.sf5.h0(r14)
            return r14
        L29:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r4
        L2f:
            boolean r12 = r0.E
            xzg r13 = r0.F
            pz7 r13 = (defpackage.pz7) r13
            defpackage.sf5.h0(r14)
        L38:
            r8 = r12
            r9 = r13
            goto L49
        L3b:
            defpackage.sf5.h0(r14)
            r14 = r13
            xzg r14 = (defpackage.xzg) r14
            r0.F = r14
            r0.E = r12
            r0.I = r3
            r14 = r4
            goto L38
        L49:
            r7 = r14
            crd r7 = (defpackage.crd) r7
            mp4 r12 = r11.b
            c45 r12 = r12.E
            bb0 r5 = new bb0
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.F = r4
            r0.E = r8
            r0.I = r2
            java.lang.Object r11 = defpackage.gb9.c0(r12, r5, r0)
            m45 r12 = defpackage.m45.E
            if (r11 != r12) goto L66
            return r12
        L66:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.d(bi5, boolean, pz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.bi5 r7, defpackage.vp4 r8) {
        /*
            gmf r0 = r7.g
            boolean r1 = r8 instanceof defpackage.wh5
            if (r1 == 0) goto L15
            r1 = r8
            wh5 r1 = (defpackage.wh5) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            wh5 r1 = new wh5
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.E
            int r2 = r1.G
            r3 = 0
            r4 = 2
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.sf5.h0(r8)
            return r8
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L33:
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L65
            goto L5a
        L37:
            defpackage.sf5.h0(r8)
            ulg r8 = r0.D()
            boolean r8 = r8 instanceof defpackage.cl7
            if (r8 == 0) goto L47
            ulg r7 = r0.D()
            return r7
        L47:
            r1.G = r5     // Catch: java.lang.Throwable -> L65
            oh5 r8 = new oh5     // Catch: java.lang.Throwable -> L65
            r8.<init>(r7, r3)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r8 = defpackage.zh4.y(r1, r8)     // Catch: java.lang.Throwable -> L65
            if (r8 != r6) goto L55
            goto L57
        L55:
            iei r8 = defpackage.iei.a     // Catch: java.lang.Throwable -> L65
        L57:
            if (r8 != r6) goto L5a
            goto L63
        L5a:
            r1.G = r4
            r8 = 0
            java.lang.Object r7 = r7.g(r8, r1)
            if (r7 != r6) goto L64
        L63:
            return r6
        L64:
            return r7
        L65:
            r7 = move-exception
            e3e r8 = new e3e
            r0 = -1
            r8.<init>(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.e(bi5, vp4):java.lang.Object");
    }

    @Override // defpackage.vg5
    public final Object a(pz7 pz7Var, vp4 vp4Var) {
        knk.u(this.b.E);
        return zh4.y(vp4Var, new mk0(this, pz7Var, null, 4));
    }

    public final z7g f() {
        return (z7g) this.j.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r10, defpackage.tp4 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ph5
            if (r0 == 0) goto L13
            r0 = r11
            ph5 r0 = (defpackage.ph5) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            ph5 r0 = new ph5
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.G
            int r1 = r0.I
            gmf r2 = r9.g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            m45 r7 = defpackage.m45.E
            if (r1 == 0) goto L43
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.sf5.h0(r11)
            goto Lac
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r6
        L37:
            defpackage.sf5.h0(r11)
            goto L92
        L3b:
            boolean r10 = r0.E
            ulg r1 = r0.F
            defpackage.sf5.h0(r11)
            goto L5f
        L43:
            defpackage.sf5.h0(r11)
            ulg r1 = r2.D()
            boolean r11 = r1 instanceof defpackage.tdi
            if (r11 != 0) goto Lc0
            z7g r11 = r9.f()
            r0.F = r1
            r0.E = r10
            r0.I = r5
            java.lang.Integer r11 = r11.a()
            if (r11 != r7) goto L5f
            goto Lab
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r1 instanceof defpackage.qf5
            if (r5 == 0) goto L6f
            r8 = r1
            qf5 r8 = (defpackage.qf5) r8
            int r8 = r8.a
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r5 == 0) goto L75
            if (r11 != r8) goto L75
            return r1
        L75:
            rh5 r11 = new rh5
            r11.<init>(r8, r6, r9)
            if (r10 == 0) goto L95
            z7g r1 = r9.f()
            qh5 r3 = new qh5
            r3.<init>(r9, r11, r10, r6)
            r0.F = r6
            r0.E = r10
            r0.I = r4
            java.lang.Object r11 = r1.b(r3, r0)
            if (r11 != r7) goto L92
            goto Lab
        L92:
            cpc r11 = (defpackage.cpc) r11
            goto Lae
        L95:
            z7g r1 = r9.f()
            eq r4 = new eq
            r5 = 7
            r4.<init>(r9, r11, r6, r5)
            r0.F = r6
            r0.E = r10
            r0.I = r3
            java.lang.Object r11 = r1.c(r4, r0)
            if (r11 != r7) goto Lac
        Lab:
            return r7
        Lac:
            cpc r11 = (defpackage.cpc) r11
        Lae:
            java.lang.Object r9 = r11.E
            ulg r9 = (defpackage.ulg) r9
            java.lang.Object r10 = r11.F
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbf
            r2.M(r9)
        Lbf:
            return r9
        Lc0:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.sz6.j(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.g(boolean, tp4):java.lang.Object");
    }

    @Override // defpackage.vg5
    public final kp7 getData() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Object r10, boolean r11, defpackage.vp4 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.yh5
            if (r0 == 0) goto L13
            r0 = r12
            yh5 r0 = (defpackage.yh5) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            yh5 r0 = new yh5
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            bae r9 = r0.E
            defpackage.sf5.h0(r12)
            goto L55
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.sf5.h0(r12)
            bae r5 = new bae
            r5.<init>()
            u0h r12 = r9.i
            java.lang.Object r12 = r12.getValue()
            nj7 r12 = (defpackage.nj7) r12
            ai5 r3 = new ai5
            r8 = 0
            r4 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.E = r5
            r0.H = r2
            java.lang.Object r9 = r12.b(r3, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto L54
            return r10
        L54:
            r9 = r5
        L55:
            int r9 = r9.E
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.h(java.lang.Object, boolean, vp4):java.lang.Object");
    }
}
