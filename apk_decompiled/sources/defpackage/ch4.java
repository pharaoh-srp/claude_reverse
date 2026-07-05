package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class ch4 implements Handler.Callback {
    public final Context E;
    public final Handler F;
    public final HashMap G = new HashMap();

    public ch4(Context context, Looper looper) {
        this.E = context;
        this.F = new Handler(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        qb5 qb5Var;
        int i = message.what;
        Handler handler = this.F;
        switch (i) {
            case 1:
                apf apfVar = (apf) message.obj;
                HashMap map = apfVar.I;
                ConcurrentLinkedQueue concurrentLinkedQueue = apfVar.F;
                for (Map.Entry entry : map.entrySet()) {
                    Objects.toString(entry.getKey());
                    Log.isLoggable("ServiceConnection", 3);
                    apfVar.c((oe1) entry.getValue());
                }
                concurrentLinkedQueue.add((oe1) apfVar.G.F);
                for (oe1 oe1Var : new ArrayList(concurrentLinkedQueue)) {
                    if (concurrentLinkedQueue.remove(oe1Var)) {
                        apfVar.c(oe1Var);
                    }
                }
                handler.removeMessages(6, apfVar);
                handler.sendMessageDelayed(handler.obtainMessage(6, apfVar), 15000L);
                return true;
            case 2:
                apf apfVar2 = (apf) message.obj;
                qb5 qb5Var2 = apfVar2.G;
                if (apfVar2.I.isEmpty()) {
                    qb5Var2.getClass();
                    Log.isLoggable("ServiceConnection", 3);
                    return true;
                }
                apfVar2.M++;
                qb5Var2.getClass();
                Log.isLoggable("ServiceConnection", 3);
                apfVar2.b();
                return true;
            case 3:
                oe1 oe1Var2 = (oe1) message.obj;
                switch (oe1Var2.a) {
                    case 0:
                        qb5Var = (qb5) oe1Var2.b;
                        break;
                    default:
                        qb5Var = ((yof) oe1Var2.b).a;
                        break;
                }
                String strO = qb5Var.o();
                HashMap map2 = this.G;
                apf apfVar3 = (apf) map2.get(strO);
                if (apfVar3 == null) {
                    apfVar3 = new apf(this.E, qb5Var, new poj(25), this);
                    map2.put(strO, apfVar3);
                }
                IBinder iBinder = apfVar3.K;
                if (iBinder == null || !iBinder.isBinderAlive()) {
                    apfVar3.F.add(oe1Var2);
                    apfVar3.b();
                } else {
                    apfVar3.c(oe1Var2);
                }
                handler.removeMessages(6, apfVar3);
                handler.sendMessageDelayed(handler.obtainMessage(6, apfVar3), 15000L);
                return true;
            case 4:
                throw ij0.e(message.obj);
            case 5:
                throw ij0.e(message.obj);
            case 6:
                apf apfVar4 = (apf) message.obj;
                if (!handler.hasMessages(3) && !handler.hasMessages(4) && !handler.hasMessages(5)) {
                    if (apfVar4.F.isEmpty() && apfVar4.I.isEmpty()) {
                        apfVar4.e();
                        return true;
                    }
                    handler.removeMessages(6, apfVar4);
                    handler.sendMessageDelayed(handler.obtainMessage(6, apfVar4), 15000L);
                }
                return true;
            default:
                Log.e("ConnectionManager", "Received unknown message: " + message.what);
                return false;
        }
    }
}
