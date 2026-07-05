package defpackage;

import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes3.dex */
public final class wld {
    public final String a;
    public final MessageFile b;

    public wld(MessageFile messageFile, String str) {
        str.getClass();
        messageFile.getClass();
        this.a = str;
        this.b = messageFile;
    }

    public final MessageFile a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wld)) {
            return false;
        }
        wld wldVar = (wld) obj;
        return ProjectId.m1082equalsimpl0(this.a, wldVar.a) && x44.r(this.b, wldVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (ProjectId.m1083hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return "ProjectFileUpload(projectId=" + ProjectId.m1084toStringimpl(this.a) + ", messageFile=" + this.b + ")";
    }
}
