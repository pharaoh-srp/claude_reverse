package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class n2g extends d4 implements jwb, wa2, r08 {
    public final int I;
    public final int J;
    public final py1 K;
    public Object[] L;
    public long M;
    public long N;
    public int O;
    public int P;

    public n2g(int i, int i2, py1 py1Var) {
        this.I = i;
        this.J = i2;
        this.K = py1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|51|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|53|25|26))(1:29)|55|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0075, B:35:0x007f, B:39:0x0092, B:42:0x0099, B:43:0x009d, B:44:0x009e, B:22:0x0047), top: B:51:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [lp7] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d4] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [n2g] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [lp7] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [e4] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [p2g] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [p2g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ac -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(defpackage.n2g r8, defpackage.lp7 r9, defpackage.tp4 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.m2g
            if (r0 == 0) goto L13
            r0 = r10
            m2g r0 = (defpackage.m2g) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            m2g r0 = new m2g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.I
            int r1 = r0.K
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            lf9 r8 = r0.H
            p2g r9 = r0.G
            lp7 r1 = r0.F
            n2g r4 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return
        L3f:
            lf9 r8 = r0.H
            p2g r9 = r0.G
            lp7 r1 = r0.F
            n2g r4 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            p2g r9 = r0.G
            lp7 r8 = r0.F
            n2g r1 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            defpackage.sf5.h0(r10)
            e4 r10 = r8.d()
            p2g r10 = (defpackage.p2g) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            c45 r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            dd8 r4 = defpackage.dd8.J     // Catch: java.lang.Throwable -> Laf
            a45 r1 = r1.x0(r4)     // Catch: java.lang.Throwable -> Laf
            lf9 r1 = (defpackage.lf9) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.v(r9)     // Catch: java.lang.Throwable -> L36
            sqb r5 = defpackage.o2g.a     // Catch: java.lang.Throwable -> L36
            m45 r6 = defpackage.m45.E
            if (r10 != r5) goto L90
            r0.E = r4     // Catch: java.lang.Throwable -> L36
            r0.F = r1     // Catch: java.lang.Throwable -> L36
            r0.G = r9     // Catch: java.lang.Throwable -> L36
            r0.H = r8     // Catch: java.lang.Throwable -> L36
            r0.K = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.l(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.c()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.H()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.E = r4     // Catch: java.lang.Throwable -> L36
            r0.F = r1     // Catch: java.lang.Throwable -> L36
            r0.G = r9     // Catch: java.lang.Throwable -> L36
            r0.H = r8     // Catch: java.lang.Throwable -> L36
            r0.K = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.g(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2g.n(n2g, lp7, tp4):void");
    }

    @Override // defpackage.kp7
    public final Object a(lp7 lp7Var, tp4 tp4Var) throws Throwable {
        n(this, lp7Var, tp4Var);
        return m45.E;
    }

    @Override // defpackage.r08
    public final kp7 b(c45 c45Var, int i, py1 py1Var) {
        return o2g.d(this, c45Var, i, py1Var);
    }

    @Override // defpackage.jwb
    public final void e() throws Throwable {
        n2g n2gVar;
        synchronized (this) {
            try {
                n2gVar = this;
                try {
                    n2gVar.w(r() + ((long) this.O), this.N, r() + ((long) this.O), r() + ((long) this.O) + ((long) this.P));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                n2gVar = this;
            }
        }
    }

    @Override // defpackage.jwb
    public final boolean f(Object obj) {
        int i;
        boolean z;
        tp4[] tp4VarArrQ = u00.b;
        synchronized (this) {
            if (t(obj)) {
                tp4VarArrQ = q(tp4VarArrQ);
                z = true;
            } else {
                z = false;
            }
        }
        for (tp4 tp4Var : tp4VarArrQ) {
            if (tp4Var != null) {
                tp4Var.resumeWith(iei.a);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // defpackage.lp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r8, defpackage.tp4 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.f(r8)
            if (r0 == 0) goto L9
            iei r7 = defpackage.iei.a
            return r7
        L9:
            ua2 r5 = new ua2
            tp4 r9 = defpackage.zni.I(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.t()
            tp4[] r9 = defpackage.u00.b
            monitor-enter(r7)
            boolean r0 = r7.t(r8)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L30
            iei r8 = defpackage.iei.a     // Catch: java.lang.Throwable -> L2b
            r5.resumeWith(r8)     // Catch: java.lang.Throwable -> L2b
            tp4[] r8 = r7.q(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8d
        L30:
            l2g r0 = new l2g     // Catch: java.lang.Throwable -> L8a
            long r1 = r7.r()     // Catch: java.lang.Throwable -> L8a
            int r3 = r7.O     // Catch: java.lang.Throwable -> L85
            int r4 = r7.P     // Catch: java.lang.Throwable -> L85
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.p(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.P     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.P = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.J     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            tp4[] r9 = r1.q(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8d
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L64
            oa2 r7 = new oa2
            r7.<init>(r6, r9)
            r5.x(r7)
        L64:
            int r7 = r8.length
            r9 = 0
        L66:
            if (r9 >= r7) goto L74
            r0 = r8[r9]
            if (r0 == 0) goto L71
            iei r1 = defpackage.iei.a
            r0.resumeWith(r1)
        L71:
            int r9 = r9 + 1
            goto L66
        L74:
            java.lang.Object r7 = r5.r()
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L7d
            goto L7f
        L7d:
            iei r7 = defpackage.iei.a
        L7f:
            if (r7 != r8) goto L82
            return r7
        L82:
            iei r7 = defpackage.iei.a
            return r7
        L85:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8d
        L8a:
            r0 = move-exception
            r1 = r7
            goto L55
        L8d:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2g.g(java.lang.Object, tp4):java.lang.Object");
    }

    @Override // defpackage.d4
    public final e4 h() {
        p2g p2gVar = new p2g();
        p2gVar.a = -1L;
        return p2gVar;
    }

    @Override // defpackage.d4
    public final e4[] i() {
        return new p2g[2];
    }

    public final Object l(p2g p2gVar, m2g m2gVar) {
        ua2 ua2Var = new ua2(1, zni.I(m2gVar));
        ua2Var.t();
        synchronized (this) {
            try {
                if (u(p2gVar) < 0) {
                    p2gVar.b = ua2Var;
                } else {
                    ua2Var.resumeWith(iei.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objR = ua2Var.r();
        return objR == m45.E ? objR : iei.a;
    }

    public final void m() {
        if (this.J != 0 || this.P > 1) {
            Object[] objArr = this.L;
            objArr.getClass();
            while (this.P > 0) {
                long jR = r();
                int i = this.O;
                int i2 = this.P;
                if (objArr[((int) ((jR + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != o2g.a) {
                    return;
                }
                this.P = i2 - 1;
                o2g.c(objArr, r() + ((long) (this.O + this.P)), null);
            }
        }
    }

    public final void o() {
        e4[] e4VarArr;
        Object[] objArr = this.L;
        objArr.getClass();
        o2g.c(objArr, r(), null);
        this.O--;
        long jR = r() + 1;
        if (this.M < jR) {
            this.M = jR;
        }
        if (this.N < jR) {
            if (this.F != 0 && (e4VarArr = this.E) != null) {
                for (e4 e4Var : e4VarArr) {
                    if (e4Var != null) {
                        p2g p2gVar = (p2g) e4Var;
                        long j = p2gVar.a;
                        if (0 <= j && j < jR) {
                            p2gVar.a = jR;
                        }
                    }
                }
            }
            this.N = jR;
        }
    }

    public final void p(Object obj) {
        int i = this.O + this.P;
        Object[] objArrS = this.L;
        if (objArrS == null) {
            objArrS = s(null, 0, 2);
        } else if (i >= objArrS.length) {
            objArrS = s(objArrS, i, objArrS.length * 2);
        }
        o2g.c(objArrS, r() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tp4[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final tp4[] q(tp4[] tp4VarArr) {
        e4[] e4VarArr;
        p2g p2gVar;
        ua2 ua2Var;
        int length = tp4VarArr.length;
        if (this.F != 0 && (e4VarArr = this.E) != null) {
            int length2 = e4VarArr.length;
            int i = 0;
            tp4VarArr = tp4VarArr;
            while (i < length2) {
                e4 e4Var = e4VarArr[i];
                if (e4Var != null && (ua2Var = (p2gVar = (p2g) e4Var).b) != null && u(p2gVar) >= 0) {
                    int length3 = tp4VarArr.length;
                    tp4VarArr = tp4VarArr;
                    if (length >= length3) {
                        tp4VarArr = Arrays.copyOf((Object[]) tp4VarArr, Math.max(2, tp4VarArr.length * 2));
                    }
                    ((tp4[]) tp4VarArr)[length] = ua2Var;
                    p2gVar.b = null;
                    length++;
                }
                i++;
                tp4VarArr = tp4VarArr;
            }
        }
        return (tp4[]) tp4VarArr;
    }

    public final long r() {
        return Math.min(this.N, this.M);
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            sz6.j("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.L = objArr2;
        if (objArr != null) {
            long jR = r();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jR;
                o2g.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.F
            int r2 = r12.I
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.p(r13)
            int r1 = r12.O
            int r1 = r1 + r9
            r12.O = r1
            if (r1 <= r2) goto L18
            r12.o()
        L18:
            long r1 = r12.r()
            int r3 = r12.O
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.N = r1
            return r9
        L23:
            int r1 = r12.O
            int r3 = r12.J
            if (r1 < r3) goto L46
            long r4 = r12.N
            long r6 = r12.M
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            py1 r1 = r12.K
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r0 = 2
            if (r1 != r0) goto L3f
            goto L7e
        L3f:
            defpackage.mr9.b()
            r0 = 0
            return r0
        L44:
            r0 = 0
            return r0
        L46:
            r12.p(r13)
            int r1 = r12.O
            int r1 = r1 + r9
            r12.O = r1
            if (r1 <= r3) goto L53
            r12.o()
        L53:
            long r3 = r12.r()
            int r1 = r12.O
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.M
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.N
            long r5 = r12.r()
            int r7 = r12.O
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.r()
            int r10 = r12.O
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.P
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.w(r1, r3, r5, r7)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2g.t(java.lang.Object):boolean");
    }

    public final long u(p2g p2gVar) {
        long j = p2gVar.a;
        if (j >= r() + ((long) this.O) && (this.J > 0 || j > r() || this.P == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object v(p2g p2gVar) {
        Object obj;
        tp4[] tp4VarArrX = u00.b;
        synchronized (this) {
            try {
                long jU = u(p2gVar);
                if (jU < 0) {
                    obj = o2g.a;
                } else {
                    long j = p2gVar.a;
                    Object[] objArr = this.L;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jU) & (objArr.length - 1)];
                    if (obj2 instanceof l2g) {
                        obj2 = ((l2g) obj2).G;
                    }
                    p2gVar.a = jU + 1;
                    Object obj3 = obj2;
                    tp4VarArrX = x(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (tp4 tp4Var : tp4VarArrX) {
            if (tp4Var != null) {
                tp4Var.resumeWith(iei.a);
            }
        }
        return obj;
    }

    public final void w(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jR = r(); jR < jMin; jR++) {
            Object[] objArr = this.L;
            objArr.getClass();
            o2g.c(objArr, jR, null);
        }
        this.M = j;
        this.N = j2;
        this.O = (int) (j3 - jMin);
        this.P = (int) (j4 - j3);
    }

    public final tp4[] x(long j) {
        long j2;
        int i;
        long j3;
        tp4[] tp4VarArr;
        tp4[] tp4VarArr2;
        e4[] e4VarArr;
        tp4[] tp4VarArr3 = u00.b;
        if (j <= this.N) {
            long jR = r();
            long j4 = ((long) this.O) + jR;
            int i2 = this.J;
            if (i2 == 0 && this.P > 0) {
                j4++;
            }
            int i3 = 0;
            if (this.F != 0 && (e4VarArr = this.E) != null) {
                for (e4 e4Var : e4VarArr) {
                    if (e4Var != null) {
                        long j5 = ((p2g) e4Var).a;
                        if (0 <= j5 && j5 < j4) {
                            j4 = j5;
                        }
                    }
                }
            }
            if (j4 > this.N) {
                long jR2 = r() + ((long) this.O);
                int i4 = this.F;
                int iMin = this.P;
                if (i4 > 0) {
                    iMin = Math.min(iMin, i2 - ((int) (jR2 - j4)));
                }
                long j6 = ((long) this.P) + jR2;
                sqb sqbVar = o2g.a;
                if (iMin > 0) {
                    tp4[] tp4VarArr4 = new tp4[iMin];
                    j3 = 1;
                    Object[] objArr = this.L;
                    objArr.getClass();
                    j2 = j4;
                    long j7 = jR2;
                    while (true) {
                        if (jR2 >= j6) {
                            tp4VarArr2 = tp4VarArr4;
                            i = i2;
                            break;
                        }
                        tp4VarArr2 = tp4VarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jR2)];
                        if (obj != sqbVar) {
                            obj.getClass();
                            l2g l2gVar = (l2g) obj;
                            int i5 = i3 + 1;
                            i = i2;
                            tp4VarArr2[i3] = l2gVar.H;
                            o2g.c(objArr, jR2, sqbVar);
                            o2g.c(objArr, j7, l2gVar.G);
                            j7++;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                        }
                        jR2++;
                        tp4VarArr4 = tp4VarArr2;
                        i2 = i;
                    }
                    jR2 = j7;
                    tp4VarArr = tp4VarArr2;
                } else {
                    j2 = j4;
                    i = i2;
                    j3 = 1;
                    tp4VarArr = tp4VarArr3;
                }
                long jMax = Math.max(this.M, Math.max(jR, jR2 - ((long) this.I)));
                if (i == 0 && jMax < j6) {
                    Object[] objArr2 = this.L;
                    objArr2.getClass();
                    if (x44.r(objArr2[((int) jMax) & (objArr2.length - 1)], sqbVar)) {
                        jR2 += j3;
                        jMax += j3;
                    }
                }
                long j8 = jR2;
                w(jMax, this.F == 0 ? j8 : j2, j8, j6);
                m();
                return tp4VarArr.length == 0 ? tp4VarArr : q(tp4VarArr);
            }
        }
        return tp4VarArr3;
    }
}
