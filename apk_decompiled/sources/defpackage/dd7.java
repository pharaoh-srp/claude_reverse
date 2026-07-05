package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class dd7 extends cd7 {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public dd7(WindowLayoutComponent windowLayoutComponent, n78 n78Var) {
        super(windowLayoutComponent, n78Var);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // defpackage.cd7, defpackage.ad7, defpackage.gbj
    public final void a(dx7 dx7Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(dx7Var);
            if (context == null) {
                return;
            }
            bub bubVar = (bub) linkedHashMap.get(context);
            if (bubVar == null) {
                return;
            }
            ReentrantLock reentrantLock2 = bubVar.b;
            reentrantLock2.lock();
            try {
                bubVar.d.remove(dx7Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(dx7Var);
                if (bubVar.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(bubVar);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.cd7, defpackage.ad7, defpackage.gbj
    public final void b(Context context, ao0 ao0Var, dx7 dx7Var) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            bub bubVar = (bub) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (bubVar != null) {
                bubVar.a(dx7Var);
                linkedHashMap2.put(dx7Var, context);
            } else {
                bub bubVar2 = new bub(context);
                linkedHashMap.put(context, bubVar2);
                linkedHashMap2.put(dx7Var, context);
                bubVar2.a(dx7Var);
                this.a.addWindowLayoutInfoListener(context, bubVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
