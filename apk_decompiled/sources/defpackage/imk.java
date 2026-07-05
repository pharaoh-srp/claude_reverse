package defpackage;

import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class imk extends ContentObserver {
    public final /* synthetic */ l51 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imk(l51 l51Var) {
        super(null);
        this.a = l51Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ((AtomicBoolean) this.a.b).set(true);
    }
}
