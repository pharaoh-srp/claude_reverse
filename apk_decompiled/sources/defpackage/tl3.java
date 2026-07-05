package defpackage;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;

/* JADX INFO: loaded from: classes3.dex */
public enum tl3 implements WireEnum {
    CLAUDE_MESSAGE_RENDERING_MODE_UNSPECIFIED(0),
    CLAUDE_MESSAGE_RENDERING_MODE_RAW(1),
    CLAUDE_MESSAGE_RENDERING_MODE_PLAIN_MARKDOWN(2),
    CLAUDE_MESSAGE_RENDERING_MODE_MESSAGES(3);

    public static final c0l F;
    public static final sl3 G;
    public final int E;

    static {
        tl3 tl3Var = CLAUDE_MESSAGE_RENDERING_MODE_UNSPECIFIED;
        F = new c0l(28);
        G = new sl3(jce.a.b(tl3.class), Syntax.PROTO_3, tl3Var);
    }

    tl3(int i) {
        this.E = i;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.E;
    }
}
