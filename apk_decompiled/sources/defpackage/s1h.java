package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class s1h {
    public final ComponentName a;
    public final a5 b;
    public final boolean c;

    static {
        nga.e("SystemJobInfoConverter");
    }

    public s1h(Context context, a5 a5Var, boolean z) {
        this.b = a5Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}
