package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vsc extends ArrayList {
    public final /* synthetic */ int E = 1;

    public /* synthetic */ vsc() {
    }

    public boolean a() {
        return size() < 0;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        switch (this.E) {
            case 1:
                super.removeRange(i, i2);
                break;
            default:
                super.removeRange(i, i2);
                break;
        }
    }

    public /* synthetic */ vsc(int i) {
        super(i);
    }
}
