package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class y2i {
    public final Context a;
    public final hjb b;
    public final rl c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final w2i h;
    public final bp0 e = new bp0(0);
    public boolean g = false;

    public y2i(FirebaseMessaging firebaseMessaging, hjb hjbVar, w2i w2iVar, rl rlVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = hjbVar;
        this.h = w2iVar;
        this.c = rlVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(r5l r5lVar) throws IOException {
        try {
            ez1.s(r5lVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        rl rlVar = this.c;
        a(rlVar.t(rlVar.V(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        rl rlVar = this.c;
        a(rlVar.t(rlVar.V(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[Catch: IOException -> 0x003a, TRY_LEAVE, TryCatch #0 {IOException -> 0x003a, blocks: (B:12:0x0018, B:25:0x004e, B:17:0x0029, B:19:0x0031, B:22:0x003d, B:24:0x0045), top: B:75:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2i.e():boolean");
    }

    public final void f(long j) {
        this.f.schedule(new a3i(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
