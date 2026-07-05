package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ooj {
    public static final s20 a = new s20("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        poj.P(context).Q();
        Set set = mmj.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            j88.a();
        } else {
            ((mmj) it.next()).getClass();
            mr9.x();
        }
    }
}
