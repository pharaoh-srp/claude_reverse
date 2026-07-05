package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class xg0 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ xg0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a() {
        Log.isLoggable("FirebaseMessaging", 3);
        ((s0h) this.b).G.b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                ((k5) this.b).q();
                break;
            case 1:
                x31 x31Var = (x31) this.b;
                if (!isInitialStickyBroadcast()) {
                    x31Var.b(u31.b(context, intent, (p31) x31Var.O, (AudioDeviceInfo) x31Var.N, x31Var.a()));
                }
                break;
            case 2:
                context.getClass();
                intent.getClass();
                ((aid) this.b).r(Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)));
                break;
            case 3:
                ((Executor) ((w1c) this.b).c).execute(new yw5(this, 20, context));
                break;
            case 4:
                s0h s0hVar = (s0h) this.b;
                if (s0hVar != null && s0hVar.a()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    s0h s0hVar2 = (s0h) this.b;
                    s0hVar2.G.getClass();
                    FirebaseMessaging.b(s0hVar2, 0L);
                    ((s0h) this.b).G.b.unregisterReceiver(this);
                    this.b = null;
                }
                break;
            default:
                umk umkVar = (umk) this.b;
                if (intent == null) {
                    qgk qgkVar = umkVar.M;
                    umk.d(qgkVar);
                    qgkVar.M.b("App receiver called with null intent");
                    break;
                } else {
                    String action = intent.getAction();
                    if (action == null) {
                        qgk qgkVar2 = umkVar.M;
                        umk.d(qgkVar2);
                        qgkVar2.M.b("App receiver called with null action");
                        break;
                    } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                        qgk qgkVar3 = umkVar.M;
                        umk.d(qgkVar3);
                        qgkVar3.M.b("App receiver called with unknown action");
                        break;
                    } else {
                        b4l.a();
                        if (umkVar.K.X0(null, zvj.G0)) {
                            qgk qgkVar4 = umkVar.M;
                            umk.d(qgkVar4);
                            qgkVar4.R.b("App receiver notified triggers are available");
                            wlk wlkVar = umkVar.N;
                            umk.d(wlkVar);
                            k51 k51Var = new k51(24);
                            k51Var.F = umkVar;
                            wlkVar.T0(k51Var);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ xg0(Object obj, boolean z, int i) {
        this.a = i;
        this.b = obj;
    }
}
