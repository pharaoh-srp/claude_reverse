package defpackage;

import android.content.ClipData;

/* JADX INFO: loaded from: classes3.dex */
public final class mp3 {
    public final ClipData a;

    public mp3(ClipData clipData) {
        this.a = clipData;
    }

    public final ClipData a() {
        return this.a;
    }

    public final np3 b() {
        return new np3(this.a.getDescription());
    }
}
