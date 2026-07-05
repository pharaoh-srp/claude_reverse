package com.anthropic.claude.code.ui;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.o36;
import defpackage.onf;
import defpackage.p36;
import defpackage.vb7;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010 Jd\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b:\u0010 ¨\u0006>"}, d2 = {"Lcom/anthropic/claude/code/ui/DiffLineComment;", "", "", "id", "filePath", "", "lineKey", "", "oldLineNumber", "newLineNumber", "lineContent", "commentText", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$ui", "(Lcom/anthropic/claude/code/ui/DiffLineComment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)Lcom/anthropic/claude/code/ui/DiffLineComment;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getFilePath", "J", "getLineKey", "Ljava/lang/Integer;", "getOldLineNumber", "getNewLineNumber", "getLineContent", "getCommentText", "getCreatedAt", "Companion", "p36", "o36", "ui"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DiffLineComment {
    public static final int $stable = 0;
    public static final p36 Companion = new p36();
    private final String commentText;
    private final long createdAt;
    private final String filePath;
    private final String id;
    private final String lineContent;
    private final long lineKey;
    private final Integer newLineNumber;
    private final Integer oldLineNumber;

    public /* synthetic */ DiffLineComment(int i, String str, String str2, long j, Integer num, Integer num2, String str3, String str4, long j2, vnf vnfVar) {
        if (126 != (i & 126)) {
            gvj.f(i, 126, o36.a.getDescriptor());
            throw null;
        }
        this.id = (i & 1) == 0 ? vb7.i() : str;
        this.filePath = str2;
        this.lineKey = j;
        this.oldLineNumber = num;
        this.newLineNumber = num2;
        this.lineContent = str3;
        this.commentText = str4;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.createdAt = System.currentTimeMillis();
        } else {
            this.createdAt = j2;
        }
    }

    public static /* synthetic */ DiffLineComment copy$default(DiffLineComment diffLineComment, String str, String str2, long j, Integer num, Integer num2, String str3, String str4, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diffLineComment.id;
        }
        if ((i & 2) != 0) {
            str2 = diffLineComment.filePath;
        }
        if ((i & 4) != 0) {
            j = diffLineComment.lineKey;
        }
        if ((i & 8) != 0) {
            num = diffLineComment.oldLineNumber;
        }
        if ((i & 16) != 0) {
            num2 = diffLineComment.newLineNumber;
        }
        if ((i & 32) != 0) {
            str3 = diffLineComment.lineContent;
        }
        if ((i & 64) != 0) {
            str4 = diffLineComment.commentText;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            j2 = diffLineComment.createdAt;
        }
        long j3 = j2;
        long j4 = j;
        return diffLineComment.copy(str, str2, j4, num, num2, str3, str4, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$ui(com.anthropic.claude.code.ui.DiffLineComment r4, defpackage.vd4 r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            boolean r0 = r5.E(r6)
            if (r0 == 0) goto L7
            goto L1a
        L7:
            java.lang.String r0 = r4.id
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            boolean r0 = defpackage.x44.r(r0, r1)
            if (r0 != 0) goto L20
        L1a:
            java.lang.String r0 = r4.id
            r1 = 0
            r5.q(r6, r1, r0)
        L20:
            r0 = 1
            java.lang.String r1 = r4.filePath
            r5.q(r6, r0, r1)
            r0 = 2
            long r1 = r4.lineKey
            r5.D(r6, r0, r1)
            e79 r0 = defpackage.e79.a
            java.lang.Integer r1 = r4.oldLineNumber
            r2 = 3
            r5.B(r6, r2, r0, r1)
            r1 = 4
            java.lang.Integer r2 = r4.newLineNumber
            r5.B(r6, r1, r0, r2)
            r0 = 5
            java.lang.String r1 = r4.lineContent
            r5.q(r6, r0, r1)
            r0 = 6
            java.lang.String r1 = r4.commentText
            r5.q(r6, r0, r1)
            boolean r0 = r5.E(r6)
            if (r0 == 0) goto L4d
            goto L57
        L4d:
            long r0 = r4.createdAt
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L5d
        L57:
            long r0 = r4.createdAt
            r4 = 7
            r5.D(r6, r4, r0)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.ui.DiffLineComment.write$Self$ui(com.anthropic.claude.code.ui.DiffLineComment, vd4, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLineKey() {
        return this.lineKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOldLineNumber() {
        return this.oldLineNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getNewLineNumber() {
        return this.newLineNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLineContent() {
        return this.lineContent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCommentText() {
        return this.commentText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final DiffLineComment copy(String id, String filePath, long lineKey, Integer oldLineNumber, Integer newLineNumber, String lineContent, String commentText, long createdAt) {
        id.getClass();
        filePath.getClass();
        lineContent.getClass();
        commentText.getClass();
        return new DiffLineComment(id, filePath, lineKey, oldLineNumber, newLineNumber, lineContent, commentText, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiffLineComment)) {
            return false;
        }
        DiffLineComment diffLineComment = (DiffLineComment) other;
        return x44.r(this.id, diffLineComment.id) && x44.r(this.filePath, diffLineComment.filePath) && this.lineKey == diffLineComment.lineKey && x44.r(this.oldLineNumber, diffLineComment.oldLineNumber) && x44.r(this.newLineNumber, diffLineComment.newLineNumber) && x44.r(this.lineContent, diffLineComment.lineContent) && x44.r(this.commentText, diffLineComment.commentText) && this.createdAt == diffLineComment.createdAt;
    }

    public final String getCommentText() {
        return this.commentText;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLineContent() {
        return this.lineContent;
    }

    public final long getLineKey() {
        return this.lineKey;
    }

    public final Integer getNewLineNumber() {
        return this.newLineNumber;
    }

    public final Integer getOldLineNumber() {
        return this.oldLineNumber;
    }

    public int hashCode() {
        int iE = vb7.e(kgh.l(this.id.hashCode() * 31, 31, this.filePath), 31, this.lineKey);
        Integer num = this.oldLineNumber;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.newLineNumber;
        return Long.hashCode(this.createdAt) + kgh.l(kgh.l((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.lineContent), 31, this.commentText);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.filePath;
        long j = this.lineKey;
        Integer num = this.oldLineNumber;
        Integer num2 = this.newLineNumber;
        String str3 = this.lineContent;
        String str4 = this.commentText;
        long j2 = this.createdAt;
        StringBuilder sbR = kgh.r("DiffLineComment(id=", str, ", filePath=", str2, ", lineKey=");
        sbR.append(j);
        sbR.append(", oldLineNumber=");
        sbR.append(num);
        sbR.append(", newLineNumber=");
        sbR.append(num2);
        sbR.append(", lineContent=");
        sbR.append(str3);
        sbR.append(", commentText=");
        sbR.append(str4);
        sbR.append(", createdAt=");
        return grc.r(j2, ")", sbR);
    }

    public /* synthetic */ DiffLineComment(String str, String str2, long j, Integer num, Integer num2, String str3, String str4, long j2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? vb7.i() : str, str2, j, num, num2, str3, str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? System.currentTimeMillis() : j2);
    }

    public DiffLineComment(String str, String str2, long j, Integer num, Integer num2, String str3, String str4, long j2) {
        ij0.z(str, str2, str3, str4);
        this.id = str;
        this.filePath = str2;
        this.lineKey = j;
        this.oldLineNumber = num;
        this.newLineNumber = num2;
        this.lineContent = str3;
        this.commentText = str4;
        this.createdAt = j2;
    }
}
