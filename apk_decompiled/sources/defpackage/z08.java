package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z08 {
    public final /* synthetic */ int a;
    public int b;
    public char[] c;
    public int d;
    public int e;

    public z08(char[] cArr, int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = cArr.length;
                this.c = cArr;
                this.d = i;
                this.e = i2;
                break;
            default:
                this.b = cArr.length;
                this.c = cArr;
                this.d = i;
                this.e = i2;
                break;
        }
    }

    public final void a(StringBuilder sb) {
        switch (this.a) {
            case 0:
                sb.append(this.c, 0, this.d);
                char[] cArr = this.c;
                int i = this.e;
                sb.append(cArr, i, this.b - i);
                break;
            default:
                sb.append(this.c, 0, this.d);
                char[] cArr2 = this.c;
                int i2 = this.e;
                sb.append(cArr2, i2, this.b - i2);
                break;
        }
    }

    public final int b() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                i = this.e;
                i2 = this.d;
                break;
            default:
                i = this.e;
                i2 = this.d;
                break;
        }
        return i - i2;
    }

    public final char c(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.d;
                char[] cArr = this.c;
                return i < i2 ? cArr[i] : cArr[(i - i2) + this.e];
            default:
                int i3 = this.d;
                char[] cArr2 = this.c;
                return i < i3 ? cArr2[i] : cArr2[(i - i3) + this.e];
        }
    }

    public final int d() {
        int i;
        int iB;
        switch (this.a) {
            case 0:
                i = this.b;
                iB = b();
                break;
            default:
                i = this.b;
                iB = b();
                break;
        }
        return i - iB;
    }

    public void e(int i, int i2, CharSequence charSequence, int i3, int i4) {
        int i5 = i4 - i3;
        int i6 = i5 - (i2 - i);
        if (i6 > b()) {
            int iB = i6 - b();
            int i7 = this.b;
            do {
                i7 *= 2;
            } while (i7 - this.b < iB);
            char[] cArr = new char[i7];
            System.arraycopy(this.c, 0, cArr, 0, this.d);
            int i8 = this.b;
            int i9 = this.e;
            int i10 = i8 - i9;
            int i11 = i7 - i10;
            System.arraycopy(this.c, i9, cArr, i11, (i10 + i9) - i9);
            this.c = cArr;
            this.b = i7;
            this.e = i11;
        }
        int i12 = this.d;
        if (i < i12 && i2 <= i12) {
            int i13 = i12 - i2;
            char[] cArr2 = this.c;
            System.arraycopy(cArr2, i2, cArr2, this.e - i13, i13);
            this.d = i;
            this.e -= i13;
        } else if (i >= i12 || i2 < i12) {
            int iB2 = b() + i;
            int iB3 = b() + i2;
            int i14 = this.e;
            int i15 = iB2 - i14;
            char[] cArr3 = this.c;
            System.arraycopy(cArr3, i14, cArr3, this.d, i15);
            this.d += i15;
            this.e = iB3;
        } else {
            this.e = b() + i2;
            this.d = i;
        }
        vsk.g(charSequence, this.c, this.d, i3, i4);
        this.d += i5;
    }

    public void f(int i, int i2, String str) {
        int length = str.length() - (i2 - i);
        if (length > b()) {
            int iB = length - b();
            int i3 = this.b;
            do {
                i3 *= 2;
            } while (i3 - this.b < iB);
            char[] cArr = new char[i3];
            System.arraycopy(this.c, 0, cArr, 0, this.d);
            int i4 = this.b;
            int i5 = this.e;
            int i6 = i4 - i5;
            int i7 = i3 - i6;
            System.arraycopy(this.c, i5, cArr, i7, (i6 + i5) - i5);
            this.c = cArr;
            this.b = i3;
            this.e = i7;
        }
        int i8 = this.d;
        if (i < i8 && i2 <= i8) {
            int i9 = i8 - i2;
            char[] cArr2 = this.c;
            System.arraycopy(cArr2, i2, cArr2, this.e - i9, i9);
            this.d = i;
            this.e -= i9;
        } else if (i >= i8 || i2 < i8) {
            int iB2 = b() + i;
            int iB3 = b() + i2;
            int i10 = this.e;
            int i11 = iB2 - i10;
            char[] cArr3 = this.c;
            System.arraycopy(cArr3, i10, cArr3, this.d, i11);
            this.d += i11;
            this.e = iB3;
        } else {
            this.e = b() + i2;
            this.d = i;
        }
        str.getChars(0, str.length(), this.c, this.d);
        this.d = str.length() + this.d;
    }

    public final String toString() {
        switch (this.a) {
        }
        return "";
    }
}
