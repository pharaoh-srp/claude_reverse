package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class cfk {
    public static final bnh c = new bnh("AgeSignalsService");
    public final Context a;
    public final y0l b;

    public cfk(Context context) {
        this.a = context;
        bnh bnhVar = s3l.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (s3l.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.b = new y0l(context, c, zoj.a);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    bnhVar.j("Play Store package is not found.", new Object[0]);
                }
            } else {
                bnhVar.j("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            bnhVar.j("Play Store package is not found.", new Object[0]);
        }
        this.b = null;
    }
}
