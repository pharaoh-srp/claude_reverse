package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class ske extends ekb {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public ske(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // defpackage.ekb
    public final void a(oy7 oy7Var) {
        int i = this.c;
        Context context = this.d;
        oy7Var.getClass();
        switch (i) {
            case 0:
                if (this.b >= 10) {
                    oy7Var.j(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                oy7Var.i("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    oy7Var.c();
                    try {
                        oy7Var.j(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        oy7Var.j(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        oy7Var.n();
                    } finally {
                        oy7Var.f();
                    }
                }
                stk.h(context, oy7Var);
                return;
        }
    }

    public ske(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
