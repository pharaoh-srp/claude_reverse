package androidx.media3.datasource;

import defpackage.grc;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int G;

    public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
        super(grc.p(i, "Response code: "), dataSourceException, 2004);
        this.G = i;
    }
}
