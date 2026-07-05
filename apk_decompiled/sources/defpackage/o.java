package defpackage;

import android.os.Handler;
import com.datadog.android.rum.internal.anr.ANRException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    public final k99 E;
    public final Handler F;
    public volatile boolean G;

    public o(k99 k99Var, Handler handler) {
        k99Var.getClass();
        this.E = k99Var;
        this.F = handler;
    }

    public final void a() {
        Map allStackTraces;
        k99 k99Var = this.E;
        Thread thread = this.F.getLooper().getThread();
        thread.getClass();
        ANRException aNRException = new ANRException(thread);
        String name = thread.getName();
        name.getClass();
        Thread.State state = thread.getState();
        state.getClass();
        ArrayList arrayListA0 = x44.a0(new rnh(name, csg.n(state), csk.h(aNRException), false));
        try {
            allStackTraces = Thread.getAllStackTraces();
            allStackTraces.getClass();
        } catch (Throwable th) {
            dch.H(k99Var.t(), 5, g99.F, n.G, th, false, 48);
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
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Thread thread2 = (Thread) ((Map.Entry) it.next()).getKey();
            String name2 = thread2.getName();
            name2.getClass();
            Thread.State state2 = thread2.getState();
            state2.getClass();
            String strN = csg.n(state2);
            StackTraceElement[] stackTrace = thread2.getStackTrace();
            stackTrace.getClass();
            arrayList.add(new rnh(name2, strN, mp0.M0(stackTrace, "\n", null, null, pgg.J, 30), false));
        }
        ArrayList arrayListA1 = w44.a1(arrayListA0, arrayList);
        cye cyeVarA = t78.a(k99Var);
        Map mapSingletonMap = Collections.singletonMap("_dd.error.threads", arrayListA1);
        mapSingletonMap.getClass();
        cyeVarA.s("Application Not Responding", 2, aNRException, mapSingletonMap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!Thread.currentThread().isInterrupted() && !this.G) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                if (!this.F.post(new m(0, countDownLatch))) {
                    return;
                }
                if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                    a();
                    g99 g99Var = g99.F;
                    k99 k99Var = this.E;
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        dch.H(k99Var.t(), 5, g99Var, n.H, e, false, 48);
                        try {
                            Thread.currentThread().interrupt();
                        } catch (SecurityException e2) {
                            dch.H(k99Var.t(), 5, g99Var, n.I, e2, false, 48);
                        }
                    }
                }
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
