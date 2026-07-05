package io.sentry.android.core.anr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final ArrayList a;

    static {
        ArrayList arrayList = new ArrayList(11);
        a = arrayList;
        arrayList.add("java.lang");
        arrayList.add("java.util");
        arrayList.add("android.app");
        arrayList.add("android.os.Handler");
        arrayList.add("android.os.Looper");
        arrayList.add("android.view");
        arrayList.add("android.widget");
        arrayList.add("com.android.internal");
        arrayList.add("com.google.android");
        arrayList.add("kotlin");
        arrayList.add("kotlinx.coroutines");
    }

    public static a a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            g gVar = (g) it.next();
            StackTraceElement[] stackTraceElementArr = gVar.E;
            if (stackTraceElementArr.length >= 2) {
                for (int length = stackTraceElementArr.length - 1; length >= 0; length--) {
                    if (!b(stackTraceElementArr[length].getClassName())) {
                        i++;
                    }
                    float length2 = i / (stackTraceElementArr.length - length);
                    c cVar = new c(stackTraceElementArr, length, stackTraceElementArr.length - 1);
                    a aVar = (a) map.get(cVar);
                    if (aVar == null) {
                        map.put(cVar, new a(gVar.E, length, r5.length - 1, gVar.F, length2));
                    } else {
                        long j = gVar.F;
                        aVar.g = Math.min(aVar.g, j);
                        aVar.h = Math.max(aVar.h, j);
                        aVar.f++;
                    }
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return (a) Collections.max(map.values(), new b(0));
    }

    public static boolean b(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
