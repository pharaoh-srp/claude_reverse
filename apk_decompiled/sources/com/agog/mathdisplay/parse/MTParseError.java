package com.agog.mathdisplay.parse;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/agog/mathdisplay/parse/MTParseError;", "", "Lcom/agog/mathdisplay/parse/MTParseErrors;", "errorcode", "", "errordesc", "<init>", "(Lcom/agog/mathdisplay/parse/MTParseErrors;Ljava/lang/String;)V", "src", "Liei;", "copyFrom", "(Lcom/agog/mathdisplay/parse/MTParseError;)V", "clear", "()V", "component1", "()Lcom/agog/mathdisplay/parse/MTParseErrors;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/agog/mathdisplay/parse/MTParseErrors;Ljava/lang/String;)Lcom/agog/mathdisplay/parse/MTParseError;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/agog/mathdisplay/parse/MTParseErrors;", "getErrorcode", "setErrorcode", "(Lcom/agog/mathdisplay/parse/MTParseErrors;)V", "Ljava/lang/String;", "getErrordesc", "setErrordesc", "(Ljava/lang/String;)V", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class MTParseError {
    private MTParseErrors errorcode;
    private String errordesc;

    public /* synthetic */ MTParseError(MTParseErrors mTParseErrors, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? MTParseErrors.ErrorNone : mTParseErrors, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ MTParseError copy$default(MTParseError mTParseError, MTParseErrors mTParseErrors, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mTParseErrors = mTParseError.errorcode;
        }
        if ((i & 2) != 0) {
            str = mTParseError.errordesc;
        }
        return mTParseError.copy(mTParseErrors, str);
    }

    public final void clear() {
        this.errorcode = MTParseErrors.ErrorNone;
        this.errordesc = "";
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MTParseErrors getErrorcode() {
        return this.errorcode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrordesc() {
        return this.errordesc;
    }

    public final MTParseError copy(MTParseErrors errorcode, String errordesc) {
        errorcode.getClass();
        errordesc.getClass();
        return new MTParseError(errorcode, errordesc);
    }

    public final void copyFrom(MTParseError src) {
        if (src != null) {
            this.errorcode = src.errorcode;
            this.errordesc = src.errordesc;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MTParseError)) {
            return false;
        }
        MTParseError mTParseError = (MTParseError) other;
        return this.errorcode == mTParseError.errorcode && x44.r(this.errordesc, mTParseError.errordesc);
    }

    public final MTParseErrors getErrorcode() {
        return this.errorcode;
    }

    public final String getErrordesc() {
        return this.errordesc;
    }

    public int hashCode() {
        return this.errordesc.hashCode() + (this.errorcode.hashCode() * 31);
    }

    public final void setErrorcode(MTParseErrors mTParseErrors) {
        mTParseErrors.getClass();
        this.errorcode = mTParseErrors;
    }

    public final void setErrordesc(String str) {
        str.getClass();
        this.errordesc = str;
    }

    public String toString() {
        return "MTParseError(errorcode=" + this.errorcode + ", errordesc=" + this.errordesc + ")";
    }

    public MTParseError(MTParseErrors mTParseErrors, String str) {
        mTParseErrors.getClass();
        str.getClass();
        this.errorcode = mTParseErrors;
        this.errordesc = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MTParseError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
