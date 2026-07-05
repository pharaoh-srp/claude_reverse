package defpackage;

import com.anthropic.claude.api.account.RavenType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class w1e extends nq6 {
    public static final w1e d;

    static {
        RavenType.Companion.getClass();
        d = new w1e((KSerializer) RavenType.$cachedKeepSerializer$delegate.getValue(), RavenType.TEAM);
    }
}
