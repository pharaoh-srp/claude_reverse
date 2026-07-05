package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class krk implements kok {
    public static final bp0 E = new bp0(0);

    public static krk a(Context context, wmj wmjVar) {
        throw null;
    }

    public static synchronized void c() {
        Iterator it = ((zo0) E.values()).iterator();
        if (it.hasNext()) {
            ((krk) it.next()).getClass();
            throw null;
        }
        E.clear();
    }
}
