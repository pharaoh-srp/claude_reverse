package defpackage;

import com.anthropic.claude.api.tasks.TaskStepStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class j9h extends nq6 {
    public static final j9h d;

    static {
        TaskStepStatus.Companion.getClass();
        d = new j9h((KSerializer) TaskStepStatus.$cachedKeepSerializer$delegate.getValue(), TaskStepStatus.NOT_STARTED);
    }
}
