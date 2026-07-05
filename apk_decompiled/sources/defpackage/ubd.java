package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ubd {
    public final String a;
    public final bz7 b;
    public final l45 c;
    public final Object d = new Object();
    public volatile tbd e;

    public ubd(String str, bz7 bz7Var, l45 l45Var) {
        this.a = str;
        this.b = bz7Var;
        this.c = l45Var;
    }

    public final Object a(Object obj, wn9 wn9Var) {
        tbd tbdVar;
        Context context = (Context) obj;
        context.getClass();
        wn9Var.getClass();
        tbd tbdVar2 = this.e;
        if (tbdVar2 != null) {
            return tbdVar2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    Context applicationContext = context.getApplicationContext();
                    bz7 bz7Var = this.b;
                    applicationContext.getClass();
                    this.e = yb5.m((List) bz7Var.invoke(applicationContext), this.c, new aac(applicationContext, 3, this));
                }
                tbdVar = this.e;
                tbdVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return tbdVar;
    }
}
