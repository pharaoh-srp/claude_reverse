package defpackage;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bd7 extends m08 implements bz7 {
    public bd7(MulticastConsumer multicastConsumer) {
        super(1, 0, MulticastConsumer.class, multicastConsumer, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V");
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
        return iei.a;
    }
}
