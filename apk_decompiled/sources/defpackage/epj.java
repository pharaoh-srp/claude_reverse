package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class epj {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ fe1 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ fe1 f;

    public epj(fe1 fe1Var, int i, Bundle bundle) {
        this.f = fe1Var;
        Boolean bool = Boolean.TRUE;
        this.c = fe1Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(hh4 hh4Var);

    public final void c() {
        Boolean bool;
        synchronized (this) {
            try {
                bool = this.a;
                if (this.b) {
                    String string = toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            fe1 fe1Var = this.f;
            int i = this.d;
            if (i != 0) {
                fe1Var.D(1, null);
                Bundle bundle = this.e;
                b(new hh4(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!a()) {
                fe1Var.D(1, null);
                b(new hh4(8, null, null));
            }
        }
        synchronized (this) {
            this.b = true;
        }
        d();
    }

    public final void d() {
        e();
        fe1 fe1Var = this.c;
        synchronized (fe1Var.P) {
            fe1Var.P.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.a = null;
        }
    }
}
