package defpackage;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oga {
    public static final aga a = new aga();

    public static void a(String str) {
        a.getClass();
        HashSet hashSet = aga.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void b(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = aga.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
