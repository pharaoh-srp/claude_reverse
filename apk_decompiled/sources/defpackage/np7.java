package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes.dex */
public final class np7 extends n7f {
    @Override // defpackage.vf9
    public final boolean C(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return y(th);
    }
}
