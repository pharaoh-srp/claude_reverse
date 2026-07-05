package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xj6 extends ArrayList {
    public boolean E;

    public xj6(int i) {
        super(i);
        this.E = true;
    }

    public final void a() {
        ((ArrayList) this).modCount++;
    }

    public final int b() {
        return ((ArrayList) this).modCount;
    }
}
