package defpackage;

import com.anthropic.claude.tool.model.TaskProposeOutputStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class d7h extends nq6 {
    public static final d7h d;

    static {
        TaskProposeOutputStatus.Companion.getClass();
        d = new d7h((KSerializer) TaskProposeOutputStatus.$cachedKeepSerializer$delegate.getValue(), TaskProposeOutputStatus.PROPOSED);
    }
}
