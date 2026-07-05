package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class re7 extends k20 {
    public final ByteBuffer d;
    public final String e;
    public final float f;
    public final dv7 g;
    public final int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re7(ByteBuffer byteBuffer, String str, float f, dv7 dv7Var, int i) {
        super(0, ql8.H, new bv7(new yu7[0]));
        dv7Var.getClass();
        this.d = byteBuffer;
        this.e = str;
        this.f = f;
        this.g = dv7Var;
        this.h = i;
    }

    @Override // defpackage.k20
    public final int a() {
        return this.h;
    }

    @Override // defpackage.k20
    public final dv7 b() {
        return this.g;
    }
}
