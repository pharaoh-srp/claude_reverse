package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bgj;
import defpackage.c4a;
import defpackage.i1h;
import defpackage.ik1;
import defpackage.knf;
import defpackage.lrb;
import defpackage.m4a;
import defpackage.nai;
import defpackage.nga;
import defpackage.p4a;
import defpackage.s2k;
import defpackage.y3a;
import defpackage.zp3;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class SystemForegroundService extends Service implements m4a {
    public static final String I = nga.e("SystemFgService");
    public final lrb E = new lrb(this);
    public boolean F;
    public i1h G;
    public NotificationManager H;

    @Override // defpackage.m4a
    public final c4a a() {
        return (p4a) this.E.F;
    }

    public final void b() {
        this.H = (NotificationManager) getApplicationContext().getSystemService("notification");
        i1h i1hVar = new i1h(getApplicationContext());
        this.G = i1hVar;
        if (i1hVar.M != null) {
            nga.c().a(i1h.N, "A callback already exists.");
        } else {
            i1hVar.M = this;
        }
    }

    public final void d() {
        lrb lrbVar = this.E;
        lrbVar.getClass();
        lrbVar.R(y3a.ON_CREATE);
        super.onCreate();
    }

    public final void e() {
        lrb lrbVar = this.E;
        lrbVar.getClass();
        lrbVar.R(y3a.ON_STOP);
        lrbVar.R(y3a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        lrb lrbVar = this.E;
        lrbVar.getClass();
        lrbVar.R(y3a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        d();
        b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        e();
        this.G.f();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        lrb lrbVar = this.E;
        lrbVar.getClass();
        lrbVar.R(y3a.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = false;
        if (this.F) {
            nga.c().d(I, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.G.f();
            b();
            this.F = false;
        }
        if (intent == null) {
            return 3;
        }
        i1h i1hVar = this.G;
        i1hVar.getClass();
        String str = i1h.N;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            nga.c().d(str, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            i1hVar.F.a.execute(new s2k(i1hVar, stringExtra, z, 6));
            i1hVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            i1hVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            nga.c().d(str, "Stopping foreground service");
            SystemForegroundService systemForegroundService = i1hVar.M;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.F = true;
            nga.c().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        nga.c().d(str, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        bgj bgjVar = i1hVar.E;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        bgjVar.getClass();
        uuidFromString.getClass();
        zp3 zp3Var = bgjVar.b.m;
        knf knfVar = bgjVar.d.a;
        knfVar.getClass();
        nai.R(zp3Var, "CancelWorkById", knfVar, new ik1(bgjVar, 9, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.G.g(i, FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM);
    }

    public final void onTimeout(int i, int i2) {
        this.G.g(i, i2);
    }
}
