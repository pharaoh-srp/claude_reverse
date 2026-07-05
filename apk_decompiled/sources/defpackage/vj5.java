package defpackage;

import android.content.Context;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class vj5 implements Thread.UncaughtExceptionHandler {
    public final qj5 E;
    public final WeakReference F;
    public Thread.UncaughtExceptionHandler G;

    public vj5(qj5 qj5Var, Context context) {
        context.getClass();
        this.E = qj5Var;
        this.F = new WeakReference(context);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Map allStackTraces;
        bgj bgjVar;
        g99 g99Var = g99.E;
        qj5 qj5Var = this.E;
        thread.getClass();
        th.getClass();
        String name = thread.getName();
        Thread.State state = thread.getState();
        state.getClass();
        String strN = csg.n(state);
        String strH = csk.h(th);
        name.getClass();
        ArrayList arrayListA0 = x44.a0(new rnh(name, strN, strH, true));
        try {
            allStackTraces = Thread.getAllStackTraces();
            allStackTraces.getClass();
        } catch (Throwable th2) {
            dch.H(qj5Var.k, 5, g99.F, yf5.S, th2, false, 48);
            allStackTraces = nm6.E;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : allStackTraces.entrySet()) {
            if (!x44.r((Thread) entry.getKey(), thread)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((StackTraceElement[]) entry2.getValue()).length != 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Thread thread2 = (Thread) entry3.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry3.getValue();
            String name2 = thread2.getName();
            name2.getClass();
            Thread.State state2 = thread2.getState();
            state2.getClass();
            String strN2 = csg.n(state2);
            stackTraceElementArr.getClass();
            arrayList.add(new rnh(name2, strN2, mp0.M0(stackTraceElementArr, "\n", null, null, pgg.J, 30), false));
        }
        ArrayList arrayListA1 = w44.a1(arrayListA0, arrayList);
        gbf feature = qj5Var.getFeature("rum");
        if (feature != null) {
            String message = th.getMessage();
            if (message == null || bsg.I0(message)) {
                String canonicalName = th.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = th.getClass().getSimpleName();
                }
                message = "Application crash detected: ".concat(canonicalName);
            }
            feature.a(new ak9(message, th, arrayListA1));
        } else {
            dch.H(qj5Var.k, 3, g99Var, yf5.T, null, false, 56);
        }
        ExecutorService executorServiceX = qj5Var.x();
        ThreadPoolExecutor threadPoolExecutor = executorServiceX instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorServiceX : null;
        if (!(threadPoolExecutor != null ? zrk.v(threadPoolExecutor, qj5Var.k, qj5Var.C().l) : true)) {
            dch.H(qj5Var.k, 4, g99Var, yf5.U, null, false, 56);
        }
        Context context = (Context) this.F.get();
        if (context != null) {
            synchronized (bgj.m) {
                try {
                    bgjVar = bgj.k;
                    if (bgjVar == null) {
                        bgjVar = bgj.l;
                    }
                } finally {
                }
            }
            if (bgjVar != null) {
                hgj.b(context, qj5Var.b, qj5Var.k);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.G;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
