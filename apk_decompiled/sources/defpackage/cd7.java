package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class cd7 extends ad7 {
    public final WindowLayoutComponent a;
    public final n78 b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public cd7(WindowLayoutComponent windowLayoutComponent, n78 n78Var) {
        this.a = windowLayoutComponent;
        this.b = n78Var;
    }

    @Override // defpackage.ad7, defpackage.gbj
    public void a(dx7 dx7Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(dx7Var);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.c(dx7Var);
            linkedHashMap2.remove(dx7Var);
            if (multicastConsumer.b()) {
                linkedHashMap.remove(context);
                jm4 jm4Var = (jm4) this.f.remove(multicastConsumer);
                if (jm4Var != null) {
                    jm4Var.a();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ad7, defpackage.gbj
    public void b(Context context, ao0 ao0Var, dx7 dx7Var) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(dx7Var);
                linkedHashMap2.put(dx7Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(dx7Var, context);
                multicastConsumer2.a(dx7Var);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(lm6.E));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(multicastConsumer2, this.b.D(this.a, jce.a.b(WindowLayoutInfo.class), (Activity) context, new bd7(multicastConsumer2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
