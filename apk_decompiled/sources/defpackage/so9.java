package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class so9 {
    public final KeyEvent a;

    public /* synthetic */ so9(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public static final /* synthetic */ so9 a(KeyEvent keyEvent) {
        return new so9(keyEvent);
    }

    public final /* synthetic */ KeyEvent b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof so9) {
            return x44.r(this.a, ((so9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
