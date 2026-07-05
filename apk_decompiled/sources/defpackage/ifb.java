package defpackage;

import com.anthropic.claude.tool.model.MessageComposeV1InputKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class ifb extends nq6 {
    public static final ifb d;

    static {
        MessageComposeV1InputKind.Companion.getClass();
        d = new ifb((KSerializer) MessageComposeV1InputKind.$cachedKeepSerializer$delegate.getValue(), MessageComposeV1InputKind.EMAIL);
    }
}
