package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ox8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    public /* synthetic */ ox8(int i, int i2, int i3) {
        this.E = i3;
        this.F = i;
        this.G = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 0;
        int i3 = this.G;
        int i4 = this.F;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (i4 > i3) {
                    options.inDensity = i4;
                    options.inTargetDensity = i3;
                }
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                bitmapDecodeByteArray.getClass();
                return new bw8(new r20(bitmapDecodeByteArray));
            default:
                dfh dfhVar = (dfh) obj;
                if (i4 < 0 || i3 < 0) {
                    e39.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i4 + " and " + i3 + " respectively.");
                }
                int i5 = 0;
                int iG = 0;
                while (true) {
                    if (i5 < i4) {
                        int i6 = iG + 1;
                        long j = dfhVar.H;
                        euc eucVar = dfhVar.F;
                        int iG2 = kkh.g(j);
                        long j2 = dfhVar.H;
                        if (iG2 > i6) {
                            iG = (Character.isHighSurrogate(eucVar.charAt((kkh.g(j2) - i6) + (-1))) && Character.isLowSurrogate(eucVar.charAt(kkh.g(dfhVar.H) - i6))) ? iG + 2 : i6;
                            i5++;
                        } else {
                            iG = kkh.g(j2);
                        }
                    }
                }
                int length = 0;
                while (true) {
                    if (i2 < i3) {
                        int i7 = length + 1;
                        long j3 = dfhVar.H;
                        euc eucVar2 = dfhVar.F;
                        if (kkh.f(j3) + i7 < eucVar2.length()) {
                            length = (Character.isHighSurrogate(eucVar2.charAt((kkh.f(dfhVar.H) + i7) + (-1))) && Character.isLowSurrogate(eucVar2.charAt(kkh.f(dfhVar.H) + i7))) ? length + 2 : i7;
                            i2++;
                        } else {
                            length = eucVar2.length() - kkh.f(dfhVar.H);
                        }
                    }
                }
                vuk.j(dfhVar, kkh.f(dfhVar.H), kkh.f(dfhVar.H) + length);
                vuk.j(dfhVar, kkh.g(dfhVar.H) - iG, kkh.g(dfhVar.H));
                return iei.a;
        }
    }
}
