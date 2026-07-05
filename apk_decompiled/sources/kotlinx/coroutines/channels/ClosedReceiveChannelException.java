package kotlinx.coroutines.channels;

import defpackage.mdj;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/ClosedReceiveChannelException;", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class ClosedReceiveChannelException extends NoSuchElementException {
    public ClosedReceiveChannelException() {
        super("Channel was closed");
    }
}
