package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ml4 {
    public final ggj a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public ml4(Context context, ggj ggjVar) {
        this.a = ggjVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.d.execute(new fd(w44.p1(this.d), 11, this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
