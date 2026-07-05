package defpackage;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zs5 implements nyg {
    public final /* synthetic */ int E;

    public /* synthetic */ zs5(int i) {
        this.E = i;
    }

    @Override // defpackage.nyg
    public final Object get() {
        switch (this.E) {
            case 0:
                byte[] bArr = new byte[12];
                bt5.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new es5();
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    pmf.m(e);
                    return null;
                }
        }
    }
}
