package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class b6d {
    public final Uri a;
    public final Bundle b;

    public b6d(Uri uri, Bundle bundle) {
        this.a = uri;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6d)) {
            return false;
        }
        b6d b6dVar = (b6d) obj;
        return x44.r(this.a, b6dVar.a) && x44.r(this.b, b6dVar.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri != null ? uri.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "PlatformTransferableContent(linkUri=" + this.a + ", extras=" + this.b + ')';
    }
}
