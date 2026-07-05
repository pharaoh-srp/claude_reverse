package defpackage;

import com.anthropic.claude.api.chat.tool.ResearchStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class bme extends nq6 {
    public static final bme d;

    static {
        ResearchStatus.Companion.getClass();
        d = new bme((KSerializer) ResearchStatus.$cachedKeepSerializer$delegate.getValue(), ResearchStatus.UNKNOWN);
    }
}
