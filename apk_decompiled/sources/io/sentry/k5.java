package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k5 {
    public final x a;

    public static io.sentry.protocol.v c(Throwable th, io.sentry.protocol.o oVar, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.v vVar = new io.sentry.protocol.v();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(list);
            if (z) {
                c0Var.G = Boolean.TRUE;
            }
            vVar.I = c0Var;
        }
        vVar.H = l;
        vVar.E = name;
        vVar.J = oVar;
        vVar.G = name2;
        vVar.F = message;
        return vVar;
    }

    public void a(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        io.sentry.protocol.o oVar;
        boolean zD;
        int iIncrementAndGet = atomicInteger.get();
        String str2 = str;
        while (th != null && hashSet.add(th)) {
            if (str2 == null) {
                str2 = "chained";
            }
            if (th instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                io.sentry.protocol.o oVarA = exceptionMechanismException.a();
                Throwable thC = exceptionMechanismException.c();
                threadCurrentThread = exceptionMechanismException.b();
                zD = exceptionMechanismException.d();
                th = thC;
                oVar = oVarA;
            } else {
                io.sentry.protocol.o oVar2 = new io.sentry.protocol.o();
                threadCurrentThread = Thread.currentThread();
                oVar = oVar2;
                zD = false;
            }
            io.sentry.protocol.v vVarC = c(th, oVar, threadCurrentThread != null ? Long.valueOf(threadCurrentThread.getId()) : null, this.a.b(th.getStackTrace(), Boolean.FALSE.equals(oVar.H)), zD);
            ArrayDeque arrayDeque2 = arrayDeque;
            arrayDeque2.addFirst(vVarC);
            if (oVar.E == null) {
                oVar.E = str2;
            }
            if (atomicInteger.get() >= 0) {
                oVar.M = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            oVar.L = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                int i = 0;
                while (i < length) {
                    a(suppressed[i], atomicInteger, hashSet, arrayDeque2, "suppressed");
                    i++;
                    arrayDeque2 = arrayDeque;
                }
            }
            th = th.getCause();
            str2 = null;
        }
    }

    public ArrayList b(Map map, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayListB;
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z3 = (thread == threadCurrentThread && !z) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            io.sentry.protocol.d0 d0Var = new io.sentry.protocol.d0();
            d0Var.G = thread2.getName();
            d0Var.F = Integer.valueOf(thread2.getPriority());
            d0Var.E = Long.valueOf(thread2.getId());
            d0Var.K = Boolean.valueOf(thread2.isDaemon());
            d0Var.H = thread2.getState().name();
            d0Var.I = Boolean.valueOf(z3);
            if (z2 && (arrayListB = this.a.b(stackTraceElementArr, false)) != null && !arrayListB.isEmpty()) {
                io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(arrayListB);
                c0Var.G = Boolean.TRUE;
                d0Var.M = c0Var;
            }
            arrayList2.add(d0Var);
        }
        return arrayList2;
    }
}
