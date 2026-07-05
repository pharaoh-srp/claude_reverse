package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nm0 {
    public final int a;

    public nm0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm0) && this.a == ((nm0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("AppWidgetId(appWidgetId="), this.a, ')');
    }
}
