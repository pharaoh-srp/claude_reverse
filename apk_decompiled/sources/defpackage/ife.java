package defpackage;

import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes2.dex */
public final class ife {
    public final RemoteViews a;
    public final c59 b;

    public ife(RemoteViews remoteViews, c59 c59Var) {
        this.a = remoteViews;
        this.b = c59Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ife)) {
            return false;
        }
        ife ifeVar = (ife) obj;
        return this.a.equals(ifeVar.a) && this.b.equals(ifeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}
