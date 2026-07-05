package androidx.media3.datasource;

import defpackage.auk;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final int F;

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(i, iOException);
        this.F = i2;
    }

    public static HttpDataSource$HttpDataSourceException a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !auk.m(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new HttpDataSource$HttpDataSourceException(iOException, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.F = 1;
    }

    public HttpDataSource$HttpDataSourceException(int i) {
        super(i == 2000 ? 2001 : i);
        this.F = 1;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.F = 1;
    }
}
