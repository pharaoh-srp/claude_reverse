package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class s1c extends ml4 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final x19 i;

    public s1c(Context context, ggj ggjVar) {
        super(context, ggjVar);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new x19(1, this);
    }

    @Override // defpackage.ml4
    public final Object a() {
        return r1c.b(this.f, this.h);
    }

    @Override // defpackage.ml4
    public final void c() {
        try {
            nga ngaVarC = nga.c();
            String str = r1c.a;
            ngaVarC.getClass();
            ConnectivityManager connectivityManager = this.f;
            x19 x19Var = this.i;
            connectivityManager.getClass();
            x19Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(x19Var);
        } catch (IllegalArgumentException e) {
            nga.c().b(r1c.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            nga.c().b(r1c.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.ml4
    public final void d() {
        try {
            nga ngaVarC = nga.c();
            String str = r1c.a;
            ngaVarC.getClass();
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            nga.c().b(r1c.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            nga.c().b(r1c.a, "Received exception while unregistering network callback", e2);
        }
    }
}
