package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class kba {
    public final Thread a;
    public final k1h b;
    public final iba c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public kba(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g1h g1hVar, iba ibaVar, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = ibaVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || g1hVar == null || ibaVar == null) {
            this.b = null;
        } else {
            this.b = g1hVar.a(looper, new gba(0, this));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new jba(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.i) {
            fd9.M(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            k1h k1hVar = this.b;
            k1hVar.getClass();
            Handler handler = k1hVar.a;
            if (!handler.hasMessages(1)) {
                j1h j1hVarA = k1hVar.a(1);
                Message message = j1hVarA.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                j1hVarA.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, hba hbaVar) {
        if (this.i) {
            fd9.M(Thread.currentThread() == this.a);
        }
        this.f.add(new y94(new CopyOnWriteArraySet(this.d), i, hbaVar, 4));
    }

    public final void d() {
        if (this.i) {
            fd9.M(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        for (jba jbaVar : this.d) {
            iba ibaVar = this.c;
            jbaVar.d = true;
            if (ibaVar != null && jbaVar.c) {
                jbaVar.c = false;
                ibaVar.f(jbaVar.a, jbaVar.b.b());
            }
        }
        this.d.clear();
    }

    public final void e(int i, hba hbaVar) {
        c(i, hbaVar);
        b();
    }

    public kba(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
