package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class pn4 extends wd1 {
    public final ContentResolver I;
    public Uri J;
    public AssetFileDescriptor K;
    public FileInputStream L;
    public long M;
    public boolean N;

    public pn4(Context context) {
        super(false);
        this.I = context.getContentResolver();
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) throws ContentDataSource$ContentDataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = ug5Var.a;
                long j = ug5Var.f;
                long j2 = ug5Var.e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.J = uriNormalizeScheme;
                q();
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.I;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.K = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        throw new ContentDataSource$ContentDataSourceException(e instanceof FileNotFoundException ? 2005 : i, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.L = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.M = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.M = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSource$ContentDataSourceException(2008, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.M = j3;
                    if (j3 < 0) {
                        throw new ContentDataSource$ContentDataSourceException(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.M;
                    this.M = j4 == -1 ? j : Math.min(j4, j);
                }
                this.N = true;
                r(ug5Var);
                return j != -1 ? j : this.M;
            } catch (ContentDataSource$ContentDataSourceException e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // defpackage.tg5
    public final void close() {
        this.J = null;
        try {
            try {
                FileInputStream fileInputStream = this.L;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.L = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.K;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSource$ContentDataSourceException(2000, e);
                    }
                } finally {
                    this.K = null;
                    if (this.N) {
                        this.N = false;
                        n();
                    }
                }
            } catch (IOException e2) {
                throw new ContentDataSource$ContentDataSourceException(2000, e2);
            }
        } catch (Throwable th) {
            this.L = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.K;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.K = null;
                    if (this.N) {
                        this.N = false;
                        n();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSource$ContentDataSourceException(2000, e3);
                }
            } finally {
                this.K = null;
                if (this.N) {
                    this.N = false;
                    n();
                }
            }
        }
    }

    @Override // defpackage.tg5
    public final Uri m() {
        return this.J;
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSource$ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.M;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(2000, e);
                }
            }
            FileInputStream fileInputStream = this.L;
            String str = tpi.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.M;
                if (j2 != -1) {
                    this.M = j2 - ((long) i3);
                }
                j(i3);
                return i3;
            }
        }
        return -1;
    }
}
