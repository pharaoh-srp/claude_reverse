package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cjd {
    public static volatile ajd a = new am4(14);
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(ejd ejdVar) {
        k99 k99VarA = kj5.a(null);
        if (!b.getAndSet(true)) {
            uu5 uu5Var = new uu5();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.getClass();
            a = new cxc(uu5Var, executorServiceNewSingleThreadExecutor);
        }
        k99VarA.d(new jjd(k99VarA, ejdVar, a));
    }

    public static void b(Context context, Map map, Set set) {
        Set<String> stringSet;
        if (!b.getAndSet(true)) {
            uu5 uu5Var = new uu5();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.getClass();
            a = new cxc(uu5Var, executorServiceNewSingleThreadExecutor);
        }
        a.e(context, map, set);
        tk5 tk5VarD = lz1.P.D(context);
        synchronized (tk5VarD) {
            Set<String> set2 = um6.E;
            try {
                stringSet = ((SharedPreferences) tk5VarD.F).getStringSet("dd_profiling_enabled", set2);
            } catch (ClassCastException unused) {
                stringSet = null;
            }
            Set<String> set3 = stringSet;
            if (set3 != null) {
                set2 = set3;
            }
            Set<String> setS1 = w44.s1(set2);
            if (setS1.removeAll(set)) {
                ((SharedPreferences) tk5VarD.F).edit().putStringSet("dd_profiling_enabled", setS1).apply();
            }
        }
    }
}
