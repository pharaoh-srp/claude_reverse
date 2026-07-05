package androidx.compose.material3.internal;

import defpackage.mdj;
import defpackage.vq5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableUninitializedException;", "", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class AnchoredDraggableUninitializedException extends Throwable {
    public final String E;

    public AnchoredDraggableUninitializedException(boolean z, boolean z2, vq5 vq5Var, Object obj) {
        this.E = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + vq5Var + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.E;
    }
}
