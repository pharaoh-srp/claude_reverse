package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c5a implements Runnable {
    public final /* synthetic */ int E;
    public Object F;
    public final Object G;

    public /* synthetic */ c5a(Object obj, int i, Object obj2) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    private final void a() {
        synchronized (((njk) this.G).G) {
            ((zdc) ((njk) this.G).H).onComplete((d5h) this.F);
        }
    }

    private final void b() {
        synchronized (((njk) this.G).G) {
            cec cecVar = (cec) ((njk) this.G).H;
            Exception excD = ((d5h) this.F).d();
            dgj.v(excD);
            cecVar.onFailure(excD);
        }
    }

    private final void c() {
        synchronized (((njk) this.G).G) {
            ((mec) ((njk) this.G).H).onSuccess(((d5h) this.F).e());
        }
    }

    private final void d() {
        synchronized (((fzk) this.G)) {
            try {
                ((fzk) this.G).E = false;
                if (!((fzk) this.G).G.Y0()) {
                    ((fzk) this.G).G.b0().R.b("Connected to service");
                    hyk hykVar = ((fzk) this.G).G;
                    pfk pfkVar = (pfk) this.F;
                    hykVar.K0();
                    hykVar.H = pfkVar;
                    hykVar.c1();
                    hykVar.b1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        njk njkVar = (njk) this.G;
        r5l r5lVar = (r5l) njkVar.H;
        try {
            r5l r5lVarA = ((gxg) njkVar.G).a(((d5h) this.F).e());
            z46 z46Var = y5h.b;
            r5lVarA.c(z46Var, njkVar);
            r5lVarA.b(z46Var, njkVar);
            r5lVarA.b.k(new njk((Executor) z46Var, (ydc) njkVar));
            r5lVarA.q();
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                njkVar.onFailure((Exception) e.getCause());
            } else {
                r5lVar.m(e);
            }
        } catch (CancellationException unused) {
            njkVar.a();
        } catch (Exception e2) {
            r5lVar.m(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.F).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        defpackage.gnf.J.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.F), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.F = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.G     // Catch: java.lang.Throwable -> L58
            gnf r2 = (defpackage.gnf) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.F     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.G     // Catch: java.lang.Throwable -> L20
            gnf r0 = (defpackage.gnf) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.G     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.H     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.H = r6     // Catch: java.lang.Throwable -> L20
            r0.G = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.G     // Catch: java.lang.Throwable -> L20
            gnf r4 = (defpackage.gnf) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.F     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.F = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.G     // Catch: java.lang.Throwable -> L20
            gnf r10 = (defpackage.gnf) r10     // Catch: java.lang.Throwable -> L20
            r10.G = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.F     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.F = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.gnf.J     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.F     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.F = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5a.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d8 A[Catch: IllegalStateException -> 0x02f8, TryCatch #8 {IllegalStateException -> 0x02f8, blocks: (B:94:0x02a9, B:98:0x02bc, B:102:0x02c8, B:106:0x02d0, B:108:0x02d8, B:112:0x02e9, B:116:0x02f5, B:115:0x02f1, B:111:0x02e5, B:120:0x02fc, B:122:0x030e, B:124:0x0313, B:123:0x0311, B:101:0x02c4, B:97:0x02b8), top: B:485:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fc A[Catch: IllegalStateException -> 0x02f8, TryCatch #8 {IllegalStateException -> 0x02f8, blocks: (B:94:0x02a9, B:98:0x02bc, B:102:0x02c8, B:106:0x02d0, B:108:0x02d8, B:112:0x02e9, B:116:0x02f5, B:115:0x02f1, B:111:0x02e5, B:120:0x02fc, B:122:0x030e, B:124:0x0313, B:123:0x0311, B:101:0x02c4, B:97:0x02b8), top: B:485:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3 A[PHI: r6
      0x00d3: PHI (r6v9 long) = (r6v8 long), (r6v57 long) binds: [B:29:0x00bb, B:31:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x035a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5a.run():void");
    }

    public String toString() {
        switch (this.E) {
            case 1:
                Runnable runnable = (Runnable) this.F;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + gid.y(((gnf) this.G).G) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c5a(Object obj, Object obj2, boolean z, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public c5a(gnf gnfVar) {
        this.E = 1;
        this.G = gnfVar;
    }
}
