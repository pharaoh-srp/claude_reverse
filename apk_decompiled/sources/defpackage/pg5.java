package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class pg5 extends wd1 {
    public ug5 I;
    public byte[] J;
    public int K;
    public int L;

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) throws ParserException, DataSourceException {
        q();
        this.I = ug5Var;
        Uri uri = ug5Var.a;
        long j = ug5Var.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        fd9.F("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = tpi.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.J = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(ij0.i("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.J = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = ug5Var.e;
        byte[] bArr = this.J;
        if (j2 > bArr.length) {
            this.J = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.K = i;
        int length = bArr.length - i;
        this.L = length;
        if (j != -1) {
            this.L = (int) Math.min(length, j);
        }
        r(ug5Var);
        return j != -1 ? j : this.L;
    }

    @Override // defpackage.tg5
    public final void close() {
        if (this.J != null) {
            this.J = null;
            n();
        }
        this.I = null;
    }

    @Override // defpackage.tg5
    public final Uri m() {
        ug5 ug5Var = this.I;
        if (ug5Var != null) {
            return ug5Var.a;
        }
        return null;
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.L;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.J;
        String str = tpi.a;
        System.arraycopy(bArr2, this.K, bArr, i, iMin);
        this.K += iMin;
        this.L -= iMin;
        j(iMin);
        return iMin;
    }
}
