package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class pyj {
    public final sqb a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public cy1 e;

    public pyj(Context context) {
        sqb sqbVar = new sqb("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new HashSet();
        this.e = null;
        this.a = sqbVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        cy1 cy1Var;
        HashSet hashSet = this.d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!zIsEmpty && this.e == null) {
            cy1 cy1Var2 = new cy1(4, this);
            this.e = cy1Var2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(cy1Var2, intentFilter, 2);
            } else {
                context.registerReceiver(cy1Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (cy1Var = this.e) == null) {
            return;
        }
        context.unregisterReceiver(cy1Var);
        this.e = null;
    }
}
