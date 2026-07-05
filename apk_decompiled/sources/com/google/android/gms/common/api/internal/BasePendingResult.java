package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.dgj;
import defpackage.fmj;
import defpackage.ig;
import defpackage.kre;
import defpackage.mmj;
import defpackage.ne1;
import defpackage.zp6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePendingResult<R extends kre> {
    public static final ig j = new ig(12);
    public kre e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(mmj mmjVar) {
        new ne1(mmjVar != null ? mmjVar.a.f : Looper.getMainLooper(), 0);
        new WeakReference(mmjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(kre kreVar) {
        if (kreVar instanceof zp6) {
            try {
                ((zp6) kreVar).e();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(kreVar)), e);
            }
        }
    }

    public final void a(fmj fmjVar) {
        synchronized (this.a) {
            try {
                if (d()) {
                    fmjVar.a(this.f);
                } else {
                    this.c.add(fmjVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract kre b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(kre kreVar) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    g(kreVar);
                    return;
                }
                d();
                dgj.x("Results have already been set", !d());
                dgj.x("Result has already been consumed", !this.g);
                this.e = kreVar;
                this.f = kreVar.e();
                this.b.countDown();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((fmj) arrayList.get(i)).a(this.f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        boolean z = true;
        if (!this.i && !((Boolean) j.get()).booleanValue()) {
            z = false;
        }
        this.i = z;
    }
}
