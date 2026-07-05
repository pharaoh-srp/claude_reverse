package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class bub implements hm4, Consumer2 {
    public final Context a;
    public odj c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public bub(Context context) {
        this.a = context;
    }

    public final void a(dx7 dx7Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            odj odjVar = this.c;
            if (odjVar != null) {
                dx7Var.accept(odjVar);
            }
            this.d.add(dx7Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.hm4
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            odj odjVarC = id7.c(this.a, windowLayoutInfo);
            this.c = odjVarC;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((hm4) it.next()).accept(odjVarC);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
