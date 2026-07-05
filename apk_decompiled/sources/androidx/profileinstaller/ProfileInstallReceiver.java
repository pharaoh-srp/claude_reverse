package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import defpackage.ao0;
import defpackage.efe;
import defpackage.pid;
import defpackage.qwk;
import defpackage.y94;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            pid.b(context, new ao0(1), new efe(23, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        efe efeVar = new efe(23, this);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new y94(efeVar, 11, null, 5).run();
                        return;
                    }
                    return;
                }
                efe efeVar2 = new efe(23, this);
                try {
                    pid.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new y94(efeVar2, 10, null, 5).run();
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    new y94(efeVar2, 7, e, 5).run();
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            setResultCode(12);
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        efe efeVar3 = new efe(23, this);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            qwk.k(context, efeVar3);
        } else if (!"SAVE_PROFILE".equals(string2)) {
            efeVar3.n(16, null);
        } else {
            Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
            efeVar3.n(12, null);
        }
    }
}
