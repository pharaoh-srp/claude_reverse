package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import defpackage.ao0;
import defpackage.cfe;
import defpackage.dpf;
import defpackage.f60;
import defpackage.gxe;
import defpackage.j5h;
import defpackage.lfj;
import defpackage.r5l;
import defpackage.ro6;
import defpackage.thk;
import defpackage.u95;
import defpackage.vk5;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque K = new ArrayDeque(10);
    public final ExecutorService E;
    public lfj F;
    public final Object G;
    public int H;
    public int I;
    public gxe J;

    public FirebaseMessagingService() {
        vk5 vk5Var = new vk5("Firebase-Messaging-Intent-Handle", 1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), vk5Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.E = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.G = new Object();
        this.I = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            thk.g(intent);
        }
        synchronized (this.G) {
            try {
                int i = this.I - 1;
                this.I = i;
                if (i == 0) {
                    stopSelfResult(this.H);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void c(cfe cfeVar) {
    }

    public void d(String str) {
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.F == null) {
                this.F = new lfj(new ro6(0, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.F;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.E.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.G) {
            this.H = i2;
            this.I++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) dpf.K().I).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        j5h j5hVar = new j5h();
        this.E.execute(new f60(this, intent2, j5hVar, 5));
        r5l r5lVar = j5hVar.a;
        if (r5lVar.f()) {
            a(intent);
            return 2;
        }
        r5lVar.i(new ao0(1), new u95(this, 4, intent));
        return 3;
    }
}
