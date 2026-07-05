package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public final class rc5 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final i49 j;

    public rc5() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new i49(cryptoInfo);
    }
}
