package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class b1a {
    public final String a;
    public volatile Logger b;
    public final Object c;

    public b1a(int i, Class cls) {
        switch (i) {
            case 1:
                this.c = new swj();
                this.a = cls.getName();
                break;
            default:
                this.c = new Object();
                this.a = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger b() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (((swj) this.c)) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
