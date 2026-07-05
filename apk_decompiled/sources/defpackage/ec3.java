package defpackage;

import com.anthropic.claude.api.share.ChatSnapshotReportCategory;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ec3 extends nq6 {
    public static final ec3 d;

    static {
        ChatSnapshotReportCategory.Companion.getClass();
        d = new ec3((KSerializer) ChatSnapshotReportCategory.$cachedKeepSerializer$delegate.getValue(), ChatSnapshotReportCategory.OTHER);
    }
}
