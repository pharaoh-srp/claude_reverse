package androidx.compose.runtime;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ComposeRuntimeError extends IllegalStateException {
    public final String E;

    public ComposeRuntimeError(String str) {
        this.E = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.E;
    }
}
