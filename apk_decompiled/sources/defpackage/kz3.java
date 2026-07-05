package defpackage;

import com.anthropic.claude.sessions.types.RepoWithStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class kz3 implements zy7 {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ RepoWithStatus G;
    public final /* synthetic */ bz7 H;

    public kz3(boolean z, bz7 bz7Var, RepoWithStatus repoWithStatus, bz7 bz7Var2) {
        this.E = z;
        this.F = bz7Var;
        this.G = repoWithStatus;
        this.H = bz7Var2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        boolean z = this.E;
        RepoWithStatus repoWithStatus = this.G;
        if (z) {
            this.F.invoke(repoWithStatus.getRepo());
        } else {
            this.H.invoke(repoWithStatus.getRepo());
        }
        return iei.a;
    }
}
