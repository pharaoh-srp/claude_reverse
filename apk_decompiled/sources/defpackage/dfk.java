package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: loaded from: classes.dex */
public final class dfk {
    public final m3l a;
    public final pyj b;
    public final Context c;

    public dfk(m3l m3lVar, pyj pyjVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = m3lVar;
        this.b = pyjVar;
        this.c = context;
    }

    public static void b(lm0 lm0Var, zh4 zh4Var, t5l t5lVar) {
        if (zh4Var == null || !lm0Var.c(t5lVar) || lm0Var.g()) {
            return;
        }
        lm0Var.f();
        zh4Var.t(new ucc(lm0Var.e(t5lVar).getIntentSender()).o());
    }

    public final r5l a() {
        String packageName = this.c.getPackageName();
        m3l m3lVar = this.a;
        u5l u5lVar = m3lVar.a;
        if (u5lVar != null) {
            m3l.e.c("requestUpdateInfo(%s)", packageName);
            j5h j5hVar = new j5h();
            u5lVar.c(new vyk(m3lVar, j5hVar, packageName, j5hVar), j5hVar);
            return j5hVar.a;
        }
        sqb sqbVar = m3l.e;
        Object[] objArr = {-9};
        sqbVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", sqb.d(sqbVar.b, "onError(%d)", objArr));
        }
        return ez1.D(new InstallException(-9));
    }
}
