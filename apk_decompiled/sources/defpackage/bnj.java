package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class bnj extends xnj {
    public final Context a;
    public final /* synthetic */ f88 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnj(f88 f88Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = f88Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = g88.a;
        f88 f88Var = this.b;
        Context context = this.a;
        int iC = f88Var.c(context, i2);
        AtomicBoolean atomicBoolean = z88.a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = f88Var.b(iC, context, "n");
            f88Var.h(context, iC, intentB == null ? null : ysj.m(context, intentB));
        }
    }
}
