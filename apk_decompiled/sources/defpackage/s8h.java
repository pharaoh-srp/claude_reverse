package defpackage;

import com.anthropic.claude.api.tasks.TaskStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class s8h extends nq6 {
    public static final s8h d;

    static {
        TaskStatus.Companion.getClass();
        d = new s8h((KSerializer) TaskStatus.$cachedKeepSerializer$delegate.getValue(), TaskStatus.NEEDS_ATTENTION);
    }
}
