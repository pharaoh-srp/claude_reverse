package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class xjb extends lz1 {
    @Override // defpackage.lz1
    public final HttpURLConnection H(String str) throws IOException {
        HttpURLConnection httpURLConnectionG = lz1.G("https://" + str + "/m");
        httpURLConnectionG.setRequestProperty("Content-Type", "text/plain");
        httpURLConnectionG.setDoOutput(true);
        httpURLConnectionG.setChunkedStreamingMode(0);
        return httpURLConnectionG;
    }
}
