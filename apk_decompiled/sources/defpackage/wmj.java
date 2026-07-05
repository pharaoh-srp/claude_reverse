package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wmj implements Runnable {
    public static final /* synthetic */ wmj F = new wmj(0);
    public static final /* synthetic */ wmj G = new wmj(1);
    public final /* synthetic */ int E;

    public wmj(xzd xzdVar, int i) {
        this.E = 2;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                iqk.i.incrementAndGet();
                break;
        }
    }

    public /* synthetic */ wmj(int i) {
        this.E = i;
    }
}
