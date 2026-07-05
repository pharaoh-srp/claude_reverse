package defpackage;

import okio.Base64;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class iq0 extends ctk {
    public final ByteString b;

    public iq0(ByteString byteString) {
        this.b = byteString;
    }

    @Override // defpackage.ctk
    public final String g() {
        return Base64.b(this.b.E);
    }
}
