package androidx.health.platform.client.proto;

import defpackage.grc;

/* JADX INFO: loaded from: classes2.dex */
class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i, int i2) {
        super(grc.o(i, i2, "Unpaired surrogate at index ", " of "));
    }
}
