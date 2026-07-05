package defpackage;

import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ix implements hx {
    public static volatile ix b;
    public final gmf a;

    public ix(gmf gmfVar) {
        dgj.v(gmfVar);
        this.a = gmfVar;
        new ConcurrentHashMap();
    }

    public final void a(String str, Bundle bundle) {
        if (j3k.c() && j3k.a(str, bundle) && j3k.b(str, bundle)) {
            j6k j6kVar = (j6k) this.a.F;
            j6kVar.c(new sbk(j6kVar, "fcm", str, bundle, true));
        }
    }
}
