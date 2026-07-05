package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x implements u1 {
    public final w6 a;

    public /* synthetic */ x(w6 w6Var) {
        this.a = w6Var;
    }

    public static Boolean c(List list, List list2, String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    @Override // io.sentry.u1
    public boolean a() {
        return r5.d().c(this.a.getFatalLogger());
    }

    public ArrayList b(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0();
                    w6 w6Var = this.a;
                    a0Var.O = c(w6Var.getInAppIncludes(), w6Var.getInAppExcludes(), className);
                    a0Var.J = className;
                    a0Var.I = stackTraceElement.getMethodName();
                    a0Var.H = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        a0Var.K = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    a0Var.Q = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(a0Var);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
