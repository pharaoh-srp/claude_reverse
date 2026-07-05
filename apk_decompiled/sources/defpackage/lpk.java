package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class lpk extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        iqk.i.incrementAndGet();
    }
}
