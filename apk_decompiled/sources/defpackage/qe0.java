package defpackage;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qe0 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ IntConsumer F;
    public final /* synthetic */ int G;

    public /* synthetic */ qe0(IntConsumer intConsumer, int i, int i2) {
        this.E = i2;
        this.F = intConsumer;
        this.G = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        int i2 = this.G;
        IntConsumer intConsumer = this.F;
        switch (i) {
            case 0:
                intConsumer.accept(i2);
                break;
            default:
                intConsumer.accept(i2);
                break;
        }
    }
}
