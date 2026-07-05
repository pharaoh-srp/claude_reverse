package defpackage;

import com.anthropic.claude.api.project.ProjectPermission;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class nnd extends nq6 {
    public static final nnd d;

    static {
        ProjectPermission.Companion.getClass();
        d = new nnd((KSerializer) ProjectPermission.$cachedKeepSerializer$delegate.getValue(), ProjectPermission.UNKNOWN);
    }
}
