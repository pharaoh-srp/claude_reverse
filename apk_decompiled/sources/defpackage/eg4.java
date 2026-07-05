package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eg4 {
    public final String a;
    public final Context b;
    public final zp3 c;
    public final List d;
    public final String e;
    public final String f;
    public final lz1 g;

    public eg4(Context context, String str) {
        zp3 zp3Var = zp3.F;
        lz1 lz1Var = new lz1(27);
        this.a = str;
        this.b = context;
        this.c = zp3Var;
        this.d = lm6.E;
        this.e = "a-api.anthropic.com/v1";
        this.f = "a-cdn.anthropic.com/v1";
        this.g = lz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg4)) {
            return false;
        }
        eg4 eg4Var = (eg4) obj;
        return this.a.equals(eg4Var.a) && this.b.equals(eg4Var.b) && this.c.equals(eg4Var.c) && this.d.equals(eg4Var.d) && this.e.equals(eg4Var.e) && this.f.equals(eg4Var.f) && this.g.equals(eg4Var.g);
    }

    public final int hashCode() {
        return (this.g.hashCode() + kgh.l(kgh.l((((this.d.hashCode() + vb7.c(10, vb7.c(3, (((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961) + 1) * 31) + 1) * 961, 31), 31)) * 961) + 1) * 31, 31, this.e), 31, this.f)) * 31;
    }

    public final String toString() {
        return "Configuration(writeKey=" + this.a + ", application=" + this.b + ", storageProvider=" + this.c + ", collectDeviceId=false, trackApplicationLifecycleEvents=true, useLifecycleObserver=true, trackDeepLinks=false, flushAt=3, flushInterval=10, flushPolicies=" + this.d + ", defaultSettings=null, autoAddSegmentDestination=true, apiHost=" + this.e + ", cdnHost=" + this.f + ", requestFactory=" + this.g + ", errorHandler=null)";
    }
}
