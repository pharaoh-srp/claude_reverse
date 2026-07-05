package coil3.compose.internal;

import defpackage.bpc;
import defpackage.c1;
import defpackage.jo4;
import defpackage.mdj;
import defpackage.tt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterNode;", "Lc1;", "Lbpc;", "painter", "Lbpc;", "q1", "()Lbpc;", "s1", "(Lbpc;)V", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class SubcomposeContentPainterNode extends c1 {
    private bpc painter;

    public SubcomposeContentPainterNode(bpc bpcVar, tt ttVar, jo4 jo4Var, float f, boolean z, String str) {
        super(ttVar, jo4Var, f, null, z, str, null);
        this.painter = bpcVar;
    }

    @Override // defpackage.c1
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final bpc getPainter() {
        return this.painter;
    }

    public final void s1(bpc bpcVar) {
        this.painter = bpcVar;
    }
}
