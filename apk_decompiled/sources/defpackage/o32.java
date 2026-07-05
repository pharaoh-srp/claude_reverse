package defpackage;

import android.net.Uri;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class o32 {
    public final UUID a;
    public final Uri b;
    public final lsc c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final lsc g;

    public o32(UUID uuid, Uri uri, String str) {
        this.a = uuid;
        this.b = uri;
        this.c = mpk.P(str);
        Boolean bool = Boolean.FALSE;
        this.d = mpk.P(bool);
        this.e = mpk.P(bool);
        this.f = mpk.P(null);
        this.g = mpk.P(m32.a);
    }

    public final n32 a() {
        return (n32) this.g.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }
}
