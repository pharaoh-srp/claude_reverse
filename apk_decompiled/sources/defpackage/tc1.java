package defpackage;

import com.anthropic.claude.api.model.BadgeVariant;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class tc1 extends nq6 {
    public static final tc1 d;

    static {
        BadgeVariant.Companion.getClass();
        d = new tc1((KSerializer) BadgeVariant.$cachedKeepSerializer$delegate.getValue(), BadgeVariant.NEUTRAL);
    }
}
