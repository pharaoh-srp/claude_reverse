package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h8f implements Consumer {
    public final /* synthetic */ i8f a;

    public h8f(i8f i8fVar) {
        this.a = i8fVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.onPixelCopyFinished(tqe.u(obj).getStatus());
    }
}
