package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class m7h {
    public final q7h a;
    public final String b;
    public boolean c;
    public c5h d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public m7h(q7h q7hVar, String str) {
        this.a = q7hVar;
        this.b = str;
    }

    public static void b(m7h m7hVar, String str, long j, zy7 zy7Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        m7hVar.getClass();
        str.getClass();
        zy7Var.getClass();
        m7hVar.c(new h4e(zy7Var, str, z), j);
    }

    public final boolean a() {
        c5h c5hVar = this.d;
        if (c5hVar != null && c5hVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((c5h) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                c5h c5hVar2 = (c5h) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    dkk.e(logger, c5hVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(c5h c5hVar, long j) {
        c5hVar.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(c5hVar, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = c5hVar.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    dkk.e(logger, c5hVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    dkk.e(logger, c5hVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.c5h r12, long r13, boolean r15) {
        /*
            r11 = this;
            q7h r0 = r11.a
            java.util.logging.Logger r0 = r0.b
            r12.getClass()
            m7h r1 = r12.c
            r2 = 0
            if (r1 != r11) goto Ld
            goto L11
        Ld:
            if (r1 != 0) goto L88
            r12.c = r11
        L11:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.e
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L37
            long r9 = r12.d
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L34
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L87
            java.lang.String r13 = "already scheduled"
            defpackage.dkk.e(r0, r12, r11, r13)
            return r2
        L34:
            r1.remove(r7)
        L37:
            r12.d = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5d
            if (r15 == 0) goto L4f
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.dkk.g(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L5a
        L4f:
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.dkk.g(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L5a:
            defpackage.dkk.e(r0, r12, r11, r15)
        L5d:
            java.util.Iterator r11 = r1.iterator()
            r15 = r2
        L62:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r11.next()
            c5h r0 = (defpackage.c5h) r0
            long r5 = r0.d
            long r5 = r5 - r3
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L76
            goto L7a
        L76:
            int r15 = r15 + 1
            goto L62
        L79:
            r15 = r8
        L7a:
            if (r15 != r8) goto L80
            int r15 = r1.size()
        L80:
            r1.add(r15, r12)
            if (r15 != 0) goto L87
            r11 = 1
            return r11
        L87:
            return r2
        L88:
            java.lang.String r11 = "task is in multiple queues"
            defpackage.sz6.j(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7h.d(c5h, long, boolean):boolean");
    }

    public final void e() {
        q7h q7hVar = this.a;
        TimeZone timeZone = blj.a;
        synchronized (q7hVar) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
