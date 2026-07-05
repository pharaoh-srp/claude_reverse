package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class luj extends xnj {
    public final /* synthetic */ fe1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luj(fe1 fe1Var, Looper looper) {
        super(looper, 4);
        this.a = fe1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        epj epjVar;
        fe1 fe1Var = this.a;
        int i = fe1Var.a0.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (epjVar = (epj) message.obj) != null) {
                epjVar.d();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !fe1Var.d()) {
            epj epjVar2 = (epj) message.obj;
            if (epjVar2 != null) {
                epjVar2.d();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            fe1Var.X = new hh4(message.arg2, null, null);
            if (!fe1Var.Y && !TextUtils.isEmpty(fe1Var.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(fe1Var.u());
                    if (!fe1Var.Y) {
                        fe1Var.D(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            hh4 hh4Var = fe1Var.X;
            if (hh4Var == null) {
                hh4Var = new hh4(8, null, null);
            }
            fe1Var.N.h(hh4Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            hh4 hh4Var2 = fe1Var.X;
            if (hh4Var2 == null) {
                hh4Var2 = new hh4(8, null, null);
            }
            fe1Var.N.h(hh4Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            fe1Var.N.h(new hh4(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            fe1Var.D(5, null);
            ce1 ce1Var = fe1Var.S;
            if (ce1Var != null) {
                ce1Var.c(message.arg2);
            }
            fe1Var.y();
            fe1Var.C(5, 1, null);
            return;
        }
        if (i4 == 2 && !fe1Var.a()) {
            epj epjVar3 = (epj) message.obj;
            if (epjVar3 != null) {
                epjVar3.d();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 == 2 || i5 == 1 || i5 == 7) {
            ((epj) message.obj).c();
        } else {
            Log.wtf("GmsClient", ij0.g(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
        }
    }
}
