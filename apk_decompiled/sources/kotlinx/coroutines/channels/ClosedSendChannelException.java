package kotlinx.coroutines.channels;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/ClosedSendChannelException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException(String str) {
        super(str);
    }
}
