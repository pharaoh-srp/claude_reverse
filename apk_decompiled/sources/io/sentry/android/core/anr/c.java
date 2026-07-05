package io.sentry.android.core.anr;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final StackTraceElement[] a;
    public final int b;
    public final int c;
    public final int d;

    public c(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        this.a = stackTraceElementArr;
        this.b = i;
        this.c = i2;
        int iHashCode = 1;
        while (i <= this.c) {
            iHashCode = (iHashCode * 31) + this.a[i].hashCode();
            i++;
        }
        this.d = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i = cVar.b;
        if (this.d != cVar.d) {
            return false;
        }
        int i2 = this.c;
        int i3 = this.b;
        int i4 = (i2 - i3) + 1;
        if (i4 != (cVar.c - i) + 1) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!this.a[i3 + i5].equals(cVar.a[i + i5])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.d;
    }
}
