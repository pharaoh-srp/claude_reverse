package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yuf implements fvf {
    public final List a;

    public yuf(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yuf) && x44.r(this.a, ((yuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("SlashCommandsAvailable(commands=", ")", this.a);
    }
}
