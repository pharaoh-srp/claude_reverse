package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class nij {
    public static final nij b;
    public gmf a;

    static {
        nij nijVar = new nij();
        nijVar.a = null;
        b = nijVar;
    }

    public static gmf a(Context context) {
        gmf gmfVar;
        nij nijVar = b;
        synchronized (nijVar) {
            try {
                if (nijVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    nijVar.a = new gmf(21, context);
                }
                gmfVar = nijVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gmfVar;
    }
}
