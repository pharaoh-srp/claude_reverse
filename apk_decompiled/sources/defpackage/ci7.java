package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class ci7 extends wd1 {
    public RandomAccessFile I;
    public Uri J;
    public long K;
    public boolean L;

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) throws FileDataSource$FileDataSourceException {
        Uri uri = ug5Var.a;
        long j = ug5Var.e;
        this.J = uri;
        q();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.I = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = ug5Var.f;
                if (length == -1) {
                    length = this.I.length() - j;
                }
                this.K = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.L = true;
                r(ug5Var);
                return this.K;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = kgh.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new FileDataSource$FileDataSourceException(sbR.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(2006, e3);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(2000, e4);
        }
    }

    @Override // defpackage.tg5
    public final void close() {
        this.J = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.I;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(2000, e);
            }
        } finally {
            this.I = null;
            if (this.L) {
                this.L = false;
                n();
            }
        }
    }

    @Override // defpackage.tg5
    public final Uri m() {
        return this.J;
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) throws FileDataSource$FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.K;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.I;
            String str = tpi.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.K -= (long) i3;
                j(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(2000, e);
        }
    }
}
