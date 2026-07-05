package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class re9 implements AutoCloseable {
    public static final AtomicBoolean N = new AtomicBoolean(true);
    public final Object E = new Object();
    public final poj F;
    public final eu8 G;
    public final AtomicReference H;
    public final Context I;
    public Set J;
    public int K;
    public final ExecutorService L;
    public final HashSet M;

    public re9(Context context, qe9 qe9Var, eu8 eu8Var) {
        poj pojVar = Build.VERSION.SDK_INT >= 30 ? new poj(new aq3()) : new poj(new tqh(29));
        this.F = pojVar;
        this.L = Executors.newCachedThreadPool(new pe9(this));
        this.I = context;
        this.H = new AtomicReference(qe9Var);
        this.G = eu8Var;
        cu8 cu8Var = (cu8) eu8Var;
        cu8Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(eu8.e);
            if (!cu8Var.i.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method getSupportedFeatures is unimplemented.");
            }
            parcelObtain2.readException();
            ArrayList<String> arrayListCreateStringArrayList = parcelObtain2.createStringArrayList();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            HashSet hashSet = new HashSet();
            if (arrayListCreateStringArrayList.contains("ISOLATE_TERMINATION")) {
                hashSet.add("JS_FEATURE_ISOLATE_TERMINATION");
            }
            if (arrayListCreateStringArrayList.contains("WASM_FROM_ARRAY_BUFFER")) {
                hashSet.add("JS_FEATURE_PROMISE_RETURN");
                hashSet.add("JS_FEATURE_PROVIDE_CONSUME_ARRAY_BUFFER");
                hashSet.add("JS_FEATURE_WASM_COMPILATION");
            }
            if (arrayListCreateStringArrayList.contains("ISOLATE_MAX_HEAP_SIZE_LIMIT")) {
                hashSet.add("JS_FEATURE_ISOLATE_MAX_HEAP_SIZE");
            }
            if (arrayListCreateStringArrayList.contains("EVALUATE_WITHOUT_TRANSACTION_LIMIT")) {
                hashSet.add("JS_FEATURE_EVALUATE_WITHOUT_TRANSACTION_LIMIT");
            }
            if (arrayListCreateStringArrayList.contains("CONSOLE_MESSAGING")) {
                hashSet.add("JS_FEATURE_CONSOLE_MESSAGING");
            }
            if (arrayListCreateStringArrayList.contains("ISOLATE_CLIENT")) {
                hashSet.add("JS_FEATURE_ISOLATE_CLIENT");
            }
            if (arrayListCreateStringArrayList.contains("EVALUATE_FROM_FD")) {
                hashSet.add("JS_FEATURE_EVALUATE_FROM_FD");
            }
            if (arrayListCreateStringArrayList.contains("MESSAGE_PORTS")) {
                hashSet.add("JS_FEATURE_MESSAGE_PORTS");
            }
            this.M = hashSet;
            this.J = new HashSet();
            this.K = 1;
            ((bq3) pojVar.E).f();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    public static boolean e() {
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        long jM = rwk.m(currentWebViewPackage);
        if (jM < 497600000) {
            return 495102400 <= jM && jM < 495200000;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:4:0x0008, B:10:0x0016, B:11:0x001d, B:14:0x0020, B:15:0x0027, B:16:0x0028, B:30:0x0052, B:31:0x0057, B:18:0x002f, B:23:0x0037, B:25:0x003e, B:27:0x0047, B:26:0x0041, B:29:0x0049), top: B:35:0x0008, inners: #4, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041 A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:4:0x0008, B:10:0x0016, B:11:0x001d, B:14:0x0020, B:15:0x0027, B:16:0x0028, B:30:0x0052, B:31:0x0057, B:18:0x002f, B:23:0x0037, B:25:0x003e, B:27:0x0047, B:26:0x0041, B:29:0x0049), top: B:35:0x0008, inners: #4, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ne9 c() {
        /*
            r3 = this;
            cm4 r0 = new cm4
            r0.<init>()
            java.lang.Object r1 = r3.E
            monitor-enter(r1)
            int r2 = r3.K     // Catch: java.lang.Throwable -> L1e
            int r2 = defpackage.sq6.F(r2)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L2f
            r0 = 1
            if (r2 == r0) goto L28
            r3 = 2
            if (r2 == r3) goto L20
            java.lang.AssertionError r3 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "unreachable"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r3 = move-exception
            goto L59
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "Cannot create isolate in closed sandbox"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L28:
            java.lang.String r0 = "sandbox was dead before call to createIsolate"
            ne9 r0 = defpackage.ne9.d(r3, r0)     // Catch: java.lang.Throwable -> L1e
            goto L52
        L2f:
            ne9 r0 = defpackage.ne9.c(r3, r0)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L34 android.os.RemoteException -> L36 android.os.DeadObjectException -> L48
            goto L52
        L34:
            r0 = move-exception
            goto L37
        L36:
            r0 = move-exception
        L37:
            r3.f(r0)     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r0 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L41
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L1e
            goto L47
        L41:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            r0 = r3
        L47:
            throw r0     // Catch: java.lang.Throwable -> L1e
        L48:
            r0 = move-exception
            r3.f(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "sandbox found dead during call to createIsolate"
            ne9 r0 = defpackage.ne9.d(r3, r0)     // Catch: java.lang.Throwable -> L1e
        L52:
            java.util.Set r3 = r3.J     // Catch: java.lang.Throwable -> L1e
            r3.add(r0)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r0
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re9.c():ne9");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Set set;
        synchronized (this.E) {
            try {
                if (this.K == 3) {
                    return;
                }
                qe9 qe9Var = (qe9) this.H.getAndSet(null);
                if (qe9Var != null) {
                    this.I.unbindService(qe9Var);
                }
                N.set(true);
                this.K = 3;
                synchronized (this.E) {
                    set = this.J;
                    this.J = Collections.EMPTY_SET;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ne9) it.next()).f(new ep1(2, "sandbox closed"));
                }
                this.L.shutdown();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yt8 d(cm4 cm4Var, me9 me9Var) {
        synchronized (this.E) {
            try {
                if (this.M.contains("JS_FEATURE_ISOLATE_CLIENT")) {
                    return ((cu8) this.G).c(me9Var);
                }
                boolean zContains = this.M.contains("JS_FEATURE_ISOLATE_MAX_HEAP_SIZE");
                eu8 eu8Var = this.G;
                if (zContains) {
                    return ((cu8) eu8Var).d();
                }
                return ((cu8) eu8Var).b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Exception exc) {
        if (exc instanceof DeadObjectException) {
            Log.e("JavaScriptSandbox", "Sandbox died before or during during remote call", exc);
        } else {
            Log.e("JavaScriptSandbox", "Killing sandbox due to exception", exc);
        }
        qe9 qe9Var = (qe9) this.H.getAndSet(null);
        Context context = this.I;
        if (qe9Var != null) {
            context.unbindService(qe9Var);
        }
        x44.N(context).execute(new fc(26, this));
    }

    public final void finalize() throws Throwable {
        try {
            ((bq3) this.F.E).c();
            close();
        } finally {
            super.finalize();
        }
    }

    public final void i() {
        int i;
        ne9[] ne9VarArr;
        synchronized (this.E) {
            try {
                if (this.K != 1) {
                    return;
                }
                this.K = 2;
                qe9 qe9Var = (qe9) this.H.getAndSet(null);
                if (qe9Var != null) {
                    this.I.unbindService(qe9Var);
                }
                synchronized (this.E) {
                    ne9VarArr = (ne9[]) this.J.toArray(new ne9[0]);
                }
                for (ne9 ne9Var : ne9VarArr) {
                    ne9Var.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
