package defpackage;

import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class end implements fnd {
    public final String a;
    public final String b;
    public final Date c;
    public final String d;
    public final MessageFile e;
    public final MessageImageAsset f;

    public end(String str, String str2, Date date, String str3, MessageFile messageFile, MessageImageAsset messageImageAsset) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        messageFile.getClass();
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = str3;
        this.e = messageFile;
        this.f = messageImageAsset;
    }

    @Override // defpackage.fnd
    public final Date a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof end)) {
            return false;
        }
        end endVar = (end) obj;
        return ProjectId.m1082equalsimpl0(this.a, endVar.a) && x44.r(this.b, endVar.b) && x44.r(this.c, endVar.c) && x44.r(this.d, endVar.d) && x44.r(this.e, endVar.e) && x44.r(this.f, endVar.f);
    }

    @Override // defpackage.fnd
    public final String getFileName() {
        return this.b;
    }

    @Override // defpackage.fnd
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        int iL = kgh.l(ProjectId.m1083hashCodeimpl(this.a) * 31, 31, this.b);
        Date date = this.c;
        int iHashCode = (this.e.hashCode() + kgh.l((iL + (date == null ? 0 : date.hashCode())) * 31, 31, this.d)) * 31;
        MessageImageAsset messageImageAsset = this.f;
        return iHashCode + (messageImageAsset != null ? messageImageAsset.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("FileKnowledgeUpload(projectId=", ProjectId.m1084toStringimpl(this.a), ", fileName=", this.b, ", createdAt=");
        sbR.append(this.c);
        sbR.append(", id=");
        sbR.append(this.d);
        sbR.append(", file=");
        sbR.append(this.e);
        sbR.append(", imageAsset=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
