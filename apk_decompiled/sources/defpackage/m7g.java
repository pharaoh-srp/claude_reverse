package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m7g extends ex5 {
    public final r9i G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7g(j7g j7gVar, r9i r9iVar) {
        super(j7gVar);
        r9iVar.getClass();
        this.G = r9iVar;
    }

    @Override // defpackage.dx5, defpackage.yr9
    public final r9i K() {
        return this.G;
    }

    @Override // defpackage.dx5
    public final dx5 s0(j7g j7gVar) {
        return new m7g(j7gVar, this.G);
    }
}
