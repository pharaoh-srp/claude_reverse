package com.anthropic.claude.api.chat.tool;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qq3;
import defpackage.rq3;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/CodeBlockDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "", "language", "code", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/CodeBlockDisplayContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/CodeBlockDisplayContent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLanguage", "getCode", "getFilename", "Companion", "qq3", "rq3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeBlockDisplayContent implements ToolDisplayContent {
    public static final int $stable = 0;
    public static final rq3 Companion = new rq3();
    private final String code;
    private final String filename;
    private final String language;

    public /* synthetic */ CodeBlockDisplayContent(int i, String str, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, qq3.a.getDescriptor());
            throw null;
        }
        this.language = str;
        this.code = str2;
        if ((i & 4) == 0) {
            this.filename = null;
        } else {
            this.filename = str3;
        }
    }

    public static /* synthetic */ CodeBlockDisplayContent copy$default(CodeBlockDisplayContent codeBlockDisplayContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeBlockDisplayContent.language;
        }
        if ((i & 2) != 0) {
            str2 = codeBlockDisplayContent.code;
        }
        if ((i & 4) != 0) {
            str3 = codeBlockDisplayContent.filename;
        }
        return codeBlockDisplayContent.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(CodeBlockDisplayContent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.language);
        output.q(serialDesc, 1, self.code);
        if (!output.E(serialDesc) && self.filename == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.filename);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    public final CodeBlockDisplayContent copy(String language, String code, String filename) {
        language.getClass();
        code.getClass();
        return new CodeBlockDisplayContent(language, code, filename);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeBlockDisplayContent)) {
            return false;
        }
        CodeBlockDisplayContent codeBlockDisplayContent = (CodeBlockDisplayContent) other;
        return x44.r(this.language, codeBlockDisplayContent.language) && x44.r(this.code, codeBlockDisplayContent.code) && x44.r(this.filename, codeBlockDisplayContent.filename);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getLanguage() {
        return this.language;
    }

    public int hashCode() {
        int iL = kgh.l(this.language.hashCode() * 31, 31, this.code);
        String str = this.filename;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.language;
        String str2 = this.code;
        return ij0.m(kgh.r("CodeBlockDisplayContent(language=", str, ", code=", str2, ", filename="), this.filename, ")");
    }

    public CodeBlockDisplayContent(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.language = str;
        this.code = str2;
        this.filename = str3;
    }

    public /* synthetic */ CodeBlockDisplayContent(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
