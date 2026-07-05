package coil.compose;

import defpackage.bpc;
import defpackage.ixg;
import defpackage.mdj;
import defpackage.u01;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil/compose/AsyncImagePainter$State$Success", "Lu01;", "Lbpc;", "painter", "Lbpc;", "a", "()Lbpc;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
public final /* data */ class AsyncImagePainter$State$Success extends u01 {
    public final ixg a;
    private final bpc painter;

    public AsyncImagePainter$State$Success(bpc bpcVar, ixg ixgVar) {
        this.painter = bpcVar;
        this.a = ixgVar;
    }

    @Override // defpackage.u01
    /* JADX INFO: renamed from: a, reason: from getter */
    public final bpc getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Success)) {
            return false;
        }
        AsyncImagePainter$State$Success asyncImagePainter$State$Success = (AsyncImagePainter$State$Success) obj;
        return x44.r(this.painter, asyncImagePainter$State$Success.painter) && this.a.equals(asyncImagePainter$State$Success.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.painter.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.painter + ", result=" + this.a + ')';
    }
}
