package defpackage;

import com.anthropic.claude.api.experience.BannerContent;

/* JADX INFO: loaded from: classes2.dex */
public final class vsf {
    public final String a;
    public final BannerContent b;

    public vsf(String str, BannerContent bannerContent) {
        str.getClass();
        this.a = str;
        this.b = bannerContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsf)) {
            return false;
        }
        vsf vsfVar = (vsf) obj;
        return x44.r(this.a, vsfVar.a) && this.b.equals(vsfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionListBanner(id=" + this.a + ", content=" + this.b + ")";
    }
}
