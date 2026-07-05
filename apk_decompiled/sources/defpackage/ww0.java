package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ww0 extends wd1 {
    public final AssetManager I;
    public Uri J;
    public InputStream K;
    public long L;
    public boolean M;

    public ww0(Context context) {
        super(false);
        this.I = context.getAssets();
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = ug5Var.a;
            long j = ug5Var.e;
            this.J = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            q();
            InputStream inputStreamOpen = this.I.open(path, 1);
            this.K = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(2008, null);
            }
            long j2 = ug5Var.f;
            if (j2 != -1) {
                this.L = j2;
            } else {
                long jAvailable = this.K.available();
                this.L = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.L = -1L;
                }
            }
            this.M = true;
            r(ug5Var);
            return this.L;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.tg5
    public final void close() {
        this.J = null;
        try {
            try {
                InputStream inputStream = this.K;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(2000, e);
            }
        } finally {
            this.K = null;
            if (this.M) {
                this.M = false;
                n();
            }
        }
    }

    @Override // defpackage.tg5
    public final Uri m() {
        return this.J;
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSource$AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.L;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSource$AssetDataSourceException(2000, e);
                }
            }
            InputStream inputStream = this.K;
            String str = tpi.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.L;
                if (j2 != -1) {
                    this.L = j2 - ((long) i3);
                }
                j(i3);
                return i3;
            }
        }
        return -1;
    }
}
