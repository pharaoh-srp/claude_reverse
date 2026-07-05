package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bgj {
    public static bgj k;
    public static bgj l;
    public static final Object m;
    public final Context a;
    public final fg4 b;
    public final WorkDatabase c;
    public final ggj d;
    public final List e;
    public final xhd f;
    public final tk5 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final j4i j;

    static {
        nga.e("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public bgj(Context context, final fg4 fg4Var, ggj ggjVar, final WorkDatabase workDatabase, final List list, xhd xhdVar, j4i j4iVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            sz6.j("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        nga ngaVar = new nga(fg4Var.h);
        synchronized (nga.b) {
            try {
                if (nga.c == null) {
                    nga.c = ngaVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = ggjVar;
        this.c = workDatabase;
        this.f = xhdVar;
        this.j = j4iVar;
        this.b = fg4Var;
        this.e = list;
        e45 e45Var = ggjVar.b;
        e45Var.getClass();
        mp4 mp4VarC = fd9.c(e45Var);
        this.g = new tk5(19, workDatabase);
        final knf knfVar = ggjVar.a;
        int i = b7f.a;
        xhdVar.a(new h57() { // from class: z6f
            @Override // defpackage.h57
            public final void b(xfj xfjVar, boolean z) {
                knfVar.execute(new a7f(list, xfjVar, fg4Var, workDatabase, 0));
            }
        });
        ggjVar.a.execute(new xv7(applicationContext, this));
        String str = dei.a;
        if (shd.a(applicationContext, fg4Var)) {
            j8.T(new gq7(j8.A(j8.l(new aq7(ez1.x(workDatabase.w().a, false, new String[]{"workspec"}, new hdj(8)), new cei(4, null)), -1, py1.E)), new t73(applicationContext, null), 2), mp4VarC);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        throw r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bgj d(android.content.Context r2) {
        /*
            java.lang.Object r0 = defpackage.bgj.m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2e
            bgj r1 = defpackage.bgj.k     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            goto Lf
        La:
            r2 = move-exception
            goto L3a
        Lc:
            bgj r1 = defpackage.bgj.l     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
        Lf:
            if (r1 != 0) goto L38
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r2 instanceof defpackage.cg4     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            r1 = r2
            cg4 r1 = (defpackage.cg4) r1     // Catch: java.lang.Throwable -> L2e
            com.anthropic.claude.application.ClaudeApplication r1 = (com.anthropic.claude.application.ClaudeApplication) r1     // Catch: java.lang.Throwable -> L2e
            kw9 r1 = r1.K     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2e
            fg4 r1 = (defpackage.fg4) r1     // Catch: java.lang.Throwable -> L2e
            e(r2, r1)     // Catch: java.lang.Throwable -> L2e
            bgj r1 = d(r2)     // Catch: java.lang.Throwable -> L2e
            goto L38
        L2e:
            r2 = move-exception
            goto L3c
        L30:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r1
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2     // Catch: java.lang.Throwable -> L2e
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgj.d(android.content.Context):bgj");
    }

    public static void e(Context context, fg4 fg4Var) {
        synchronized (m) {
            try {
                bgj bgjVar = k;
                if (bgjVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (bgjVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = dgj.B(applicationContext, fg4Var);
                    }
                    k = l;
                }
            } finally {
            }
        }
    }

    public final n78 a(String str) {
        zp3 zp3Var = this.b.m;
        String strConcat = "CancelWorkByName_".concat(str);
        knf knfVar = this.d.a;
        knfVar.getClass();
        return nai.R(zp3Var, strConcat, knfVar, new sa2(str, this));
    }

    public final void b(tgc tgcVar) {
        List listW = x44.W(tgcVar);
        if (listW.isEmpty()) {
            sz6.p("enqueue needs at least one WorkRequest.");
        } else {
            new pfj(this, listW).a();
        }
    }

    public final n78 c(String str, c77 c77Var, tgc tgcVar) {
        return new pfj(this, str, c77Var, x44.W(tgcVar)).a();
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() throws Throwable {
        zp3 zp3Var = this.b.m;
        p3f p3fVar = new p3f(21, this);
        zp3Var.getClass();
        boolean zO = mpk.O();
        if (zO) {
            try {
                Trace.beginSection("ReschedulingWork");
            } catch (Throwable th) {
                if (zO) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        p3fVar.a();
        if (zO) {
            Trace.endSection();
        }
    }
}
