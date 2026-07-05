package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.fnf;
import defpackage.mji;
import defpackage.oji;
import defpackage.xzd;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new mji(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new oji(new fnf(8, parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new mji(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new mji(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(File file) {
        return new oji(new xzd(16, file));
    }
}
