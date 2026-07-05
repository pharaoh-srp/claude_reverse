package defpackage;

import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes2.dex */
public final class iki {
    public final ApiResult a;
    public final int b;

    public iki(ApiResult apiResult, int i) {
        apiResult.getClass();
        this.a = apiResult;
        this.b = i;
    }

    public final ApiResult a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iki)) {
            return false;
        }
        iki ikiVar = (iki) obj;
        return x44.r(this.a, ikiVar.a) && this.b == ikiVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UploadResult(apiResult=" + this.a + ", retryCount=" + this.b + ")";
    }
}
