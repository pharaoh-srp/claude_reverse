package defpackage;

import com.anthropic.claude.api.export.ExportStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ob7 extends nq6 {
    public static final ob7 d;

    static {
        ExportStatus.Companion.getClass();
        d = new ob7((KSerializer) ExportStatus.$cachedKeepSerializer$delegate.getValue(), ExportStatus.UNKNOWN);
    }
}
