package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class u34 {
    public int a;
    public int b;
    public d c;

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract i22 g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);

    public final void y() {
        int iU;
        do {
            iU = u();
            if (iU == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = i2 + 1;
            this.b--;
        } while (x(iU));
    }
}
