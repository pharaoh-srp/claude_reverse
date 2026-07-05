package defpackage;

import com.anthropic.claude.api.common.WindowLimitStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class qdj extends nq6 {
    public static final qdj d;

    static {
        WindowLimitStatus.Companion.getClass();
        d = new qdj((KSerializer) WindowLimitStatus.$cachedKeepSerializer$delegate.getValue(), WindowLimitStatus.UNKNOWN);
    }
}
