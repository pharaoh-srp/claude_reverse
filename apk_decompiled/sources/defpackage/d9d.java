package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class d9d {
    public final int a;
    public final zy7 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final vh4[] f;
    public final jkf g;
    public final qo0 h;

    public d9d(int i, zy7 zy7Var) {
        this.a = i;
        this.b = zy7Var;
        this.f = new vh4[i];
        int i2 = kkf.a;
        this.g = new jkf(i);
        this.h = new qo0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r7) {
        /*
            r6 = this;
            qo0 r0 = r6.h
            boolean r1 = r7 instanceof defpackage.b9d
            if (r1 == 0) goto L15
            r1 = r7
            b9d r1 = (defpackage.b9d) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            b9d r1 = new b9d
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.E
            int r2 = r1.G
            r3 = 0
            jkf r4 = r6.g
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L2a
            defpackage.sf5.h0(r7)
            goto L3e
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L30:
            defpackage.sf5.h0(r7)
            r1.G = r5
            java.lang.Object r7 = r4.a(r1)
            m45 r1 = defpackage.m45.E
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.util.concurrent.locks.ReentrantLock r7 = r6.c     // Catch: java.lang.Throwable -> L78
            r7.lock()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r6.e     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6e
            int r1 = r6.d     // Catch: java.lang.Throwable -> L7a
            int r2 = r6.a     // Catch: java.lang.Throwable -> L7a
            if (r1 < r2) goto L54
            goto L6e
        L54:
            vh4 r1 = new vh4     // Catch: java.lang.Throwable -> L7a
            zy7 r2 = r6.b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L7a
            lze r2 = (defpackage.lze) r2     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            vh4[] r2 = r6.f     // Catch: java.lang.Throwable -> L7a
            int r3 = r6.d     // Catch: java.lang.Throwable -> L7a
            int r5 = r3 + 1
            r6.d = r5     // Catch: java.lang.Throwable -> L7a
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7a
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.Object r6 = r0.removeLast()     // Catch: java.lang.Throwable -> L7a
            vh4 r6 = (defpackage.vh4) r6     // Catch: java.lang.Throwable -> L7a
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            return r6
        L78:
            r6 = move-exception
            goto L88
        L7a:
            r6 = move-exception
            goto L84
        L7c:
            java.lang.String r6 = "Connection pool is closed"
            r0 = 21
            defpackage.u00.N(r0, r6)     // Catch: java.lang.Throwable -> L7a
            throw r3     // Catch: java.lang.Throwable -> L7a
        L84:
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            throw r6     // Catch: java.lang.Throwable -> L78
        L88:
            r4.e()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9d.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:11|(2:49|12)|25|45|30|(1:(1:40)(2:36|(1:38)))(1:32)|39|19|47|20|21|(1:23)(11:24|25|45|30|(0)(0)|39|19|47|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r11 = r11;
        r10 = r10;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:30:0x006b, B:32:0x006f, B:36:0x0077, B:40:0x007e), top: B:45:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0058 -> B:25:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r8, defpackage.rf1 r10, defpackage.vp4 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.c9d
            if (r0 == 0) goto L13
            r0 = r11
            c9d r0 = (defpackage.c9d) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            c9d r0 = new c9d
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.H
            int r1 = r0.J
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r8 = r0.E
            dae r10 = r0.G
            zy7 r1 = r0.F
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L2c
            goto L5a
        L2c:
            r11 = move-exception
            goto L66
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L34:
            defpackage.sf5.h0(r11)
        L37:
            dae r11 = new dae
            r11.<init>()
            cx r1 = new cx     // Catch: java.lang.Throwable -> L64
            r4 = 24
            r1.<init>(r11, r7, r3, r4)     // Catch: java.lang.Throwable -> L64
            r0.F = r10     // Catch: java.lang.Throwable -> L64
            r0.G = r11     // Catch: java.lang.Throwable -> L64
            r0.E = r8     // Catch: java.lang.Throwable -> L64
            r0.J = r2     // Catch: java.lang.Throwable -> L64
            long r4 = defpackage.d4c.o0(r8)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = defpackage.iuj.P(r4, r1, r0)     // Catch: java.lang.Throwable -> L64
            m45 r4 = defpackage.m45.E
            if (r1 != r4) goto L58
            return r4
        L58:
            r1 = r10
            r10 = r11
        L5a:
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r3
            goto L6b
        L5f:
            r6 = r1
            r1 = r10
            r10 = r11
            r11 = r6
            goto L66
        L64:
            r1 = move-exception
            goto L5f
        L66:
            r6 = r11
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r6
        L6b:
            boolean r4 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L75
            r10.a()     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r8 = move-exception
            goto L7f
        L75:
            if (r0 != 0) goto L7e
            java.lang.Object r11 = r11.E     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L7c
            return r11
        L7c:
            r0 = r1
            goto L37
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L7f:
            java.lang.Object r9 = r11.E
            vh4 r9 = (defpackage.vh4) r9
            if (r9 == 0) goto L88
            r7.e(r9)
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9d.b(long, rf1, vp4):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (vh4 vh4Var : this.f) {
                if (vh4Var != null) {
                    vh4Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        qo0 qo0Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            d8a d8aVarE = x44.E();
            int size = qo0Var.size();
            for (int i = 0; i < size; i++) {
                d8aVarE.add(qo0Var.get(i));
            }
            d8a d8aVarV = x44.v(d8aVarE);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            jkf jkfVar = this.g;
            jkfVar.getClass();
            sb2.append(Math.max(ikf.K.get(jkfVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + d8aVarV.size() + ")[" + w44.S0(d8aVarV, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            vh4[] vh4VarArr = this.f;
            int length = vh4VarArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                vh4 vh4Var = vh4VarArr[i3];
                i2++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i2);
                sb3.append("] - ");
                sb3.append(vh4Var != null ? vh4Var.E.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (vh4Var != null) {
                    vh4Var.e(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(vh4 vh4Var) {
        vh4Var.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(vh4Var);
            reentrantLock.unlock();
            this.g.e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
