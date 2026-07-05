package retrofit2;

import defpackage.oqe;
import defpackage.pqe;

/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends RuntimeException {
    public HttpException(oqe oqeVar) {
        StringBuilder sb = new StringBuilder("HTTP ");
        pqe pqeVar = oqeVar.a;
        sb.append(pqeVar.H);
        sb.append(" ");
        sb.append(pqeVar.G);
        super(sb.toString());
    }
}
