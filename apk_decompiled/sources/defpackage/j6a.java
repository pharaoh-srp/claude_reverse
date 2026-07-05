package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j6a implements Iterator, mm9 {
    public final CharSequence E;
    public int F;
    public int G;
    public int H;
    public int I;

    public j6a(CharSequence charSequence) {
        charSequence.getClass();
        this.E = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.F;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.I < 0) {
            this.F = 2;
            return false;
        }
        CharSequence charSequence = this.E;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.G; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.F = 1;
                this.I = i;
                this.H = length;
                return true;
            }
        }
        i = -1;
        this.F = 1;
        this.I = i;
        this.H = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        this.F = 0;
        int i = this.H;
        int i2 = this.G;
        this.G = this.I + i;
        return this.E.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
