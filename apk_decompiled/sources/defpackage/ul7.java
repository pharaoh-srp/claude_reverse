package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ul7 {
    public final kw9 a;
    public volatile String b;

    public ul7(kw9 kw9Var) {
        this.a = kw9Var;
    }

    public final void a() {
        Object hreVar;
        this.b = null;
        try {
            FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.a.getValue();
            if (firebaseMessaging.e() == null) {
                hreVar = ez1.E(null);
            } else {
                j5h j5hVar = new j5h();
                Executors.newSingleThreadExecutor(new vk5("Firebase-Messaging-Network-Io", 1)).execute(new yw5(firebaseMessaging, 2, j5hVar));
                hreVar = j5hVar.a;
            }
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        d5h d5hVar = (d5h) (hreVar instanceof hre ? null : hreVar);
        if (d5hVar != null) {
            d5hVar.a(new rl7(0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.vp4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.sl7
            if (r0 == 0) goto L13
            r0 = r8
            sl7 r0 = (defpackage.sl7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            sl7 r0 = new sl7
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ul7 r7 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L73
            goto L64
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L30:
            defpackage.sf5.h0(r8)
            java.lang.String r8 = r7.b
            if (r8 == 0) goto L38
            return r8
        L38:
            kw9 r8 = r7.a     // Catch: java.lang.Throwable -> L73
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L73
            com.google.firebase.messaging.FirebaseMessaging r8 = (com.google.firebase.messaging.FirebaseMessaging) r8     // Catch: java.lang.Throwable -> L73
            r8.getClass()     // Catch: java.lang.Throwable -> L73
            j5h r2 = new j5h     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r8.f     // Catch: java.lang.Throwable -> L73
            j01 r5 = new j01     // Catch: java.lang.Throwable -> L73
            r6 = 10
            r5.<init>(r8, r6, r2)     // Catch: java.lang.Throwable -> L73
            r4.execute(r5)     // Catch: java.lang.Throwable -> L73
            r5l r8 = r2.a     // Catch: java.lang.Throwable -> L73
            r8.getClass()     // Catch: java.lang.Throwable -> L73
            r0.E = r7     // Catch: java.lang.Throwable -> L73
            r0.H = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r8 = defpackage.zh4.k(r8, r0)     // Catch: java.lang.Throwable -> L73
            if (r8 != r1) goto L64
            return r1
        L64:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto L6b
            r7.b = r8     // Catch: java.lang.Throwable -> L73
            return r8
        L6b:
            java.lang.String r7 = "FCM token is null"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L73
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L73
            throw r8     // Catch: java.lang.Throwable -> L73
        L73:
            r7 = move-exception
            hre r8 = new hre
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul7.b(vp4):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.tl7
            if (r0 == 0) goto L13
            r0 = r9
            tl7 r0 = (defpackage.tl7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            tl7 r0 = new tl7
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            defpackage.sf5.h0(r9)
            jre r9 = (defpackage.jre) r9
            java.lang.Object r8 = r9.E
            return r8
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r5
        L35:
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L39
            goto L79
        L39:
            r9 = move-exception
            goto L7c
        L3b:
            defpackage.sf5.h0(r9)
            r8.b = r5
            kw9 r9 = r8.a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L39
            com.google.firebase.messaging.FirebaseMessaging r9 = (com.google.firebase.messaging.FirebaseMessaging) r9     // Catch: java.lang.Throwable -> L39
            g5e r2 = r9.e()     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L53
            r5l r9 = defpackage.ez1.E(r5)     // Catch: java.lang.Throwable -> L39
            goto L6d
        L53:
            j5h r2 = new j5h     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            vk5 r6 = new vk5     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = "Firebase-Messaging-Network-Io"
            r6.<init>(r7, r4)     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newSingleThreadExecutor(r6)     // Catch: java.lang.Throwable -> L39
            yw5 r7 = new yw5     // Catch: java.lang.Throwable -> L39
            r7.<init>(r9, r3, r2)     // Catch: java.lang.Throwable -> L39
            r6.execute(r7)     // Catch: java.lang.Throwable -> L39
            r5l r9 = r2.a     // Catch: java.lang.Throwable -> L39
        L6d:
            r9.getClass()     // Catch: java.lang.Throwable -> L39
            r0.G = r4     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = defpackage.zh4.k(r9, r0)     // Catch: java.lang.Throwable -> L39
            if (r9 != r1) goto L79
            goto Lae
        L79:
            java.lang.Void r9 = (java.lang.Void) r9     // Catch: java.lang.Throwable -> L39
            goto L82
        L7c:
            hre r2 = new hre
            r2.<init>(r9)
            r9 = r2
        L82:
            java.lang.Throwable r2 = defpackage.jre.a(r9)
            if (r2 == 0) goto La0
            java.util.List r4 = defpackage.xah.a
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "FCM deleteToken failed: "
            r4.<init>(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r4 = 6
            defpackage.xah.e(r4, r2, r5, r5)
        La0:
            java.lang.Throwable r9 = defpackage.jre.a(r9)
            if (r9 != 0) goto Lb0
            r0.G = r3
            java.io.Serializable r8 = r8.b(r0)
            if (r8 != r1) goto Laf
        Lae:
            return r1
        Laf:
            return r8
        Lb0:
            hre r8 = new hre
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul7.c(vp4):java.lang.Object");
    }
}
