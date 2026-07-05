package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iqg {
    public y3i b;
    public yd7 c;
    public xcc d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final vcc a = new vcc();
    public mvd j = new mvd(6);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(ssc sscVar);

    public abstract boolean c(ssc sscVar, long j, mvd mvdVar);

    public void d(boolean z) {
        if (z) {
            this.j = new mvd(6);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
