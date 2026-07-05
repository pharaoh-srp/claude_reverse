package defpackage;

import io.sentry.i4;

/* JADX INFO: loaded from: classes.dex */
public class hvd {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;

    public hvd() {
        this.d = null;
        this.e = i4.AUTO;
        this.a = false;
        this.b = false;
        this.c = false;
        this.f = "manual";
    }

    public Object a() {
        if (this.a) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        pd4.b("Unexpected form of a provided value");
        sz6.r();
        return null;
    }

    public hvd(fvd fvdVar, Object obj, boolean z, fdg fdgVar, boolean z2) {
        this.d = fvdVar;
        this.a = z;
        this.e = fdgVar;
        this.b = z2;
        this.f = obj;
        this.c = true;
    }
}
