package defpackage;

import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class clb {
    public final KSerializer serializer() {
        return (KSerializer) MobileAppFeedbackEvents$FeedbackType.$cachedSerializer$delegate.getValue();
    }
}
