package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class une implements m54 {
    public final int a;

    public une(int i) {
        this.a = i;
    }

    @Override // defpackage.m54
    public final long a(Context context) {
        return d4c.m(context.getColor(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof une) && this.a == ((une) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("ResourceColorProvider(resId="), this.a, ')');
    }
}
