package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DataSourceException extends IOException {
    public final int E;

    public DataSourceException(int i) {
        this.E = i;
    }

    public DataSourceException(int i, Exception exc) {
        super(exc);
        this.E = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.E = i;
    }

    public DataSourceException(String str, Exception exc, int i) {
        super(str, exc);
        this.E = i;
    }
}
