package androidx.compose.foundation.lazy.layout;

import defpackage.mdj;
import defpackage.nb0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class ItemFoundInScroll extends CancellationException {
    public final int E;
    public final nb0 F;

    public ItemFoundInScroll(int i, nb0 nb0Var) {
        this.E = i;
        this.F = nb0Var;
    }
}
