package defpackage;

import com.anthropic.claude.login.MagicLinkSentConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class n9j implements s9j {
    public final MagicLinkSentConfig a;

    public n9j(MagicLinkSentConfig magicLinkSentConfig) {
        this.a = magicLinkSentConfig;
    }

    public final MagicLinkSentConfig a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9j) && this.a.equals(((n9j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GoToMagicLinkSent(config=" + this.a + ")";
    }
}
