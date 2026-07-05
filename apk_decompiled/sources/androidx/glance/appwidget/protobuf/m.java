package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends k {
    @Override // androidx.glance.appwidget.protobuf.k
    public final l a(Object obj) {
        f fVar = (f) obj;
        l lVar = fVar.unknownFields;
        if (lVar != l.f) {
            return lVar;
        }
        l lVar2 = new l(0, new int[8], new Object[8], true);
        fVar.unknownFields = lVar2;
        return lVar2;
    }
}
