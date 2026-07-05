package defpackage;

import com.anthropic.claude.tool.model.MessageComposeV0InputKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class efb extends nq6 {
    public static final efb d;

    static {
        MessageComposeV0InputKind.Companion.getClass();
        d = new efb((KSerializer) MessageComposeV0InputKind.$cachedKeepSerializer$delegate.getValue(), MessageComposeV0InputKind.EMAIL);
    }
}
