package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ngb {
    public final KSerializer serializer() {
        return (KSerializer) MessageFileEvents$DownloadSource.$cachedSerializer$delegate.getValue();
    }
}
