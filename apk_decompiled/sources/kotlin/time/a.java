package kotlin.time;

import defpackage.c69;
import defpackage.csg;
import defpackage.f69;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f69 {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.f69
    public final c69 toInstant() {
        throw new InstantFormatException(this.a + " when parsing an Instant from \"" + csg.X(64, this.b) + '\"');
    }
}
