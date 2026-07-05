package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class kmk extends Thread {
    public final Object E;
    public final BlockingQueue F;
    public boolean G = false;
    public final /* synthetic */ wlk H;

    public kmk(wlk wlkVar, String str, BlockingQueue blockingQueue) {
        this.H = wlkVar;
        dgj.v(blockingQueue);
        this.E = new Object();
        this.F = blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        this.H.b0().M.c(getName() + " was interrupted", interruptedException);
    }

    public final void b() {
        synchronized (this.H.M) {
            try {
                if (!this.G) {
                    this.H.N.release();
                    this.H.M.notifyAll();
                    wlk wlkVar = this.H;
                    if (this == wlkVar.G) {
                        wlkVar.G = null;
                    } else if (this == wlkVar.H) {
                        wlkVar.H = null;
                    } else {
                        wlkVar.b0().J.b("Current scheduler thread is neither worker nor network");
                    }
                    this.G = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.H.N.acquire();
                z = true;
            } catch (InterruptedException e) {
                a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                nmk nmkVar = (nmk) this.F.poll();
                if (nmkVar != null) {
                    Process.setThreadPriority(nmkVar.F ? threadPriority : 10);
                    nmkVar.run();
                } else {
                    synchronized (this.E) {
                        if (this.F.peek() == null) {
                            try {
                                this.E.wait(30000L);
                            } catch (InterruptedException e2) {
                                a(e2);
                            }
                        }
                    }
                    synchronized (this.H.M) {
                        if (this.F.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
