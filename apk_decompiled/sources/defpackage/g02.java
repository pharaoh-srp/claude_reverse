package defpackage;

import com.anthropic.claude.api.experience.BulletsStyle;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class g02 extends nq6 {
    public static final g02 d;

    static {
        BulletsStyle.Companion.getClass();
        d = new g02((KSerializer) BulletsStyle.$cachedKeepSerializer$delegate.getValue(), BulletsStyle.PLAIN);
    }
}
