package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import io.sentry.y4;

/* JADX INFO: loaded from: classes.dex */
public final class lpj extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public lpj(y4 y4Var, boolean z) {
        this.d = y4Var;
        this.c = z;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        o0l o0lVar = (o0l) this.d;
        o0lVar.a0();
        o0lVar.O().K0();
        o0lVar.O().K0();
        if (this.b) {
            o0lVar.b0().R.b("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                o0lVar.P.E.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                o0lVar.b0().J.c("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.b) {
            jyj.h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.b = false;
        }
    }

    public void d(Bundle bundle, hp1 hp1Var, int i, isk iskVar, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            y4 y4Var = (y4) this.d;
            if (byteArray != null) {
                ((cbf) ((e3k) y4Var.d)).y(lqk.t(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((cbf) ((e3k) y4Var.d)).y(a3k.b(23, i, hp1Var, null, iskVar), j, z);
            }
        } catch (Throwable unused) {
            jyj.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0273  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpj.onReceive(android.content.Context, android.content.Intent):void");
    }

    public lpj(o0l o0lVar) {
        this.d = o0lVar;
    }
}
