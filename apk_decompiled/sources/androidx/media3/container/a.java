package androidx.media3.container;

import defpackage.dg2;
import defpackage.fd9;
import defpackage.pbc;
import defpackage.qbc;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public final boolean a;

    public a(qbc qbcVar, pbc pbcVar) throws ObuParser$NotYetImplementedException {
        int i = pbcVar.a;
        ByteBuffer byteBuffer = pbcVar.b;
        fd9.E(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        dg2 dg2Var = new dg2(bArr, iMin);
        if (qbcVar.a) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (dg2Var.f()) {
            this.a = false;
            return;
        }
        int iG = dg2Var.g(2);
        boolean zF = dg2Var.f();
        if (qbcVar.b) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (!zF) {
            this.a = true;
            return;
        }
        boolean zF2 = (iG == 3 || iG == 0) ? true : dg2Var.f();
        dg2Var.n();
        if (!qbcVar.d) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (dg2Var.f()) {
            if (!qbcVar.e) {
                throw new ObuParser$NotYetImplementedException();
            }
            dg2Var.n();
        }
        if (qbcVar.c) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (iG != 3) {
            dg2Var.n();
        }
        dg2Var.o(qbcVar.f);
        if (iG != 2 && iG != 0 && !zF2) {
            dg2Var.o(3);
        }
        this.a = ((iG == 3 || iG == 0) ? 255 : dg2Var.g(8)) != 0;
    }
}
