package com.agog.mathdisplay.parse;

import defpackage.fsh;
import defpackage.grc;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/agog/mathdisplay/parse/MTEnvProperties;", "", "envName", "", "ended", "", "numRows", "", "<init>", "(Ljava/lang/String;ZJ)V", "getEnvName", "()Ljava/lang/String;", "setEnvName", "(Ljava/lang/String;)V", "getEnded", "()Z", "setEnded", "(Z)V", "getNumRows", "()J", "setNumRows", "(J)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class MTEnvProperties {
    private boolean ended;
    private String envName;
    private long numRows;

    public /* synthetic */ MTEnvProperties(String str, boolean z, long j, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j);
    }

    public static /* synthetic */ MTEnvProperties copy$default(MTEnvProperties mTEnvProperties, String str, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTEnvProperties.envName;
        }
        if ((i & 2) != 0) {
            z = mTEnvProperties.ended;
        }
        if ((i & 4) != 0) {
            j = mTEnvProperties.numRows;
        }
        return mTEnvProperties.copy(str, z, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEnvName() {
        return this.envName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnded() {
        return this.ended;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getNumRows() {
        return this.numRows;
    }

    public final MTEnvProperties copy(String envName, boolean ended, long numRows) {
        return new MTEnvProperties(envName, ended, numRows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MTEnvProperties)) {
            return false;
        }
        MTEnvProperties mTEnvProperties = (MTEnvProperties) other;
        return x44.r(this.envName, mTEnvProperties.envName) && this.ended == mTEnvProperties.ended && this.numRows == mTEnvProperties.numRows;
    }

    public final boolean getEnded() {
        return this.ended;
    }

    public final String getEnvName() {
        return this.envName;
    }

    public final long getNumRows() {
        return this.numRows;
    }

    public int hashCode() {
        String str = this.envName;
        return Long.hashCode(this.numRows) + fsh.p((str == null ? 0 : str.hashCode()) * 31, 31, this.ended);
    }

    public final void setEnded(boolean z) {
        this.ended = z;
    }

    public final void setEnvName(String str) {
        this.envName = str;
    }

    public final void setNumRows(long j) {
        this.numRows = j;
    }

    public String toString() {
        String str = this.envName;
        boolean z = this.ended;
        long j = this.numRows;
        StringBuilder sb = new StringBuilder("MTEnvProperties(envName=");
        sb.append(str);
        sb.append(", ended=");
        sb.append(z);
        sb.append(", numRows=");
        return grc.r(j, ")", sb);
    }

    public MTEnvProperties(String str, boolean z, long j) {
        this.envName = str;
        this.ended = z;
        this.numRows = j;
    }
}
