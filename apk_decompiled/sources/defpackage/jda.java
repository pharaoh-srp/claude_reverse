package defpackage;

import kotlinx.datetime.LocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class jda extends f1 {
    public final z52 a;

    public jda(z52 z52Var) {
        this.a = z52Var;
    }

    @Override // defpackage.f1
    public final z52 a() {
        return this.a;
    }

    @Override // defpackage.f1
    public final l25 b() {
        return kda.b;
    }

    @Override // defpackage.f1
    public final Object d(l25 l25Var) {
        l09 l09Var = (l09) l25Var;
        l09Var.getClass();
        return new LocalDateTime(l09Var.a.b(), l09Var.b.f());
    }
}
