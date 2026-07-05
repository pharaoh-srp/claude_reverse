package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class xv7 implements Runnable {
    public static final String I = nga.e("ForceStopRunnable");
    public static final long J = 315360000000L;
    public final Context E;
    public final bgj F;
    public final tk5 G;
    public int H = 0;

    public xv7(Context context, bgj bgjVar) {
        this.E = context.getApplicationContext();
        this.F = bgjVar;
        this.G = bgjVar.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + J;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv7.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        String str = I;
        bgj bgjVar = this.F;
        try {
            fg4 fg4Var = bgjVar.b;
            fg4Var.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.E;
            if (zIsEmpty) {
                nga.c().getClass();
                zA = true;
            } else {
                zA = shd.a(context, fg4Var);
                nga.c().getClass();
            }
            if (!zA) {
                return;
            }
            while (true) {
                try {
                    qfj.b(context);
                    nga.c().getClass();
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.H + 1;
                        this.H = i;
                        if (i >= 3) {
                            String str2 = eve.G(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            nga.c().b(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            bgjVar.b.getClass();
                            throw illegalStateException;
                        }
                        nga.c().getClass();
                        try {
                            Thread.sleep(((long) this.H) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    nga.c().a(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    bgjVar.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            bgjVar.f();
        }
    }
}
