package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class u5b {
    public final t5b a;

    public u5b(t5b t5bVar) {
        this.a = t5bVar;
    }

    public static final u5b b(Context context) {
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        od odVar = od.a;
        if (i >= 30) {
            odVar.a();
        }
        t5b t5bVar = (i >= 30 ? odVar.a() : 0) >= 5 ? new t5b(context) : null;
        if (t5bVar != null) {
            return new u5b(t5bVar);
        }
        return null;
    }

    public saa a(vy5 vy5Var) {
        throw null;
    }

    public saa c() {
        return stk.f(gb9.k(fd9.c(g86.a), null, new al8(this, (tp4) null, 13), 3));
    }

    public saa d(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return stk.f(gb9.k(fd9.c(g86.a), null, new ba9(this, uri, inputEvent, null, 6), 3));
    }

    public saa e(Uri uri) {
        uri.getClass();
        return stk.f(gb9.k(fd9.c(g86.a), null, new kza(this, uri, null, 2), 3));
    }

    public saa f(f7j f7jVar) {
        throw null;
    }

    public saa g(g7j g7jVar) {
        throw null;
    }
}
