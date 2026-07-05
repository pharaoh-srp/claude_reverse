package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class bdc extends UrlRequest.Callback {
    public final exf a = new exf();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ArrayBlockingQueue d = new ArrayBlockingQueue(2);
    public final exf e = new exf();
    public final long f;
    public final am4 g;
    public volatile UrlRequest h;

    public bdc(long j, am4 am4Var) {
        fd9.E(j >= 0);
        if (j == 0) {
            this.f = 2147483647L;
        } else {
            this.f = j;
        }
        this.g = am4Var;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.set(true);
        this.d.add(new zcc(4, null, null));
        IOException iOException = new IOException("The request was canceled!");
        this.e.m(iOException);
        this.a.m(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.e.m(cronetException) && this.a.m(cronetException)) {
            return;
        }
        this.d.add(new zcc(3, null, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.d.add(new zcc(1, byteBuffer, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        am4 am4Var = this.g;
        am4Var.getClass();
        int size = urlResponseInfo.getUrlChain().size();
        am4Var.getClass();
        if (size <= 16) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        StringBuilder sb = new StringBuilder("Too many follow-up requests: ");
        am4Var.getClass();
        sb.append(17);
        ProtocolException protocolException = new ProtocolException(sb.toString());
        this.e.m(protocolException);
        this.a.m(protocolException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.h = urlRequest;
        fd9.M(this.e.l(urlResponseInfo));
        fd9.M(this.a.l(new adc(this)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.d.add(new zcc(2, null, null));
    }
}
