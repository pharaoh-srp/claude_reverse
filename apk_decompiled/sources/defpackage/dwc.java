package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes2.dex */
public final class dwc {
    public final boolean a;
    public final MessageFileEvents$DownloadSource b;
    public final String c;
    public final String d;

    public dwc(boolean z, MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str, String str2) {
        messageFileEvents$DownloadSource.getClass();
        str.getClass();
        str2.getClass();
        this.a = z;
        this.b = messageFileEvents$DownloadSource;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final MessageFileEvents$DownloadSource d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwc)) {
            return false;
        }
        dwc dwcVar = (dwc) obj;
        return this.a == dwcVar.a && this.b == dwcVar.b && x44.r(this.c, dwcVar.c) && ChatId.m981equalsimpl0(this.d, dwcVar.d);
    }

    public final int hashCode() {
        return ChatId.m982hashCodeimpl(this.d) + kgh.l((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        String strM983toStringimpl = ChatId.m983toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("PendingDownload(shouldOpen=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", fileExtension=");
        return vb7.t(sb, this.c, ", chatId=", strM983toStringimpl, ")");
    }
}
