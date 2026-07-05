package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class twh implements vwh {
    public final boolean a;

    public twh(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twh) && this.a == ((twh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("AsInputWidget(showAsNotice=", ")", this.a);
    }
}
