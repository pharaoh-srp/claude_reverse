package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class mgb {
    public final KSerializer serializer() {
        return (KSerializer) MessageFileEvents$DownloadOutcome.$cachedSerializer$delegate.getValue();
    }
}
