package defpackage;

import com.anthropic.claude.tool.model.TaskStatusOutputStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class n8h extends nq6 {
    public static final n8h d;

    static {
        TaskStatusOutputStatus.Companion.getClass();
        d = new n8h((KSerializer) TaskStatusOutputStatus.$cachedKeepSerializer$delegate.getValue(), TaskStatusOutputStatus.PROPOSED);
    }
}
