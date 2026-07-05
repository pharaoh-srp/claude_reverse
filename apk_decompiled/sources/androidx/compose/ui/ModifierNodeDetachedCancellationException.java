package androidx.compose.ui;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/ModifierNodeDetachedCancellationException;", "Landroidx/compose/ui/internal/PlatformOptimizedCancellationException;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ModifierNodeDetachedCancellationException extends PlatformOptimizedCancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }
}
