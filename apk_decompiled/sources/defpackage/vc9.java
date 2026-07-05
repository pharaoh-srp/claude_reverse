package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vc9 {
    public int a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    public int j;
    public int k;

    public final synchronized void a(long j, long j2, long j3) {
        try {
            this.a++;
            this.b += j;
            if (j > this.c) {
                this.c = j;
            }
            if (j > od9.b) {
                this.d++;
            }
            if (j > od9.c) {
                this.e++;
            }
            if (j > od9.d) {
                this.f++;
            }
            if (j2 <= od9.e) {
                return;
            }
            this.g++;
            if (j3 > 0) {
                this.h += j2;
                if (j2 <= j3) {
                    this.i++;
                } else if (j2 <= j3 * 3) {
                    this.j++;
                } else {
                    this.k++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zc9 b() {
        return new zc9(this.a, this.b / 1000000, this.c / 1000000, this.d, this.e, this.f, this.g, this.h / 1000000, this.i, this.j, this.k);
    }
}
