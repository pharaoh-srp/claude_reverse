package defpackage;

import com.anthropic.claude.sessions.types.GitHubRepo;

/* JADX INFO: loaded from: classes2.dex */
public final class lhf {
    public final GitHubRepo a;
    public final String b;

    public lhf(GitHubRepo gitHubRepo, String str) {
        gitHubRepo.getClass();
        this.a = gitHubRepo;
        this.b = str;
    }

    public static lhf a(lhf lhfVar, String str) {
        GitHubRepo gitHubRepo = lhfVar.a;
        lhfVar.getClass();
        gitHubRepo.getClass();
        return new lhf(gitHubRepo, str);
    }

    public final GitHubRepo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhf)) {
            return false;
        }
        lhf lhfVar = (lhf) obj;
        return x44.r(this.a, lhfVar.a) && x44.r(this.b, lhfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SelectedRepoEntry(repo=" + this.a + ", branch=" + this.b + ")";
    }
}
