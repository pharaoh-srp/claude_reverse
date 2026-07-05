package defpackage;

import android.net.Uri;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ol {
    public final UUID a;
    public final Uri b;
    public final lsc c;
    public final lsc d;
    public final lsc e = mpk.P(ml.a);

    public ol(UUID uuid, Uri uri, String str, boolean z) {
        this.a = uuid;
        this.b = uri;
        this.c = mpk.P(str);
        this.d = mpk.P(Boolean.valueOf(z));
    }

    public final UUID a() {
        return this.a;
    }

    public final nl b() {
        return (nl) this.e.getValue();
    }
}
