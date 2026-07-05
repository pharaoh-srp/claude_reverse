package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oyi {
    public final WeakReference a;

    public oyi(WeakReference weakReference) {
        this.a = weakReference;
    }

    public final WeakReference a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyi) && x44.r(this.a.get(), ((oyi) obj).a.get());
    }

    public final int hashCode() {
        Object obj = this.a.get();
        return (obj != null ? obj.hashCode() : 0) * 31;
    }
}
