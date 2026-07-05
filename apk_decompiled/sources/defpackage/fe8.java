package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fe8 {
    public static final byte[] f = {0, 0, 1};
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public Object e;

    public fe8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new char[25];
                this.b = 0;
                this.d = false;
                break;
        }
    }

    public static fe8 g(f0... f0VarArr) {
        return new fe8(f0VarArr);
    }

    public void a(int i) {
        this.c = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public f0[] c() {
        return (f0[]) this.e;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public boolean f() {
        return this.d;
    }

    public void h(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.b + i3;
            if (length < i4) {
                this.e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.e, this.b, i3);
            this.b += i3;
        }
    }

    public void i() {
        this.d = true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[chars:");
                sb.append(new String((char[]) this.e, 0, this.b));
                sb.append(", point:");
                return vb7.l(this.c, "]", sb);
            default:
                return super.toString();
        }
    }

    public fe8(f0[] f0VarArr) {
        this.a = 2;
        this.b = -1;
        this.c = -1;
        this.d = false;
        this.e = f0VarArr;
    }
}
