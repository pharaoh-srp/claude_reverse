package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends k {
    @Override // com.google.crypto.tink.shaded.protobuf.k
    public final l a(Object obj) {
        f fVar = (f) obj;
        l lVar = fVar.unknownFields;
        if (lVar != l.f) {
            return lVar;
        }
        l lVarC = l.c();
        fVar.unknownFields = lVarC;
        return lVarC;
    }
}
