package coil3.compose;

import defpackage.bpc;
import defpackage.mdj;
import defpackage.t01;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil3/compose/AsyncImagePainter$State$Loading", "Lt01;", "Lbpc;", "painter", "Lbpc;", "a", "()Lbpc;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class AsyncImagePainter$State$Loading implements t01 {
    private final bpc painter;

    public AsyncImagePainter$State$Loading(bpc bpcVar) {
        this.painter = bpcVar;
    }

    @Override // defpackage.t01
    /* JADX INFO: renamed from: a, reason: from getter */
    public final bpc getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AsyncImagePainter$State$Loading) && x44.r(this.painter, ((AsyncImagePainter$State$Loading) obj).painter);
    }

    public final int hashCode() {
        bpc bpcVar = this.painter;
        if (bpcVar == null) {
            return 0;
        }
        return bpcVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.painter + ")";
    }
}
