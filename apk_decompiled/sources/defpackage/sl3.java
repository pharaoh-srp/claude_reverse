package defpackage;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class sl3 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        tl3.F.getClass();
        if (i == 0) {
            return tl3.CLAUDE_MESSAGE_RENDERING_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return tl3.CLAUDE_MESSAGE_RENDERING_MODE_RAW;
        }
        if (i == 2) {
            return tl3.CLAUDE_MESSAGE_RENDERING_MODE_PLAIN_MARKDOWN;
        }
        if (i != 3) {
            return null;
        }
        return tl3.CLAUDE_MESSAGE_RENDERING_MODE_MESSAGES;
    }
}
